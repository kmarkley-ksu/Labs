import java.io.*;

public class Lab6B
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
    FileReader fr = new FileReader("textfile.txt");
      //new FileReader("PATH\\filename.extension");
  
    int i = fr.read();
    String fullFile = "";
    while (i != -1)
    {
    	fullFile += (char) i;
    	System.out.print((char) i);
    	i = fr.read();
    }
    fr.close();
    
    fullFile += "\r\n\r\nHELLO THERE!";
    
    FileWriter fw = new FileWriter("textfile.txt");
    
    fw.write(fullFile);
    fw.close();
    
    File file = new File("textfile.txt");
    		//new File("PATH\\filename.extension"); 
    
    BufferedReader br = new BufferedReader(new FileReader(file)); 
    
    fullFile = "";
    String st = br.readLine();
    while (st != null)
    {
    	fullFile += st;
    	System.out.println(st); 
    	st = br.readLine();
    }
    br.close();
    
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    
    fullFile += "\r\nWOAH YEAH!";
    bw.write(fullFile);
    bw.close();
  }
}

//new FileReader("C:\\Users\\kmarkley.WIN.002\\Documents\\Markley_Lab6B\\bin\\textfile.txt");

//"C:\\Users\\kmarkley.WIN.000\\Autodesk\\Genuine Service"
//"C:\\Users\\kmarkley.WIN.000\\Autodesk\\"
//+ "Genuine Service\\GenuineService.exe"