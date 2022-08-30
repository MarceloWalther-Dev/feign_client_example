package com.feignclient.example.proxy;

import com.feignclient.example.client.PhotoClient;
import com.feignclient.example.dto.PhotoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoClientProxy {

    @Autowired
    PhotoClient photoClient;

    public List<PhotoDto> getAllPhotos(){
        return photoClient.getAllPhotos();
    }


}
