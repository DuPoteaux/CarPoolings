package com.carpooling.admin.config;


import com.carpooling.library.models.Admin;
import com.carpooling.library.repositories.AdminRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.stream.Collectors;

public class AdminServiceConfig implements UserDetailsService {
private AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin = adminRepository.findByUserName(username);

        if (admin == null) {
            throw  new UsernameNotFoundException("non trouvé");
        }
        return  new User(
                admin.getUserName(),
                admin.getPassWord(),
                admin.getRoles().stream().
                        map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList())

        );
    }
    }
