package com.bd.musity.dto.response;

import com.bd.musity.entity.AppUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserResponse {

    private Long id;
    private String name;
    private String email;
    private String role;
    private String accessToken;
    private String refreshToken;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static AppUserResponse fromEntity(AppUser appUser, String accessToken)
    {
        AppUserResponse response = new AppUserResponse();
        response.setId(appUser.getId());
        response.setName(appUser.getName());
        response.setEmail(appUser.getEmail());
        response.setRole(appUser.getRole());
        response.setAccessToken(accessToken);
        response.setRefreshToken(accessToken);
        response.setCreatedAt(appUser.getCreateAt());
        response.setUpdatedAt(appUser.getUpdatedAt());
        return response;
    }

}
