package com.agent.rater.service.rater.implementations;

import com.agent.rater.dao.RaterDao;
import com.agent.rater.model.users.Rater;
import com.agent.rater.service.rater.CreateRaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CreateRaterServiceImpl implements CreateRaterService {

    @Autowired
    private RaterDao raterDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String create(Rater rater) {
        encodePassword(rater);
        Rater savedRater = raterDao.save(rater);
        return savedRater.getUsername();
    }

    private void encodePassword(Rater rater) {
        String password = rater.getCredentials().getPassword();
        String encodedPassword = passwordEncoder.encode(password);
        rater.getCredentials().setPassword(encodedPassword);
    }
}
