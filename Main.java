public class Main {
    public static void SubString(String str1,int starting_index,int ending_index)
    {
        String Str2="";
        {
            for(int i=starting_index;i<ending_index;i++)
            {
                Str2+=str1.charAt(i);
            }
            System.out.println(Str2);
        }
    }
    public static void main(String[] args) {
        String name="Mihir_GUpta";
  SubString(name,1,3);
    }
}