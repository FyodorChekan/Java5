# 1. Считаем площадь фигуры
Напишите программу, которая считает площадь геометрической фигуры (круг, квадрат,
прямоугольный треугольник). Данная программа должна запрашивать в консоль тип
геометрической фигуры. В зависимости от полученного ответа запрашивать необходимые
геометрические размеры и расчитывать площадь фигуры. Под все три типа фигур создайте
отдельные классы с соответствующими параметрами. Каждый класс должен имплементировать
интерфейс Area, который должен содержать метод calculateArea. Для каждого класса необходимо
реализовать свой функционал данного метода.
# 2. Больше геометрических фигур
Дополните функционал предыдущей задачи возможностью за один запуск вносить размеры N
разных фигур. Программа должна создавать массив Area[] figure и заполнять его полученными
фигурами. После внесения последней фигуры программа должна запускать цикл, который считает
площадь всех введенных фигур и выводит его в консоль 
# 3. Телефон
а) Создайте класс Phone, который содержит переменные number, model и weight.

б) Создайте три экземпляра этого класса.

в) Выведите на консоль значения их переменных.

г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на
консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти
методы для каждого из объектов.

д) Добавить конструктор в класс Phone, который принимает на вход три параметра для
инициализации переменных класса - number, model и weight.

е) Добавить конструктор, который принимает на вход два параметра для инициализации
переменных класса - number, model.

ж) Добавить конструктор без параметров.

з) Вызвать из конструктора с тремя параметрами конструктор с двумя.

и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего
и номер телефона звонящего. Вызвать этот метод.

к) Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на
вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль
номера этих телефонов.

# 4. Читатели библиотеки
Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер
читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
Разработать программу, в которой создается массив объектов данного класса. Перегрузить
методы takeBook(), returnBook():
- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение
"Петров В. В. взял 3 книги".
- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль
сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
- takeBook, который будет принимать переменное количество объектов класса Book (создать
новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял
книги: Приключения, Словарь, Энциклопедия".

Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров
В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".