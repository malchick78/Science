// NameAndInitials.java displays my full name and initials

public class NameAndInitials
{
    public static void main(String[] args)
    {
		// identifier declarations
        String firstName = "Mark ";
        String middleName = "NA";
        String lastName = "Villar ";
        char firstInitial = 'M';
        char middleInitial = ' ';
        char lastInitial = 'V';

        // use logical operator to display results
        if (middleName == "NA")
        {
            System.out.println("Name: " + firstName + lastName);
            System.out.println("Initials: " + firstInitial + lastInitial);
        }
        else
        {
            System.out.println("Name: " + firstName + middleName + lastName);
            System.out.println("Initials: " + firstInitial + middleInitial 
			+ lastInitial);
        }
	}
}