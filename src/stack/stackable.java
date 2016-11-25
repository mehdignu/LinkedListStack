package stack;

public interface stackable<T> {
	public void push(T data);
	public T pop();
	public T peek();
	public boolean isEmpty();
	public int getSize();
	public void clear();
	public void prinAll();
}
