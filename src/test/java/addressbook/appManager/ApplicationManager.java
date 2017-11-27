package addressbook.appManager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private SessionHelper sessionHelper;
    FirefoxDriver wd;
    private NavigationHelper navigationHelper;
    private GroupHelperBase groupHelper;

    public void init() {
        System.setProperty("webdriver.gecko.driver", "C:\\bin\\geckodriver.exe");
        wd = new FirefoxDriver();
        sessionHelper = new SessionHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        groupHelper = new GroupHelperBase(wd);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelperBase getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
