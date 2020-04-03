# RPP_Laba_2
  Задание с фрагментами, один содержит кликабельный список, другой ViewPager
  Первое активити загружает JSON-файл, который переводится в строку и передается второму активити.
  Второе активити получает строку. И передает ее в ViewModel. По разметке, второе активити имеет один контейнер, в который вставляется
определенный фрагмент, по необходимости. Также, второе активити содержит, грубо говоря, 4 класса.
  Первый класс, это ViewModel. Он позволяет хранить информацию во время всего жизненного цикла активити. Еще он необходим для хранения
информации о технологиях, которые передаются двум фрагментам (ViewModel хранит общую информацию для двух фрагментов). Этот класс
получает строку из второго активити и преобразует его в список технологий и подгружает все необходимые фотографии (картинки также хранятся
в классе технологий).
  Второй класс это Technologies, который хранит список класса Technology. Каждый класс Technology в свою очередь хранит поля:
name, graphics, helptext и image, первые три имеют тип String, а последний тип Bitmap (т.е. картинка)
  Третий класс это ListFragment, это стандартный фрагмент, который был немного модернезирован под класс Technology. ListFragment
содержит вспомогательные класс, такие как адаптер и т.д. (все стандартно). Также, фрагмент объявляет новый интерфейс, который подключается
во втором активити. Он необходим для отслеживания нажатия на определенный элемент в списке.
  Последний класс это фрагмент, который содержит в разметке ViewPager и еще один фрагмент, который будет отображаться на ViewPager.
  
  Кратко опишу информационные потоки между классами. В первом активити получаем JSON-файл, передаем его второму активити, второе
активити передает эту строку ViewModel и создает на основе JSON-файла список классов и подгружает все картинки. Дальше, во втором 
активити, создается ListFragment, которому мы передаем ссылку на ViewModel, через нее он будет получать всю необходимую информацию. После
этого фрагмент подгружает всю информацию из ViewModel в адаптер списка. Все это выводится на экран смартфона. Как только произошло нажатие
на какой-нибудь элемент списка, второе активити через интерфейс получает данное событие, и открывает второй фрагмент с ViewPager. Дальше,
может быть нажата кнопка "назад", тогда программа опять вернется к списку, при повторном нажатии, программа закрывается.

Скриншоты из приложения:


Список

![Список в программе](https://github.com/BadKrog/RPP_Laba_2/blob/master/imagesForGit/Screenshot_list.jpg)

Страница в ViewPager (объект без описания)
![Страница без helptext](https://github.com/BadKrog/RPP_Laba_2/blob/master/imagesForGit/Screenshot_page_without_helptext.jpg)

Страница в ViewPager (объект с описанием)
![Страница c helptext](https://github.com/BadKrog/RPP_Laba_2/blob/master/imagesForGit/Screenshot_page_with_helptext.jpg)

