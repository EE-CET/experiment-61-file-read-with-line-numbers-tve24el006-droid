import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    public static void main(String[] args) {
        String fileName = "input.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){

		String line;
		int lineNum=1;

		while((line= br.readLine())!=null){

			System.out.println(lineNum+": "+line);
			lineNum++;

		}

	}catch(IOException e){

		System.out.println("File read error : "+e.getMessage());

	}
    }
}