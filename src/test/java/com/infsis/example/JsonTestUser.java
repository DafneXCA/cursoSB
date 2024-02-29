package com.infsis.example;

import com.infsis.example.DTOs.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
public class JsonTestUser {

    @Autowired
    private JacksonTester<UserDTO> json;

    @Test
    public void testSerialize()throws Exception{
        UserDTO userDTO=new UserDTO(1,"a","a@a");
        assertThat(this.json.write(userDTO)).isEqualToJson("{'id':1,'name':'a','email':'a@a'}");
    }
}
