// Anas Ayoubi 101226450
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
            System.out.println(buddy.getName() + " added to AddressBook");
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (buddies.remove(buddy)) {
            System.out.println(buddy.getName() + " removed from AddressBook");
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("John", "904 Ralph Henesy", "123");
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
