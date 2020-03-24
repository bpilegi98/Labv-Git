public class Pila<E>
{
    private Nodo<E> top;
    private Nodo<E> bottom;

    public Pila(Nodo<E> top, Nodo<E> bottom)
    {
        this.top = top;
        this.bottom = bottom;
    }

    public Pila()
    {
        this.top = null;
        this.bottom = null;
    }

    public Nodo<E> getTop() {
        return top;
    }

    public void setTop(Nodo<E> top) {
        this.top = top;
    }

    public Nodo<E> getBottom() {
        return bottom;
    }

    public void setBottom(Nodo<E> bottom) {
        this.bottom = bottom;
    }

    public void push(E element)
    {
        Nodo<E> nodo = new Nodo<E>(element);
        if(top==null)
        {
            bottom=nodo;
            top=bottom;
        }
        else
        {
            top.setNext(nodo);
            top=nodo;
        }
    }

    public Nodo<E> pop()
    {
        return top;
    }

    public int size()
    {
        int i=0;
        Nodo<E> nodo = new Nodo<E>(bottom.getElement(), bottom.getNext());

        while(nodo!=null)
        {
            i++;
            nodo=nodo.getNext();
        }
        return i;
    }
}
