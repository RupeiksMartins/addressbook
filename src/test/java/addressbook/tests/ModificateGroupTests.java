package addressbook.tests;

import addressbook.model.GroupObject;
import org.testng.annotations.Test;

public class ModificateGroupTests extends TestBase{
    @Test
    public void testGroupModification() {
        app.getNavigationHelper().navigateToGroups();
        app.getGroupHelper().selectGoup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupObject("goup after layering", "Logo", "Comment"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGoupPage();
    }
}
