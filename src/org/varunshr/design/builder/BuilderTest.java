package org.varunshr.design.builder;

public class BuilderTest {
	public static void main(String[] args) {
		User user = User.builder()
						.setFirstName("varun")
						.setLastName("sharma")
						.setAget(24)
						.setCompany("Amazon")
						.setDesignation("SDE")
						.build();
		System.out.println(user);

		User user2 = User.builder()
						.setFirstName("vijay")
						.setLastName("pravin")
						.setAget(27)
						.build();
		System.out.println(user2);

	}
}
