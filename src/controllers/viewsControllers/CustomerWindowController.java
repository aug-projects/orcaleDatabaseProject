
package controllers.viewsControllers;


import dao.*;
import models.*;

import java.util.ArrayList;

public class CustomerWindowController {

/*
|--------------------------------------------------------------------------
| Department
|--------------------------------------------------------------------------
|
*/

    public static ArrayList<Department> getDepartments() {
        return DepartmentDAO.getDepartments();
    }

    public static ArrayList<Product> getProductsByDepartmentID(String departmentID) {
        return ProductDAO.getProductsByDepartmentID(departmentID);
    }

/*
|--------------------------------------------------------------------------
| carts
|--------------------------------------------------------------------------
|
*/

    public static String getCartCustomerByProduct(String productId,String customerId) {
        return CartDAO.getCartCustomerByProduct(productId,customerId);
    }

    public static boolean insertCart(Cart cart) {
        return CartDAO.insert(cart);
    }

    public static void updateCart(Cart cart) {
        CartDAO.update(cart);
    }


/*
|--------------------------------------------------------------------------
| Favourite Product
|--------------------------------------------------------------------------
|
*/

    public static boolean insertFavouriteProduct(FavouriteProduct favouriteProduct) {
        return  FavouriteProductDAO.insert(favouriteProduct);
    }

    public static void deleteFavouriteProduct(String productId) {
        FavouriteProductDAO.delete(productId);
    }

    public static boolean getFavouriteByProductId(String productId) {
        return FavouriteProductDAO.getFavouriteByProductId(productId);
    }

    public static ArrayList<Product> getFavouritesByProductId(String productId) {
        return FavouriteProductDAO.getFavouritesByProductId(productId);
    }

/*
|--------------------------------------------------------------------------
| Log
|--------------------------------------------------------------------------
|
*/

    public static boolean insertLogs(Log logs) {
        return LogsDAO.insert(logs);
    }

}
