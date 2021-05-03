# Cocus

Automation project with Java (Language) + Gradle (Dependency) on Browser Stack (Device Farm) and Github Action (CI) doing remote mobile test, GithubPages to deploy Allure Serve to see test result, PageObject/Screen and PageFactory as a structure. 

[![Appium Execution](https://github.com/tassioplima/cocus/workflows/CI/badge.svg)](https://github.com/tassioplima/cocus/actions)
[![Allure Report](https://img.shields.io/badge/Allure%20Report-deployed-yellowgreen)](https://tassioplima.github.io/cocus/)


Configuration: 

- Java JDK 8 or 11
- Android SDK updated
- Android Emulator
- Appium Server
- Browser Stack Account and Keys

Running:

```
./gradlew test --tests "Tests"
```

You can run with different devices like iOS and Android using properties when running this command line:

Android: 

```
./gradlew test --tests "Tests" -DMOBILE=ANDROID
```

iOS: 

```
./gradlew test --tests "Tests" -DMOBILE=iOS
```
For use local user name by json or remote you can use Exec true or false:

true = execution using environment variable from secret key

```
./gradlew test --tests "Tests" -DMOBILE=ANDROID -DEXEC=true
```

false = execution using json name and key from browser stack

```
./gradlew test --tests "Tests" -DMOBILE=ANDROID -DEXEC=false
```

Github Pages with Allure report results: [ALLURE](https://tassioplima.github.io/cocus/)
