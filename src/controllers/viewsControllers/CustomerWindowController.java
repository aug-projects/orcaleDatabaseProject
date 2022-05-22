
package controllers.viewsControllers;


import dao.DepartmentDAO;
import dao.ProductDAO;
import model.Department;
import model.Product;

import java.util.ArrayList;

public class CustomerWindowController {

    public static ArrayList<Department> getDepartments() {
        return DepartmentDAO.getDepartments();
    }

    public static ArrayList<Product> getProductsByDepartmentID(String departmentID) {
        return ProductDAO.getProductsByDepartmentID(departmentID);
    }
}
