package firstapp

class Store {

	String storeCode
	String storeName
	String format
	String city
	//Boolean isActive
	Date createdOn
	
	static hasMany = [employee:Employee]
    static constraints = {
		storeCode (blank:false) 
		storeName (blank:false) 
		format(blank:false)
		city (blank:false) 
		createdOn (unique:false ) 
		//isActive (unique:false)
		
    }
	
String toString() {
	return "${storeName}"
	}
}
