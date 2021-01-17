public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        StringBuilder sb = new StringBuilder();

        for (char c = 'g'; c < 'f'; c++) {
            sb.append(c);
        }

        // append 方法支持拼接字符、字符串、数字等类型
        sb.append('g').append("hij").append(123);
        System.out.println(sb.toString());
    }
}
