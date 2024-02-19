package CRUDOparation;

public class Model2 {
	private String pro_name;
	int pro_id, pro_price,e_id;
	
	
	void setpro_id(int pro_id) {
		this.pro_id=pro_id;
	}
	void setpro_name(String pro_name){
		this.pro_name= pro_name;
		
	}
	void setpro_price(int pro_price) {
		this.pro_price=pro_price;
	}
	
	void sete_id(int e_id) {
		this.e_id=e_id;
	}
	int getpro_id() {
		return pro_id;
	}
	String getpro_name () {
		return pro_name;
	}
	int getpro_price() {
		return pro_price;
	}
	
	int gete_id() {
		return e_id;
	}

}
