package com.fatec.cidade.mapping;

import com.fatec.cidade.dto.CidadeRequest;
import com.fatec.cidade.dto.CidadeResponse;
import com.fatec.cidade.entities.Cidade;

public class CidadeMapper {
    
    public static Cidade toEntity(CidadeRequest request){
        Cidade cidade = new Cidade();
        cidade.setNome(request.nome());
        cidade.setEstado(request.estado());
        cidade.setPop(request.pop());
        cidade.setPib(request.pib());
        return cidade;
    }

    public static CidadeResponse toDTO(Cidade cidade){
        return new CidadeResponse(cidade.getId(),
                                    cidade.getNome(),
                                    cidade.getEstado(),
                                    cidade.getPop(),
                                    cidade.getPib());
    }
}
