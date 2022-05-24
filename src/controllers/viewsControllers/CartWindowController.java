
package controllers.viewsControllers;


import dao.CartDAO;
import dao.OrderDAO;
import dao.ProductDAO;
import models.Order;
import models.OrderDetails;

public class CartWindowController {

/*
|--------------------------------------------------------------------------
| Products
|--------------------------------------------------------------------------
|
*/

    public static boolean insertOrder(Order order) {
        return OrderDAO.insert(order);
    }

    public static boolean insertOrderDetails(OrderDetails orderDetails) {
        return OrderDAO.insertOrderDetails(orderDetails);
    }

    public static void clear(String productId) {
         CartDAO.delete(productId);
    }

    public static void update(int quantity,String productID) {
        ProductDAO.updateQuantity(quantity,productID);
    }
}
