package firstapp

class CustomFilters {

    def filters = {
	
        all(controller:'*', action:'*') {
            before = {
				log.info("*** Calling Method ***")			
//				if(!session.empId ) {
//				   redirect(action:'doLogin')
//				   return false
//				}
            }
            after = { Map model ->
				//println "calling after method" 
            }
            afterView = { Exception e ->

            }
        }
    }
}
