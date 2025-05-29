package lt.viko.zdybel.cucumber;

import io.cucumber.java.en.Given;

public class MyStepdefs {


    private String today;
    @Given("today is Sunday")
    public void todayIsSunday() {
        today = "Sunday"
    }
}
