package Controller;

public class OrderValidation {

	public static void validateOrder(String bookId, String quantity) throws Exception {

		if (bookId == null || bookId.equals("") || bookId.trim().equals("")) {
			throw new Exception("Please select a Book");
		}

		try {
			int bId = Integer.parseInt(bookId);
		}
		catch (Exception e) {
			throw new Exception("Invalid BookId");
		}

	}
}
