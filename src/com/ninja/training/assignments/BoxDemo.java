package com.ninja.training.assignments;

class Box {
	
	private int length;
	private int width;
	private int height;
	
	public Box() {
		length = 0;
		width = 0;
		height = 0;
	}
	
    public Box(int value) {
    	
    	length = value;
		width = value;
		height = value;
		
	}
	
    public Box(int l,int w, int h) {
    	
    	length = l;
		width = w;
		height = h;
		
	}
    
    public int findVolume() {
    	int volume = length * width * height;
    	return volume;
    }
}

public class BoxDemo {
	
	public static void main(String[] args) {
		
		Box box = null;
		int volume = 0;
		
		box = new Box();
		volume = box.findVolume();
		System.out.println("Volume 1: " + volume);
		
		box = new Box(3);
		volume = box.findVolume();
		System.out.println("Volume 2: " + volume);
		
		box = new Box(3,5,7);
		volume = box.findVolume();
		System.out.println("Volume 3: " + volume);
		
	}
}




