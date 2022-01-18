package com.firstProject.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public  List<Users> getAllUsers() {
        return  userRepository.findAll();
    }

    public  void addUsers(Users users)
    {
        userRepository.save(users);
    }

    public void delete(String users_id) {
        userRepository.deleteById(users_id);
    }

    public boolean checkName_Email(Users users)
    {
        return (userRepository.existsById(users.getUsername()) || userRepository.existsById(users.getEmail()));
    }
    // u can skip this
//    public boolean notValidNumber(Users users) {
//
//            int temp = users.getMobileNumber() ;
//            if(temp == (int)temp)
//                return false;
//            else
//                return  true;
//
//
//    }
// to check for updation user exist or not
    // the inside get is the repostiory function
    public Users get(String id){

        return userRepository.findById(id).get();
    }

}
