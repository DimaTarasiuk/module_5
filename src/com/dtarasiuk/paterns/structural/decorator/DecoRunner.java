package com.dtarasiuk.paterns.structural.decorator;

public class DecoRunner {
    public static void main(String[] args) {
        String salary_records = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(new EncriptionDecorator(new FileDataSource("out/Output.txt")));

        encoded.writeData(salary_records);
        DataSource plain  = new FileDataSource("out/Output.txt");


        System.out.println(" - Input --------------");
        System.out.println(salary_records);
        System.out.println(" - Encoded --------------");
        System.out.println(plain.readData());
        System.out.println(" - Decoded --------------");
        System.out.println(encoded.readData());
    }
}
