
package controllers.interfaceListeners;

import model.Product;


public interface InsertNewProductActionListener {
    
     boolean insertNewProductListener(Product product,String idDepartment);
   
}
