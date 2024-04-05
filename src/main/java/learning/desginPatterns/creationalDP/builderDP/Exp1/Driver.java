package learning.desginPatterns.creationalDP.builderDP.Exp1;

public class Driver {

	public static void main(String[] args) {
		User firstUser = new User.UserBuilder("Harry", "Potter").age(30).phoneNbr("1234567")
				.address("221B Baker Street - London").build();

		System.out.println(firstUser);

		// no address
		User secondUser = new User
							  .UserBuilder("Ron", "Weasley")
							  .age(32)
							  .phoneNbr("5655")
							  .build();

		System.out.println(secondUser);

		// No age
		// No phone
		// no address
		User thirdUser = new User
							.UserBuilder("Hermoine", "Granger")
							.age(20)
							.nationality("English")
							.build();

		System.out.println(thirdUser);

	}

}
