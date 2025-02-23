```java
public class StepDefinitions {
    private WebDriver driver;

    public StepDefinitions(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Navigate to the PTSB Mortgage Calculator page
     * @param url the URL to navigate to
     */
    public void navigateToMortgageCalculator(String url) {
        driver.get(url);
    }

    /**
     * Select buyer type
     * @param buyerType the buyer type to select
     */
    public void selectBuyerType(String buyerType) {
        driver.findElement(By.xpath("//select[@id='buyerType']")).sendKeys(buyerType);
    }

    /**
     * Select application type
     * @param applicationType the application type to select
     */
    public void selectApplicationType(String applicationType) {
        driver.findElement(By.xpath("//select[@id='applicationType']")).sendKeys(applicationType);
    }

    /**
     * Select marital status
     * @param maritalStatus the marital status to select
     */
    public void selectMaritalStatus(String maritalStatus) {
        driver.findElement(By.xpath("//select[@id='maritalStatus']")).sendKeys(maritalStatus);
    }

    /**
     * Answer dependents question
     * @param dependentsAnswer the answer to the dependents question
     */
    public void answerDependentsQuestion(String dependentsAnswer) {
        if (dependentsAnswer.equals("Yes")) {
            driver.findElement(By.xpath("//input[@id='dependentsYes']")).click();
        } else {
            driver.findElement(By.xpath("//input[@id='dependentsNo']")).click();
        }
    }

    /**
     * Enter age
     * @param age the age to enter
     */
    public void enterAge(String age) {
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys(age);
    }

    /**
     * Enter annual income
     * @param annualIncome the annual income to enter
     */
    public void enterAnnualIncome(String annualIncome) {
        driver.findElement(By.xpath("//input[@id='annualIncome']")).sendKeys(annualIncome);
    }

    /**
     * Select loan term
     * @param loanTerm the loan term to select
     */
    public void selectLoanTerm(String loanTerm) {
        driver.findElement(By.xpath("//select[@id='loanTerm']")).sendKeys(loanTerm);
    }

    /**
     * Click the "Calculate" button
     */
    public void clickCalculateButton() {
        driver.findElement(By.xpath("//button[@id='calculate']")).click();
    }

    /**
     * Validate buyer type selection
     * @param buyerType the expected buyer type
     */
    public void validateBuyerTypeSelection(String buyerType) {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='buyerTypeSelection']")).getText().contains(buyerType));
    }

    /**
     * Validate application type selection
     * @param applicationType the expected application type
     */
    public void validateApplicationTypeSelection(String applicationType) {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='applicationTypeSelection']")).getText().contains(applicationType));
    }

    /**
     * Validate marital status selection
     * @param maritalStatus the expected marital status
     */
    public void validateMaritalStatusSelection(String maritalStatus) {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='maritalStatusSelection']")).getText().contains(maritalStatus));
    }

    /**
     * Validate dependents selection
     * @param dependentsAnswer the expected dependents answer
     */
    public void validateDependentsSelection(String dependentsAnswer) {
        if (dependentsAnswer.equals("Yes")) {
            Assert.assertTrue(driver.findElement(By.xpath("//div[@id='dependentsSelection']")).getText().contains("Yes"));
        } else {
            Assert.assertTrue(driver.findElement(By.xpath("//div[@id='dependentsSelection']")).getText().contains("No"));
        }
    }

    /**
     * Validate age entry
     * @param age the expected age
     */
    public void validateAgeEntry(String age) {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='ageEntry']")).getText().contains(age));
    }

    /**
     * Validate annual income entry
     * @param annualIncome the expected annual income
     */
    public void validateAnnualIncomeEntry(String annualIncome) {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='annualIncomeEntry']")).getText().contains(annualIncome));
    }

    /**
     * Validate loan term selection
     * @param loanTerm the expected loan term
     */
    public void validateLoanTermSelection(String loanTerm) {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='loanTermSelection']")).getText().contains(loanTerm));
    }

    /**
     * Validate calculation results
     */
    public void validateCalculationResults() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='maximumBorrowingAmount']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='estimatedMonthlyRepayments']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='additionalMortgageRelatedBenefits']")).isDisplayed());
    }
}
```