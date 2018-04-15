package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class UtilFiles {

	public static final String FILES_DIR ="conf/files/";
	public static List<String> readFileLines(String fileName) throws IOException{
		return Files.readAllLines(Paths.get(FILES_DIR,fileName));
	}
}
