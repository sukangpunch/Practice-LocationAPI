package com.example.forgps.controller;


import com.example.forgps.dto.request.LocationRequestDto;
import com.example.forgps.dto.response.LocationResponseDto;
import com.example.forgps.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    @PostMapping()
    public ResponseEntity<LocationResponseDto> createLocation(@RequestBody LocationRequestDto locationRequestDto)
    {

        return ResponseEntity.status(HttpStatus.OK).body(locationService.createLocation(locationRequestDto));
    }

}
