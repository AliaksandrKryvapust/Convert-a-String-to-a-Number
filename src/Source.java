public class Source {
    public static void main(String[] args) {
        String str ="1234";
        System.out.println(stringToNumber(str)==1234);
    }
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
