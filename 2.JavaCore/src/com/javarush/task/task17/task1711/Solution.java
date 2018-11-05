package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion.

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u - обновляет соответствующие данные людей с заданными id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке.
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople.
Порядок вывода данных соответствует вводу данных.
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных).
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример вывода для параметра -і с двумя id:
Миронов м 15-Apr-1990
Миронова ж 25-Apr-1997


Требования:
1. Класс Solution должен содержать public static volatile поле allPeople типа List<Person>.
2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
3. При параметре -с программа должна добавлять всех людей с заданными параметрами в конец списка allPeople, и выводить id каждого (index) на экран.
4. При параметре -u программа должна обновлять данные людей с заданными id в списке allPeople.
5. При параметре -d программа должна логически удалять людей с заданными id в списке allPeople.
6. При параметре -i программа должна выводить на экран данные о всех людях с заданными id по формату указанному в задании.
7. Метод main класса Solution должен содержать оператор switch по значению args[0].
8. Каждый case оператора switch должен иметь блок синхронизации по allPeople.
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
       /*name - имя, String
        sex - пол, "м" или "ж", одна буква
        bd - дата рождения в следующем формате 15/04/1990*/

        Person people = null;
        String value;

        int id =0;
        String name;
        Sex male;
        Date date = null;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        //Каждый case оператора switch должен иметь блок синхронизации по allPeople.
        switch (args[0]) {
            case "-c":{
                synchronized (allPeople){
                    //-с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
                    //-c Миронов м 15/04/1990

                    for (int i = 1; i< args.length;i+=3) {
                        name = args[i];
                        male = args[i+1].equals("м") ? Sex.MALE : Sex.FEMALE;

                        try {
                            date = formatter.parse(args[i+2]);//создаю дату через
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        allPeople.add(male == Sex.MALE ? Person.createMale(name, date) : Person.createFemale(name, date));
                        System.out.println(allPeople.size() - 1);
                    }

                }
                break;
            }
            case "-u":{
                synchronized (allPeople){

                    // При параметре -u программа должна обновлять данные людей с заданными id в списке allPeople.
                    //-u id name sex bd
                    for (int i = 1; i< args.length;i+=4) {
                        id = Integer.parseInt(args[i]);

                        name = args[i+1];
                        male = args[i+2].equals("м") ? Sex.MALE : Sex.FEMALE;

                        try {
                            date = formatter.parse(args[i+3]);//создаю дату через
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        people = allPeople.get(id);
                        people.setName(name);
                        people.setSex(male);
                        people.setBirthDate(date);
                    }
                }
                break;
            }
            case "-d": {
                synchronized (allPeople) {
                    //-d - производит логическое удаление человека с id, заменяет все его данные на null
                    //-d id1 id2 id3 id4 ...
                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);

                        people = allPeople.get(id);
                        people.setName(null);
                        people.setSex(null);
                        people.setBirthDate(null);
                    }
                }
                    break;
            }
            case "-i":{
                synchronized (allPeople) {
                    //-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
                    //Миронов м 15-Apr-1990

                    for (int i = 1; i < args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        people = allPeople.get(id);

                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

                        System.out.println(people.getName() + " " + (people.getSex() == Sex.MALE ? "м" : "ж") + " " + dateFormat.format(people.getBirthDate()));
                    }
                }
                break;
            }
        }

    }
}
