package pl.owi;
import java.util.ArrayList;
import pl.owi.Storehouse;
import pl.owi.ProductPC;

public class Groups {

    ArrayList<Storehouse> groups;

    Groups() {
        this.groups = new ArrayList<Storehouse>();

    }

    public void addgroup(String groupname) {
        this.groups.add(new Storehouse(100));

    }

    public void showgroup() {

        for (Storehouse y : this.groups) {
            System.out.println(y.groupname);

        }
    }

    public Storehouse choicegroup(String groupname) {

        for (Storehouse x : this.groups) {

            if (x.groupname.contains(groupname)) {
                return x;
            }

        }
        return null;
    }
}
