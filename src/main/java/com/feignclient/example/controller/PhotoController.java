package com.feignclient.example.controller;

import com.feignclient.example.dto.PhotoDto;
import com.feignclient.example.proxy.PhotoClientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/photos")
public class PhotoController {

    @Autowired
    private PhotoClientProxy photoClientProxy;

    @GetMapping()
    public ResponseEntity<?> getAllPhotos(){
        List<PhotoDto> photoDtoList = photoClientProxy.getAllPhotos();
        return ResponseEntity.ok(photoDtoList);
    }



}
