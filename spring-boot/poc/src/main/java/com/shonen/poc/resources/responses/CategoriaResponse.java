package com.shonen.poc.resources.responses;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class CategoriaResponse extends BaseResponse {
    private String nome;
}
