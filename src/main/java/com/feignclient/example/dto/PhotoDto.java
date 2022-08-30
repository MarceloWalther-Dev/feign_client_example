package com.feignclient.example.dto;

import lombok.Data;

@Data
public class PhotoDto {

    private Long albumId;
    private Long id;
    private String title;
    private String url;
    private String thumbnailUrl;

}
