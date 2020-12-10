package com.huang.community.community;

import com.huang.community.community.mapper.UserMapper;
import com.huang.community.community.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommunityApplicationTests {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        User user = new User();
        user.setId(100);
        user.setName("2");
        user.setAccountId("2");
        user.setToken("2");
        user.setGmtCreate(212l);
        user.setGmtModified((long) 2121);

        userMapper.insert(user);
    }

}
