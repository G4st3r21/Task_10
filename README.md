# Task 10. Массивы / списки объектов (классов)

Видео работы - https://vk.com/video/@g4st3r7?z=video305871474_456239520%2Fpl_305871474_-2

В задаче обязательно использовать свои (описанные в вашей программе) составные типы данных (структуры или классы).
Для представления набора объектов лучше использовать списки (массивы также допустимы, но менее удобны для данной задачи).
Данная задача должна быть оформлена двумя способами:
1) в виде консольного приложения;
2) в виде оконного приложения, где массив объектов можно задать в JTable. При этом должна быть возможность загрузить данный из файла в JTable (реализованная в виде двух функций: чтение данных из файла в двумерный массив и отображение двумерного массива в JTable), а также сохранить данные из JTable в файл (реализованная в виде двух функций: чтение данных из JTable в двумерный массив и запись двумерного массива в файл).
Функции, реализующие логику задачи и чтение / запись данных из файлов / в файлы, должны быть оформлены в виде отдельного модуля (в отдельном файле). Этот модуль без каких-либо изменений должен использоваться в двух программах: с консольным интерфесом (файлы для чтения / записи задаются в параметрах командной строки) и оконным интерфейсом.
Данные в файлах должны храниться в следующем виде: каждая отдельная строка описывает отдельный объект. Соответственно строки состоят из нескольких элементов (чисел, строк), каждый из которых описывает отдельный атрибут объекта. Например, набор линий вида ax + by + c = 0 будет храниться в текстовом файле в следующем виде:
  
  4 5 4 10 2 12
  
  5 34 23
  
  и т.д.
  
, где каждая строка описывает отдельную линию с параметрами a, b, c.
Заранее придумать не менее 5 различных тестов, охватывающих как типичные, так и все возможные граничные (наиболее невероятные и показательные) ситуации. (Сохранить в текстовых файлах input01.txt, input02.txt и т. д.)
Решение, естественно, должно быть оформлено в виде отдельной функции. В реализации обязательно использовать вспомогательные функции примерно так же, как в предыдущих Задачах № 8 - 9 (в этой задаче, какие именно вспомогательные функции использовать, не расписано, вы должны самостоятельно решить, какие именно будут удобны для вашего варианта).



**Вариант № 18: Упорядочить набор треугольников, заданных тремя вершинами, по площади (от меньшей к большей).**

ArrayUtlis был очищен от ненужных методов и отредактирован под необходимые требования(прим. метод "WriteTriangleArrayToFile")
