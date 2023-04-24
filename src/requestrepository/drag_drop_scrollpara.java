package requestrepository;

public class drag_drop_scrollpara {
	public static String framexpath()
	{
		String xpath="//iframe[@class=\"demo-frame\"]";
	return xpath;
	
	}
	
	public static String dragelementxpath()
	{
		String xpath="//div[@id=\"draggable\"]";
	return xpath;
	}
	
	public static String droplementxpath()
	{
		String xpath="//div[@id=\"droppable\"]";
	return xpath;
	}
	public static String elementoutsideframexpath()
	{
		String xpath="//a[text()=\"Widget Factory\"]";
	return xpath;
	}
	
	public static String drapdropurl()
	{
		String url="https://jqueryui.com/droppable/";
	return url;
	}
	
}
