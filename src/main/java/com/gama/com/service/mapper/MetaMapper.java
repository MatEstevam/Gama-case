package com.gama.com.service.mapper;

import com.gama.com.domain.Aluno;
import com.gama.com.domain.Meta;
import com.gama.com.service.dto.AlunoDTO;
import com.gama.com.service.dto.MetaDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Meta} and its DTO {@link MetaDTO}.
 */
@Mapper(componentModel = "spring")
public interface MetaMapper extends EntityMapper<MetaDTO, Meta> {
    @Mapping(target = "aluno", source = "aluno", qualifiedByName = "alunoName")
    MetaDTO toDto(Meta s);

    @Named("alunoName")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    AlunoDTO toDtoAlunoName(Aluno aluno);
}
