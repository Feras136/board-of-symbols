package jserver;


/**
 * This is the abstract class with the interface to a board. 
 * It implements the convenience methods to send commands. 
 * A sub class has to implement the abstract method send. 
 * The codeExecutorJava performs the following sequence of method calls
 * <ol>
 * <li>setUp - connect the output with the message field</li>
 * <li>send - send all commands</li>
 * <li>setDown  - disconnect the output</li>
 * </ol>
 * 
 * @author Euler
 *
 */
public abstract class XSendDE extends XSend {
	
	public void groesse(int x, int y) {
		log( board.receiveMessage(">>resize " + x + " " + y ) );
	}

	public void hintergrund(int i, int f) {
		log( board.receiveMessage( ">>background " + i + " " + f ) ) ;
	}

	public void hintergrund2(int i, int j, int f) {
		log( board.receiveMessage(">>background2 " + i + " " + j + " " + f ) ) ;
	}

	public void flaeche(int f) {
		log( board.receiveMessage(">>ba " + f ) ) ;
	}

	public void rahmen(int f) {
		log( board.receiveMessage(">>border " + f ) ) ;
	}

	public void loeschen() {
		log( board.receiveMessage(">>clear") );
	}

	public void farben(int f) {
		log( board.receiveMessage(">>colors " + f ) ) ;
	}

	public  void farbe(int i, int f) {
		log( board.receiveMessage(  ">>color " + i + " " + f ) ) ;
	}

	public void farbe2(int i, int j, int f) {
		log( board.receiveMessage(">>color2 " + i + " " + j + " " + f ) ) ;
	}

///	public void grau(int i, int g) {
//		farbe(i, g << 16 | g << 8 | g);
//	}
//
//	public void grau2(int i, int j, int g) {
//		farbe2(i, j, g << 16 | g << 8 | g);
//	}
//
	public void formen(String f) {
		log( board.receiveMessage(">>forms " + f ) ) ;
	}

	public void form(int i, String f) {
		log( board.receiveMessage(">>form " + i + " " + f ) ) ;
	}

	public void form2(int i, int j, String f) {
		log( board.receiveMessage(">>form2 " + i + " " + j + " " + f ) ) ;
	}

	public void symbolGroesse(int i, double s) {
		log( board.receiveMessage(">>symbolSize " + i + " " + s ) ) ;
	}

	public void symbolGroesse2(int i, int j, double s) {
		log( board.receiveMessage(">>symbolSize2 " + i + " " + j + " " + s ) ) ;
	}

	public void symbolGroessen( double s) {
		log( board.receiveMessage(">>symbolSizes "  + s ) ) ;
	}

	public void text(int i, String f) {
		log( board.receiveMessage(">>text " + i + " " + f ) ) ;
	}

	public void text2(int i, int j, String f) {
		log( board.receiveMessage(">>text2 " + i + " " + j + " " + f ) ) ;
	}

	public void textFarbe(int i, int c) {
		log( board.receiveMessage(">>textColor " + i + " " + c ) ) ;
	}

	public void textFarbe2(int i, int j, int c) {
		log( board.receiveMessage(">>textColor2 " + i + " " + j + " " + c ) ) ;
	}

	public void zeichen(int i, char c) {
		log( board.receiveMessage(">>T " + i + " " + c ) ) ;
	}

	public void zeichen2(int i, int j, char c) {
		log( board.receiveMessage(">>#T " + i + " " + j + " " + c ) ) ;
	}

	public void statusText(String s) {
		log( board.receiveMessage(">>statusText " + s ) ) ;
	}
	
	public String abfragen() {
		return board.receiveMessage(">>p \n"  );
	}
}
