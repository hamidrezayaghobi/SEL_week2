
# آزمایشگاه مهندسی نرم‌افزار: آزمایش دوم
اعضای گروه: علیرضا حیدری - حمیدرضا یعقوبی عراقی

## گام 1


| Row | Location of Change | Change Title | Brief Description of Change |
| --- | ------------------- | ------------ | --------------------------- |
| 1   | Order Service       | Add Phone Order Payment Function | Added a new void function named `phoneOrderPayment` |
| 2   | Order Service       | Add Phone Order Register Function | Added a new void function named `phoneOrderRegister` |
| 3   | PhoneOrderService   | Add New Class for supporting telephone way              | Created the `PhoneOrderService` class implementing the `OrderService` interface |
| 4   | OnSiteOrderService | Override and Implement Phone Order Register | Implemented `phoneOrderRegister` from the `OrderService` interface |
| 5   | OnSiteOrderService | Override and Implement Phone Order Payment  | Implemented `phoneOrderPayment` from the `OrderService` interface |
| 6   | OnlineOrderService  | Override and Implement Phone Order Register | Implemented `phoneOrderRegister` from the `OrderService` interface |
| 7   | OnlineOrderService  | Override and Implement Phone Order Payment  | Implemented `phoneOrderPayment` from the `OrderService` interface |
| 8   | PhoneOrderService   | Override and Implement Phone Order Register  | Implemented `phoneOrderRegister` from the `OrderService` interface |
| 9   | PhoneOrderService   | Override and Implement Phone Order Payment  | Implemented `phoneOrderPayment` from the `OrderService` interface |
| 10  | PhoneOrderService   | Override and Implement OnSite Order Register | Implemented `onSiteOrderRegister` from the `OrderService` interface |
| 11  | PhoneOrderService   | Override and Implement OnSite Order Payment | Implemented `onSiteOrderPayment` from the `OrderService` interface |
| 12  | PhoneOrderService   | Override and Implement Online Order Register | Implemented `onlineOrderRegister` from the `OrderService` interface |
| 13  | PhoneOrderService   | Override and Implement Online Order Payment  | Implemented `onlineOrderPayment` from the `OrderService` interface |
| 14  | Main                | Change Payment Method Prompt | Added the option for phone payment by entering the number 3 |
| 15  | Main                | Allow Phone Order Registration | Added a condition to allow phone order registration when the number 3 is entered |
| 16  | Main                | Allow Phone Payment           | Added a condition to allow phone payment for phone orders |

در کل 16 تغییر انجام شده است.

## گام 2

| Principle  | Achievements  | Violations  |
|---|---|---|
| **Principle 1: Single Responsibility**  | -   | - Payment services are responsible for both registering and paying processes. Order class is responsible for two different jobs (adding food and calculating price). |
| **Principle 2: Open-Close Principle (OCP)**  | - Adding "Phone Payment" didn't changed the current logic in the main class and no modification was required.  | - For adding new methods all of the codes relating the Order Services must be modified like now that adding phone changed all the classes in the Payment Services objects. |
| **Principle 3: Liskov Substitution Principle**  | - In the implementation of the "OrderService," the interface is used, and there is an Is-A relationship between the services, so they can implement their corresponding methods.  | - None  |
| **Principle 4: Interface Segregation Principle**  | - None  | - The "OrderService" interface contains many methods that are unecessary for child classes with many of these methods having no body. |
| **Principle 5: Dependency Inversion Principle**  | - In the "Main" class, an entity of type "OrderService" is considered, allowing any type of "Order" to be assigned to it.  | - Access to the object of services directly.  |


| Principle  | Violation Description  | Proposed Solution  |
|---|---|---|
| **Single Responsibility (SRP)**  | multiple responsiblities in the Order class and services | separate register and payment to different classes, and in similar way for calculing the price and adding the price, but in this scopre it is overkilling. |
| **Open-Close Principle (OCP)**  | modification of service methods | since all service tyeps share a common attribute of registering and paying, the interface be implemented more general and with register and pay abstracct methods rather than specific and detailed methods for each class |
| **Interface Segregation Principle (ISP)**  | OrderService has many unecessary methods that are not implemented mostly in subclasses | the solution of OCP solves this. |
| **Dependency Inversion Principle (DIP)**  | Direct access to class objects in the client side | Communication based on abstraction through the use of factory method design pattern which removes this dependency. |


## گام 4
با توجه به رعایت اصول، طبعا تغییرات کمتر خواهد زیرا دیگر نیاز نیست که بخواهیم برای هر کلاس تابع های متفاوت خرید و فروش جداگونه پیاده سازی کنیم. پس عملا تغییرات (1-2-4-5-6-7-10-11-12-13-16) در گام یک را نیاز نداریم. و پنج تغییر دیگر(3-8-9-14-15) را تنها نیاز داریم.
## گام 5
به طور کلی با رعایت اصول SOLID، پروژه ما نسبت به تغییرات، چه تغییرات نیازمندی‌ها و چه تغییراتی که در راستای بهبود و یا برطرف کردن یک باگ باشد، به قولی Maintableتر هستش و راحت تر میشه تغییرات رو توش اعمال کرد یا به عبارتی دیگر هزینه تغییرات را برای ما کمتر می‌کند و باعث میشود که نسبت به تغییرات منعطف تر باشیم.
