import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quanlysinhvien ql = new quanlysinhvien();
        int menu;
        do {
            System.out.println("|-------------------MENU------------------------|");
            System.out.println("|1.Khoi tao danh sach                           |");
            System.out.println("|2.Them sinh vien                |");
            System.out.println("|3.Xoa sinh vien                |");
            System.out.println("|4.Tim kiem sinh vien                                    |");
            System.out.println("|0.Thoat                                        |");
            System.out.println("|-----------------------------------------------|");
            System.out.print("Nhap lua chon: ");
            menu = sc.nextInt();
            switch(menu) {
                case 1:
                    //ql.Init();
                    break;
                case 2:
                    ql.themsv();
                    break;
                case 3:
                    ql.xoasv();
                    break;
                case 4:
                    ql.timkiemsv();
                    break;
            }
        } while (menu != 0);
    }
}