package net.beifeng.mobile_scm.test.service;

import java.sql.SQLException;


public class TestServiceImpl implements TestService {

//    private CommonDao dao;

    /*
     * (non-Javadoc)
     * 
     * @see net.beifeng.mobile_scm.test.service.TestService#validateName(java.lang.String)
     */
    public String validateName(String name) throws SQLException {
//        int cnt = (Integer) dao.queryObject("findName", name);
//        if (cnt > 0) {
//            return "welcome " + name;
//        } else {
//            return name + " is not exist!";
//        }
    	if ("zhangsan".equalsIgnoreCase(name)) {
			return "welcome "+name;
		}else {
			return name+" is bad";
		}
    }

//    public void setDao(CommonDao dao) {
//        this.dao = dao;
//    }

}
