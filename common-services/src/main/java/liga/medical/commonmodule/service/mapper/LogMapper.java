package liga.medical.commonmodule.service.mapper;

import liga.medical.commonmodule.dto.entity.DBDebugLog;
import liga.medical.commonmodule.dto.entity.DBExceptionLog;
import liga.medical.commonmodule.dto.logger.LogDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LogMapper {

    private final ModelMapper mapper;

    public LogDto toDto(DBDebugLog dbLog) {
        return mapper.map(dbLog, LogDto.class);
    }

    public DBDebugLog toDebugEntity(LogDto logDto) {
        return mapper.map(logDto, DBDebugLog.class);
    }

    public DBExceptionLog toExceptionEntity(LogDto logDto) {
        return mapper.map(logDto, DBExceptionLog.class);
    }

}
