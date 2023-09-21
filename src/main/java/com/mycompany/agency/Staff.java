package com.mycompany.agency;

    //@author Brandon Anup


public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 employees to the staffList
        staffList[0] = new Executive("Jim", "Oak St", "333-333-3333", "100-03-3049", 5.0);
        staffList[1] = new Intern("Bob", "Maple St", "666-666-6666");
        staffList[2] = new Executive("Pat", "Apple Pl", "444-444-4444", "123-45-6789", 10.0);
        //theres a typo with the TempEmployee class so make sure whoever is working on that fixes it. It's TempEmploee instead of TempEmployee
        staffList[3] = new TempEmployee("Tim", "Mango St", "222-222-2222", "111-11-1111", 15.0);
        staffList[4] = new StaffMember("Bill", "Willow Pl", "777-777-7777");
        staffList[5] = new StaffMember("Sam", "Blueberry St", "111-111-1111");




        ((Executive)staffList[0]).awardBonus(500.00);
        ((TempEmployee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
