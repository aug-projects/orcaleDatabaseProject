
package controllers.interfaceListeners;

import models.Product;


public interface InsertNewProductActionListener {
    
     boolean insertNewProductListener(Product product,String idDepartment);
   
}
