
package controllers.viewsControllers;


import dao.CartDAO;
import models.Product;

import java.util.ArrayList;

public class CartCheckoutWindowController {
  
    public static ArrayList<Product> getCarBytCustomerId(String customerID) {
        return CartDAO.getCarBytCustomerId(customerID);
    }
}
