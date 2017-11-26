package addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.navigateToGroups();
        app.selectGoup();
        app.deleteSelectedGroups();
        app.returnToGoupPage();
    }
}
