package com.javarush.test.level19.lesson03.task03;

/**
 * Created by Александр on 19.08.2015.
 */
public class test
{
    public static void main(String[] args) {
        Solution s = new Solution();
        Solution.IncomeData in = new Solution.IncomeData()
        {
            @Override
            public String getCountryCode()
            {
                return "UA";
            }

            @Override
            public String getCompany()
            {
                return "JavaRush Ltd.";
            }

            @Override
            public String getContactFirstName()
            {
                return "Ivan";
            }

            @Override
            public String getContactLastName()
            {
                return "Ivanov";
            }

            @Override
            public int getCountryPhoneCode()
            {
                return 8;
            }

            @Override
            public int getPhoneNumber()
            {
                return 5012347;
            }
        };
        Solution.IncomeDataAdapter adapter = new Solution.IncomeDataAdapter(in);
        System.out.println(adapter.getCompanyName());
        System.out.println(adapter.getCountryName());
        System.out.println(adapter.getName());
        System.out.println(adapter.getPhoneNumber());
    }
}
