package Test;

import java.io.File;

import org.testng.annotations.Test;

public class DownFile {
	@Test
	public void VerifyfileisDownloaded() {
		verifyDownloadedFile("1 Cucumber 1");
	}
	
	public boolean verifyDownloadedFile(String fileName) {
		boolean fileFound = false;
		String FILES_DIRECTORY = "C:\\Users\\CA005\\Downloads\\";
		File Folder = new File(FILES_DIRECTORY);
		File[] allFiles = new File(Folder.getPath()).listFiles();
		for (File file : allFiles) {
			String eachFile = file.getName();
			if (eachFile.contains(fileName))
				fileFound = true;
		}
		return fileFound;
	}
}