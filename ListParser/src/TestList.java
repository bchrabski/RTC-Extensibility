import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserCategory {
	public String userName;
	public String categoryName;
}

public class TestList {

	
	
	public static void main(String[] args) {
		
		String text = "text<title>qwe</title><title>dupadwa";
		// Extract the text between the two title elements
		String pattern = "(&lt;approval&gt;)(.+?)(&lt;/approval&gt;)";
		String updated = text.replaceAll(pattern, "");
		System.out.println(updated);
	}
}
