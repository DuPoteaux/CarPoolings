package com.carpooling.library.services.impl;

import com.library.dto.AdminDto;
import com.carpooling.library.models.Admin;
import com.carpooling.library.repositories.AdminRepository;
import com.carpooling.library.repositories.RoleRepository;
import com.library.services.AdminService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AdminImpl implements AdminService {
    private AdminRepository adminRepository;
    private RoleRepository roleRepository;

    @Override
    public Admin findByUserName(String username) {

        return adminRepository.findByUserName(username);
    }

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();

        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setUserName(adminDto.getUserName());
        admin.setPassWord(adminDto.getPassword());
        admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));

        return adminRepository.save(admin);
    }
}
