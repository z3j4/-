import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class classer {
    private static final Map<Integer, String> BOOKS = new HashMap<>();

    static {
        BOOKS.put(1, "Java编程思想");
        BOOKS.put(2, "Effective Java");
        BOOKS.put(3, "深入理解Java虚拟机");
        BOOKS.put(4, "算法第四版");
        BOOKS.put(5, "Head First 设计模式");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n请选择操作：");
            System.out.println("1. 显示所有图书名称");
            System.out.println("2. 根据图书名称查询图书");
            System.out.println("0. 退出程序");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    searchBookByName();
                    break;
                case 0:
                    System.out.println("感谢使用图书查询程序！");
                    running = false;
                    break;
                default:
                    System.out.println("无效的选择，请重新输入。");
                    break;
            }
        }
    }
    private static void displayAllBooks() {
        System.out.println("所有图书的名称：");
        for (Map.Entry<Integer, String> entry : BOOKS.entrySet()) {
            System.out.println(STR."\{entry.getKey()}. \{entry.getValue()}");
        }
    }
    private static void searchBookByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要查询的图书名称：");
        String bookName = scanner.nextLine();
        if (BOOKS.containsValue(bookName)) {
            System.out.println("图书存在！");
        } else {
            System.out.println("图书不存在！");
        }
    }
}