package demo.demo1;

import java.util.Arrays;

public class User {
		private String name;
		private Integer age;
		private int gender;
		private String[] hobbys;
		private String address;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public int getGender() {
			return gender;
		}
		public void setGender(int gender) {
			this.gender = gender;
		}
		public String[] getHobbys() {
			return hobbys;
		}
		public void setHobbys(String[] hobbys) {
			this.hobbys = hobbys;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + ", gender=" + gender
					+ ", hobbys=" + Arrays.toString(hobbys) + ", address="
					+ address + "]";
		}
		
		
		
		
}
