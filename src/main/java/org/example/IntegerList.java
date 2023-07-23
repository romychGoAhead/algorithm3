package org.example;

public interface IntegerList {
    Integer add(Integer item);


    Integer add(int index, Integer item);  // выходит за пределы фактического количества элементов


    Integer set(int index, Integer item);   // Выбросить исключение, если индекс больше фактического количества элементов

    Integer remove(Integer item);

    Integer remove(int index);

    boolean contains(Integer item);                                         //Проверка на существование элемента

    int indexOf(Integer item);                                              //Поиск элемента

    int lastIndexOf(Integer item);                                          //Поиск элемента с конца

    Integer get(int index);           // Получить элемент по индексу

    boolean equals(IntegerList otherList);     //Сравнить текущий список с другим.

    int size();                                                            // Вернуть фактическое количество элементов

    boolean isEmpty();                                                     // Вернуть true, если элементов в списке нет иначе false.

    void clear();                                                          // Удалить все элементы из списка.

    Integer[] toArray();                                                    // Создать новый массив
}

