public class stringB_h {
    public static void main(String args[]){
        int b =101010;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]*"));
        String str2 = "3223AFF3";
        System.out.println(str2.matches("[0-9A-F]+"));
        String str3 ="a@#$%skkslsja*";
        System.out.println(str3.replaceAll("[^a-zA-Z0-9]",""));
    }

}
