package com.hackathon.springboot.controllers;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackathon.springboot.entities.User;
import com.hackathon.springboot.repositories.UserRepository;
import com.hackathon.springboot.services.UserService;
import jakarta.validation.constraints.NotNull;
import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.mockito.Mock;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
    private MockMvc mockMvc;

    ObjectMapper objectMapper = new ObjectMapper();
    ObjectWriter objectWriter = objectMapper.writer();
    @Mock
    private UserService userService;
     @InjectMocks
    private UserController userController;

     User user_1 = new User(20, "Matt", 2435.22);
     User user_2 = new User(21, "Mike", 3425.2);

     @Before
    public void setUp(){
         MockitoAnnotations.initMocks(this);
         this.mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
     }
     @Test
    public void getUser_success() throws Exception{
         List<User> users = new ArrayList<>(Arrays.asList(user_1, user_2));
         Mockito.when(userService.getAllUsers()).thenReturn(users);
         mockMvc.perform(MockMvcRequestBuilders
                 .get("/users")
                 .contentType(MediaType.APPLICATION_JSON))
                 .andExpect(status().isOk())
                 .andExpect(jsonPath("$").value(hasSize(2)))
                 .andExpect(jsonPath("$[0].name").value("Matt"));
     }
     @Test
    public void postUser_success() throws Exception{

        Mockito.when(userService.addUser(user_2)).thenReturn(user_2);
        String content = objectWriter.writeValueAsString(user_2);
         MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/users")
                 .contentType(MediaType.APPLICATION_JSON)
                 .accept(MediaType.APPLICATION_JSON)
                 .content(content);

         mockMvc.perform(mockRequest)
                 .andExpect(status().isOk());

     }


}
