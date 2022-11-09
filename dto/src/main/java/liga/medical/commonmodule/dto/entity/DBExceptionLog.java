package liga.medical.commonmodule.dto.entity;

import liga.medical.commonmodule.dto.enums.SystemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "exception", schema = "log")
public class DBExceptionLog {

    @Id
    private String id;

    @Column(name = "system_type_id")
    private String systemTypeId;

    @Column(name = "method_params")
    private String methodParams;

}