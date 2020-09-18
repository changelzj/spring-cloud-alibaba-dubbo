package com.example.test;

import com.example.ConsumerApplication;
import com.example.dto.User;
import com.example.servlce.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ConsumerApplication.class)
@Slf4j
public class DubboTest {

    @Reference(version = "1.0.0")
    private UserService userService;

    @Test
    public void call() {
        try {
            User byId = userService.getById(1);
            log.info(byId.getUsername());
        } catch (Exception e) {
            log.error(e.getLocalizedMessage(), e);
        }

    }
}
