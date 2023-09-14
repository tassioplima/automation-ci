# Automation Project

Automation project with Java + Gradle on Browser Stack (Device Farm) and GitHub Action (CI) doing the remote mobile test, GithubPages to deploy Allure Serve to see test results, PageObject/Screen and PageFactory as a structure. 

[![Appium Execution](https://github.com/tassioplima/cocus/workflows/CI/badge.svg)](https://github.com/tassioplima/cocus/actions)
[![Allure Report](https://img.shields.io/badge/Allure%20Report-deployed-yellowgreen)](https://tassioplima.github.io/automation-ci/)

Configuration: 

- Java JDK 8 or 11
- Android SDK updated
- Android Emulator
- Appium Server
- Browser Stack Account and Keys

Running:

```
./gradlew test --tests "AppTest"
```

You can run with different devices like iOS and Android using properties when running this command line:

Android: 

```
./gradlew test --tests "AppTest" -DMOBILE=ANDROID
```

iOS: 

```
./gradlew test --tests "AppTest" -DMOBILE=iOS
```
To use local user name by JSON or remote you can use Exec true or false:

true = execution using environment variable from the secret key

```
./gradlew test --tests "AppTest" -DMOBILE=ANDROID -DEXEC=true
```

false = execution using JSON name and key from browser stack

```
./gradlew test --tests "AppTest" -DMOBILE=ANDROID -DEXEC=false
```

GitHub Pages with Allure report results: [ALLURE](https://tassioplima.github.io/automation-ci/)
