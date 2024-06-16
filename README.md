<div class="Markdown base-markdown base-markdown_with-gallery markdown markdown_size_normal markdown_type_theory full-markdown"><h1>Постановка задачи</h1><div class="paragraph">Тебе предстоит протестировать API учебного сервиса <a href="http://qa-scooter.praktikum-services.ru/" target="_blank">Яндекс.Самокат</a>. Его документация: <a href="https://qa-scooter.praktikum-services.ru/docs/" target="_blank">qa-scooter.praktikum-services.ru/docs/</a>.</div><div class="paragraph">Перед тем как писать тесты, протестируй API вручную в Postman. Это поможет разобраться, как работают запросы.</div><h3>Подготовка</h3><div class="paragraph">Перед тем как приступить к заданиям:</div><ol start="1"><li>Создай Maven-проект.</li><li>Назови проект Sprint_3.</li><li>Подключи JUnit 4, RestAssured, Allure.</li></ol><h3><strong>Протестируй ручки</strong></h3><div class="paragraph">Проверь, что они корректно работают и выдают нужные ошибки.</div><ol start="1"><li><strong>Создание курьера</strong></li></ol><div class="paragraph">Проверь:</div><ul><li>курьера можно создать;</li><li>нельзя создать двух одинаковых курьеров;</li><li>чтобы создать курьера, нужно передать в ручку все обязательные поля;</li><li>запрос возвращает правильный код ответа;</li><li>успешный запрос возвращает <code class="code-inline code-inline_theme_light">ok: true</code><strong>;</strong></li><li>если одного из полей нет, запрос возвращает ошибку;</li><li>если создать пользователя с логином, который уже есть, возвращается ошибка.</li></ul><ol start="2"><li><strong>Логин курьера</strong></li></ol><div class="paragraph">Проверь:</div><ul><li>курьер может авторизоваться;</li><li>для авторизации нужно передать все обязательные поля;</li><li>система вернёт ошибку, если неправильно указать логин или пароль;</li><li>если какого-то поля нет, запрос возвращает ошибку;</li><li>если авторизоваться под несуществующим пользователем, запрос возвращает ошибку;</li><li>успешный запрос возвращает <code class="code-inline code-inline_theme_light">id</code>.</li></ul><ol start="3"><li><strong>Создание заказа</strong></li></ol><div class="paragraph">Проверь, что когда создаёшь заказ:</div><ul><li>можно указать один из цветов — BLACK или GREY;</li><li>можно указать оба цвета;</li><li>можно совсем не указывать цвет;</li><li>тело ответа содержит <code class="code-inline code-inline_theme_light">track</code>.</li></ul><div class="paragraph">Чтобы протестировать создание заказа, нужно использовать параметризацию.</div><ol start="4"><li><strong>Список заказов</strong></li></ol><div class="paragraph">Проверь, что в тело ответа возвращается список заказов.</div><ol start="5"><li><strong>Отчёт Allure</strong></li></ol><div class="paragraph">Сгенерируй его и запушь в репозиторий.</div><div class="paragraph">Обрати внимание: всю папку target коммитить не нужно. Чтобы добавить в коммит только отчёт, можно перейти в папку проекта в консоли и выполнить команды:</div><pre class="bash code-block code-block_theme_light"><div class="code-block__tools"><span class="code-block__clipboard">Скопировать код</span><span class="code-block__lang">BASH</span></div><div class="scrollable-default scrollable scrollable_theme_light code-block__scrollable prisma prisma_theme_light"><div></div><div class="scrollable__content-wrapper"><div class="scrollbar-remover scrollable__content-container" style="--scroll-bar-width:18px; --scroll-bar-height:18px;"><div class="scrollable__content"><div class="code-block__code-wrapper"><code class="code-block__code bash"><span class="hljs-comment"># добавляем папку с отчётом Allure к файлам. Ключ -f пригодится, если папка target указана в .gitignore</span>
git add -f .\target\allure-results\.
<span class="hljs-comment"># выполняем коммит</span>
git commit -m <span class="hljs-string">"add allure report"</span>
<span class="hljs-comment"># так отправишь файлы в удалённый репозиторий</span>
git push </code></div><div></div></div></div></div><section class="scrollbar-default scrollbar scrollbar_vertical scrollbar_hidden scrollable__scrollbar scrollable__scrollbar_type_vertical" style="--scrollbar-offset-size:153px; --scrollbar-control-size:153px; --scrollbar-control-container-size:100%; --scrollbar-scale:1; --scrollbar-control-offset:0;" size="1"><div class="scrollbar__control-container"><div class="scrollbar__control"><div class="scrollbar__control-line"></div></div></div></section><section class="scrollbar-default scrollbar scrollbar_horizontal scrollable__scrollbar scrollable__scrollbar_type_horizontal" style="--scrollbar-offset-size:688px; --scrollbar-control-size:592.192px; --scrollbar-control-container-size:100%; --scrollbar-scale:1; --scrollbar-control-offset:0;"><div class="scrollbar__control-container"><div class="scrollbar__control"><div class="scrollbar__control-line"></div></div></div></section></div></pre><div class="paragraph">Не забудь: тесты должны быть независимыми. Все данные нужно удалять после того, как тест выполнится. Если для проверки нужен пользователь, создай его перед тестом и удали после. </div><h3>Дополнительное задание</h3><div class="paragraph">Это задание можешь выполнить по желанию: оно не повлияет на оценку за основную часть, но поможет дополнительно попрактиковаться. </div><div class="paragraph">Протестируй ручки:</div><ol start="1"><li><strong>Удалить курьера</strong></li></ol><div class="paragraph">С методом DELETE можно работать так же, как с другими методами. </div><div class="paragraph">Проверь:</div><ul><li>неуспешный запрос возвращает соответствующую ошибку;</li><li>успешный запрос возвращает <code class="code-inline code-inline_theme_light">ok: true</code><strong>;</strong></li><li>если отправить запрос без <code class="code-inline code-inline_theme_light">id</code>, вернётся ошибка;</li><li>если отправить запрос с несуществующим <code class="code-inline code-inline_theme_light">id</code>, вернётся ошибка.</li></ul><ol start="2"><li><strong>Принять заказ</strong></li></ol><div class="paragraph">Проверь:</div><ul><li>успешный запрос возвращает <code class="code-inline code-inline_theme_light">ok: true</code>;</li><li>если не передать <code class="code-inline code-inline_theme_light">id</code> курьера, запрос вернёт ошибку;</li><li>если передать неверный <code class="code-inline code-inline_theme_light">id</code> курьера, запрос вернёт ошибку;</li><li>если не передать номер заказа, запрос вернёт ошибку;</li><li>если передать неверный номер заказа, запрос вернёт ошибку.</li></ul><ol start="3"><li><strong>Получить заказ по его номеру</strong></li></ol><div class="paragraph">Проверь:</div><ul><li>успешный запрос возвращает объект с заказом;</li><li>запрос без номера заказа возвращает ошибку;</li><li>запрос с несуществующим заказом возвращает ошибку.</li></ul><div class="paragraph">В запросах 2 и 3 дополнительного задания нужно передавать query-параметры.</div><div class="paragraph">Query-параметры — это параметры в форме «имя параметра — значение». </div><div class="paragraph">Строка запроса с параметрами выглядит так: <code class="code-inline code-inline_theme_light">some_url?parameter1=1&amp;parameter2=some_value</code>.</div><div class="paragraph">Из чего она состоит:</div><ul><li>ручка <code class="code-inline code-inline_theme_light">some_url</code>,</li><li>параметр <code class="code-inline code-inline_theme_light">parameter1</code> с числовым значением 1,</li><li><code class="code-inline code-inline_theme_light">parameter2</code> со строковым значением <code class="code-inline code-inline_theme_light">some_value</code>.</li></ul><div class="paragraph">После пути к ручке нужно поставить <code class="code-inline code-inline_theme_light">?</code>. Параметры отделяются друг от друга знаком <code class="code-inline code-inline_theme_light">&amp;</code>.</div><div class="paragraph">Посмотри, как передать такой запрос в RestAssured:</div><pre class="java code-block code-block_theme_light"><div class="code-block__tools"><span class="code-block__clipboard">Скопировать код</span><span class="code-block__lang">JAVA</span></div><div class="scrollable-default scrollable scrollable_theme_light code-block__scrollable prisma prisma_theme_light"><div></div><div class="scrollable__content-wrapper"><div class="scrollbar-remover scrollable__content-container" style="--scroll-bar-width:18px; --scroll-bar-height:18px;"><div class="scrollable__content"><div class="code-block__code-wrapper"><code class="code-block__code java">        
            given()
                <span class="hljs-comment">// здесь всё как обычно</span>
        .auth().oauth2(<span class="hljs-string">"введи_сюда_свой_токен"</span>)
                <span class="hljs-comment">// в этих строчках параметры переданы в запрос</span>
        .queryParam(<span class="hljs-string">"parameter1"</span>, <span class="hljs-string">"1"</span>)
        .queryParam(<span class="hljs-string">"parameter2"</span>, <span class="hljs-string">"some_value"</span>)
        .get(<span class="hljs-string">"some_url"</span>)
        .then() 
          ... <span class="hljs-comment">// дальше всё как обычно</span> </code></div><div></div></div></div></div><section class="scrollbar-default scrollbar scrollbar_vertical scrollbar_hidden scrollable__scrollbar scrollable__scrollbar_type_vertical" style="--scrollbar-offset-size:249px; --scrollbar-control-size:249px; --scrollbar-control-container-size:100%; --scrollbar-scale:1; --scrollbar-control-offset:0;" size="1"><div class="scrollbar__control-container"><div class="scrollbar__control"><div class="scrollbar__control-line"></div></div></div></section><section class="scrollbar-default scrollbar scrollbar_horizontal scrollbar_hidden scrollable__scrollbar scrollable__scrollbar_type_horizontal" style="--scrollbar-offset-size:688px; --scrollbar-control-size:688px; --scrollbar-control-container-size:100%; --scrollbar-scale:1; --scrollbar-control-offset:0;" size="1"><div class="scrollbar__control-container"><div class="scrollbar__control"><div class="scrollbar__control-line"></div></div></div></section></div></pre><div class="paragraph">Обрати внимание на метод <code class="code-inline code-inline_theme_light">queryParam</code>: туда передают имя параметра и его значение.</div><div class="paragraph">Как видишь, эту строчку можно повторять несколько раз — столько, сколько нужно передать параметров.</div><h3>Как будут оценивать твою работу</h3><div class="paragraph"><strong>Для основного задания</strong></div><ol start="1"><li>Нейминг элементов корректный. Если не помнишь правила, посмотри <a href="https://code.s3.yandex.net/qa-automation-engineer/java/cheatsheets/paid-track/sprint2/namingRules.pdf" target="_blank">в шпаргалку</a>.</li><li>В <code class="code-inline code-inline_theme_light">pom.xml</code> нет ничего лишнего.</li><li>Тесты лежат в <code class="code-inline code-inline_theme_light">src/test/java</code>.</li><li>Для каждой ручки тесты лежат в отдельном классе.</li><li>Написаны тесты на ручку «Создать курьера».</li><li>Написаны тесты на ручку «Логин курьера».</li><li>Написаны тесты на ручку «Создать заказ».</li><li>Написаны тесты на ручку, которая получает список заказов.</li><li>Сделан отчёт с помощью Allure. Не забудь закоммитить его.</li><li>В тестах проверяется тело и код ответа.</li><li>Все тесты независимы.</li><li>Необходимые тестовые данные создаются перед тестом и удаляются после того, как он выполнится.</li><li>В тестах нет хардкода.</li><li>В проекте используется Java 11.</li></ol><div class="paragraph"><strong>Для дополнительного задания</strong> </div><div class="paragraph">Правила те же, что и для основного задания. Что ещё:</div><ol start="1"><li>Написаны тесты на ручку «Удалить курьера».</li><li>Написаны тесты на ручку «Принять заказ».</li><li>Написаны тесты на ручку «Получить заказ по его номеру».</li></ol><h3>Как сдать работу</h3><div class="paragraph">Прочитай <a href="https://code.s3.yandex.net/qa-automation-engineer/java/cheatsheets/paid-track/sprint3/uploadProjectGithub.pdf" target="_blank">инструкцию</a>.</div></div>
#   S p r i n t _ 7  
 