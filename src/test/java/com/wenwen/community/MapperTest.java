package com.wenwen.community;



import com.wenwen.community.dao.UserMapper;
import com.wenwen.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {

    @Autowired(required=false)
    private UserMapper userMapper;




    @Test
    public void TestSelectUser(){
        User user = userMapper.selectById(101);
        System.out.println(user);
    }



}
