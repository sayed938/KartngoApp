package com.exampletafsyr.kartngoapp.data;

import com.exampletafsyr.kartngoapp.R;
import com.exampletafsyr.kartngoapp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    public List<Product> getProducts() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Cheese burger", 20, 0, R.drawable.pngegg));
        productList.add(new Product("Zinger burger", 18.0, 0, R.drawable.pngegg2));
        productList.add(new Product("French Fries", 9.5, 0, R.drawable.pngegg3));
        productList.add(new Product("Crispy Chicken", 18.75, 0, R.drawable.pngegg4));
        productList.add(new Product("Good Burger", 6.0, 0, R.drawable.pngegg5));
        productList.add(new Product("French Fries", 9.5, 0, R.drawable.pngegg6));
        productList.add(new Product("Crispy Chicken", 18.75, 0, R.drawable.pngegg7));
        productList.add(new Product("Good Burger", 6.0, 0, R.drawable.pngegg8));

        return productList;
    }
}
