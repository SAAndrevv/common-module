package liga.medical.commonmodule.service.repository;

import liga.medical.commonmodule.dto.entity.DBDebugLog;
import liga.medical.commonmodule.dto.entity.DBExceptionLog;
import org.springframework.data.repository.CrudRepository;

public interface LoggerExceptionRepository extends CrudRepository<DBExceptionLog, Long> {
}
