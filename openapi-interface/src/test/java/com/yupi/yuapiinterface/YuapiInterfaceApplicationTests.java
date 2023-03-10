package com.openapi.openapiinterface;

import com.openapi.openapiclientsdk.client.openapiClient;
import com.openapi.openapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class openapiInterfaceApplicationTests {

    @Resource
    private openapiClient openapiClient;

    @Test
    void contextLoads() {
        String result = openapiClient.getNameByGet("openapi");
        User user = new User();
        user.setUsername("liopenapi");
        String usernameByPost = openapiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
