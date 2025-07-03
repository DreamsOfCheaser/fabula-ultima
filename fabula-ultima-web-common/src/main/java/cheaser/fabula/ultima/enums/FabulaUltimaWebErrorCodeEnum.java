package cheaser.fabula.ultima.enums;

import lombok.Getter;

public enum FabulaUltimaWebErrorCodeEnum {

    LOGIN_USERNAME_IS_NULL("LOGIN_USERNAME_IS_NULL", "用户名为空"),

    LOGIN_PASSWORD_IS_NULL("LOGIN_PASSWORD_IS_NULL", "密码为空");

    /**
     * 错误码
     */
    @Getter
    private String errorCode;

    /**
     * 错误信息
     */
    @Getter
    private String errorMessage;

    FabulaUltimaWebErrorCodeEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
