package facebook;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name = "LoginPass")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"irasnat@gmail.com","89024","//*[@id=\"error_box\"]"},
                {"irasnat   2013@gmail.com", "890    924", "//*[@id=\"error_box\"]"},
                {"irasnat2013@gmail.com","ooo","//*[@id=\"error_box\"]"},
                {"irasnat2013@gmail.com", "", "//*[@id=\"error_box\"]"},
                {"", "890924", "//*[@id=\"error_box\"]"},
                {"ooo", "890924", "//*[@id=\"error_box\"]"},
                {"", "", "//*[@id=\"error_box\"]"},
                {"    ", "        ", "//*[@id=\"error_box\"]"},
                {"/","]","//*[@id=\"error_box\"]"},
                {"irasnat2013@gmail.com", "890924", "//*[@id=\"facebook\"]/body/div[3]/div[1]/div/div[2]/div/div/div "}
               };
        return data;
    }
}
