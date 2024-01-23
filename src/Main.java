public class Main {

	public static void main(String[] args) {
		taskTwo();
		taskThree();
	}

	private static void taskTwo() {
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("������ ������", "�������", "sergey@mail.ru", "+79184567896", 64600, 46);
		employees[1] = new Employee("���� �������", "������", "arin@mail.ru", "+79187892586", 47600, 35);
		employees[2] = new Employee("������� ����", "��������", "anna@mail.ru", "+79194856314", 45000, 27);
		employees[3] = new Employee("������ ����", "��������", "pepe@mail.ru", "+79145567898", 37000, 56);
		employees[4] = new Employee("����� ������", "��������", "hazin@mail.ru", "+79136987746", 110000, 42);
		for (Employee employee : employees) {
			if (employee.age > 40) {
				employee.print();
			}
		}
	}
	
	private static void taskThree() {
		Park myPark = new Park("����������, ��� 6", "8915478", "mypark@mail.ru");
		Park.Attraction trampoline = myPark.new Attraction("10:00-20:00", 300);
		trampoline.print();
	}

}
