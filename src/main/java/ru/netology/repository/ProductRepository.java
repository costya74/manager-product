package ru.netology.repository;

import ru.netology.domain.Book;
import ru.netology.domain.Product;

public class ProductRepository {
    private Product[] items = new Product[0];
// команда принимает и сохраняет в памяти
    public void save(Product item) {
        // вычисляем длину массива и создаем массив размером на 1 ячейку больше
        int lenght = items.length + 1;
//  создаем новый массив
        Product[] tmp = new Product[lenght];
// просим выдать: ячейку от куда копир, № позиции от куда копир, куда копир, от куда, какое кол-во эл-тов
        System.arraycopy(items, 0, tmp, 0, items.length);
//        вычисляем номр последней ячейки
        int lastIndex = tmp.length - 1;
//        копир в новую ячейку
        tmp[lastIndex] = item;
//        сохраняем в ячейке
        items = tmp;
    }
// отдаем массив всех запомнившихся эл-тов
    public Product[] finAll() {
        return items;
    }
// удаляем по номеру id
    public void removeById(int id) {
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        // Дай мне номер массива, если =, то копир и удаляй
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
}
