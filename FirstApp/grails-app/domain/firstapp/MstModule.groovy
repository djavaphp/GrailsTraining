package firstapp

class MstModule {
String moduleId
String moduleName
static hasMany = Role
Role role

    static constraints = {
		//role(nullable:true)
    }
	 String toString() {
		return "${moduleName}"
	};
}
