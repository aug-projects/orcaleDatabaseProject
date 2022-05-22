
package controllers.viewsControllers;


import dao.CustomerDAO;
import model.Customer;

public class CustomerLoginController {

    public static Customer login(String username, String password) {
        return CustomerDAO.login(username,password);
    }
}
