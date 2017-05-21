package xm.zjl.testfile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class File0618 {
	public static void main(String[] args) {
		File path = new File("E:"+File.separator+"kankan");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		} else {
			list = path.list(new DirFilter(args[0]));
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list) {
			System.out.println(dirItem);
		}
	}

}

class DirFilter implements FilenameFilter {
	private Pattern pattern;

	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
		System.out.println("pattern--->"+pattern);
	}

	public boolean accept(File dir, String name) {
		System.out.println("dir---->"+dir+"\r\n"+"name--->"+name);
		return pattern.matcher(name).matches();
	}
}