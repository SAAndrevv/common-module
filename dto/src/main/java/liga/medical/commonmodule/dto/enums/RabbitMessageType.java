package liga.medical.commonmodule.dto.enums;

public enum RabbitMessageType {
    DAILY("daily"), ALERT("alert"), ERROR("error");

    private final String type;

    RabbitMessageType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
