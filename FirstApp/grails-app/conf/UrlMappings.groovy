class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/login")
		"500"(view:'/error')
		"/welcomePage"(view:"/welcome")
		"/createRolePage"(view:"/role/createrole")
		
		/* Nammed URL MAPPING  **/
		
//		name doLogin: "/login" {
//			controller = 'LoginController'
//			action = 'authoriseUser'
//		}
//	name welcomePage : "/welcomePage"(view:"/welcome")
		
				name createrole_action: "/role_create_jsp" {
					controller = 'RoleController'
					action = 'createrole'
				}
	}
}
