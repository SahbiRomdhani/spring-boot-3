package com.example.test.demo;

import com.example.test.demo.auth.AuthenticateService;
import com.example.test.demo.user.User;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/demo")
public class DemoController {
    AuthenticateService userService;
    @GetMapping
    public ResponseEntity<String> HelloWorld(){
        return  ResponseEntity.ok("Hello world blade Secured One");
    }


    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> AllUsers(){
        List<User> allUsers = userService.GetAllUsers();
        return ResponseEntity.ok(allUsers);
    }


}
