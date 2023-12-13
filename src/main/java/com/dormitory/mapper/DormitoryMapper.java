package com.dormitory.mapper;

import com.dormitory.dto.DormitoryDTO;
import com.dormitory.dto.RoomDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DormitoryMapper {
    public List<RoomDTO> getRoom() throws Exception;

    //숙소 정보 전체 조회
    //=============================MAIN==========================

    //1. 숙소 추천 (별점 별)
    public List<DormitoryDTO> getDormitoryByStar(String keyword);
    //2. 숙소 추천

    //5.(test)  추천 얼리체크인
    public List<DormitoryDTO> getEarlyCheckin();
    
    //6. (test) 추천 등급별
    public List<DormitoryDTO> getDormitoryByGrade();

    //7,
    public List<DormitoryDTO> getDormitoryByType (String type);


    //=======================2


    //=====================3

    //========================4
    public List<RoomDTO> getRoomDetail(String d_code);


    //SearchList
    //전체 리스트
    public List<DormitoryDTO> getDormitoryList(Map<String, Object> data) throws Exception;


}