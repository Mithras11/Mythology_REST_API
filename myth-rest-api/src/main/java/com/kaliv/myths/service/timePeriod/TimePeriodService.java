package com.kaliv.myths.service.timePeriod;

import com.kaliv.myths.dto.timePeriodDtos.CreateTimePeriodDto;
import com.kaliv.myths.dto.timePeriodDtos.UpdateTimePeriodDto;
import com.kaliv.myths.dto.timePeriodDtos.TimePeriodDto;

import java.util.List;

public interface TimePeriodService {
    List<TimePeriodDto> getAllTimePeriods();

    TimePeriodDto getTimePeriodById(long id);

    TimePeriodDto createTimePeriod(CreateTimePeriodDto dto);

    TimePeriodDto updateTimePeriod(long id, UpdateTimePeriodDto dto);

    void deleteTimePeriod(long id);
}
