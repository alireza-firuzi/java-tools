package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLTags {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		Pattern p = Pattern.compile("<a\\s*[^<>]*href=\"(.*?)\"[^<>]*>((<[^<>]*>)*?([^<>]*)(</[^<>]*>)*?)</\\s*a>", Pattern.CASE_INSENSITIVE);
		while (n > 0) {
			
			String eachLine = s.nextLine();
			Matcher matcher = p.matcher(eachLine);
			while (matcher.find()) {
				System.out.println(matcher.group(1).trim() + "," + matcher.group(4).trim());
			}

			n--;
		}

	}
}
