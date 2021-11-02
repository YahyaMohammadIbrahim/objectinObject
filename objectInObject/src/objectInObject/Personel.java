package objectInObject;

public class Personel {
	private String Name;
	private String Surname;
	private int Age;
	private  Company Company;
	private Title Title;
	public Personel() {
		super();
	}
	public Personel(String name, String surname, int age, objectInObject.Company company, objectInObject.Title title) {
		super();
		Name = name;
		Surname = surname;
		Age = age;
		Company = company;
		Title = title;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Company getCompany() {
		return Company;
	}
	public void setCompany(Company company) {
		Company = company;
	}
	public Title getTitle() {
		return Title;
	}
	public void setTitle(Title title) {
		Title = title;
	}
	
	
	}
	


