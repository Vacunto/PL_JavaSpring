package com.example.newMock.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class RequestDTO {
    private String rqUID;
    private String ClientId;
    private String account;
    private String openDate;
    private String closeDate;

}
