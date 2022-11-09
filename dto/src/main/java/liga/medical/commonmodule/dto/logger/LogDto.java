package liga.medical.commonmodule.dto.logger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogDto {

    private String id;
    private String systemTypeId;
    private String methodParams;

}
