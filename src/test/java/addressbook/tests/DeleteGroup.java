package addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().navigateToGroups();
        app.getGroupHelper().selectGoup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGoupPage();
    }
}
