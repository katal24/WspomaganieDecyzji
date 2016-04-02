package sp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dawid on 02.04.16.
 */
@Controller
@RequestMapping("/kontroler")
public class BaseController {

    @Autowired
    private Inquiry inquiry;        // chcemy miec obiekt Inquiry i miec go dostepnego pod nazwa inquiry

    @RequestMapping("/metoda")
    public String metoda(){
        return "glowny";
    }

    // metoda ustawia atrybut, ktory bedzie dostepny z poziomu widoku:  ${message}
    @RequestMapping("/przyklad/model")
    public String przykladModelu(Model model){
        model.addAttribute("message", "To jest super inormacja przekazana z widoku");
        return "glowny";
    }


}
