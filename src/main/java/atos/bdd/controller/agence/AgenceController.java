package atos.bdd.controller;

import atos.bdd.dao.IAgenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgenceController {

    IAgenceDao iAgenceDao;

    @Autowired
    public AgenceController(IAgenceDao iAgenceDao) {
        this.iAgenceDao = iAgenceDao;
    }
}
