package io.github.epam.tests.recommended;

import io.github.epam.StaticTestsInit;
import java.nio.file.Paths;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.contactFormPage;
import static io.github.com.StaticSite.homePage;
import static io.github.com.pages.ContactFormPage.main;
import static io.github.com.pages.Header.loginForm;
import static io.github.com.pages.Header.userIcon;
import static io.github.epam.entities.Users.DEFAULT_USER;
import static io.github.epam.entities.Users.USER_WITH_CONTACTS;
import static io.github.epam.tests.recommended.steps.Preconditions.shouldBeLoggedIn;
import static io.github.epam.tests.recommended.steps.Preconditions.shouldBeLoggedOut;

public class FormsTests extends StaticTestsInit {

    @Test
    public void loginTest() {
        System.out.println(Paths.get(".").toAbsolutePath());
        shouldBeLoggedOut();
        userIcon.click();
        loginForm.submit(DEFAULT_USER, "enter");
        homePage.checkOpened();
    }

    @Test
    public void fillContactFormTest() {
        shouldBeLoggedIn();
        contactFormPage.shouldBeOpened();
        main.contactForm.submit(USER_WITH_CONTACTS);
        main.contactForm.check(USER_WITH_CONTACTS);
    }
}
