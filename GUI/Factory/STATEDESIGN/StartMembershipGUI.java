// Author -Emmet Browne
package GUI.Factory.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.Factory.GUI;
import GUI.Factory.GUIFactory;

public class StartMembershipGUI implements State {

    @Override
    public void enterGUI() throws FileNotFoundException, IOException {
        // factory method
        GUIFactory gui = new GUIFactory();
        GUI Membership = gui.getGUI("Membership");
        Membership.Create();

    }

}