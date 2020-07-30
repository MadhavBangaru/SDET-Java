package task5;

public class DuplicateChar {

    public static void main(String[] args)
    {
      String input = "Better Butter";
      int count=0,len=0;
        do
        {  

          char name[]=input.toCharArray();
              len=name.length;
              count=0;
              for(int j=0;j<len;j++)
               {
                  if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123))) 
                      count++;
               }
              if(count!=0)
                System.out.println(name[0]+" "+count+" Times");
              input=input.replace(""+name[0],"");          
          }
        while(len!=1);
   }

}