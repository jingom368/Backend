package com.dormitory.controller;

import com.dormitory.dto.*;
import com.dormitory.service.DormitoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/room")
public class RestRoomInfoController {
    private final DormitoryService service;

    //1. 숙소 제일 위, 방 전체 정보 출력(사진, 등)
    @GetMapping("/roomReview")
    public RoomReviewDTO getRoomReviewInfo(){
        //조인
        return null;
    }

    //2. 리뷰 테이블
    @GetMapping("/review")
    public ReviewDTO getReview(){
        return null;
    }

    //3. 지도
    @GetMapping("/map")
    public DormitoryDTO getMap(){
        return null;

    }

    //4. 객실 정보
    @GetMapping("/roomDetail")
    public List<RoomDTO> getRoomDetail(DormitoryDTO dormitory){
        //  1000002288  서귀포 유러하우스펜션
        //String d_code = "1000002288";
        String d_code = dormitory.getD_code();

        return service.getRoomDetail(d_code);
    }
    //5. 숙소 정보
    @GetMapping("/dormitory")
    public DormitoryDTO getDormitory(DormitoryDTO dormitory){

        return null;
    }
    //6. 비품 정보
    @GetMapping("/amentiy")
    public AmenityDTO getAmenity(DormitoryDTO dormitory){
        return null;
    }
}