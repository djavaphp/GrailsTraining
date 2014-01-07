package firstapp

import javassist.bytecode.stackmap.BasicBlock.Catch;

import org.springframework.dao.DataIntegrityViolationException


class LoginController {

	static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
	def loginService
//	def index() {
//		redirect(action: "list", params: params)
//	}

	
	
	def authoriseUser(){

		log.info("----- login controller ----")		
		log.info( params.get("empId"))
		log.info( params.get("password"))
		
		try {
		Employee getresp=	loginService.authoriseUser(params.get("empId") , params.get("password"))
		log.info("--- Service Resp : "+ getresp)
			if(getresp!=null){		
			//def userName = session["empId"]
			session["empId"] =  params.get("empId")
			log.info("---- Session id : "+session.empId)
			session["name"] =  getresp.empName
			log.info("---- Session name : "+session.name)
			session["store"] =  getresp.store.find().toString()
			log.info("---- Session name : "+session.store)
			session["role"] =  getresp.role.toString()
			log.info("---- Session name : "+session.role)
			redirect(url: "/welcomePage")
						
			} else{
		
			flash.message ="Invalid user !"
			redirect(url: "/")
			}
		}
		catch (Exception e) {
			render e.toString()
		}
	}

}
