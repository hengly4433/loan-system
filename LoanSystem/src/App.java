import models.Customer;
import models.Loan;
import models.PersonalLoan;
import service.LoanProcessor;

public class App {
    public static void main(String[] args) throws Exception {
        Customer hengly = new Customer("Hengly Siev", 35, 50_000);

        Loan personalLoan = new PersonalLoan(hengly, 1_000, 5);

        LoanProcessor processor = new LoanProcessor();

        if (processor.approveLoan(hengly, personalLoan)) {
            processor.processLoan(personalLoan);
        } else {
            System.out.println("Loan Rejected");
        }
    }
}
