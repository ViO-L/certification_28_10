# certification_28_10

## Задание
1. Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).
2. Создать директорию, переместить файл туда.
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.
4. Установить и удалить deb-пакет с помощью dpkg.
5. Выложить историю команд в терминале ubuntu
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).
7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”
8. Создать таблицы с иерархией из диаграммы в БД
9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
11. Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.
13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.

### 14. Написать программу, имитирующую работу реестра домашних животных.
#### В программе должен быть реализован следующий функционал:
 - #### 14.1 Завести новое животное
 - #### 14.2 определять животное в правильный класс
 - #### 14.3 увидеть список команд, которое выполняет животное
 - #### 14.4 обучить животное новым командам
 - #### 14.5 Реализовать навигацию по меню
15. Создайте класс Счетчик
у которого есть метод add(), увеличивающий̆
значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
животное” Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.

## Решение

1. Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и ослы), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
```
mkdir Marshal
cd ~/Marhal
cat > home_animals
cat > pack_animals
cat home_animals pack_animals > animals
cat animals
mv animals mans_friends
ls -ali
```
2. Создать директорию, переместить файл туда.
```
cd ..
mkdir Marshal_system
cd ~/Marshal
mv mans_friends ~/Marshal_system
cd ~/Marshal_system
ls -ali
```
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
```
sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.17-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.17-1_all.deb
sudo apt-get update
sudo apt-get install mysql-server
```
4.
```
sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb
sudo dpkg -i docker-ce-cli_20.10.133-0ubuntu-jammy_amd64.deb
sudo dpkg -r docker-ce-cli
```
5.  Выложить [историю](#CommandUbuntu.txt) команд в терминале ubuntu

` history > CommandUbuntu.txt`