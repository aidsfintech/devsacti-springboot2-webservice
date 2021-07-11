package com.devsacti.book.springboot.web;

import com.devsacti.book.springboot.service.PostsService;
import com.devsacti.book.springboot.web.dto.PostsListResponseDto;
import com.devsacti.book.springboot.web.dto.PostsResponseDto;
import com.devsacti.book.springboot.web.dto.PostsSaveRequestDto;
import com.devsacti.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    //Create in CRUD
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        //System.out.println("plz come in..."+requestDto.getTitle());
        return postsService.save(requestDto);
    }

    //Read in CRUD
    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    @GetMapping("/api/v1/posts/list")
    public List<PostsListResponseDto> findAll() {
        return postsService.findAllDesc();
    }

    //Update in CRUD
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    //Delete in CRUD
    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}
