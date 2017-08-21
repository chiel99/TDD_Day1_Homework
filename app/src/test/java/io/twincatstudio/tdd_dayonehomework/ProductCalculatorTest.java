package io.twincatstudio.tdd_dayonehomework;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ProductCalculatorTest {

    private ArrayList<Product> mTestSampleList = new ArrayList<>();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setup() {
        mTestSampleList.clear();
        mTestSampleList.add(new Product(1, 1, 11, 21));
        mTestSampleList.add(new Product(2, 2, 12, 22));
        mTestSampleList.add(new Product(3, 3, 13, 23));
        mTestSampleList.add(new Product(4, 4, 14, 24));
        mTestSampleList.add(new Product(5, 5, 15, 25));
        mTestSampleList.add(new Product(6, 6, 16, 26));
        mTestSampleList.add(new Product(7, 7, 17, 27));
        mTestSampleList.add(new Product(8, 8, 18, 28));
        mTestSampleList.add(new Product(9, 9, 19, 29));
        mTestSampleList.add(new Product(10, 10, 20, 30));
        mTestSampleList.add(new Product(11, 11, 21, 31));
    }

    @Test
    public void getSumList_group3_columnCost() throws Exception {
        // Arrange
        ProductCalculator target = new ProductCalculator(mTestSampleList);
        int group = 3;
        String columnName = "Cost";
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6, 15, 24, 21));

        // Act
        ArrayList<Integer> actual = target.getSumList(group, columnName);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getSumList_group4_columnRevenue() throws Exception {
        // Arrange
        ProductCalculator target = new ProductCalculator(mTestSampleList);
        int group = 4;
        String columnName = "Revenue";
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(50, 66, 60));

        // Act
        ArrayList<Integer> actual = target.getSumList(group, columnName);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getSumList_groupNegative_columnCost_should_throw_IllegalArgumentException() {
        // Arrange
        ProductCalculator target = new ProductCalculator(mTestSampleList);
        int group = -1;
        String columnName = "Cost";

        // Act
        thrown.expect(IllegalArgumentException.class);
        ArrayList<Integer> actual = target.getSumList(group, columnName);

        // Assert
        // Should throw IllegalArgumentException
    }

    @Test
    public void getSumList_group3_columnInvalid_should_throw_IllegalArgumentException() {
        // Arrange
        ProductCalculator target = new ProductCalculator(mTestSampleList);
        int group = 3;
        String columnName = "Invalid";

        // Act
        thrown.expect(IllegalArgumentException.class);
        ArrayList<Integer> actual = target.getSumList(group, columnName);

        // Assert
        // Should throw IllegalArgumentException
    }

    @Test
    public void getSumList_group0_columnCost_should_return_zero() {
        // Arrange
        ProductCalculator target = new ProductCalculator(mTestSampleList);
        int group = 0;
        String columnName = "Cost";
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0));

        // Act
        ArrayList<Integer> actual = target.getSumList(group, columnName);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getSumList_group1_columnCost() throws Exception {
        // Arrange
        ProductCalculator target = new ProductCalculator(mTestSampleList);
        int group = 1;
        String columnName = "Cost";
        ArrayList<Integer> expected = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

        // Act
        ArrayList<Integer> actual = target.getSumList(group, columnName);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getSumList_group12_columnCost() throws Exception {
        // Arrange
        ProductCalculator target = new ProductCalculator(mTestSampleList);
        int group = 12;
        String columnName = "Cost";
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(66));

        // Act
        ArrayList<Integer> actual = target.getSumList(group, columnName);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getSumList_group3_columnSellPrice() throws Exception {
        // Arrange
        ProductCalculator target = new ProductCalculator(mTestSampleList);
        int group = 3;
        String columnName = "SellPrice";
        ArrayList<Integer> expected = new ArrayList<>(
                Arrays.asList(66, 75, 84, 61));

        // Act
        ArrayList<Integer> actual = target.getSumList(group, columnName);

        // Assert
        assertEquals(expected, actual);
    }
}