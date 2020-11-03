package pl.coderslab.imageviewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.imageviewer.model.User;
import pl.coderslab.imageviewer.repository.UserRepository;

import java.util.List;

@Service
public class UserService implements IUserService{
    public UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll(){
        return (List<User>)userRepository.findAll();
    }
}
