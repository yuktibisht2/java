public class pattern7 {
    
    public static void main(String[] args)
    {
        int i,j, n=5;
        int count=1;
        
          for(i=0;i<n;i++)
          {
            for(j=0;j<n;j++)
            {
                //printing 0 bcz dimesions will be get mismatched
                if(count<10)
            {
                System.out.print('0');
            
            }
            System.out.print(count+" ");
            count++;
            
            }
            System.out.println(" ");
          }
    }
    }




