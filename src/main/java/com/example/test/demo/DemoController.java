package com.example.test.demo;

import com.example.test.demo.auth.AuthenticateService;
import com.example.test.demo.user.User;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/demo")
@Hidden // hide the controller in Swagger
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

    @GetMapping("/getUserByID/{userId}")
    public ResponseEntity<Optional<User>> GetUserByID(@PathVariable("userId") Long id){
         Optional<User> user = userService.findUserById(id);
        return ResponseEntity.ok(user);
        }

}
