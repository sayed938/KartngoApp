package com.exampletafsyr.kartngoapp.viewmodel;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import com.exampletafsyr.kartngoapp.data.ProductRepo;
import com.exampletafsyr.kartngoapp.model.Product;

import java.util.List;

public class ProductViewModel extends ViewModel {

    private final MutableLiveData<List<Product>> productsLiveData = new MutableLiveData<>();
    private final ProductRepo productRepo;

    public ProductViewModel() {
        getProducts();
        productRepo = new ProductRepo();
        loadProducts();
    }

    private void loadProducts() {
        // Assuming ProductRepo has a method getProducts() that returns List<Product>
        List<Product> products = productRepo.getProducts();
        productsLiveData.setValue(products);
    }

    public LiveData<List<Product>> getProducts() {
        return productsLiveData;
    }
}
