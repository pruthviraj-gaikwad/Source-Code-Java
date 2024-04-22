public class string {
    public static void main(String args[]){
        String str = "programming@gmail.com";
        int i = str.indexOf("@");
        String str1= str.substring(0, i);
        String str2 = str.substring(i+1,str.length());
        System.out.println("UserName: " + str1 + "\n"+"DomainName: "+str2);
        int j = str.indexOf(".");
        String domain = str.substring(i+1, j);
        System.out.println(domain.equals("gmail"));
    }
}
