package com.example.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.security.model.UserT;
import com.example.security.repo.UserRepository;
import com.example.security.security.UserPrincipal;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserT user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found" + username);
        }

        return new UserPrincipal(user);
    }
}
