package br.com.bechepechesoftware.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PessoaDTO {

    private Long id;

    private String nome;

    private Integer idade;

}
