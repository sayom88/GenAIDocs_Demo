```java
public class MortgageCalculatorTest {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void testBuyerTypeSelection() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select buyer type
        steps.selectBuyerType("First Time Buyer");

        // Validate buyer type selection
        steps.validateBuyerTypeSelection("First Time Buyer");
    }

    @Test
    public void testApplicationTypeSelection() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select application type
        steps.selectApplicationType("Single");

        // Validate application type selection
        steps.validateApplicationTypeSelection("Single");
    }

    @Test
    public void testMaritalStatusSelection() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select marital status
        steps.selectMaritalStatus("Single");

        // Validate marital status selection
        steps.validateMaritalStatusSelection("Single");
    }

    @Test
    public void testDependentsSelection() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Answer dependents question
        steps.answerDependentsQuestion("No");

        // Validate dependents selection
        steps.validateDependentsSelection("No");
    }

    @Test
    public void testAgeEntry() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Enter age
        steps.enterAge("30");

        // Validate age entry
        steps.validateAgeEntry("30");
    }

    @Test
    public void testAnnualIncomeEntry() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Enter annual income
        steps.enterAnnualIncome("50000");

        // Validate annual income entry
        steps.validateAnnualIncomeEntry("50000");
    }

    @Test
    public void testLoanTermSelection() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select loan term
        steps.selectLoanTerm("25 years");

        // Validate loan term selection
        steps.validateLoanTermSelection("25 years");
    }

    @Test
    public void testCalculationTrigger() {
        StepDefinitions steps = new StepDefinitions(driver);

        // Navigate to the PTSB Mortgage Calculator page
        steps.navigateToMortgageCalculator("https://www.ptsb.ie/mortgages/first-time-buyer-mortgage-calculator/");

        // Select buyer type
        steps.selectBuyerType("First Time Buyer");

        // Select application type
        steps.selectApplicationType("Single");

        // Select marital status
        steps.selectMaritalStatus("Single");

        // Answer dependents question
        steps.answerDependentsQuestion("No");

        // Enter age
        steps.enterAge("30");

        // Enter annual income
        steps.enterAnnualIncome("50000");

        // Select loan term
        steps.selectLoanTerm("25 years");

        // Click the "Calculate" button
        steps.clickCalculateButton();

        // Validate calculation results
        steps.validateCalculationResults();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
```