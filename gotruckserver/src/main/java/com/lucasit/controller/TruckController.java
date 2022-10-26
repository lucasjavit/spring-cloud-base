package com.lucasit.controller;

import com.lucasit.domain.Truck;
import com.lucasit.request.TruckPostRequestBoby;
import com.lucasit.service.TruckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

@RestController
@RequestMapping("/truck")
@RequiredArgsConstructor
public class TruckController {

    private final TruckService truckService;

    @PostMapping
    public ResponseEntity<Truck> save(@RequestBody @Valid TruckPostRequestBoby truckPostRequestBoby) {
        return new ResponseEntity<>(truckService.save(truckPostRequestBoby), HttpStatus.CREATED);
    }

    @RolesAllowed("test")
    @GetMapping("/{id}")
    public ResponseEntity<Truck> findById(@PathVariable long id) {
        return new ResponseEntity<>(truckService.findById(id), HttpStatus.OK);
    }

}
