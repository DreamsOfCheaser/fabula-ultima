package cheaser.utils.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = -2462037350134039852L;

    /**
     * 消息结果
     */
    private T result;

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 错误码
     */
    private String errorMessage;

}
