

public abstract class Heap {
	
	private Node storage[];
	private int maxSize;
	private int n;
	
	public Heap(){
		maxSize = 10;
		storage = new Node[maxSize];
		n = 0;
	}
	
	public Heap(Node list[], int largest)
	{
		for(int i = 0; i < list.length; i++)
		{
			//enqueue(list[i]);
		}
		maxSize = largest;
		n = list.length;
	}
	
	public void enqueue(int id, int importance)
	{
		Node temp = new Node(id, importance, new Object());
		//insert(temp);
	}
	
	public int dequeue()
	{
		//removemax();
		return 1;
	}
	
	
}
