package keywordStatic;

public class Employee {
	public static int id=0;
	private String nom,prenom,email;
	private double salaire;
	private String grade;
	String description;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Employee(String nom, String prenom, String email, double salaire, String grade) {
		super();
		id++;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.salaire = salaire;
		this.grade = grade;
	}
	public Employee() {
		
		super();
		id++;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", salaire=" + salaire + ", grade="
				+ grade + "]";
	}
	
	
	
	
	

}
