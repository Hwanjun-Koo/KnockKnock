package com.example.knockknock.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HashtagRegisterRequestDto {
    @NotBlank
    private String tagName;
}
