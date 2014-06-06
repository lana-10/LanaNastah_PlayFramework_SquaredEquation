package controllers;


import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import models.User;



public class Application extends Controller {
final static Form<User> userForm = Form.form(User.class);
    public static Result index() {
        return ok(index.render(userForm));
    }
    

	public static Result submit()
    {
    	
    	Form<User> filledForm = userForm.bindFromRequest();
    	User created = filledForm.get();
    	String a1 = created.a;
    	String b1 = created.b;
    	String c1 = created.c;
    	int a = Integer.parseInt(a1);
    	int b = Integer.parseInt(b1);
    	int c = Integer.parseInt(c1);
    	if (a ==0 )
    	{
    		  return ok(submit.render("a musn't be 0"));
    		
    	}
   	 int delta;
 	double x1=0.0,x2=0.0;
 	        delta = (b*b)-(4*a*c);
 	     
 	               if (delta>0){

 	        x1 = ((-b) + (Math.sqrt(delta)))/(2*a);
 	        x2 = ((-b) - (Math.sqrt(delta)))/(2*a);
 	       return ok(submit.render("delta > 0 and the equation has two solutions x1=  " + x1 +" and x2= " + x2 ));
 	        //return "delta > 0 and the equation has two solutions x1=  " + x1 +" and x2= " + x2 +"<br><br>";
 	           }

 	 else if(delta ==0)
 	        {
 	 x1  = -b / (2*a);
 	return ok(submit.render("delta = 0 and the equation has one solutions x1 = x2 =  " + x1 ));
	
 	 // return "delta = 0 and the equation has one solutions x1 = x2 =  " + x1 +"<br><br>";
 	 }
 	 else{

    	
      	return ok(submit.render("delta" + "<" +" 0 and the equation has no solution"));
    	
    }

}

}
