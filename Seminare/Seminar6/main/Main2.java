package main;

import Prototype.AbstractPrototype;
import Prototype.Client;

public class Main2 {
	public static void main(String[] args) throws CloneNotSupportedException {
	AbstractPrototype clientPrototye = new Client("Andrei","0734934","aaa@aa");
	
	AbstractPrototype client = clientPrototye.createCopy();
	
	System.out.println(client.toString());
	}

}
