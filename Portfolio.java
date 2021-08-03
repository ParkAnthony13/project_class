import java.util.ArrayList;

public class Portfolio {
    private static ArrayList<Object> port = new ArrayList<Object>();

    public ArrayList<Object> addItem(Project anotherObject) {
        this.port.add(anotherObject);
        return this.port;
    }
    public ArrayList<Object> returnList(){
        return port;
    }
}