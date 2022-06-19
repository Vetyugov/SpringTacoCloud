package com.vetyugov.spring.tacos;

import com.vetyugov.spring.tacos.HomeController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc; //Внедряет MockMvc

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))                                   //Выполняем get запрос
                .andExpect(status().isOk())                                   //Ожидаем HTTP статус 200
                .andExpect(view().name("home.html"))                //Ожидаем страницу home
                .andExpect(content().string(containsString("Welcome to...")));  //С содержанием Welcome to ...

    }
}
