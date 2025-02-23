```java
public class MortgageCalculatorTest {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testMortgageCalculator() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the Nationwide Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.nationwide.co.uk/mortgages/mortgage-calculators/borrowing-calculator/");

        // Select buyer details
        steps.selectBuyerDetails("Buy a new home");

        // Enter property price
        steps.enterPropertyPrice("200000");

        // Enter deposit amount
        steps.enterDepositAmount("20000");

        // Select length of mortgage
        steps.selectLengthOfMortgage("15 years");

        // Enter number of people on the mortgage
        steps.enterNumberOfPeople("2");

        // Select employment status
        steps.selectEmploymentStatus("Employed");

        // Enter basic income
        steps.enterBasicIncome("6000");

        // Click the "Get Results" button
        steps.clickGetResultsButton();

        // Validate estimated maximum lending amount
        steps.validateEstimatedMaximumLendingAmount();

        // Validate additional mortgage-related benefits
        steps.validateAdditionalMortgageRelatedBenefits();

        // Validate estimated monthly repayment amount
        steps.validateEstimatedMonthlyRepaymentAmount();
    }

    @Test
    public void testInvalidLengthOfMortgage() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the Nationwide Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.nationwide.co.uk/mortgages/mortgage-calculators/borrowing-calculator/");

        // Select buyer details
        steps.selectBuyerDetails("Buy your first home");

        // Enter property price
        steps.enterPropertyPrice("150000");

        // Enter deposit amount
        steps.enterDepositAmount("10000");

        // Select length of mortgage
        steps.selectLengthOfMortgage("abc");

        // Enter number of people on the mortgage
        steps.enterNumberOfPeople("1");

        // Select employment status
        steps.selectEmploymentStatus("Employed");

        // Enter basic income
        steps.enterBasicIncome("5000");

        // Click the "Get Results" button
        steps.clickGetResultsButton();

        // Validate error message for invalid length of mortgage input
        steps.validateErrorMessageForInvalidLengthOfMortgage();
    }

    @Test
    public void testInvalidNumberOfPeople() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the Nationwide Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.nationwide.co.uk/mortgages/mortgage-calculators/borrowing-calculator/");

        // Select buyer details
        steps.selectBuyerDetails("Buy your first home");

        // Enter property price
        steps.enterPropertyPrice("150000");

        // Enter deposit amount
        steps.enterDepositAmount("10000");

        // Select length of mortgage
        steps.selectLengthOfMortgage("10 years");

        // Enter number of people on the mortgage
        steps.enterNumberOfPeople("-1");

        // Select employment status
        steps.selectEmploymentStatus("Employed");

        // Enter basic income
        steps.enterBasicIncome("5000");

        // Click the "Get Results" button
        steps.clickGetResultsButton();

        // Validate error message for invalid number of people on the mortgage input
        steps.validateErrorMessageForInvalidNumberOfPeople();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
```