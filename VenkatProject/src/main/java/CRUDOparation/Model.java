package CRUDOparation;

public class Model {
	private String e_name, e_pass;
	int e_id;
	
	
	void sete_name(String e_name){
		this.e_name= e_name;
		
	}
	void sete_pass(String e_pass) {
		this.e_pass =e_pass;
		
	}
	
	void sete_id(int e_id) {
		this.e_id=e_id;
	}
	
	String gete_name () {
		return e_name;
	}
	String gete_pass() {
		return e_pass;
	}
	
	int gete_id() {
		return e_id;
	}


}
