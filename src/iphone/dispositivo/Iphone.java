package iphone.dispositivo;

public class Iphone implements Phone, Music, Internet {
	//PHONE
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA " + numero);
	}
	
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}
	
	public void tocar() {
		System.out.println("TOCANDO MÚSICA");
	}
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA");
	}
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MÚSICA: " + musica);
	}
	
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PÁGINA DA INTERNET: " + url);
	}
	
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}
	
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA AO NAVEGADOR");
	}
}
