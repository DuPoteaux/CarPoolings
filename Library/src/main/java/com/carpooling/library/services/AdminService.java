package com.carpooling.library.services;

import com.carpooling.library.models.Admin;
import com.library.dto.AdminDto;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    Admin findByUserName(String name);

    Admin save(AdminDto adminDto);
}
