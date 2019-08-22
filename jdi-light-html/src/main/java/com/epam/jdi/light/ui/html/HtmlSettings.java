package com.epam.jdi.light.ui.html;

import com.epam.jdi.light.elements.interfaces.complex.IsChecklist;
import com.epam.jdi.light.elements.interfaces.complex.IsCombobox;
import com.epam.jdi.light.elements.interfaces.complex.IsDropdown;
import com.epam.jdi.light.ui.html.elements.complex.Checklist;
import com.epam.jdi.light.ui.html.elements.complex.DataListOptions;
import com.epam.jdi.light.ui.html.elements.complex.Dropdown;

import static com.epam.jdi.light.elements.init.InitActions.INTERFACES;
import static com.epam.jdi.light.elements.init.PageFactory.PRE_INIT;
import static com.epam.jdi.tools.pairs.Pair.$;
import static java.util.Arrays.asList;

public class HtmlSettings {
    public static void init() {
        PRE_INIT.add("HtmlSettings", () -> {
            INTERFACES.add(new Object[][]{
                { IsDropdown.class, Dropdown.class },
                { IsChecklist.class, Checklist.class },
                { IsCombobox.class, DataListOptions.class }
            });
        });
    }
}
