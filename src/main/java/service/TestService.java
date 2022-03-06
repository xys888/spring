package service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

//@Service
//@Configuration
//@ComponentScan("constroller")
public class TestService {
    public String sayHello(String word){
        return "Hello"+word+" !";
    }
}
