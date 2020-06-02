package com;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EProduct")
public class EmployeeProductController {

    @ResponseBody
    public String signUpCompanyDetails() {
        return "HelloWorld";
    }
}