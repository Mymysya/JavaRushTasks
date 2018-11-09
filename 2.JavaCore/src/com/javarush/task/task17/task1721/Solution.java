package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла.
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.


Требования:
1. Класс Solution должен содержать public static поле allLines типа List<String>.
2. Класс Solution должен содержать public static поле forRemoveLines типа List<String>.
3. Класс Solution должен содержать public void метод joinData() который может бросать исключение CorruptedDataException.
4. Программа должна считывать c консоли имена двух файлов.
5. Программа должна считывать построчно данные из первого файла в список allLines.
6. Программа должна считывать построчно данные из второго файла в список forRemoveLines.
7. Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в allLines содержаться все строки из списка forRemoveLines.
8. Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException, если в allLines не содержаться все строки из списка forRemoveLines.
9. Метод joinData должен вызываться в main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        String file1 = "";
        String file2 = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            file1 = reader.readLine();
            file2 = reader.readLine();

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //file1 = "D:\\Java\\Javarush\\1.txt";
        //file2 = "D:\\Java\\Javarush\\2.txt";

        allLines        = readFile(file1);
        forRemoveLines  = readFile(file2);

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
        }
    }

    public static List<String> readFile(String file) {

        List<String> aLines = new ArrayList<String>();

        try {
            FileInputStream fstream1 = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream1));
            String strLine;

            while ((strLine = br.readLine()) != null) {
                aLines.add(strLine);
                System.out.println(strLine);
            }

            fstream1.close();
            br.close();
        } catch (IOException e) {
            System.out.println("Error to read.");
        }

        return aLines;
    }

    public void joinData() throws CorruptedDataException {

/*7. Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в allLines содержаться все строки из списка forRemoveLines.
8. Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException, если в allLines не содержаться все строки из списка forRemoveLines.*/
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();

            throw new CorruptedDataException();
        }
    }
}
/*public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            File file = new File(reader.readLine());
            File file2 = new File(reader.readLine());

            Runnable task1 = () -> {
                try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
                    String data = null;
                    while ((data = fileReader.readLine()) != null) {
                        allLines.add(data);
                    }
                }  catch (IOException e) {
                    e.printStackTrace();
                }
            };

            Runnable task2 = () -> {
                try (BufferedReader fileReader = new BufferedReader(new FileReader(file2))) {
                    String data = null;
                    while ((data = fileReader.readLine()) != null) {
                        forRemoveLines.add(data);
                    }
                }  catch (IOException e) {
                    e.printStackTrace();
                }
            };

            Thread thread1 = new Thread(task1);
            Thread thread2 = new Thread(task2);
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            Solution solution = new Solution();
            solution.joinData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}*/
