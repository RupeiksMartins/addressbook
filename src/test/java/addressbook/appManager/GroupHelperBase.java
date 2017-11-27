package addressbook.appManager;

import addressbook.model.GroupObject;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelperBase extends HelperBase{

    public GroupHelperBase(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToGoupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupForm() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupObject groupObject) {
        type(By.name("group_name"), groupObject.getName());
        type(By.name("group_header"), groupObject.getLogo());
        type(By.name("group_footer"), groupObject.getComment());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGoup() {
        click(By.cssSelector("span.group"));
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            click(By.name("selected[]"));
        }
    }
}
