package com.dormitory.controller;

import com.dormitory.dto.*;
import com.dormitory.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reservation")
public class RestReservationController {
    private final MemberService service;

    //======================예약 화면

    //1. 숙소 + 객실 (JOIN + DTO)
    @GetMapping("/dormitoryRoom")
    public DormitoryRoomDTO getDormitoryRoom(DormitoryDTO dormitory){

        dormitory.getD_code();
        return null;
    }


    //2. 구매 회원 정보 입력 받아서 POST 처리만 하면됨
    @PostMapping("/memberInfo")
    public String postMemberInfo() {
        return null;
    }

    //3-1. 예약 정보 조회
    @GetMapping("/reservationInfo")
    public ReservationDTO getReservationInfo(ReservationDTO reservation){
        return reservation;
    }

    //3-2. 예약 정보 받아서 POST 처리
    @PostMapping("/reservationInfo")
    public String posteservationInfo(ReservationDTO reservation){
        return null;
    }



    //4. 결제 정보 저장
    @PostMapping("/payment")
    public String getPayment(PaymentDTO payment){
        return null;
    }


    //5. 시즌별 환불규정 -> OK
    @GetMapping("/cancel")
    public List<CancelDTO> getCancel(DormitoryDTO dormitory) throws Exception{
        //테스트용
        //return service.getCancelPolicy("3002534");

        return service.getCancelPolicy(dormitory.getD_code());

    }


}