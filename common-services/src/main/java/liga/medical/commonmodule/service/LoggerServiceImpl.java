package liga.medical.commonmodule.service;

import liga.medical.commonmodule.dto.entity.DBDebugLog;
import liga.medical.commonmodule.dto.entity.DBExceptionLog;
import liga.medical.commonmodule.dto.logger.LogDto;
import liga.medical.commonmodule.service.mapper.LogMapper;
import liga.medical.commonmodule.service.repository.LoggerDebugRepository;
import liga.medical.commonmodule.service.repository.LoggerExceptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoggerServiceImpl implements LoggerService {

    private final LogMapper mapper;

    private final LoggerDebugRepository debugRepository;

    private final LoggerExceptionRepository exceptionRepository;

    @Override
    public void saveDebugLog(LogDto logDto) {
        DBDebugLog dbLog = mapper.toDebugEntity(logDto);
        debugRepository.save(dbLog);
    }

    @Override
    public void saveExceptionLog(LogDto logDto) {
        DBExceptionLog dbLog = mapper.toExceptionEntity(logDto);
        exceptionRepository.save(dbLog);
    }

}
