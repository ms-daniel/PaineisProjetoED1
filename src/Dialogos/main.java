package Dialogos;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class main {

	public static void main(String[] args) {

		String cam = System.getProperty("user.dir") + "\\arq\\lista.csv";
		String linha;
		int cont=0;
		String estadoEsc;
		String[] munEstadoEscolhido = null;
		String munEscolhido = "";
		Dialogo dia = new Dialogo();
		RImprime print;
		String[] aux = new String [5];
		String[][] coluna = new String [5800][10];
		
		
		
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(cam), "UTF-8"));
			
			while((linha = br.readLine()) != null) { 
				if(cont ==0)
					cont++;
				else {
					aux = linha.split(";");
					coluna[cont-1] = aux;
					cont++;
				}
			}
			
		}	catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(dia.EscolheData()); //escolhe a reigao		
		
		/*do{
			estadoEsc = dia.DialogoEstado();
			
			if(estadoEsc == null ) {
				dia.MsgErro();
				break;
				
			}else if(estadoEsc.equals("Cancelar")) {
				break;
				
			}else {
				munEstadoEscolhido = dia.SelecionaMunicipio(estadoEsc);
				munEscolhido = dia.DialogoMunicicpio(munEstadoEscolhido, estadoEsc);
				
				if(munEscolhido == null) {
					dia.MsgErro();
					break;
				}
			}

		}while(munEscolhido.equals("Voltar"));*/
	}

}
