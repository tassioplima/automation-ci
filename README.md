# Cocus

Automation project with Java + Gradle on Browser Stack and Github Action as a CI doing remote mobile test using GithubPages to deploy Allure Serve and PageObject and PageFactory. 

![Appium Execution](https://github.com/tassioplima/cocus/workflows/CI/badge.svg)
![Allure Report](https://img.shields.io/badge/Allure%20Report-deployed-yellowgreen)


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
