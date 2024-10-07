## В чем суть проекта?

Проект реализовывает небольшое банковское приложение, расчитанное на большие нагрузки.

## Функционал:
- Пользователь может зарегистрироваться или авторизоваться в приложении(имеет двухфакторную авторизацию).
- Пользователь может просматривать актуальные курсы валют и данные с биржевых сайтов.
- Пользователь может создавать, замораживать и удалять свои счета.
- Пользователь может делать переводы между собственными счетами и между счетами других пользователей.
- Пользователю предоставляется система уведомлений, которая будет уведомлять его о всех операциях и всех входах в его профиль.


## Стек технологий:

#### Backend:
- __Java 17__ 
- __Java Spring Boot__: основная платформа для создания RESTful API и микросервисов.
- __Spring Security__: обеспечение аутентификации и авторизации, интеграция с JWT.
- __Hibernate__: ORM для работы с базами данных.
- __PostgreSQL__: БД для хранения данных о пользователях.
- __Redis__: кэширование для ускорения запросов.
- __Kafka/RabbitMQ__: очередь сообщений для обработки событий и уведомлений в реальном времени.
- __Elasticsearch__: для ведения журналов (логов) и аналитики.

#### Devops:
- __Docker & Kubernetes__: для контейнеризации и оркестрации сервисов, масштабируемости и управления нагрузкой.
- __AWS__: облачные сервисы для масштабирования и гибкости.
- __Nginx__: реверс-прокси и балансировка нагрузки.
- __HashiCorp Vault__: безопасное хранение токенов.

#### Frontend:
- React: фронтенд фреймворк для создания удобного пользовательского интерфейса.
- TypeScript: для обеспечения стабильности и улучшенной разработки.



## Основные системы в проекте:



## Фичи:



