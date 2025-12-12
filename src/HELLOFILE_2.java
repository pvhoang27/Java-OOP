/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
import java.io.File;
import java.util.*;
public class HELLOFILE_2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
    }
}
