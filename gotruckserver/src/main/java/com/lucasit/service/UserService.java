package com.lucasit.service;

import com.lucasit.domain.Pessoa;
import com.lucasit.request.UserPostRequestBoby;

public interface UserService {

    Pessoa save(UserPostRequestBoby userPostRequestBoby);

    Pessoa findById(Long id);

}
