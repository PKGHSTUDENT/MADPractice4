# Практическая работа №4
## Запуск приложения
Для запуска приложения достаточно его экспортировать проект в Intellij IDEA.
Запуск происходит из файла `MADPractice4/src/main/kotlin/Main.kt`. Нажимаем на кнопку старта или горячей клавишей `Shift+F10` (Windows) и через консоль работаем с приложением.

## Unit тесты.
Unit тесты хранятся по адресу `MADPractice4/src/test/kotlin/*`.
В unit тесты входят два класса, `MainKtTest` и `CipherTest`, которые предназначены для функций `countDifferentDigits` и `isSymmetrical` из главного файла Main.kt и функций шифрования `ecrypt` и `decrypt` класса `Cipher` соответственно.