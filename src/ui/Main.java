package ui;

import models.Client;
import models.Product;
import models.Recipe;
import models.Table;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Inicio el programa");
		
		Client newClient = new Client("koga", "varon", "1133548140", "3215685452", false);
		Client newClient1 = new Client("yuma", "sanchez", "3355987426", "3102657178", true);
		Client newClient2 = new Client("yin", "sierra", "8845971330", "3202614550", false);
		
		Table newTable = new Table("1", 4, "lado derecho del restaurante");
		Table newTable1 = new Table("4", 6, "la habitacion siguiente");
		Table newTable2 = new Table("3", 2, "lado izquierdo cerca de la ventana");
		
		Recipe newRecipe = new Recipe("ensalada con crutones calientitos de queso crema", 12000);
		Recipe newRecipe1 = new Recipe("tacos mexicano", 6000);
		Recipe newRecipe2 = new Recipe("salteado asiatico de cerdo", 15000);
		
		Product newProduct = new Product("vegetales", "frescos", 3.000, 10);
		Product newProduct1 = new Product("tortillas de maiz", "frescas", 5.000, 12);
		Product newProduct2 = new Product("carne", "tierna", 8.000, 2);
		
		System.out.println("Primer cliente");
		System.out.println("El nuevo cliente es: " + newClient.getName() + " " + newClient.getLastName() + " " + "Id:" + newClient.getnId() + " " + "Numero:" + newClient.getPhoneNumber() + " " + "¿tiene hijos?"+ " " + newClient.getHasChildren());
		
		System.out.println("Ubicado en la mesa: " + newTable2.getNumber() + " " +  "Capacidad: " + newTable2.getCapacity() + " " + "Ubicacion:" + newTable2.getLocation());
		
		
		System.out.println("Segundo cliente");
		System.out.println("El nuevo cliente es: " + newClient1.getName() + " " + newClient1.getLastName() + " " + "Id:" + newClient1.getnId() + " " + "Numero:" + newClient1.getPhoneNumber() + " " + "¿tiene hijos?"+ " " + newClient1.getHasChildren());
		
		newTable.setCapacity(3);
		System.out.println("Ubicado en la mesa: " + newTable.getNumber() + " " +  "Capacidad: " + newTable.getCapacity() + " " + "Ubicacion:" + newTable.getLocation());
		
		
		System.out.println("Tercer cliente");
		newClient2.setName("soma");
		newClient2.setHasChildren(true);
		System.out.println("El nuevo cliente es: " + newClient2.getName() + " " + newClient2.getLastName() + " " + "Id:" + newClient2.getnId() + " " + "Numero:" + newClient2.getPhoneNumber() + " " + "¿tiene hijos?"+ " " + newClient2.getHasChildren());
		
		newTable1.setCapacity(5);
		System.out.println("Ubicado en la mesa: " + newTable1.getNumber() + " " +  "Capacidad: " + newTable1.getCapacity() + " " + "Ubicacion:" + newTable1.getLocation());
		
		
		System.out.println("Recetas y productos");
		
		newRecipe1.setName("ensalada con crutones calientitos de queso crema");
		newRecipe1.setPrice(12000);
		System.out.println("Nombre de la receta: " + newRecipe1.getName() + " " + "Precio:" + newRecipe1.getPrice());
		
		System.out.println("Productos: " + newProduct.getBrand() + " " + newProduct.getName() + " " + "Cantidad: " + newProduct.getQuantity() + " " + "Precio:" + newProduct.getPrice());
		
		newRecipe.setName("tacos mexicano");
		newRecipe.setPrice(6000);
		System.out.println("Nombre de la receta: " + newRecipe.getName() + " " + "Precio:" + newRecipe.getPrice());
		System.out.println("Productos: " + newProduct1.getBrand() + " " + newProduct1.getName() + " " + "Cantidad: " + newProduct1.getQuantity() +" " + "Precio:" + newProduct1.getPrice());
		System.out.println("Nombre de la receta: " + newRecipe2.getName() + " " + "Precio:" + newRecipe2.getPrice());
		System.out.println("Productos: " + newProduct2.getBrand() + " " + newProduct2.getName() + " " + "Cantidad: " + newProduct2.getQuantity() +" " + "Precio:" + newProduct2.getPrice());
		
		
		
	}

}
