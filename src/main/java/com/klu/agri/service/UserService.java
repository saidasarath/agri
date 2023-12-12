package com.klu.agri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.klu.agri.entity.ContactUs;
import com.klu.agri.entity.User;
import com.klu.agri.entity.ContactUs;
import com.klu.agri.repo.ContactUsRepository;
import com.klu.agri.repo.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ContactUsRepository contactUsRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public String insertUser(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "saved";
    }
    public String insertcontactus(ContactUs contactUs)
    {
        contactUsRepository.save(contactUs);
        return "home";
    }
}
