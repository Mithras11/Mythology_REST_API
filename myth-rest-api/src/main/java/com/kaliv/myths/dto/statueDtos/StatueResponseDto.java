package com.kaliv.myths.dto.statueDtos;

import java.util.Set;

import com.kaliv.myths.dto.BaseDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StatueResponseDto extends BaseDto {
    private BaseDto Author;
    private BaseDto Myth;
    private BaseDto Museum;
    private Set<BaseDto> mythCharacters;
    private Set<BaseDto> statueImages;
    private Set<BaseDto> smallStatueImages;
}
