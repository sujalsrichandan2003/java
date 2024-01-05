//1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class first
{
    public static void main(String[] args) {
        System.err.println("welcome to java");
    }
}

//2
class sum
{
    public static void main(String[] args) 
    {
        int x,y;
        x = 10;
        y = 25;
        
        int z = x+y;
        System.err.println(z);
    }

}

//3
class positive
{
    public static void main(String[] args) 
    {
        int num = -5;

        if (num==0)
            System.out.println("it is zero");
        else if (num>0)
            System.out.println(num+" is positive");
        else
            System.out.println(num+" is negative");
    }
}

//4
class display
{
    public static void main(String[] args) 
    {
        int x = 1;
        do{
            System.out.println(x);
            x++;
        }while(x<=10);
    }
}

//5
class show
{
    public static void main(String[] args)
    {
        int x= 1;       
            while(x<=10)
            {
                System.out.println(x);
                x++;
            }
    }
}

//6
class loop
{
    public static void main(String[] args) 
    {
        for(int x = 1; x<=10 ; x++)
        //{
            System.out.println(x);
        //}without this also output are coming.
    }
}

//7
class print
{
    public static void main(String[] args) {
        int x = 1;
        for( ; ; )
        {
            System.out.println(x);
            x++;
            if(x > 10)break;
        }
    }
}

//8
class stars
{
    public static void main(String[] args) 
    {
        int r = 5;
        for(int i=1 ; i<=r ; i++)
        {
            for( int st=1 ; st<=i ; st++)
        {
            System.out.print("*");
        }
        System.out.println();
        }
    }
}

//9
class each
{
    public static void main(String[] args) {
        int arr[] = {200, 19, -56, 44, 99};
        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}
//10
class switchcase
{
    public static void main(String[] args) {
        char color='g';
        switch(color)
        {
            case 'r':System.out.println("red");
            break;
            case 'g':System.out.println("green");
            break;
            case 'b':System.out.println("blue");
            break;
            case 'w':System.out.println("white");
            break;
            default :System.out.println("no color");
        }
    }
}

//11
class descending
{
    public static void main(String[] args) {
        for(int i=10;i>=1;i--)
        {
            System.out.println(i);
        }
    }
}

//12
class input
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter character: ");
        char ch = (char)br.read();
        System.out.println("you entered: "+ ch);
    }
}