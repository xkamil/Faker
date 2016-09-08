package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by kamilwrobel on 08.09.2016.
 */
public class DataParser {


    public static List<String> getDataFromFile(String path){
        List<String> fileData = new ArrayList<String>();
        File file = new File(path);
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader(file));
            String line = null;

            while((line = br.readLine()) != null){
                fileData.add(line.trim());
            }
            if(br != null){
                br.close();
            }
        }catch(Exception ex){
            Logger.getLogger(DataParser.class.getName()).log(Level.SEVERE, ex.getMessage());
        }

        return fileData;
    }
}
