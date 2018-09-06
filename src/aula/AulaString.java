package aula;

public class AulaString {

	public static void main(String[] args) {
		
		//String str = "isto é uma String do java";
		
		//String xyz = new String("isto é uma String do java");
		
		//if (str == xyz ) System.out.println("IGUAL");
		
		//else System.out.println("DIFERENTE");
		
		//if (str.equals( xyz ) )	{
			
	  //}
		
		//System.out.println("Tamanho da String: " + str.length() );
		
		//System.out.println("SubString: " + str.substring(0, 10) );
		
		//System.out.println("Caracter na posição 5: " + str.charAt(5) );
		
		String str = "isto é uma String do java";
		
		String[] palavras = str.split(" ");
		
		int i = str.indexOf("uma");
		
		if( str.startsWith("isto") || str.endsWith("Mundo!") ) {
			System.out.println("");
		}
	    
		str = str.trim();
	   
		str = str.replace('o','0');
	   
		str = str.replaceAll("String","Cadeia de caracteres");
	    
		System.out.println(str);
	}
	
}

