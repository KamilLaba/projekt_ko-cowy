package pl.coderslab.imageviewer.service;


import pl.coderslab.imageviewer.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
}
