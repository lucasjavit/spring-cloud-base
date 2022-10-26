package com.lucasit.mapper;

import com.lucasit.domain.Pessoa;
import com.lucasit.request.UserPostRequestBoby;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public abstract class PessoaMapper {

    public static final PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);

    public abstract Pessoa toPessoa(UserPostRequestBoby userPostRequestBoby);
}
