package SmartPhonePattern;

import java.util.HashMap;
import java.util.Map;

class Node {
    private String name;
    Map<String, Node> neighbors = new HashMap<String, Node>();
    private boolean state;

    Node(String sName, Map hNeighbors, boolean bState){
        name = sName;
        neighbors = hNeighbors;
        state = bState;
    }

    public String getName() {
        return name;
    }

    public boolean getState(){
        return state;
    }

    public void setState(boolean bState){
        state = bState;
    }

}
