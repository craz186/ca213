class LinkedList<T>
{	
	private static class Node<T>
	{
		private T item; 
		private Node<T> next; 
		
		Node(T item0, Node<T> next0)
		{
			item= item0; next= next0;
		}
	
	}
	private Node<T> head = null;
	private Node<T> tail= null;
	private int numItems = 0;
	
	public T get(int i) 
	{
		if(i<0||i>numItems)
			throw new IndexOutOfBoundsException();
		else if(i==numItems-1&&tail!=null)
			return tail.item;
		else if(head!=null) 
		{
			Node<T> p= head;
			int count=0;
			while(p!=null&&i!=count)
			{
				p=p.next;
				count++;
			}
			return p.item;
		}
		else return null;
	}
	public boolean add(T t)
	{
		if(tail==null)
		{
			tail= new Node<T>(t,null);
			head=tail;
		}
		else
		{
			tail.next= new Node<T>(t,null);
			tail=tail.next;
		}
		numItems++;
		return true;
	}
	public static void main(String[] args)
	{
		LinkedList<String> ls= new LinkedList<>();
		ls.add("a");
		ls.add("b");
		ls.add("c");
		System.out.println(ls.get(3));
	
	}
}