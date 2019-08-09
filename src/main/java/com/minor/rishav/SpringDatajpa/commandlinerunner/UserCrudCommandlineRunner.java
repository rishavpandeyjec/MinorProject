package com.minor.rishav.SpringDatajpa.commandlinerunner;

import com.minor.rishav.SpringDatajpa.model.User;
import com.minor.rishav.SpringDatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserCrudCommandlineRunner implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        User user1=new User("Rishav","Pandey");
        userRepository.save(user1);
        User user2=new User("Saurav","Pandey");
        userRepository.save(user2);
        List<User> userList=userRepository.findAll();
        System.out.println("Ha Ha "+userList);
        user2.setLastName("Hero");
        userRepository.save(user2);

    }
}
