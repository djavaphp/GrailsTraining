package firstapp

import groovy.sql.Sql

class EmployeService {

    def getallEmp() {
	Sql sql= new groovy.sql.Sql(dataSource)
	def resultlist=[]
	
	sql.call("BEGIN pro1(); END;",
            [Sql.resultSet(OracleTypes.CURSOR)]) {cursorResults -> 
            cursorResults.eachRow{result ->
                resultList << result
            }
    }
    return resultList
	
    }
}
