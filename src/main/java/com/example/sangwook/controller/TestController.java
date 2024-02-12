package com.example.sangwook.controller;

import com.example.sangwook.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/items")
    public String getItems() {
        return "test";
    }
    @GetMapping("/item/{itemNo}")
    public long getItems(@PathVariable("itemNo") long itemNo) {
        return testService.getItem(itemNo);
    }
}
