```java
public class FirstTimeBuyerMortgageCalculatorTest {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void testFirstTimeBuyerSelection() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB mortgage calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select buyer type
        steps.selectBuyerType("First Time Buyer");

        // Click the "Next" button
        steps.clickNextButton();
    }

    @Test
    public void testSingleApplicationTypeSelection() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB mortgage calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select buyer type
        steps.selectBuyerType("First Time Buyer");

        // Click the "Next" button
        steps.clickNextButton();

        // Select application type
        steps.selectApplicationType("Single");

        // Click the "Next" button
        steps.clickNextButton();
    }

    @Test
    public void testSingleMaritalStatusSelection() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB mortgage calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select buyer type
        steps.selectBuyerType("First Time Buyer");

        // Click the "Next" button
        steps.clickNextButton();

        // Select application type
        steps.selectApplicationType("Single");

        // Click the "Next" button
        steps.clickNextButton();

        // Select marital status
        steps.selectMaritalStatus("Single");

        // Click the "Next" button
        steps.clickNextButton();
    }

    @Test
    public void testNoDependentsSelection() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB mortgage calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select buyer type
        steps.selectBuyerType("First Time Buyer");

        // Click the "Next" button
        steps.clickNextButton();

        // Select application type
        steps.selectApplicationType("Single");

        // Click the "Next" button
        steps.clickNextButton();

        // Select marital status
        steps.selectMaritalStatus("Single");

        // Click the "Next" button
        steps.clickNextButton();

        // Answer "No" to having dependents
        steps.answerNoToDependents();

        // Click the "Next" button
        steps.clickNextButton();
    }

    @Test
    public void testAgeEntry() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB mortgage calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select buyer type
        steps.selectBuyerType("First Time Buyer");

        // Click the "Next" button
        steps.clickNextButton();

        // Select application type
        steps.selectApplicationType("Single");

        // Click the "Next" button
        steps.clickNextButton();

        // Select marital status
        steps.selectMaritalStatus("Single");

        // Click the "Next" button
        steps.clickNextButton();

        // Answer "No" to having dependents
        steps.answerNoToDependents();

        // Click the "Next" button
        steps.clickNextButton();

        // Enter age
        steps.enterAge("30");

        // Click the "Next" button
        steps.clickNextButton();
    }

    @Test
    public void testAnnualIncomeEntry() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB mortgage calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select buyer type
        steps.selectBuyerType("First Time Buyer");

        // Click the "Next" button
        steps.clickNextButton();

        // Select application type
        steps.selectApplicationType("Single");

        // Click the "Next" button
        steps.clickNextButton();

        // Select marital status
        steps.selectMaritalStatus("Single");

        // Click the "Next" button
        steps.clickNextButton();

        // Answer "No" to having dependents
        steps.answerNoToDependents();

        // Click the "Next" button
        steps.clickNextButton();

        // Enter age
        steps.enterAge("30");

        // Click the "Next" button
        steps.clickNextButton();

        // Enter annual income
        steps.enterAnnualIncome("50000");

        // Click the "Next" button
        steps.clickNextButton();
    }

    @Test
    public void testLoanTermSelection() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB mortgage calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select buyer type
        steps.selectBuyerType("First Time Buyer");

        // Click the "Next" button
        steps.clickNextButton();

        // Select application type
        steps.selectApplicationType("Single");

        // Click the "Next" button
        steps.clickNextButton();

        // Select marital status
        steps.selectMaritalStatus("Single");

        // Click the "Next" button
        steps.clickNextButton();

        // Answer "No" to having dependents
        steps.answerNoToDependents();

        // Click the "Next" button
        steps.clickNextButton();

        // Enter age
        steps.enterAge("30");

        // Click the "Next" button
        steps.clickNextButton();

        // Enter annual income
        steps.enterAnnualIncome("50000");

        // Click the "Next" button
        steps.clickNextButton();

        // Select loan term
        steps.selectLoanTerm("25 years");

        // Click the "Calculate" button
        steps.clickCalculateButton();

        // Validate maximum borrowing amount
        steps.validateMaximumBorrowingAmount();

        // Validate estimated monthly repayments
        steps.validateEstimatedMonthlyRepayments();

        // Validate additional mortgage-related benefits
        steps.validateAdditionalMortgageRelatedBenefits();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
```