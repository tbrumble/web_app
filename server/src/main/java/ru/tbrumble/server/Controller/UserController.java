package ru.tbrumble.server.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.tbrumble.restapi.Model.Web.WebUser;
import ru.tbrumble.restapi.service.user.web.WebUserService;


import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name = "webUserImpl")
    private WebUserService userServiceImpl;

    @GetMapping(value = "/get-all-users")
    public ResponseEntity<List<WebUser>>
    getAllUsers() {
        return new ResponseEntity<>(
                userServiceImpl.getUsers(),
                HttpStatus.OK);
    }
}
