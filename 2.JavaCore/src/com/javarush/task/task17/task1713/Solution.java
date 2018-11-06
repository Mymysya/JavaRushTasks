package com.javarush.task.task17.task1713;


import java.util.*;
import java.util.function.UnaryOperator;

/*
Общий список
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
2. Список Solution должен работать только с целыми числами Long.
3. Воспользуйтесь полем original.
4. Список будет использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.


Требования:
1. Класс Solution должен реализовывать интерфейс List<Long>.
2. Класс Solution должен содержать private поле original типа ArrayList<Long>.
3. Все переопределенные методы интерфейса List должны делегировать полномочия методам объекта original.
4. Все методы класса Solution, кроме метода main, должны быть синхронизированы.
*/

public class Solution implements List<Long>{

    private volatile ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    @Override
    public synchronized int size() {
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {

        /*Убедись, что переопределенный метод contains(Object o) класса Solution вызывает метод contains(Object o) объекта original.*/
        return original.contains(o);
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        return original.iterator();
    }

    @Override
    public synchronized Object[] toArray() {

        //Убедись, что переопределенный метод  toArray() класса Solution вызывает метод  toArray() объекта original.
        return original.toArray();
    }

    @Override
    public synchronized <T> T[] toArray(T[] a) {

        //Убедись, что переопределенный метод toArray() c параметром класса Solution вызывает метод toArray() с параметром объекта original.
        return original.toArray(a);
    }

    @Override
    public synchronized boolean add(Long aLong) {
        return original.add(aLong);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return original.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        //Убедись, что переопределенный метод containsAll(Collection c) класса Solution вызывает метод containsAll(Collection c) объекта original.
        return original.containsAll(c);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> c) {
        return original.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends Long> c) {
        return original.addAll(index,c);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {

        //Убедись, что переопределенный метод removeAll(Collection c) класса Solution вызывает метод removeAll(Collection c) объекта original.
        return original.removeAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        return original.retainAll(c);
    }

    @Override
    public synchronized void clear() {
        //Убедись, что переопределенный метод clear() класса Solution вызывает метод clear() объекта original.
        original.clear();
    }

    @Override
    public synchronized Long get(int index) {
        return original.get(index);
    }

    @Override
    public synchronized Long set(int index, Long element) {
        return original.set(index,element);
    }

    @Override
    public synchronized void add(int index, Long element) {
        original.add(index, element);
    }

    @Override
    public synchronized Long remove(int index) {
        return original.remove(index);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int index) {
        return original.listIterator(index);
    }

    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex) {
        //Убедись, что переопределенный метод subList(int fromIndex, int toIndex) класса Solution вызывает метод subList(int fromIndex, int toIndex) объекта original.
        return original.subList(fromIndex,toIndex);
    }
}
