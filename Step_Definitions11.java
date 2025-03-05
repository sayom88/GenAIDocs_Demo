```java
public class StepDefinitions {
    private WebDriver driver;

    public StepDefinitions(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Navigate to the Nationwide Mortgage Calculator portal link
     * @param url the URL to navigate to
     */
    public void navigateToMortgageCalculator(String url) {
        driver.get(url);
    }

    /**
     * Select buyer details
     * @param buyerDetails the buyer details to select
     */
    public void selectBuyerDetails(String buyerDetails) {
        driver.findElement(By.xpath("//select[@id='buyerDetails']")).sendKeys(buyerDetails);
    }

    /**
     * Enter property price
     * @param propertyPrice the property price to enter
     */
    public void enterPropertyPrice(String propertyPrice) {
        driver.findElement(By.xpath("//input[@id='propertyPrice']")).sendKeys(propertyPrice);
    }

    /**
     * Enter deposit amount
     * @param depositAmount the deposit amount to enter
     */
    public void enterDepositAmount(String depositAmount) {
        driver.findElement(By.xpath("//input[@id='depositAmount']")).sendKeys(depositAmount);
    }

    /**
     * Select length of mortgage
     * @param lengthOfMortgage the length of mortgage to select
     */
    public void selectLengthOfMortgage(String lengthOfMortgage) {
        driver.findElement(By.xpath("//select[@id='lengthOfMortgage']")).sendKeys(lengthOfMortgage);
    }

    /**
     * Enter number of people on the mortgage
     * @param numberOfPeople the number of people to enter
     */
    public void enterNumberOfPeople(String numberOfPeople) {
        driver.findElement(By.xpath("//input[@id='numberOfPeople']")).sendKeys(numberOfPeople);
    }

    /**
     * Select employment status
     * @param employmentStatus the employment status to select
     */
    public void selectEmploymentStatus(String employmentStatus) {
        driver.findElement(By.xpath("//select[@id='employmentStatus']")).sendKeys(employmentStatus);
    }

    /**
     * Enter basic income
     * @param basicIncome the basic income to enter
     */
    public void enterBasicIncome(String basicIncome) {
        driver.findElement(By.xpath("//input[@id='basicIncome']")).sendKeys(basicIncome);
    }

    /**
     * Click the "Get Results" button
     */
    public void clickGetResultsButton() {
        driver.findElement(By.xpath("//button[@id='getResults']")).click();
    }

    /**
     * Validate estimated maximum lending amount
     */
    public void validateEstimatedMaximumLendingAmount() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='estimatedMaximumLendingAmount']")).isDisplayed());
    }

    /**
     * Validate additional mortgage-related benefits
     */
    public void validateAdditionalMortgageRelatedBenefits() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='additionalMortgageRelatedBenefits']")).isDisplayed());
    }

    /**
     * Validate error message for invalid Property Price input
     */
    public void validateErrorMessageForInvalidPropertyPrice() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='error-message']")).isDisplayed());
    }

    /**
     * Validate error message for invalid Deposit Amount input
     */
    public void validateErrorMessageForInvalidDepositAmount() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='error-message']")).isDisplayed());
    }

    /**
     * Validate error message for invalid Length of Mortgage input
     */
    public void validateErrorMessageForInvalidLengthOfMortgage() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='error-message']")).isDisplayed());
    }

    /**
     * Validate error message for invalid Number of People on the Mortgage input
     */
    public void validateErrorMessageForInvalidNumberOfPeople() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='error-message']")).isDisplayed());
    }

    /**
     * Validate error message for invalid Employment Status input
     */
    public void validateErrorMessageForInvalidEmploymentStatus() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='error-message']")).isDisplayed());
    }

    /**
     * Validate error message for invalid Basic Income input
     */
    public void validateErrorMessageForInvalidBasicIncome() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='error-message']")).isDisplayed());
    }
}
```