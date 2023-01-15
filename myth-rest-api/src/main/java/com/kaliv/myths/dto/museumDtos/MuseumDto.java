package com.kaliv.myths.dto.museumDtos;

import java.util.Set;

import com.kaliv.myths.dto.BaseDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MuseumDto extends BaseDto {
    private Set<Long> statueIds;
    private Set<Long> paintingIds;
}
