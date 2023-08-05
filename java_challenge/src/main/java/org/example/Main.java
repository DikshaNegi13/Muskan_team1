package org.example;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("BankDatabase");

        MongoCollection<Document> accountcollection = database.getCollection("Bank");
        List<BankAccount>bank =new ArrayList<>();

        while(true){
        Scanner sc= new Scanner(System.in);

            System.out.println("(a) Add Account");
            System.out.println("(I) Display Account");
            System.out.println("(s) Save Account");
            System.out.println("(q) Quit");


            char ch=sc.next().charAt(0);

            if(ch=='q'){break;}

            else if (ch=='a'||ch=='A')
            {
                System.out.println("Choose the type of account : 1 -> Savings Account");

                int opt=sc.nextInt();

                System.out.println("Type Account Name");

                String account_name2=sc.nextLine();
                String account_name=sc.nextLine();

                System.out.println("Type the Account Balance");

                double balance=sc.nextDouble();

                System.out.println("Account Name: "+account_name);

                System.out.println("Account Balance: "+balance);

                System.out.println("Account Type: Savings Account");

                BankAccount account=new BankAccount(account_name,balance);

                bank.add(account);

            }
            else if(ch=='i'||ch=='I')
            {               Document bankd1=new Document();

                FindIterable<Document> cursor = accountcollection.find({},{"_id":0,"account_name":1,"balance":1});
                    cursor.forEach(System.out::println);




            }
            else if(ch=='s'||ch=='S'){
              Document bankd=new Document();
              bankd.put(bank.get(bank.size()-1).account_name,bank.get(bank.size()-1).balance);
              accountcollection.insertOne(bankd);
            }




















            }}

        }




















