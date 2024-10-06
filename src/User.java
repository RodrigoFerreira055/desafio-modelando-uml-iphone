import iphone.dispositivo.Iphone;

public class User {
	public static void main(String[] args) {
	
		Iphone usuario = new Iphone(); 
		
		usuario.ligar("21-90000-0000");
		usuario.iniciarCorreioVoz();
		
		usuario.selecionarMusica("Metallica");
		usuario.tocar();
		
		usuario.exibirPagina("https://www.google.com");
		usuario.atualizarPagina();
	}
	
}
