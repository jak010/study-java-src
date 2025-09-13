package practice.enums;

import lombok.Getter;

@Getter
public enum ErrorCode {

    BadRequest("400", "유효하지 않은 요청입니다."),
    NotFound("404", "요청한 페이지를 찾을 수 없다.");


    private final String errorCode;
    private final String errorMessage;

    ErrorCode(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }


}
