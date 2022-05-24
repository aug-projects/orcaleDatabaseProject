package models;

public class Log {

    private  String type;
    private  String actionId;
    private  String data;

    public Log(String type, String actionId, String data) {
        this.type = type;
        this.actionId = actionId;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public String getActionId() {
        return actionId;
    }

    public String getData() {
        return data;
    }
}
