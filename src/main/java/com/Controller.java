package com;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EProduct")
public class Controller {

    @ResponseBody
    public String signUpCompanyDetails() {
        return "HelloWorld";
    }
}