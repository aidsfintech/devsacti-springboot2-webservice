package com.devsacti.book.springboot.web;

import com.devsacti.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        // 일단 리턴 자료형이 Dto로 고정인데, 클래스 단위로 출력이 지원되진 않음.
        // 하지만 아래와같이 전달되는 것을 중간에 확인가능
        //System.out.println(name);
        //System.out.println(amount);
        return new HelloResponseDto(name, amount);
    }

}
