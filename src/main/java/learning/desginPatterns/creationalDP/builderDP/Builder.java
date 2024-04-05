//package learning.desginPatterns.creationalDP.builderDP;
//
//public class Builder {
//
//	private int id;
//	private String name;
//	private String address;
//
//	public static Builder newInstance() {
//		return new Builder();
//	}
//
//	private Builder() {}
//
//	// Setter methods
//	public Builder setId(int id) {
//		this.id = id;
//		return this;
//	}
//
//	public Builder setName(String name) {
//		this.name = name;
//		return this;
//	}
//
//	public Builder setAddress(String address) {
//		this.address = address;
//		return this;
//	}
//
//	// build method to deal with outer class
//	// to return outer instance
//	public Employee build() {
//		return new Employee(this);
//	}
//
//	}
//
//	@Override
//	public String toString() {
//		return "id = " + this.id + ", name = " + this.name + ", address = " + this.address;
//	}
//
//}
