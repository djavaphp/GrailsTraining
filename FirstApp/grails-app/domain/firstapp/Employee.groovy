package firstapp

class Employee {

	String empName
	String empId
	String password
	static belongsTo = [store:Store, role:Role]
    static constraints = {
    }
	
	
	
	String toString() {
		return "${empName}"
		}
}
