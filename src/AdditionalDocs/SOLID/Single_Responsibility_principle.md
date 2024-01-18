# Single Responsibility Principle

**Принцип единственной ответственности (The Single Responsibility Principle, SRP)**

- **Каждый объект должен иметь одну ответственность и эта ответственность должна быть полностью инкапсулирована в класс**. Все его поведения должны быть направлены исключительно на обеспечение этой ответственности.

**Robert C. Martin определяет ответственность как причину изменения и заключает, что классы должны иметь одну и только одну причину для изменений**. 
***

Например, представьте себе класс, который составляет и печатает отчёт. Такой класс может измениться по двум причинам:

- может измениться само содержимое отчёта;

- может измениться формат отчёта.

Логично, что оба аспекта этих причин на самом деле являются двумя разными ответственностями. **SRP** говорит, что в таком случае нужно **разделить класс на два новых класса, для которых будет характерна только одна ответственность**. Причина, почему нужно сохранять направленность классов на единственную цель в том, что это делает классы более здоровыми. Что касается класса, приведённого выше, если произошло изменение в процессе составления отчёта - есть большая вероятность, что в негодность придёт код, отвечающий за печать.

## Использование 
Возникает вопрос, когда стоит использовать этот принцип? Всё же **принцип - это не закон и SRP стоит применять в зависимости от того, как изменяется приложение**:

- если **при изменении кода, отвечающего за одну ответственность, в приложении появляются исправления кода, отвечающего за другую ответственность**, то это первый сигнал о нарушении SRP.

  - если же изменения кода, отвечающего за одну ответственность, не вносят изменения в код, отвечающий за другую ответственность, то этот принцип можно не применять.
  
**Слепое следование принципу единственной ответственности приводит к избыточной сложности приложения, его поддержки и тестированию.**SRP** стоит применять только тогда, когда это оправдано.**
 
 Принцип **SRP** можно применить только в том случае, когда:

- объекту класса становится позволительно слишком много;

- доменная логика концентрируется только в одном классе;

- любое изменение логики поведения объекта приводит к изменениям в других местах приложения, где это не подразумевалось изначально;

- приходится тестировать, исправлять ошибки, компилировать различные места приложения, даже если за их работоспособность отвечает третья сторона;

- невозможно легко отделить и применить класс в другой сфере приложения, так как это потянет ненужные зависимости.  