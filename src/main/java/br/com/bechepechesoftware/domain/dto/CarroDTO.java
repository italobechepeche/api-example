package br.com.bechepechesoftware.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarroDTO {

    private Long id;

    private String modelo;

    private Integer ano;

}
