package com.agent.rater.configuration;

import com.agent.rater.dao.RaterDao;
import com.agent.rater.endpoint.CustomerEndpoint;
import com.agent.rater.enums.RoleType;
import com.agent.rater.handler.login.LoginHandler;
import com.agent.rater.handler.login.implementations.LoginHandlerImpl;
import com.agent.rater.mediator.login.LoginMediator;
import com.agent.rater.mediator.login.implementations.LoginMediatorImpl;
import com.agent.rater.model.Rater;
import com.agent.rater.model.UserCredentials;
import com.agent.rater.service.login.LoginService;
import com.agent.rater.service.login.implementations.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class CustomerConfiguration {

    @Autowired
    RaterDao raterDao;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public CustomerEndpoint userEndpoint() {
        return new CustomerEndpoint();
    }

    @Bean
    public LoginHandler loginHandler() {
        return new LoginHandlerImpl(loginMediator());
    }

    @Bean
    public LoginMediator loginMediator() {
        return new LoginMediatorImpl(loginService());
    }

    @Bean
    public LoginService loginService() {
        PasswordEncoder passwordEncoder = passwordEncoder();
        try {
            UserCredentials userCredentials1 = new UserCredentials("ross", passwordEncoder.encode("pass"));
            UserCredentials userCredentials2 = new UserCredentials("ross1", passwordEncoder.encode("pass"));
            UserCredentials userCredentials3 = new UserCredentials("ross2", passwordEncoder.encode("pass"));
            UserCredentials userCredentials4 = new UserCredentials("ross3", passwordEncoder.encode("pass"));
            UserCredentials userCredentials5 = new UserCredentials("ross4", passwordEncoder.encode("pass"));

            raterDao.save(new Rater("rossy1", "mb", "ross", "email", "address", "town", "dublin", "eir", userCredentials1));
            raterDao.save(new Rater("rossy2", "mb", "ross1", "email", "address", "town", "dublin", "eir", userCredentials2));
            raterDao.save(new Rater("rossy3", "mb", "ross2", "email", "address", "town", "dublin", "eir", userCredentials3));
            raterDao.save(new Rater("rossy4", "mb", "ross3", "email", "address", "town", "dublin", "eir", userCredentials4));
            raterDao.save(new Rater("rossy5", "mb", "ross4", "email", "address", "town", "dublin", "eir", userCredentials5));
        } catch (Exception ignore) {

        }
        return new LoginServiceImpl();
    }
}
