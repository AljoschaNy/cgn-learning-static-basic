package org.example;

public class Main {
    public static void main(String[] args) {
        Count count1 = new Count();
        Count count2 = new Count();
        Count count3 = new Count();

        count1.incrementInstanceCount();
        count1.incrementInstanceCount();

        count2.incrementInstanceCount();
        count2.incrementInstanceCount();
        count2.incrementInstanceCount();
        count2.incrementInstanceCount();

        count3.incrementInstanceCount();

        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();




    }
}