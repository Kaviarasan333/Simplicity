package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class MainClass extends BaseClass
{
public static void main(String[] args) throws AWTException, InterruptedException 
{
	Browserlaunch();
	website("https://www.simplicity.co.za/");
	driver.manage().window().maximize();
	LoginPojoClass l=new LoginPojoClass();
	cli(l.getSettings());
	cli(l.getClk_login());
	UserName(l.getUsername(), "kaviarasana3@gmail.com");
	UserName(l.getPassword(), "Vadalur@1234");
	cli(l.getLogin());
	SearchPojaClass s=new SearchPojaClass();
	//cli(s.getSearchBox());
	UserName(s.getSearchtext(), "watch");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	CartPojoClass c=new CartPojoClass();
	cli(c.getWatchclick());
	cli(c.getAddtocart());
	AddressPojoClass a=new AddressPojoClass();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(1000);
	cli(a.getClkCart());
	Thread.sleep(1000);
	cli(a.getVwCart());
	cli(a.getProceed());
	cli(a.getContine());
	PyamentPojoClass p= new PyamentPojoClass();
	cli(p.getCont());
	cli(p.getPayoptin2());
	cli(p.getChckbox());
}
}