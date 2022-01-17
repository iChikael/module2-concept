package product.services;

import product.model.Cart;
import product.model.Product;
import product.utils.CSVUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CartService implements ICartService {
    List<Cart> cartList = new ArrayList<>();
    public static String path = "src/data/cart.csv";

    @Override
    public List<Cart> getCart() {
        List<Cart> newCartlist = new ArrayList<>();
        List<String> reads = CSVUtils.read(path);
        for (String read:reads) {
            newCartlist.add(new Cart(read));
        }
        return cartList = newCartlist;
    }

    @Override
    public void updateCart(int id, Cart update) {
        getCart();
        for (int i = 0; i < cartList.size(); i++) {
            if(cartList.get(i).getId() == id){
                cartList.set(i,update);
                CSVUtils.write(path,cartList);
            }
        }
    }

    @Override
    public void addCart(Cart newCart) {
        cartList.add(newCart);
        CSVUtils.write(path, cartList);
    }

    @Override
    public void removeCart() {
        cartList.clear();
    }



    public Cart findCartbyID(int id){
        getCart();
        for (Cart cart : cartList) {
            if (cart.getId() == id){
                return cart;
            }
        }
        return null;
    }
    public boolean checkDupblicate(int id){
        for (Cart p :cartList) {
            if (p.getId() == id)
                return true;
        }
        return false;
    }
}

