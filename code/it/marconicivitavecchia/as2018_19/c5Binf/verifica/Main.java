
// DONE Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Color Picker");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// DONE Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(300,900);
		
		// DONE Usare StringBuilder per costruire la stringa HTML
		StringBuilder stbuild = new StringBuilder();
		
		// DONE Creare la stringa HTML per il wireframe
		stbuild.append("<html>");
		stbuild.append("<head>");

		stbuild.append("<h1>Color Picker</h1>");
		
		stbuild.append("</head>");
		stbuild.append("<body>");
		stbuild.append("<div style='display:table;width:100%'>");//OPEN TABLE
		//FIRST ROW
		stbuild.append("<div style='display:table-row;'>");
		
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("<b>Name</b>");
		stbuild.append("</div>");
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("<b>Hex</b>");
		stbuild.append("</div>");
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("<b>RGB</b>");
		stbuild.append("</div>");
		
		stbuild.append("</div>");
			
		//SECOND ROW
		stbuild.append("<div style='display:table-row;'>");
			
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("Persian Green");
		stbuild.append("</div>");
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("#00A693");
		stbuild.append("</div>");
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("0,166,147");
		stbuild.append("</div>");
			
		stbuild.append("</div>");
			
		//THIRD ROW
		stbuild.append("<div style='display:table-row;'>");
			
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("Venice Blue");
		stbuild.append("</div>");
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("#055989");
		stbuild.append("</div>");
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("5,89,137");
		stbuild.append("</div>");
			
		stbuild.append("</div>");
		
		//FOURTH ROW
		stbuild.append("<div style='display:table-row;'>");
			
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("Pale Blue");
		stbuild.append("</div>");
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("#73D1E4");
		stbuild.append("</div>");
		stbuild.append("<div style='display:table-cell;'>");
		stbuild.append("115,209,228");
		stbuild.append("</div>");
			
		stbuild.append("</div>");
		
		stbuild.append("</div>"); //END TABLE
		stbuild.append("</body>");
		stbuild.append("</html>");
		
		// DONE Convertire lo StringBuilder in String
		String strHtml = stbuild.toString();
		
		// DONE Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(strHtml));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

