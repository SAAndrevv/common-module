package liga.medical.commonmodule.service;

import liga.medical.commonmodule.dto.logger.LogDto;

public interface LoggerService {

    void saveDebugLog(LogDto logDto);
    void saveExceptionLog(LogDto logDto);

}
