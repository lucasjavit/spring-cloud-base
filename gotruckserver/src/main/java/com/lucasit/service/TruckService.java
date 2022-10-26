package com.lucasit.service;

import com.lucasit.domain.Truck;
import com.lucasit.request.TruckPostRequestBoby;

public interface TruckService {

    Truck save(TruckPostRequestBoby truckPostRequestBoby);

    Truck findById(Long id);

}
