package com.dt;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class OnlineShooping {
	static Scanner s = new Scanner(System.in);
	static ArrayList<String> arr = new ArrayList<String>();
	static UsernamePass u = new UsernamePass();
	static OnlineShooping shop= new OnlineShooping();
	public static void main(String[] args) throws IOException {
		shop.userPass();
	}
	public  void userPass() throws IOException {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\ARUN\\eclipse-workspace\\com.dt\\src\\com\\dt\\user.properties");
			Properties p = new Properties();
			p.load(fin);
			System.out.println("ENTER YOUR USERNAME");
			u.setUserpass(s.nextLine());
			if (p.containsKey(u.getUserpass())) {
				System.out.println("ENTER YOUR PASSWORD");
				 u.setPassword(s.nextLine());
				if (p.containsValue(u.getPassword())) {
					System.out.println("HEY!  " + u.getUserpass());
					shop.productCategory();
				} else {
					System.out.println("WRONG PASSWORD TRY AGAIN");
					shop.userPass();
					}
			} else {
				System.out.println("WRONG USERNAME TRY AGAIN");
				shop.userPass();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
public  void productCategory() {
		try {
			System.out.println("------WELCOME TO E-SHOPPING------");
			System.out.println("---THESE ALL ARE PRODUCT CATEGORIES---");
			HashMap<Integer, String> km = new HashMap<Integer, String>();
			km.put(1, "GROCERY");
			km.put(2, "MOBILES");
			km.put(3, "FASHION");
			km.put(4, "ELECTRONICS");
			km.put(5, "APPLIANCES");
			for (Entry<Integer, String> string : km.entrySet()) {
				System.out.println(string);
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("WHICH PRODUCT CATEGORY YOU WANT TO CHOOSE ?");
			String product = sc.next();
			if (product.equalsIgnoreCase("Grocery")) {
				System.out.println("----SO YOU CHOOSE->>>>" + product);
				shop.groceryList();
			} else if (product.equalsIgnoreCase("mobiles")) {
				System.out.println("SO YOU CHOOSE   " + product);
				shop.mobilesList();
			} else if (product.equalsIgnoreCase("fashion")) {
				System.out.println("SO YOU CHOOSE   " + product);
				shop.fashionList();
			} else if (product.equalsIgnoreCase("electronics")) {
				System.out.println("SO YOU CHOOSE   " + product);
				shop.electronicsList();
			} else if (product.equalsIgnoreCase("appliances")) {
				System.out.println("SO YOU CHOOSE   " + product);
				shop.applianceList();
			} else {
				System.out.println(" ");
				System.out.println("SOMETHING WRONG TRY AGAIN");
				shop.productCategory();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public  void groceryList() {
		try {
			System.out.println("----GROCERY CATEGORIES----");
			Deque<String> deque = new ArrayDeque<String>();
			deque.add("GOLDWINNER");
			deque.add("HARPICPOWERPLUS");
			deque.add("ONION");
			deque.add("DETTOLHANDWASH");
			deque.add("TATATEA");
			deque.add("RAGIFLOUR");
			deque.add("CHOCOLATE");
			for (String string : deque) {
				System.out.println(string);
			}
			System.out.println("!!! CHOOSE OUR PRODUCT !!!");
			String groc = s.next();
			if (deque.contains(groc)) {
				arr.add(groc);
				System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
				System.out.println(arr.size() + " PRODUCTS IN THE CART");
				System.out.println("!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
				String cart = s.next();
				if (cart.equalsIgnoreCase("yes")) {
					shop.choiceCart();
				} else if (cart.equalsIgnoreCase("no")) {
					System.out.println(
							"!!! DO YU WANT TO CONTINUE IN GROCERY CATEGORY CLICK<<--YES OR-->>NO FOR MAIN CATEGORY !!!");
					String decis = s.next();
					if (decis.equalsIgnoreCase("yes")) {
						shop.groceryList();
					} else if (decis.equalsIgnoreCase("no")) {
						shop.productCategory();
					}
				}
			}

			else {
				System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
				shop.groceryList();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public  void mobilesList() {
		try {
			System.out.println("----MOBILES CATEGORIES----");
			List<String> link = new LinkedList<String>();
			link.add("REDMIA1");
			link.add("GALAXYF13");
			link.add("MOTOROLA30");
			link.add("INFINIX11");
			link.add("REALME9");
			link.add("VIVO20");
			link.add("OPPO5G");
			for (String string : link) {
				System.out.println(string);
			}
			System.out.println("!!! CHOOSE OUR PRODUCT !!!");
			String mobi = s.next();
			if (link.contains(mobi)) {
				arr.add(mobi);
				System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
				System.out.println(arr.size() + " PRODUCTS IN THE CART");
				System.out.println("!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
				String cart = s.next();
				if (cart.equalsIgnoreCase("yes")) {
					shop.choiceCart();
				} else if (cart.equalsIgnoreCase("no")) {
					System.out.println("!!! DO YU WANT TO CONTINUE IN MOBILES CATEGORY SHOOPING CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
					String decis1 = s.next();
					if (decis1.equalsIgnoreCase("yes")) {
						shop.mobilesList();
					} else if (decis1.equalsIgnoreCase("no")) {
						shop.productCategory();
					}
				}
			} else {
				System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
				shop.mobilesList();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void fashionList() {
		try {
			System.out.println("----MOBILES CATEGORIES----");
			Set<String> set = new TreeSet<String>();
			set.add("menswear");
			set.add("womenwear");
			for (String string : set) {
				System.out.println(string);
			}
			System.out.println("!!! CHOOSE YOUR PRODUCT WEAR !!!");
			String fash = s.next();
			if (fash.equalsIgnoreCase("menswear")) {
				shop.menList();
			} else if (fash.equalsIgnoreCase("womenwear")) {
				shop.womenList();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public  void menList() {
		try {
			System.out.println("----MENSWEAR PRODUCTS----");
			Set<String> hash = new HashSet<String>();
			hash.add("TSHIRT");
			hash.add("PANT");
			hash.add("JEANS");
			hash.add("SHOES");
			for (String string : hash) {
				System.out.println(string);
			}
			System.out.println("!!! CHOOSE YOUR PRODUCT WEAR !!!");
			String mobi = s.next();
			if (hash.contains(mobi)) {
				arr.add(mobi);
				System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
				System.out.println(arr.size() + " PRODUCTS IN THE CART");
				System.out.println(
						"!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES OR NO-->>FOR CONTINUE SHOPPING !!!");
				String cart = s.next();
				if (cart.equalsIgnoreCase("yes")) {
					shop.choiceCart();
				} else if (cart.equalsIgnoreCase("no")) {
					System.out.println("!!! DO YU WANT TO CONTINUE SHOOPING IN MENSWEAR PRODUCTS CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
					String decis1 = s.next();
					if (decis1.equalsIgnoreCase("yes")) {
						shop.menList();
					} else if (decis1.equalsIgnoreCase("no")) {
						shop.productCategory();
					}
				}
			} else {
				System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
				shop.menList();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public  void womenList() {
		try {
			System.out.println("----WOMENWEAR PRODUCTS----");
			Set<String> hash1 = new HashSet<String>();
			hash1.add("SAREES");
			hash1.add("LEGGINGS");
			hash1.add("HEELS");
			hash1.add("GOWNS");
			for (String string : hash1) {
				System.out.println(string);
			}
			System.out.println("!!! CHOOSE YOUR PRODUCT WEAR !!!");
			String wear = s.next();
			if (hash1.contains(wear)) {
				arr.add(wear);
				System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
				System.out.println(arr.size() + " PRODUCTS IN THE CART");
				System.out.println("!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
				String cart = s.next();
				if (cart.equalsIgnoreCase("yes")) {
					shop.choiceCart();
				} else if (cart.equalsIgnoreCase("no")) {
            System.out.println("!!! DO YU WANT TO CONTINUE SHOOPING IN WOMENWEAR PRODUCTS CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
					String decis1 = s.next();
					if (decis1.equalsIgnoreCase("yes")) {
						shop.womenList();
					} else if (decis1.equalsIgnoreCase("no")) {
						shop.productCategory();
					}
				}
			} else {
				System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
				shop.womenList();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private  void electronicsList() {
		try {
			System.out.println("----ELECTRONICS CATEGORIES----");
			List<String> link1 = new LinkedList<String>();
			link1.add("HEADPHONES");
			link1.add("SPEAKERS");
			link1.add("SOUNDBAR");
			link1.add("POWERBANK");
			link1.add("PRINTER");
			link1.add("CONSOLE");
			link1.add("OPPO5G");
			for (String string : link1) {
				System.out.println(string);
			}
			System.out.println("!!! CHOOSE OUR PRODUCT !!!");
			String elec = s.next();
			if (link1.contains(elec)) {
				arr.add(elec);
				System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
				System.out.println(arr.size() + " PRODUCTS IN THE CART");
				System.out.println("!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
				String cart = s.next();
				if (cart.equalsIgnoreCase("yes")) {
					shop.choiceCart();
				} else if (cart.equalsIgnoreCase("no")) {
					System.out.println(
							"!!! DO YU WANT TO CONTINUE IN ELECTRONICS CATEGORY SHOOPING CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
					String decis1 = s.next();
					if (decis1.equalsIgnoreCase("yes")) {
						shop.electronicsList();
					} else if (decis1.equalsIgnoreCase("no")) {
						shop.productCategory();
					}
				}
			} else {
				System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
				shop.electronicsList();
			}

		}catch (Exception e) {
			System.out.println(e);
		}

	}

	private  void applianceList() {
		try {
			System.out.println("----APPLIANCES CATEGORIES----");
			List<String> link2 = new LinkedList<String>();
			link2.add("TV");
			link2.add("WASHINGMACHINE");
			link2.add("AC");
			link2.add("FANS");
			link2.add("FRIDGE");
			link2.add("HEATER");
			for (String string : link2) {
				System.out.println(string);
			}
			System.out.println("!!! CHOOSE OUR PRODUCT !!!");
			String appl = s.next();
			if (link2.contains(appl)) {
				arr.add(appl);
				System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
				System.out.println(arr.size() + " PRODUCTS IN THE CART");
				System.out.println("!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES OR NO-->>FOR CONTINUE SHOPPING !!!");
				String cart = s.next();
				if (cart.equalsIgnoreCase("yes")) {
					shop.choiceCart();
				} else if (cart.equalsIgnoreCase("no")) {
					System.out.println("!!! DO YU WANT TO CONTINUE IN APPLIANCES CATEGORY FOR SHOPING CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
					String decis1 = s.next();
					if (decis1.equalsIgnoreCase("yes")) {
						shop.applianceList();
					} else if (decis1.equalsIgnoreCase("no")) {
						shop.productCategory();
					}
				}
			} else {
				System.out.println("!!! WRONG PRODUCT TRY AGAIN!!!");
				shop.applianceList();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private  void choiceCart() {
		System.out.println("press --1-- for show the cart product");
		System.out.println("press --2-- remove the product from cart");
		int choice = s.nextInt();
		switch (choice) {
		case 1: {
			shop.showCart();
		}
		case 2: {
			shop.removeCart();
		}

		}

	}

	public  void showCart() {
		try {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println((i + 1) + ")-" + arr.get(i));
		}
		System.out.println(" IF YOU WANT REMOVE THE PRODUCT ENTER GO <<-- OR NO -->> FOR SEE THE CART");
		String start = s.next();
		if (start.equalsIgnoreCase("go")) {
			shop.removeCart();
		} else if (start.equalsIgnoreCase("no")) {
			shop.choiceCart();
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
public  void removeCart() {
		try {
		Iterator<String> iterator = arr.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("WHICH PRODUCT YOU WANT TO REMOVE FROM THE CART");
		String remve = s.next();
		if (arr.contains(remve)) {
			arr.remove(remve);
			Iterator<String> iterator1 = arr.iterator();
			while (iterator1.hasNext()) {
				System.out.println(iterator1.next());
			}
		} else {
			shop.showCart();
		}
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	private void paymentWay() {
		shop.groceryList();
		
	}
}

