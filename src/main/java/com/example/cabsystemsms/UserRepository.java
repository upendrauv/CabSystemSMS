package com.example.cabsystemsms;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UserRepository extends JpaRepository<Users,Integer>
{
   Users findByEmail(String email);
}
