package com.shonen.poc.resources.responses;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProdutoResponse extends BaseResponse {
    private String nome;

    private String observacao;

    private Long categoriaId;

    private CategoriaResponse categoria;
}
