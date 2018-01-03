package basic.Pojo;

import java.io.Serializable;

//prova commento per commit
public class Users implements Serializable, Cloneable
{
	private String fname, lname, gender, username, password, dob, area, state, city, country, usertype;
	private int id, pincode;
	float latitude, longitude;
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public Users(String fname, String lname, String gender, String username, String password, String dob, String area,
			String state, String city, String country, String usertype, int id, int pincode, float latitude,
			float longitude) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.area = area;
		this.state = state;
		this.city = city;
		this.country = country;
		this.usertype = usertype;
		this.id = id;
		this.pincode = pincode;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Users() {
		super();
		this.fname = null;
		this.lname = null;
		this.gender = null;
		this.username = null;
		this.password = null;
		this.dob = null;
		this.area = null;
		this.state = null;
		this.city = null;
		this.country = null;
		this.usertype = null;
		this.id = 0;
		this.pincode = 0;
		this.latitude = 0.0f;
		this.longitude = 0.0f;
	}

	@Override
	public String toString() {
		return "Users [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", username=" + username
				+ ", password=" + password + ", dob=" + dob + ", area=" + area + ", state=" + state + ", city=" + city
				+ ", country=" + country + ", usertype=" + usertype + ", id=" + id + ", pincode=" + pincode
				+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + getId();		
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((usertype == null) ? 0 : usertype.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} 
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (usertype == null) {
			if (other.usertype != null)
				return false;
		} else if (!usertype.equals(other.usertype))
			return false;
		return true;
	}
	
}
