package com.dddn.DDDNyang.service;

import com.dddn.DDDNyang.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class MemberServiceImpl implements MemberService {

    private MemberMapper testMapper;

    @Autowired
    MemberServiceImpl(MemberMapper testMapper) {
        this.testMapper = testMapper;
    }

    public List<Map<String, Object>> getEmployee(){
        return testMapper.getEmployee();
    }
}