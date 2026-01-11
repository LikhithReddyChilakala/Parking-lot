Add ParkingAttendant class
import com.parkinglot.models.Person;

public class ParkingAttendant extends Account {

    public ParkingAttendant(int accountId, Person person, String userName, String password) {
        super(accountId, person, userName, password);
    }

    public void processPayment() {
        System.out.println("Attendant: Processing payment");
    }

    public void issueTicket() {
        System.out.println("Attendant: Issuing parking ticket");
    }

    public void closeTicket() {
        System.out.println("Attendant: Closing parking ticket");
    }

    @Override
    public void displayRole() {
        System.out.println("Role: ParkingAttendant");
    }
}
