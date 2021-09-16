package SmartPhonePattern;

import java.util.HashMap;
import java.util.Map;

class Node {
    private String name;
    Map<String, Boolean> neighbors = new HashMap<String, Boolean>();
    private boolean state;

    Node(String sName, Map<String, Boolean> hNeighbors, boolean bState){
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
}
