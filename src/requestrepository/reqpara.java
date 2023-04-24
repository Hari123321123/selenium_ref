package requestrepository;

import java.io.IOException;
import java.util.ArrayList;

import common_methods.getdata;
import common_methods.getdata_ExpDates;

public class reqpara {
	public static ArrayList<String> Expectedvalue_inputfromexcel() throws IOException
	{
		
		ArrayList<String> data=getdata.getDataExcel("input_data","tc_1");
	System.out.println(data);
		return data;		
      }
	
	
	public static String url ()
	{
		String url="https://www.amazon.in/";
	return url;
	}
	public static String DropdownWebelementxpath1()
	{
		String xpath1="//select[@id=\"searchDropdownBox\"]";
	return xpath1;
	}
	
	public static String dropdownoptionsWebelementxpath2()
	{
		String xpath2="//select[@id=\"searchDropdownBox\"]/option";
	return xpath2;
	}
	public static String searchboxxpath3()
	{
		String xpath3="//textarea[@title=\"Search\"]";
	return xpath3;}
	public static String optiontextxpath4()
	{
		String xpath4="//li[@data-view-type=\"1\"]/div/div[2]/div[1]/div[1]/span";
	return xpath4;}
	
	public static String optionclickxpath5()
	{
		String xpath5="//li[@data-view-type=\"1\"]/div";
	return xpath5;}
	
	public static String currentdate_calxpath()
	{
		String xpath6="//div[contains(@class,\"DayPicker-Day--today\")]";
	return xpath6;}
	public static String url2()
	{
		String url2="https://www.google.com";
	return url2;}
	public static String expected_value()
	{
		String expvalue="quantum physics";
	return expvalue;}
	
	public static String url3()
	{
		String url3="https://www.goibibo.com";
	return url3;}
	
	
	public static ArrayList<String> Expecteddate_inputfromexcel() throws IOException
	{
		ArrayList<String> data2=getdata_ExpDates.getDataExcel("input_dates","tc_1");
	System.out.println(data2);
		return data2;		
      }
	public static String closewindowxpath()
	{
		String xpath_close="//span[@class=\"logSprite icClose\"]";
	return xpath_close;
	}
	public static String dropwonarrowxpath()
	{
		String xpath_arrow="//span[@class=\"sc-dvQaRk fchrvX fswDownArrow\"]";
	return xpath_arrow;
	}
	public static String sel_Anydatexpath()
	{
		String xpath_Anydate="//div[text()=\"April 2023\"]/../../div[3]/div/div[contains(@class,\"DayPicker-Day\") and @aria-disabled=\"false\"]";
	return xpath_Anydate;
	}
	public static String sel_Anydate_Textxpath()
	{
		String xpath_Anydate_Text="//div[text()=\"April 2023\"]/../../div[3]/div/div[contains(@class,\"DayPicker-Day\") and @aria-disabled=\"false\"]/p";
	return xpath_Anydate_Text;
	}
}
