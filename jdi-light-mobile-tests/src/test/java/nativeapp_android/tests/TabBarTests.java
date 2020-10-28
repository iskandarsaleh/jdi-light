package nativeapp_android.tests;

import com.epam.jdi.light.mobile.elements.composite.AndroidScreen;
import nativeapp_android.ApiDemosTestInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static nativeapp.android.apiDemos.IndexPage.*;
import static nativeapp.android.apiDemos.ViewsPage.*;
import static nativeapp.android.apiDemos.TabsPage.*;

public class TabBarTests extends ApiDemosTestInit {

    @BeforeMethod
    public void initSteps() {
        viewsPage.click();
        AndroidScreen.scrollDown(3000);
        tabsPage.click();
        scrollableButton.click();
    }

    @Test
    public void clickTabBarByNumberTest(){
        tab.selectByNumber(2);
        tabBar.is().selected("TAB 2");
        tabContent.is().text("Content for tab with tag Tab 2");
    }

    @Test
    public void clickTabBarByTabNameTest(){
        tabBar.selectByText("TAB 2");
        tabBar.is().selected("TAB 2");
        tabContent.is().text("Content for tab with tag Tab 2");
    }
}