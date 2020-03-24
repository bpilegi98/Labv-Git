import java.util.ArrayList;
import java.util.List;

public class Generic <T extends Comparable>
{
    private List<T> list;

    public Generic()
    {
        list = new ArrayList<T>();
    }

    public void add(T t)
    {
        this.list.add(t);
    }

    public boolean remove(T t)
    {
        return this.list.remove(t);
    }

    public boolean exist(T t)
    {
        return this.list.contains(t);
    }

    public T findMaximum(T t)
    {
        if (this.list != null && !this.list.isEmpty())
        {
            int i = 0;
            T variable = list.get(i);
            while (i < list.size())
            {
                if (1 == list.get(i).compareTo(variable))
                {
                    variable = list.get(i);
                }
                i++;
            }
            return variable;
        }
        else
            return null;
    }

    public T findMinimum(T t)
    {
        if (this.list != null && !this.list.isEmpty())
        {
            int i = 0;
            T variable = list.get(i);
            while (i < list.size())
            {
                if (-1 == list.get(i).compareTo(variable))
                {
                    variable = list.get(i);
                }
                i++;
            }
            return variable;
        }
        else
            return null;
    }

    public String toString()
    {
        if (this.list != null && !this.list.isEmpty())
        {
            String result = " ";

            for (T e : this.list)
            {
                result += e.toString() + "\n";
            }
            return result;

        }
        else
            return " ";
    }

    public T deleteLastAndReturn()
    {
        if (this.list != null && !this.list.isEmpty())
        {
            int i = this.list.size() - 1;
            T var = this.list.get(i);
            this.list.remove(i);
            return var;
        }
        else
            return null;
    }

}
