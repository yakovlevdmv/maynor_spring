package ru.yakovlevdmv;

import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 1 on 09.03.2017.
 */

@Controller
@Slf4j
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @RequestMapping("/")
    public String person(Model model) {
        model.addAttribute("persons", repository.findAll());

        return "index";
    }

}
