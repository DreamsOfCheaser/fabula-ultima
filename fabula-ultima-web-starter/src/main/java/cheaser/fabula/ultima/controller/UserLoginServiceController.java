package cheaser.fabula.ultima.controller;

import cheaser.fabula.ultima.user.UserLoginService;
import cheaser.utils.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static cheaser.fabula.ultima.enums.FabulaUltimaWebErrorCodeEnum.LOGIN_PASSWORD_IS_NULL;
import static cheaser.fabula.ultima.enums.FabulaUltimaWebErrorCodeEnum.LOGIN_USERNAME_IS_NULL;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserLoginServiceController {

    private final UserLoginService loginService;

    @Autowired
    public UserLoginServiceController(UserLoginService userLoginService){
        this.loginService = userLoginService;
    }

    @RequestMapping("/login")
    public Result<String> userLogin(@RequestParam String userName, @RequestParam String password){
        try{
            String result = loginService.userLoginByUserNameAndPassword(userName, password);
            return Result.success(result);
        }catch (Exception e){
            log.error("UserLoginServiceController#userLogin exception:{}", e.getMessage());
            return Result.failure(e.getMessage());
        }
    }
    
    @RequestMapping("/signUp")
    public Result<String> signUp(@RequestParam String userName, @RequestParam String password){
        try{
            Assert.notNull(userName, LOGIN_USERNAME_IS_NULL.getErrorMessage());
            Assert.notNull(password, LOGIN_PASSWORD_IS_NULL.getErrorMessage());

            return Result.success(null);
        }catch (Exception e){
            log.error("UserLoginServiceController#signUp exception:{}", e.getMessage());
            return Result.failure(e.getMessage());
        }
    }
}
