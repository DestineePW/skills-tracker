package oeg.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String displayHomePage() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> Here is a list of skills I'd like to learn!</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Ruby</>" +
                "<li>Python</li>" +
                "<li>F#</li>" +
                "<li>Scala</li>" +
                "<li>Perl</li>" +
                "<li>LISP</li>" +
                "</ol>" +
                "<p><a href='/form'>click here</a> to select your favorites.</p>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String displaySkillsForm(){
        return "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" +
                "<label>Name:<label>" +
                "<input type='text name='userName'/><br/>" +

                "<label>My Favorite Language: " +
                "<select name='fave1'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='ruby'>Ruby</option>" +
                "<option value='python'>Python</option>" +
                "<option value='f#'>F#</option>" +
                "<option value='scala'>Scala</option>" +
                "<option value='perl'>Perl</option>" +
                "<option value='lisp'>LISP</option>" +
                "</select><br/>"+


                "<label>My Second Favorite Language: " +
                "<select name='fave2'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='ruby'>Ruby</option>" +
                "<option value='python'>Python</option>" +
                "<option value='f#'>F#</option>" +
                "<option value='scala'>Scala</option>" +
                "<option value='perl'>Perl</option>" +
                "<option value='lisp'>LISP</option>" +
                "</select><br/>"+

                "<label>My Third Favorite Language" +
                "<select name='fave3'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='ruby'>Ruby</option>" +
                "<option value='python'>Python</option>" +
                "<option value='f#'>F#</option>" +
                "<option value='scala'>Scala</option>" +
                "<option value='perl'>Perl</option>" +
                "<option value='lisp'>LISP</option>" +
                "</select><br/>" +
                "<input type='submit' value='Submit'/>" +
                "</form>"+
                "</body>" +
                "</html>";

    }

    @PostMapping("/results")
    public String skillsOutput(@RequestParam String username, String fave1, String fave2, String fave3){
        return "<html>" +
                "<body>" +
                "<h1>" + username + "</h1>" +
                "<ol>" +
                "<li>" + fave1 + "</li>" +
                "<li>" + fave2 + "</li>" +
                "<li>" + fave3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


}
