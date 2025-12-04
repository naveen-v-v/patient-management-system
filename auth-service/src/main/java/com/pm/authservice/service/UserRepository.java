package com.pm.authservice.service;

import com.pm.authservice.model.User;
import org.springframework.data.repository.Repository;

import java.util.UUID;

interface UserRepository extends Repository<User, UUID> {
}
