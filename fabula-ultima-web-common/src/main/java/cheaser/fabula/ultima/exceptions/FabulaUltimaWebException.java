package cheaser.fabula.ultima.exceptions;

import lombok.Getter;

import java.io.Serial;

@Getter
public class FabulaUltimaWebException extends Throwable {
    @Serial
    private static final long serialVersionUID = 7988658956810374566L;
    /**
     * 错误码
     */
    private String ErrorCode;
    /**
     * 错误信息
     */
    private String ErrorMessage;
}
