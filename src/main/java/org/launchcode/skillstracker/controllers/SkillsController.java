package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class SkillsController {

     @GetMapping("/")
     public String skills() {
          String html =  "<html>" +
                  "<body>" +
                  "<h1>Skills Tracker</h1>" +
                  "<h2>Skills we would like to learn:</h2>" +
                  "<ol>" +
                  "<li>This will</li>" +
                  "<li>be a</li>" +
                  "<li>for loop</li>" +
                  "</ol>" +
                  "</body>" +
                  "</html>";
          return html;
     }
}
