package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class SkillsController {


     @GetMapping("/")
     public String skills()  {
          String html =  "<html>" +
                  "<body>" +
                  "<h1>Skills Tracker</h1>" +
                  "<h2>Skills we would like to learn:</h2>" +
                  "<ol>" +
                  "<li>Java</li>" +
                  "<li>Python</li>" +
                  "<li>JavaScript</li>" +
                  "</ol><br>" +
                  "<a href='http://localhost:8080/form'>Form</a>"+
                  "</body>" +
                  "</html>";
          return html;
     }

     @GetMapping("form")
     public String skillsForm() {
          String html = "<html>" +
                  "<body>" +
                  "<form method = 'post' action = 'complete'>" +
                  "<label for='name'>Please enter your name: </label> " +
                  "<input type = 'text' name = 'name' /><br>" +
                  "<label for='opt1'>Please rank the following languages: </label><br>" +
                  "<select name='opt1' id='opt1'>" +
                  "<option value='Python'>Python</option>" +
                  "<option value='JavaScript'>JavaScript</option>" +
                  "<option value='Java'>Java</option>" +
                  "<option value='Cobal'>Cobal</option>" +
                  "<option value='Fortran'>Fortran</option>" +
                  "<option value='Pascal'>Pascal</option>" +
                  "</select><br>" +
                  "<select name='opt2' id='opt2'>" +
                  "<option value='Python'>Python</option>" +
                  "<option value='JavaScript'>JavaScript</option>" +
                  "<option value='Java'>Java</option>" +
                  "<option value='Cobal'>Cobal</option>" +
                  "<option value='Fortran'>Fortran</option>" +
                  "<option value='Pascal'>Pascal</option>" +
                  "</select><br>" +
                  "<select name='opt3' id='opt3'>" +
                  "<option value='Python'>Python</option>" +
                  "<option value='JavaScript'>JavaScript</option>" +
                  "<option value='Java'>Java</option>" +
                  "<option value='Cobal'>Cobal</option>" +
                  "<option value='Fortran'>Fortran</option>" +
                  "<option value='Pascal'>Pascal</option>" +
                  "</select><br>" +
                  "<input type = 'submit' value = 'Submit' />" +
                  "</body>" +
                  "</html>";
          return html;
     }

     @RequestMapping(method = RequestMethod.POST, value="complete")
     public String skillsLearned(@RequestParam String name, @RequestParam String opt1, @RequestParam String opt2, @RequestParam String opt3)  {
          String html =  "<html>" +
                  "<body>" +
                  "<h1>"+name+"</h1>" +
                  "<ol>" +
                  "<li>"+opt1+"</li>" +
                  "<li>"+opt2+"</li>" +
                  "<li>"+opt3+"</li>" +
                  "</ol>" +
                  "<a href='http://localhost:8080/'>Home</a>"+
                  "</body>" +
                  "</html>";
          return html;
     }
}
