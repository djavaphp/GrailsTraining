package firstapp

import java.util.Set;

class Role {
String roleName;
String roleId;
static hasMany=[employee:Employee, module:MstModule]
//static mapping = {
//	table name: "map_module_role", schema: "pwm"
//}
//static belongsTo = MapModuleRole
//static mapping = { modules joinTable: [name: 'map_module_role'] }

    static constraints = {
		module(nullable:true)
    }
	String toString() {
		return "${roleName}"
	};

}
