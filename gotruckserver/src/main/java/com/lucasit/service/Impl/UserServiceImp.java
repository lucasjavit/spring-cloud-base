package com.lucasit.service.Impl;

import com.lucasit.domain.Pessoa;
import com.lucasit.exceptions.BadRequestException;
import com.lucasit.mapper.PessoaMapper;
import com.lucasit.repository.UserRepository;
import com.lucasit.request.UserPostRequestBoby;
import com.lucasit.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImp implements UserService {


    private final UserRepository userRepository;

    @Override
    public Pessoa save(UserPostRequestBoby userPostRequestBoby) {
        Pessoa save = userRepository.save(PessoaMapper.INSTANCE.toPessoa(userPostRequestBoby));

        if (true){
            throw new RuntimeException("ERroo");
        }

        return save;
    }

    @Override
    public Pessoa findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new BadRequestException("User not found."));
    }
}
