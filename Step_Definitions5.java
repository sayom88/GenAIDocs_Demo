```java
public class StepDefinitions {
    private WebDriver driver;

    public StepDefinitions(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Open the PTSB mortgage calculator site
     * @param url the URL to navigate to
     */
    public void openPTSBMortgageCalculatorSite(String url) {
        driver.get(url);
    }

    /**
     * Select "First Time Buyer" as the Buyer Type
     */
    public void selectFirstTimeBuyer() {
        driver.findElement(By.cssSelector("select.buyer-type")).sendKeys("First Time Buyer");
    }

    /**
     * Select "Single" as the Application Type
     */
    public void selectSingleApplicationType() {
        driver.findElement(By.cssSelector("select.application-type")).sendKeys("Single");
    }

    /**
     * Select "Single" as the Marital Status
     */
    public void selectSingleMaritalStatus() {
        driver.findElement(By.cssSelector("select.marital-status")).sendKeys("Single");
    }

    /**
     * Answer "No" to having dependents
     */
    public void answerNoToDependents() {
        driver.findElement(By.cssSelector("input.dependents-no")).click();
    }

    /**
     * Enter age
     * @param age the age to enter
     */
    public void enterAge(String age) {
        driver.findElement(By.cssSelector("input.age")).sendKeys(age);
    }

    /**
     * Enter annual income
     * @param income the annual income to enter
     */
    public void enterAnnualIncome(String income) {
        driver.findElement(By.cssSelector("input.annual-income")).sendKeys(income);
    }

    /**
     * Select loan term
     * @param term the loan term to select
     */
    public void selectLoanTerm(String term) {
        driver.findElement(By.cssSelector("select.loan-term")).sendKeys(term);
    }

    /**
     * Click the "Calculate" button
     */
    public void clickCalculateButton() {
        driver.findElement(By.cssSelector("button.calculate")).click();
    }

    /**
     * Validate the maximum borrowing amount is displayed
     */
    public void validateMaximumBorrowingAmountDisplayed() {
        Assert.assertTrue(driver.findElement(By.cssSelector("div.maximum-borrowing-amount")).isDisplayed());
    }

    /**
     * Validate the estimated monthly repayments are displayed
     */
    public void validateEstimatedMonthlyRepaymentsDisplayed() {
        Assert.assertTrue(driver.findElement(By.cssSelector("div.estimated-monthly-repayments")).isDisplayed());
    }

    /**
     * Validate any additional mortgage-related benefits are displayed
     */
    public void validateAdditionalMortgageBenefitsDisplayed() {
        Assert.assertTrue(driver.findElement(By.cssSelector("div.additional-mortgage-benefits")).isDisplayed());
    }
}
```