package com.firstProject.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.NameNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;


@RestController
public class UserController {


    // use UserService here
    //below private variable is used from userService so have to be injected usign autowired
    @Autowired
    public UserService userService;

    @RequestMapping("/users")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping("/users/{id}")
    public Users getAllUsers(@PathVariable String id){

        return userService.get(id);
    }

    @PostMapping("/users")
    public String addUsers(@RequestBody Users users) {

            if (userService.checkName_Email(users))
                return " user already exist";
            else {
                userService.addUsers(users);
                return "created successfully";
            }
    }


    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable String id) {
        userService.delete(id);
        return id + "  deleted successfully ";
    }

    @PutMapping("/users/{id}") // here two variables passed to check the username and updation
    public String updateUser(@RequestBody Users users, @PathVariable String id){
       try { //since get is defined in the userService
           Users tempuser = userService.get(id);
           userService.addUsers(users);
       }
       catch (NoSuchElementException e){
           return  " no such user available first add the user ";
       }
       return id + " user updated successfully";


  }
//    @PutMapping("/users")
//    public String updateUser(@RequestBody Users users)
//    {
//        userService.
//    }

    // try and catch

//
//    {
//        try {
//            Users tempUser = userService.get(id);
//            userService.addUsers(users);
//
//        }
//        // e is used for printing the type of exception
//        catch (NoSuchElementException e) {
//            return "user doesnt exist";
//        }
//
//        return id + " user updated";
//
//
//    }
}