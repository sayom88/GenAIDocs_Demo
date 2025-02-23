```java
public class StepDefinitions {
    private WebDriver driver;

    public StepDefinitions(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Navigate to the Nationwide Mortgage Calculator page
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
     * Validate estimated monthly repayment amount
     */
    public void validateEstimatedMonthlyRepaymentAmount() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='estimatedMonthlyRepaymentAmount']")).isDisplayed());
    }

    /**
     * Validate error message for invalid length of mortgage input
     */
    public void validateErrorMessageForInvalidLengthOfMortgage() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='error-message']")).isDisplayed());
    }

    /**
     * Validate error message for invalid number of people on the mortgage input
     */
    public void validateErrorMessageForInvalidNumberOfPeople() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='error-message']")).isDisplayed());
    }
}
```