package com.agent.rater.customer.endpoint;

import com.agent.rater.customer.handler.login.LoginHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class CustomerEndpoint {

    @Autowired
    private LoginHandler loginHandler;

    @GetMapping("/index")
    public String index() {
        return "index page";
    }

    @GetMapping("/login")
    public String login() {
        return loginHandler.login();
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession)
    {
        if(httpSession != null) {
            httpSession.invalidate();
        }
        return "log out";
    }
}
