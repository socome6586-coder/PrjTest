package text01;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String id, name, joinDate, dept;
    int salary, bonus;

    public Employee(String id, String name, String joinDate, int salary, int bonus, String dept) {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
        this.salary = salary;
        this.bonus = bonus;
        this.dept = dept;
    }

    // Process: 수령액 계산
    public int getTotalPay() {
        return salary + bonus;
    }

    // Output: 개별 사원 정보 출력
    public void display() {
        System.out.printf("[%s] %s | 부서: %s | 입사일: %s | 수령액: %,d원\n", 
                          id, name, dept, joinDate, getTotalPay());
    }
}


public class Test01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Employee> empList = new ArrayList<>(); // 사원들을 담을 리스트

	        while (true) {
	            System.out.println("\n1.사원등록 2.전체조회 3.종료");
	            System.out.print("선택: ");
	            int menu = sc.nextInt();

	            if (menu == 1) {
	                // 1. Input: 정보 입력받기
	                System.out.print("사번: "); String id = sc.next();
	                System.out.print("이름: "); String name = sc.next();
	                System.out.print("입사일: "); String date = sc.next();
	                System.out.print("월급: "); int salary = sc.nextInt();
	                System.out.print("보너스: "); int bonus = sc.nextInt();
	                System.out.print("부서: "); String dept = sc.next();

	                // 2. Process: 리스트에 추가
	                empList.add(new Employee(id, name, date, salary, bonus, dept));
	                System.out.println("등록 완료!");

	            } else if (menu == 2) {
	                // 3. Output: 리스트 순회하며 출력
	                System.out.println("\n--- 전체 사원 목록 ---");
	                if (empList.isEmpty()) {
	                    System.out.println("등록된 사원이 없습니다.");
	                } else {
	                    for (Employee e : empList) {
	                        e.display();
	                    }
	                }
	            } else {
	                System.out.println("프로그램을 종료합니다.");
	                break;
	            }
	        }
	        sc.close();
	    }
	}