package mugikortalde.mugikorrak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mugikortalde.mugikorrak.model.MugikorrakRepository;

@RestController
@RequestMapping(path = "/mugikorrak")
public class MainController {
    @Autowired
    private MugikorrakRepository mugikorrakRepository;
}
