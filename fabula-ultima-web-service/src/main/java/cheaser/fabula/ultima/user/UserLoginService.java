package cheaser.fabula.ultima.user;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import static cheaser.fabula.ultima.enums.FabulaUltimaWebErrorCodeEnum.LOGIN_USERNAME_IS_NULL;
import static cheaser.fabula.ultima.enums.FabulaUltimaWebErrorCodeEnum.LOGIN_USERNAME_PATTERN_NOT_MATCH;

@Service
@Slf4j
public class UserLoginService {

    private final String USERNAME_PATTERN = "^[a-zA-Z0-9]{4,16}$";

    public String userLoginByUserNameAndPassword(String userName, String password) {
        log.info("UserLoginService#userLoginByUserNameAndPassword userName:{}, password:{}", userName, password);
        this.checkLoginUserNameFormat(userName);
        return userName;
    }

    private void checkLoginUserNameFormat(String userName) {
        Assert.notNull(userName, LOGIN_USERNAME_IS_NULL.getErrorMessage());
        Assert.isTrue(userName.matches(USERNAME_PATTERN), LOGIN_USERNAME_PATTERN_NOT_MATCH.getErrorMessage());
    }
}
