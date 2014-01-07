package firstapp

import javax.sound.midi.MidiDevice.Info;

import org.apache.jasper.compiler.Node.ParamsAction;
import org.bouncycastle.asn1.x509.UserNotice;

class LoginService {
	static transactional = false
    def  authoriseUser(username , password) {
		log.info("----- login Service ----")
		log.info("-- Service User Id :"+ username)
		log.info( "-- Service Password :"+password)
		Employee isReleased= Employee.findWhere(empId : username,
			password:password)
		//log.Info("-- Service : "+isReleased.toString())
		//log.info("User Store data : "+ isReleased.store.first())		
		if(isReleased.toString()!=null){			  
			return isReleased
		}	else {
		return null}
    }
}
