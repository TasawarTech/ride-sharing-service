package com.example.ride_sharing_service.driver;



import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class DriverControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddDriver() throws Exception {
        mockMvc.perform(post("/driver/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"driverId\":1,\"driverName\":\"John Doe\",\"vehicle\":\"Toyota Prius\"}"))
                .andExpect(status().isOk())
                .andExpect(result -> assertThat(result.getResponse().getContentAsString()).isEqualTo("Driver added"));
    }

    @Test
    public void testUpdateAvailability() throws Exception {
        mockMvc.perform(post("/driver/availability")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"driverId\":1,\"availability\":true}"))
                .andExpect(status().isOk())
                .andExpect(result -> assertThat(result.getResponse().getContentAsString()).isEqualTo("Driver availability updated"));
    }
}
