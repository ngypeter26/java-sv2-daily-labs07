package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> soldProducts = new ArrayList<>();


    public void addProduct(Product p){
        if (p.getSellDate().isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Sell Date is not ok!");
        }
        soldProducts.add(p);
    }

    public Path writeToFileByMonth(Month month, Path testPath){
        List<String> content =createStringByMonth(month);
        System.out.println(content);
//        String filename = testPath.toString() + "/" + month.toString() + ".csv";
//        System.out.println(filename);
//        Path pathFileName = Paths.get(filename);
        try {
            StringBuilder sb = new StringBuilder().append("soldProducts_").append(month.name()).append(".csv");
            Path path = Path.of(sb.toString());
            Files.write(testPath, content);
            return path;
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot write file",ioe);
        }
    }

    private List<String> createStringByMonth(Month month){
        List<String> result = new ArrayList<>();
        for (Product p : soldProducts){
            if (p.getSellDate().getMonth().equals(month)){
                result.add(p.toString());
            }
        }
        return result;
    }



}
