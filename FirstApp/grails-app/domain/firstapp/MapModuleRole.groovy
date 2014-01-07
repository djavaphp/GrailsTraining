package firstapp

class MapModuleRole {

	static hasMany = [ module : MstModule, role: Role ]
    static constraints = {
    }
}
