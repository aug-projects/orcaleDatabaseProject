package controllers.viewsControllers;


import dao.CustomerDAO;
import dao.DepartmentDAO;
import dao.LogsDAO;
import dao.ProductDAO;
import models.Customer;
import models.Department;
import models.Log;
import models.Product;

import java.util.ArrayList;

public class ManagerWindowController {

/*
|--------------------------------------------------------------------------
| Customers
|--------------------------------------------------------------------------
|
*/

    public static boolean insertCustomer(Customer customer) {
        return CustomerDAO.insert(customer);
    }

    public static void updateCustomer(Customer customer) {
        CustomerDAO.update(customer);
    }

    public static ArrayList<Customer> getCustomers() {
        return CustomerDAO.getCustomers();
    }

/*
|--------------------------------------------------------------------------
| Department
|--------------------------------------------------------------------------
|
*/

    public static boolean insertDepartment(Department department) {
        return DepartmentDAO.insert(department);
    }

    public static void updateDepartment(Department department) {
        DepartmentDAO.update(department);
    }

    public static ArrayList<Department> getDepartments() {
        return DepartmentDAO.getDepartments();
    }

/*
|--------------------------------------------------------------------------
| Products
|--------------------------------------------------------------------------
|
*/

    public static boolean insertProduct(Product product) {
        return ProductDAO.insert(product);
    }

    public static void updateProduct(Product product) {
        ProductDAO.update(product);
    }

    public static ArrayList<Product> getProducts() {
        return ProductDAO.getProducts();
    }

    public static ArrayList<Product> getProductsByDepartmentID(String departmentID) {
        return ProductDAO.getProductsByDepartmentID(departmentID);
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
