package com.javarush.test.level19.lesson03.task05;

/**
 * Created by Александр on 19.08.2015.
 */
public class Main
{
    public static void main(String[] args) {
        Solution.Customer customer = new Solution.Customer()
        {
            @Override
            public String getCompanyName()
            {
                return "JavaRush Ltd.";
            }

            @Override
            public String getCountryName()
            {
                return "Ukraine";
            }
        };

        Solution.Contact contact = new Solution.Contact()
        {
            @Override
            public String getName()
            {
                return "Ivanov, Ivan";
            }

            @Override
            public String getPhoneNumber()
            {
                return "+38(050)123-45-67";
            }
        };

        Solution.DataAdapter dataAdapter = new Solution.DataAdapter(customer, contact);
        System.out.println(dataAdapter.getCompany());
        System.out.println(dataAdapter.getContactFirstName());
        System.out.println(dataAdapter.getContactLastName());
        System.out.println(dataAdapter.getCountryCode());
        System.out.println(dataAdapter.getDialString());
    }
}
