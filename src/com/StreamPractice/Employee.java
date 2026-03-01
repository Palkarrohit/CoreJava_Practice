package com.StreamPractice;

public class Employee {
	   private int employeeId;
	    private String employeeName;
	    private String email;
	    private String role;
	    private String department;
	    private double salary;
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Employee{" +
            "employeeId=" + employeeId +
            ", employeeName='" + employeeName + '\'' +
            ", email='" + email + '\'' +
            ", role='" + role + '\'' +
            ", department='" + department + '\'' +
            ", salary=" + salary +
            '}';
		}
		public Employee(int employeeId, String employeeName, String email, String role, String department,
				double salary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.email = email;
			this.role = role;
			this.department = department;
			this.salary = salary;
		}

}
