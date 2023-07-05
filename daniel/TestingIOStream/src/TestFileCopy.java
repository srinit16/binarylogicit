import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileCopy{
	public static void main(String[] args){
		// passing Strign using Command Line Argument
		//System.out.println(args[0]);		
		//System.out.println(args[1]);
		try {
			FileCopy fc=new FileCopy(args[0],args[1]);
			int count =fc.copy();
			System.out.println("Total Bytes Copies is "+count);
		}catch(FileNotFoundException fx) {
				System.out.println("Error while opening:"+fx);
		}catch(IOException ix) {
			System.out.println("Error while Reading : "+ix);
		}catch(Exception ex) {
			System.out.println("Other :"+ex);
		}
		
	}

	
}
