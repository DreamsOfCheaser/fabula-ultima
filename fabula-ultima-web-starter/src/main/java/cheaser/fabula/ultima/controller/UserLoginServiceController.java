package cheaser.fabula.ultima.controller;

import cheaser.fabula.ultima.user.UserLoginService;
import cheaser.utils.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static cheaser.fabula.ultima.enums.FabulaUltimaWebErrorCodeEnum.LOGIN_PASSWORD_IS_NULL;
import static cheaser.fabula.ultima.enums.FabulaUltimaWebErrorCodeEnum.LOGIN_USERNAME_IS_NULL;

@Slf4j
@Controller("/users")
public class UserLoginServiceController {

    private UserLoginService loginService;

    @Autowired
    public UserLoginServiceController(UserLoginService userLoginService){
        this.loginService = userLoginService;
    }

    @RequestMapping("/login")
    public Result<String> userLogin(@RequestParam String userName, @RequestParam String password){
        try{
            Assert.notNull(userName, LOGIN_USERNAME_IS_NULL.getErrorMessage());
            Assert.notNull(password, LOGIN_PASSWORD_IS_NULL.getErrorMessage());

            String result = loginService.userLoginByUserNameAndPassword(userName, password);
            return Result.success(result);
        }catch (Exception e){
            log.error("UserLoginServiceController#userLogin exception:{}", e.getMessage());
            return Result.failure(e.getMessage());
        }
    }
}
