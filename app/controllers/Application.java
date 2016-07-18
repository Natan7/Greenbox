package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
    
    private List<User> listUsers = new ArrayList<>();

    public static Result index() {
        return ok(views.html.index.render("Green Box"));
    }

    public static Result cadastro() {
        return ok(cadastro.render());
    }

    public static  Result login() {
        return ok(home.render());
    }

    
}
