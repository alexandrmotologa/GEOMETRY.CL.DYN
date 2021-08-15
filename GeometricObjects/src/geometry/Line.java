package geometry;

public class Line {

	public int startX;
	public int endX;
	public int startY;
	public int endY;
	
		// constructor
		  public Line(int startX,int startY,int endX,int endY) {
			  
			  if(startX == endX && startY == endY) {
				  System.err.println("Error");
			  } else {
				  
				  this.startY = startY;
				  this.startX = startX;
				  this.endX   = endX;
				  this.endY   = endY;
			  }
		    
		  }
		  
		  public void printCoords() {
			  System.out.printf("[%d:%d]----->[%d:%d]\n", this.startX, this.startY, this.endX, this.endY);
		  }
		  
		  public int length() {
			  int lineLength = (int)Math.sqrt( Math.pow(( this.endX - this.startX ), 2) + Math.pow(( this.endY - this.startY ), 2));
			  return lineLength;
		  }
}

