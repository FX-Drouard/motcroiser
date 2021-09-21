package pobj.motx.tme1;

public class Case {
	private int lig,col;
	private char c;
	
	public Case(int lig, int col, char c) {
		this.lig=lig;
		this.col=col;
		this.c=c;
	}

	public int getLig() {
		return lig;
	}


	public int getCol() {
		return col;
	}


	public char getChar() {
		return c;
	}

	public void setChar(char c) {
		this.c = c;
	}

	public boolean isVide() {
		return this.c==' ';
	}
	
	public boolean isPleine() {
		return this.c=='*';
	}
	
	
	
}
