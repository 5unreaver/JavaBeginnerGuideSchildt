package Chapter_5;

// Использование строк для управления оператором switch
public class StringSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String command = "cancel";
		
		switch(command) {
		case "connect":
			System.out.println("Подключение");
			break;
		case "cancel":
			System.out.println("Отмена");
			break;
		case "disconnect":
			System.out.println("Отключение");
			break;
		default:
			System.out.println("Неверная команда!");
			break;
		}
	}
}
