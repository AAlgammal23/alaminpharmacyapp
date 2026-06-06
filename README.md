# صيدلية الأمين الحديثة — Al-Amin Modern Pharmacy

تطبيق أندرويد احترافي لصيدلية الأمين الحديثة، مبني بـ **Kotlin + Jetpack Compose** ومُحسَّن للأجهزة الحديثة (Android 7.0+).

## المميزات

- 🎨 هوية بصرية كاملة بألوان فيروزي فاتح + أبيض
- 🏠 شاشة رئيسية: بانر + خدمات + أقسام + منتجات مميزة + جديدة
- 💊 شاشة الأقسام: تصفّح حسب الفئة
- 📤 رفع الوصفة الطبية: اختيار صورة + ملاحظات + إرسال عبر واتساب
- ⏰ منبه الدواء: إضافة / تعديل / حذف المنبهات
- 👤 شاشة الحساب: كل بيانات التواصل + ساعات العمل
- 🟢 تكامل مباشر مع واتساب والاتصال والبريد والموقع وفيسبوك

## بيانات التواصل (مدمجة في التطبيق)

| البند | القيمة |
|------|------|
| واتساب (عام) | +967774973636 |
| واتساب (الوصفات) | +967784332800 |
| هاتف | +967774973636 |
| البريد | alaminmodern.ph@gmail.com |
| العنوان | اليمن - إب - مدينة القاعدة |
| فيسبوك | https://www.facebook.com/share/18BNE6VzVK/ |
| ساعات العمل | 8 ص — 11 م يومياً |

## المتطلبات

1. **Android Studio Hedgehog (2023.1.1)** أو أحدث
2. **JDK 17** (مدمج مع Android Studio)
3. **Android SDK 34** (يتم تحميله من خلال SDK Manager)

## خطوات بناء ملف APK

### الطريقة 1: عبر Android Studio (الأسهل)

1. افتح Android Studio → **File → Open** → اختر مجلد `alamin-pharma/`
2. انتظر حتى ينتهي مزامنة Gradle (Sync) — أول مرة قد تأخذ بضع دقائق
3. من شريط القائمة: **Build → Build Bundle(s) / APK(s) → Build APK(s)**
4. بعد الانتهاء اضغط **locate** في الرسالة التي ستظهر
5. ستجد الملف في: `app/build/outputs/apk/debug/app-debug.apk`

> لتوليد APK للنشر (Release) موقّع: **Build → Generate Signed Bundle / APK** واتبع الخطوات لإنشاء keystore.

### الطريقة 2: عبر سطر الأوامر

```bash
cd alamin-pharma
./gradlew assembleDebug
```

الملف الناتج: `app/build/outputs/apk/debug/app-debug.apk`

> على Windows استبدل `./gradlew` بـ `gradlew.bat`

## تثبيت APK على الجهاز

### مباشرة على الجهاز
1. انسخ ملف `app-debug.apk` إلى هاتفك (USB / بريد / Drive / Telegram…)
2. افتح الملف من مدير الملفات
3. وافق على "السماح بالتثبيت من مصادر غير معروفة" إن طُلب
4. اضغط **تثبيت**

### عبر ADB (للمطورين)
```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

## بنية المشروع

```
alamin-pharma/
├── app/
│   ├── build.gradle.kts
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/alamin/pharma/
│       │   ├── AlAminApp.kt
│       │   ├── MainActivity.kt
│       │   ├── data/Models.kt
│       │   ├── utils/ContactUtils.kt
│       │   └── ui/
│       │       ├── AlAminAppRoot.kt
│       │       ├── theme/{Color,Theme}.kt
│       │       ├── components/{Common,TopBar}.kt
│       │       └── screens/{Home,Categories,Prescription,Reminder,Account}Screen.kt
│       └── res/
│           ├── values/{colors,strings,themes}.xml
│           ├── values-night/themes.xml
│           ├── drawable/ic_launcher_foreground.xml
│           ├── mipmap*/ic_launcher{,_round}.xml
│           └── xml/{backup_rules,data_extraction_rules,file_paths}.xml
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── gradle/wrapper/gradle-wrapper.properties
```

## تخصيص لاحق

- تغيير الألوان: عدّل `res/values/colors.xml`
- تغيير النصوص: عدّل `res/values/strings.xml`
- تغيير بيانات التواصل: عدّل `data/Models.kt → ContactInfo`
- إضافة منتجات حقيقية: استبدل `SampleProducts` بقاعدة بيانات أو API

---

صُنع بعناية لصيدلية الأمين الحديثة 💚
