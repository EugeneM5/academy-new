package by.academy.homework.hw3.Deal;

import java.text.DateFormat;
import java.util.Calendar;

public class Deal implements DealInterface {

	public final static int DEFAULT_PRODUCT_SIZE = 2;

	private String date;
	private Person seller;
	private Person buyer;
	private Product[] products;
	private int productCounter;

	public Deal() {
		super();
	}

	public Deal(String date, Person seller, Person buyer) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	@Override
	public void addProduct(Product product) {

		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}

	@Override
	public void deleteProduct(int index) {

		if (index > products.length || index < 0) {
			System.out.println("Index of bound");
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter] = null;
		productCounter--;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	private void printBill() {
		double summ = 0;
		System.out.println("Сделка совершена ");
		for (Product product : products) {
			double totalProductPrice = product.getPrice() * product.getQuantity();
			summ += totalProductPrice;
			System.out.println("Имя: " + product.getProducerName() + " " + product.getPrice() + "X"
					+ product.getQuantity() + "=" + totalProductPrice);
		}
		System.out.println("Сумма всей сделки " + summ);
		buyer.setCash(buyer.getCash() - summ);
		seller.setCash(seller.getCash() + summ);
		System.out.println("Деньги покупателя " + buyer.getCash());
		System.out.println("Деньги продавца " + seller.getCash());

	}

	public void printProducts() {
		for (int i = 0; i < productCounter; i++) {
			Product p = products[i];
			System.out.println("Name: " + p.getProducerName());
			System.out.println("Type: " + p.getType());
			System.out.println("Total Price: " + p.calcTotalPrice());
			System.out.println("-----------------");
		}
	}

	@Override
	public void deal() {
		double sum = 0;
		for (Product product : products) {
			sum += product.getPrice() * product.getQuantity();
		}
		if (sum > buyer.getCash()) {
			System.out.println("Недостаточно средств! ");
		} else {
			printBill();
		}
	}
	
	public void deadLineDate() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 10);

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
    }

}