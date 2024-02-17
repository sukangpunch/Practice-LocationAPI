package com.example.forgps.service;

import com.example.forgps.domain.Location;
import com.example.forgps.dto.request.LocationRequestDto;
import com.example.forgps.dto.response.LocationResponseDto;
import com.example.forgps.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocationService {

    private final LocationRepository locationRepository;
    
    public LocationResponseDto createLocation(LocationRequestDto locationRequestDto) {
        Location location = Location.builder()
                .name(locationRequestDto.getName())
                .latitude(locationRequestDto.getLatitude())
                .longitude(locationRequestDto.getLongitude())
                .build();

        locationRepository.save(location);
        LocationResponseDto locationResponseDto = new LocationResponseDto("저장성공");


        return locationResponseDto;
    }

}
