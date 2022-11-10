package liga.medical.commonmodule.dto.logger;

import liga.medical.commonmodule.dto.enums.SystemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogDto {

    private String id;
    private SystemType systemTypeId;
    private String methodParams;

}
