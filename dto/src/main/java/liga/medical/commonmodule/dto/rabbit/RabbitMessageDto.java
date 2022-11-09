package liga.medical.commonmodule.dto.rabbit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RabbitMessageDto {

    private long id;
    @NotEmpty(message = "Field type can't be an empty")
    private String type;
    private String message;

}
