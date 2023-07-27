package com.example.knockknock.domain.friend.dto.requestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@Builder
public class FriendRequestDto {
    private String friendName;
    private String nickName;
    private String phoneNumber;

    MultipartFile profileImage;
}
