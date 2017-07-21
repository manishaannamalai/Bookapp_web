package Controller;

public class TestOrderValidator {

	public static void main(String[] args) {

		String bookId = "123";
		String quantity = "";
		
		try {
			OrderValidation.validateOrder(bookId, quantity);
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
