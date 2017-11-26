package addressbook.tests;

import addressbook.model.GroupObject;
import org.testng.annotations.Test;


public class CreateGroup extends TestBase {


    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().navigateToGroups();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupObject("goup after layering", "Logo", "Comment"));
        app.getGroupHelper().submitGroupForm();
        app.getGroupHelper().returnToGoupPage();
    }
}
