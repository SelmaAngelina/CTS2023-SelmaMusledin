package Prototype;

public interface AbstractPrototype extends Cloneable{
	public AbstractPrototype createCopy() throws CloneNotSupportedException;
}
