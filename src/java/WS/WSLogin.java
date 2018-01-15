/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author krissada.r
 */
@WebService(serviceName = "WSLogin")
@Stateless()
public class WSLogin {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkLogin")
    public String checkLogin(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        
        String result="ไม่สามารถเข้าสุ่ระบบได้";
        
        String user[] = {"user","1234"};
        if (user[0].equals(username) && user[1].equals(password)) {
            result="ยินดีต้อนรับเข้าสู่ระบบ";
        }
        
        return result;
        
    }
}
