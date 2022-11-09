package liga.medical.commonmodule.service.repository;

import liga.medical.commonmodule.dto.entity.DBDebugLog;
import org.springframework.data.repository.CrudRepository;

public interface LoggerDebugRepository extends CrudRepository<DBDebugLog, Long> {

}
