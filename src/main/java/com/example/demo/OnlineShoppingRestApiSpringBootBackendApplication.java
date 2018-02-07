package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShoppingRestApiSpringBootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingRestApiSpringBootBackendApplication.class, args);
	}
}


//Note to sync-up this spirng-boot RESTAPI with ur Front-end Angualr code.
//U must take care of PUT HTTP method bcoz JPA (ie CrudRepositry) provides
//save() method which takes in the productId rather than taking it from url itself
//Soo To configure the sync-up code would be -
// prod.productIdSetter = this.formGroupObj.get("myproductId").value;
// this line of code need to be added in mySaveForm() method
//which is inside (product-edit.component.ts) file 


