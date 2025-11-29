package nit.com.nt.service;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;




@SelectPackages("com.nt.service")
@SelectClasses({AppTest.class,MoreOperationOnServiceTest.class})
@Suite
public class AllTestSuite {

}
