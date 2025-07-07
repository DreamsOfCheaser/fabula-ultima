package cheaser.fabula.ultima.enums;

import lombok.Getter;

public enum FabulaUltimaWebErrorCodeEnum {

    LOGIN_USERNAME_IS_NULL("LOGIN_USERNAME_IS_NULL", "用户名为空"),

    LOGIN_USERNAME_PATTERN_NOT_MATCH("LOGIN_USERNAME_PATTERN_NOT_MATCH", "用户名格式错误"),

    LOGIN_PASSWORD_IS_NULL("LOGIN_PASSWORD_IS_NULL", "密码为空");

    /**
     * 错误码
     */
    @Getter
    private final String errorCode;

    /**
     * 错误信息
     */
    @Getter
    private final String errorMessage;

    FabulaUltimaWebErrorCodeEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
