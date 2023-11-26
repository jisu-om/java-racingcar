package racingcar.exception;

public enum ErrorMessage {
    ERROR_CAPTION("[ERROR] "),
    INVALID_CAR_NAMES("유효하지 않은 이름 형식 입니다."),
    DUPLICATE_CAR_NAMES("서로 다른 이름을 입력해 주세요."),
    INVALID_BLANK_CAR_NAME("유효하지 않은 이름 입니다."),
    INVALID_CAR_NAME_LENGTH("이름은 5자 이하여야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_CAPTION.message + message;
    }
}
