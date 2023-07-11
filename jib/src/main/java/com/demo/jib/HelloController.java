package com.demo.jib;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hifi")
    public String welcome()
    {
        //return "Welcome To Gcp with new Features and innovations";
        return "Google Cloud consists of a set of physical assets, such as computers and hard disk drives, and virtual resources, such as virtual machines (VMs), that are contained in Google's data centers around the globe";
    }

}
