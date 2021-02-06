package com.intellipaat.javatraining.ab;

public abstract class Drawing {
	
	void sketchPenDrawing()
	{
		System.out.println("Sketch by Pen");
	}
	
	void pencilDrawing()
	{
		System.out.println("Sketch by Pencil");
	}
	
	
	abstract void draw();   // method without body
	

}
