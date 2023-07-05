import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class FileCopy{
	
	private InputStream source;
	private OutputStream target;

	public FileCopy(String sourceFile, String targetFile) throws FileNotFoundException{
		
		source=new FileInputStream(sourceFile);
		target= new FileOutputStream(targetFile);

	}
	
	public int copy() throws IOException {
		byte[] buffer=new byte[128];
		int n=0, count=0;
		
		while((n=source.read(buffer))!=-1) {
			    target.write(buffer);
				count+=n; // count=count+n
		}
		return count;
	}

}



