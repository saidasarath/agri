package com.klu.agri.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.klu.agri.entity.User;
import com.klu.agri.repo.UserRepository;

public class CustomUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByName(username);
        if(user  == null ) throw new UsernameNotFoundException("User not found");
        UserDetails userDetails = new CustomUserDetails(user);
        return userDetails;
    }
    
}
