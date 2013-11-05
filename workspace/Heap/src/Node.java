
public class Node {
	private int Object_ID;
	private int priority;
	private Object item;
	private Node left, right;
	
	public Node (int id, int importance, Object thing)
	{
		Object_ID = id;
		priority = importance;
		item = thing;
		Right = null;
		Left = null;
	}
	
	public int getObject_ID()
	{
		return Object_ID;
	}
	
	public int getPriority()
	{
		return priority;
	}
	
	public Object getItem()
	{
		return item;
	}
	
	public void setObject_ID(int ID)
	{
		Object_ID = ID;
	}
	
	public void setPriority(int importance)
	{
		priority = importance;
	}
	
	public void setItem(Object thing)
	{
		item = thing;
	}
	
	public Node getLeft()
	{
		return left;
	}
	
	public Node getRight()
	{
		return right;
	}
	
	public void setRight(Node r)
	{
		right = r;
	}
	
	public void setLeft(Node l) 
	{
		left = l;
	}
}
