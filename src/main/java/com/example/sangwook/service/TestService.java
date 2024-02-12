package com.example.sangwook.service;

import com.example.sangwook.mapper.TestMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestService {
    private final TestMapper testMapper;

    public long getItem(long itemNo) {
        return testMapper.getItemByItemNo(itemNo);
    }

}
