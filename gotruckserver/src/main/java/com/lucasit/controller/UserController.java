package com.lucasit.controller;

import com.lucasit.domain.Pessoa;
import com.lucasit.request.UserPostRequestBoby;
import com.lucasit.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody @Valid UserPostRequestBoby userPostRequestBoby) {
        return new ResponseEntity<>(userService.save(userPostRequestBoby), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable long id) {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }

}
