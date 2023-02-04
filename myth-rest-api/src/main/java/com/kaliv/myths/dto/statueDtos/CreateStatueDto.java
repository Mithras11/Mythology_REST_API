package com.kaliv.myths.dto.statueDtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateStatueDto {
    @NotBlank
    private String name;

    @Positive
    private Long AuthorId;

    @Positive
    private Long MythId;

    @Positive
    private Long MuseumId;

    private Set<@Positive Long> mythCharacterIds;

    private Set<@Positive Long> statueImageIds;
}
