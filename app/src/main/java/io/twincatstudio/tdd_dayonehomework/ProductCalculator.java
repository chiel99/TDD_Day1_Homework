package io.twincatstudio.tdd_dayonehomework;


import java.util.ArrayList;

class ProductCalculator {
    private ArrayList<Product> mProductList = null;

    public ProductCalculator(ArrayList<Product> list) {
        mProductList = list;
    }

    public ArrayList<Integer> getSumList(int group, String columnName)
            throws IllegalArgumentException {
        ArrayList<Integer> result = new ArrayList<>();

        if (group == 0) {
            result.add(0);
            return result;
        }
        if (group < 0) {
            throw new IllegalArgumentException("group should be greater than zero");
        }

        int count = 0;
        int sum = 0;
        for (int i = 0 ; i < mProductList.size() ; i++) {
            Product product = mProductList.get(i);
            if (!product.has(columnName)) {
                throw new IllegalArgumentException("Invalid column name");
            }

            sum += product.get(columnName);
            count++;

            if (count == group) {
                result.add(sum);
                count = 0;
                sum = 0;
            }
        }

        // Last sum
        if (count != 0) {
            result.add(sum);
        }

        return result;
    }
}
