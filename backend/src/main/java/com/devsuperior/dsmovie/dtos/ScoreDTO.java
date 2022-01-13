package com.devsuperior.dsmovie.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ScoreDTO {

    private long movieId;
    private String email;
    private Double score;

}
