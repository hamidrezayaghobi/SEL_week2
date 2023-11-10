
# آزمایشگاه مهندسی نرم‌افزار: آزمایش دوم
اعضای گروه: علیرضا حیدری - حمیدرضا یعقوبی عراقی

## گام 1


| ردیف | مکان تغییر | عنوان تغییر | شرح مختصر تغییر |
| --- | ------------------- | ------------ | --------------------------- |
| 1   | Order Service       | افزودن تابع پرداخت تلفنی | یک تابع جدید با نام `phoneOrderPayment` اضافه شد |
| 2   | Order Service       | افزودن تابع ثبت سفارش تلفتی | یک تابع جدید با نام `phoneOrderRegister` اضافه شد |
| 3   | OnSiteOrderService | Override کردن تابع ثبت سفارش تلفنی | پیاده‌سازی تابع `phoneOrderRegister` از واسط `OrderService` |
| 4   | OnSiteOrderService | Override کردن تابع پرداخت تلفنی  | پیاده‌سازی تابع `phoneOrderPayment` از واسط `OrderService` |
| 5   | OnlineOrderService  | Override کردن تابع ثبت سفارش تلفنی | پیاده‌سازی تابع `phoneOrderRegister` از واسط `OrderService` |
| 6   | OnlineOrderService  | Override کردن تابع پرداخت تلفنی  | پیاده‌سازی تابع `phoneOrderPayment` از واسط `OrderService` |
| 7   | PhoneOrderService   | افزودن کلاس جدید              | ایجاد کلاس `PhoneOrderService` که واسط `OrderService` را پیاده‌سازی می‌کند |
| 8   | PhoneOrderService   | Override کردن تابع ثبت سفارش تلفنی | پیاده‌سازی تابع `onSiteOrderRegister` از واسط `OrderService` |
| 9   | PhoneOrderService   | Override کردن تابع پرداخت تلفنی  | پیاده‌سازی تابع `onSiteOrderPayment` از واسط `OrderService` |
| 10  | PhoneOrderService   | Override کردن تابع ثبت سفارش آنلاین | پیاده‌سازی تابع `onlineOrderRegister` از واسط `OrderService` |
| 11  | PhoneOrderService   | Override کردن تابع پرداخت آنلاین  | پیاده‌سازی تابع `onlineOrderPayment` از واسط `OrderService` |
| 12  | PhoneOrderService   | Override کردن تابع ثبت سفارش تلفنی  | پیاده‌سازی تابع `phoneOrderRegister` از واسط `OrderService` |
| 13  | PhoneOrderService   | Override کردن تابع پرداخت تلفنی  | پیاده‌سازی تابع `phoneOrderPayment` از واسط `OrderService` |
| 14  | Main                | تغییر در پیام راهنمای بخش پرداخت | امکان پرداخت تلفنی با وارد کردن شماره 3 اضافه شد |
| 15  | Main                | امکان ثبت سفارش تلفنی | اضافه کردن شرط برای اجازه ثبت سفارش تلفنی هنگام ورود شماره 3 |
| 16  | Main                | امکان پرداخت تلفنی | اضافه کردن شرط برای اجازه پرداخت تلفنی برای سفارش‌های تلفنی |
