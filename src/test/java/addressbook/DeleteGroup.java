package addressbook;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    @Test
    public void testGroupDeletion() {
        navigateToGroups();
        selectGoup();
        deleteSelectedGroups();
        returnToGoupPage();
    }
}
