package org.varunshr.design.builder;

import com.google.common.base.Preconditions;

public final class User {
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String company;
	private final String designation;

	/**
	 * private constructor to force object creation via builder. Only firstName
	 * and lastName are mandatory. By using builder pattern we avoided
	 * constructor overloading.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param company
	 * @param designation
	 */
	private User(String firstName, String lastName, int age, String company,
			String designation) {
		Preconditions.checkNotNull(firstName);
		Preconditions.checkNotNull(lastName);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.company = company;
		this.designation = designation;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getCompany() {
		return company;
	}

	public String getDesignation() {
		return designation;
	}

	public final static Builder builder() {
		return new Builder();
	}

	@Override
	public String toString() {
		return "User Details : \n firstName :" + this.firstName
				+ "\n lastName : " + this.lastName + "\n age : " + this.age
				+ "\n company : " + this.company + "\n designation : "
				+ this.designation + "\n";
	}

	/**
	 * Static inner class, responsible for constructing object of hosting class.
	 * It takes advantage of the fact that private method of parent class is
	 * visible inside the inner class.
	 * 
	 * @author varunshr
	 * 
	 */
	public final static class Builder {
		private String firstName;
		private String lastName;
		private int age;
		private String company;
		private String designation;

		private Builder() {
		}

		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder setAget(int age) {
			this.age = age;
			return this;
		}

		public Builder setCompany(String company) {
			this.company = company;
			return this;
		}

		public Builder setDesignation(String designation) {
			this.designation = designation;
			return this;
		}

		public User build() {
			return new User(firstName, lastName, age, company, designation);
		}
	}
}
