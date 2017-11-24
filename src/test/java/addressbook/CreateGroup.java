package addressbook;

import org.testng.annotations.Test;


public class CreateGroup extends TestBase {


    @Test
    public void testGroupCreation() {
        navigateToGroups();
        initGroupCreation();
        fillGroupForm(new GroupObject("group1", "Logo", "Comment"));
        submitGroupForm();
        returnToGoupPage();
    }
}
