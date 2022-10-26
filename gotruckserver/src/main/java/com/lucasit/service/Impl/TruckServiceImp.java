package com.lucasit.service.Impl;

import com.lucasit.domain.Truck;
import com.lucasit.exceptions.BadRequestException;
import com.lucasit.mapper.TruckMapper;
import com.lucasit.repository.TruckRepository;
import com.lucasit.request.TruckPostRequestBoby;
import com.lucasit.service.TruckService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TruckServiceImp implements TruckService {


    private final TruckRepository truckRepository;

    @Override
    public Truck save(TruckPostRequestBoby truckPostRequestBoby) {
        Truck save = truckRepository.save(TruckMapper.INSTANCE.toTruck(truckPostRequestBoby));
        if (true) {
            throw new RuntimeException("ERroo");
        }

        return save;
    }

    @Override
    public Truck findById(Long id) {
        return truckRepository.findById(id).orElseThrow(() -> new BadRequestException("User not found."));
    }
}
