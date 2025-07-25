package com.exampletafsyr.kartngoapp.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.exampletafsyr.kartngoapp.R;
import com.exampletafsyr.kartngoapp.model.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private List<Product> productList;

    public ProductAdapter(List<Product> products) {
        this.productList = products;
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView name, price,btnPlus,btnMinus,quantity;
        ImageView image;

        public ProductViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.productName);
            price = itemView.findViewById(R.id.productPrice);
            image = itemView.findViewById(R.id.productImage);
            btnPlus = itemView.findViewById(R.id.plusButton);
            btnMinus=itemView.findViewById(R.id.minusButton);
            quantity=itemView.findViewById(R.id.quantityText);

        }
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.name.setText(product.getProductName());
        holder.price.setText(product.getProductPrice() + " SAR");
        holder.image.setImageResource(product.getImage());
        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "Selected: " + product.getProductName(), Toast.LENGTH_SHORT).show();
        });
        holder.btnPlus.setOnClickListener(v -> {
            int qty = product.getProductQuantity();
            product.setProductQuantity(qty + 1);
            holder.quantity.setText(String.valueOf(product.getProductQuantity()));
        });

        holder.btnMinus.setOnClickListener(v -> {
            int qty = product.getProductQuantity();
            if (qty > 0) {
                product.setProductQuantity(qty - 1);
                holder.quantity.setText(String.valueOf(product.getProductQuantity()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}

