package nativeapp.ios.epamiostestapp;

import com.epam.jdi.light.mobile.elements.common.app.ios.MenuItem;
import com.epam.jdi.light.mobile.elements.pageobjects.annotations.MobileFindBy;

public class MainPage {

    @MobileFindBy(xpath = "//XCUIElementTypeCell[@name=\"DatePicker\"]")
    public static MenuItem menuDataPicker;

    @MobileFindBy(xpath = "//XCUIElementTypeCell[@name=\"Slider\"]")
    public static MenuItem menuSliderItem;

    @MobileFindBy(xpath = "//XCUIElementTypeCell[@name=\"ActionSheet\"]")
    public static MenuItem menuActionSheet;

    @MobileFindBy(xpath = "//XCUIElementTypeCell[@name=\"ContextMenu\"]")
    public static MenuItem menuContextMenu;

    @MobileFindBy(xpath = "//XCUIElementTypeCell[@name=\"ToggleSwitch\"]")
    public static MenuItem menuToggleSwitch;

    @MobileFindBy(xpath = "//XCUIElementTypeCell[@name=\"AlertDialog\"]")
    public static MenuItem menuAlertDialog;

    @MobileFindBy(xpath = "//XCUIElementTypeCell[@name=\"TabView\"]")
    public static MenuItem menuTabView;

    @MobileFindBy(xpath = "//XCUIElementTypeButton[@name=\"TextField\"]")
    public static MenuItem menuTextField;

    @MobileFindBy(xpath = "//XCUIElementTypeButton[@name=\"SegmentedControl\"]")
    public static MenuItem menuSegmentedControl;

    @MobileFindBy(xpath = "//XCUIElementTypeButton[@name=\"Stepper\"]")
    public static MenuItem menuStepper;

}