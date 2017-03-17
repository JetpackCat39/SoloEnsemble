
public class StudentSolo {
	private String firstName;
	private String lastName;
	private String windInstrument; //WW, Brass, NA
	private String accompanist;
	private boolean conflict;
	private boolean eightAM;
	private boolean twelvePM;
	private String bandClass; //Freshman, Wind, Concert, Strings, Perc
	
	public StudentSolo(String first, String last, String windI, String accomp, boolean conf, boolean eight, boolean twelve, String clss) {
		firstName = first;
		lastName = last;
		windInstrument = windI;
		accompanist = accomp;
		conflict = conf;
		eightAM = eight;
		twelvePM = twelve;
		bandClass = clss;
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName + ", Accompanist: " + accompanist + ", Class: " + bandClass;
	}
}
