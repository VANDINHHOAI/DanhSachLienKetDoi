package basic.dev;
import java.util.LinkedList;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> doubleLinkedList = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.println("Nhap cac phan tu cua danh sach: ");
		for (int i = 0; i < n; i++ ) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			doubleLinkedList.add(a[i]);
		}
		
		System.out.println("Danh sach lien ket doi: " + doubleLinkedList);
		
		
		System.out.println("Nhap vao phan tu chen vao dau danh sach: ");
		int m = sc.nextInt();
		doubleLinkedList.addFirst(m);
		
		System.out.println("Nhap vao phan tu chen vao cuoi danh sach: ");
		int l = sc.nextInt();
		doubleLinkedList.addLast(l);
		
		System.out.println("Danh sach lien ket doi da duoc cap nhat: " + doubleLinkedList);
	}

}
