package controllers;


import play.*;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


private FormFactory formFactory;

@inject

public HomeController (FormFactory){
    this.formFactory = f;

    public Result addMember(){
        Form<product> productForm = formFactory.form(product.class);
          return ok(addMember.render(productForm));
    
    
    }

}

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result addMember() {
        return ok(addMember.render());
    }


    public Result deleteMember(Long id){
      Member.find.ref(id).delete();

      flash("Deleted")

      return redirect(routes.HomeController.index)

    }

    



}
