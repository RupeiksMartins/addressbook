package addressbook.tests;

import addressbook.model.GroupObject;
import org.testng.annotations.Test;


public class CreateGroup extends TestBase {


    @Test
    public void testGroupCreation() {
        app.navigateToGroups();
        app.initGroupCreation();
        app.fillGroupForm(new GroupObject("group1", "Logo", "Comment"));
        app.submitGroupForm();
        app.returnToGoupPage();
    }
}
