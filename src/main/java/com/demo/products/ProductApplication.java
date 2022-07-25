package com.demo.products;

import com.demo.products.exceptions.InvalidInputException;

public interface ProductApplication {

    /**
     * @param str null| name of product
     * @returns array of products that match the string
     * @exception InvalidInputException
     */

    String[] searchProduct(String str) throws InvalidInputException;
}
