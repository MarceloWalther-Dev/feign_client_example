package com.feignclient.example.client;

import com.feignclient.example.dto.PhotoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "photoClient", url = "https://jsonplaceholder.typicode.com")
public interface PhotoClient {

    @GetMapping(path = "/photos")
    List<PhotoDto> getAllPhotos();

    @GetMapping(path = "/photos/{photoId}")
    PhotoDto getOnePhoto(@PathVariable("photoId") String photoId);

}
