import java.util.Scanner;

public class queue_implementation {
    
    //global vars 
    int A[]=new int[6];
    int f=-1,r=-1;
    
    //peek funciton
    public int peek(){
        int v = 0;
        if(f==-1 && r == -1)
        System.out.println("Queue Underflow");
        else if ( f == r)
        v = A[f];
        else
        v = A[f];
        return v;
    }

    public int pop(){
        int v = 0;
        if(f==-1 && r == -1)
        System.out.println("Queue Underflow");
        else if ( f == r)
        {
            v = A[f];
            A[f] = 0;
            r = -1;
            f = -1;
        }
        else
        {
            v=A[0];
            A[0]=0;
            f=f+1;
        }
        return v;
    }

    public void push(int value){
        if(r==6)
        System.out.println("Queue Overflow");
        else
        {
            if(f == -1)
            f = 0;
            r=r+1;
            A[r]=value;
        }
    }

    public void show_all(){
        System.out.println("front: "+f);
        System.out.println("rear: "+r);
        System.out.println("All elements");
        for(int i : A)
        System.out.print(i+" ");
        System.out.println();
    }

    public static void main (String arrgs[])
    {
        queue_implementation o = new queue_implementation();
        Scanner sc=new Scanner (System.in);
        int n=0;
        while(true)
        {
            System.out.println("Do you want to PUSH, POP or PEEK the queue A[] \n 1-PEEK \t 2-PUSH \t 3-POP");
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
