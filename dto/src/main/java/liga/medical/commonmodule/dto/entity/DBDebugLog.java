package liga.medical.commonmodule.dto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "debug", schema = "log")
public class DBDebugLog {

    @Id
    private String id;

    @Column(name = "system_type_id")
    private String systemTypeId;

    @Column(name = "method_params")
    private String methodParams;

}
