
package controllers.viewsControllers;


import dao.LogsDAO;
import models.Log;

public class MainWindowController {


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
