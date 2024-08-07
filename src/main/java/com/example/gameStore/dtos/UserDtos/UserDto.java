package com.example.gameStore.dtos.UserDtos;

import com.example.gameStore.enums.UserRole;
import com.example.gameStore.enums.UserStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private UUID id;
    private String username;
    private String email;
    private Timestamp createdAt;
    private UserRole role;
    private LocalDate birthDate;
    private UserStatus activeStatus;
    private String address;
    private String postalCode;
    private String phone;
}
