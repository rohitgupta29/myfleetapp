package com.first.myfleetapp.services;

import com.first.myfleetapp.models.User;
import com.first.myfleetapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import java.nio.file.attribute.UserPrincipal;
import java.security.Principal;

public class MyUserDetailsService  implements UserDetailsService{

    @Autowired UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            User user = userRepository.findByUsername(username);

            if(user == null) {
                throw new UsernameNotFoundEception("User not found!");
            }

            return new UserPrincipal(user);
    }
}
