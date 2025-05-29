import java.util.*;
public class stack_implementation{

    //global vars 
    int A[]=new int[6];
    int t=-1;
    
    //peek funciton
    public int peek(){
        int v = 0;
        if(t==-1)
        System.out.println("Stack Underflow");
        else
        v = A[t];
        return v;
    }

    public int pop(){
        int v = 0;
        if(t==-1)
        System.out.println("Stack Underflow");
        else
        {
            v = A[t];
            A[t--]=0;            
        }
        return v;
    }

    public void push(int value){
        if(t==5)
        System.out.println("Stack Overflow");
        else
        {
            t=t+1;
            A[t]=value;
        }
    }

    public void show_all(){
        System.out.println("All elements");
        for(int i : A)
        System.out.print(i+" ");
        System.out.println();
    }

    public static void main (String arrgs[])
    {
        stack_implementation o = new stack_implementation();
        Scanner sc=new Scanner (System.in);
        int n=0;
        while(true)
        {
            System.out.println("Do you want to PUSH, POP or PEEK the stack A[] \n 1-PEEK \t 2-PUSH \t 3-POP");
            n=sc.nextInt();
            switch(n)
            {
                case 1: 
                System.out.println("Peeked value: "+o.peek());
                o.show_all();
                break;
                case 2: 
                System.out.println("Enter the value");
                o.push(sc.nextInt());
                o.show_all();
                break;
                case 3:
                System.out.println("Popped value: "+o.pop());
                o.show_all();
                break;
            }
        }
    }
}