# Clean Architecture Sample

## Description
Clean Architecture 스터디를 위하여 작성한 Sample Code.
Clean Architecture 개념을 이해하 위하여 기본적인 구조, API 통신, DI 등의 기본적인 사용 방법을 가이드 하기 위하여 만들었습니다.

## Architecture 
Clean Architecture의 기본적인 구조.
Data, Domain, Presentation 구조이며, Lint 사용을 위하여 Lint 모듈도 추가해 두었으나, Clean Architecture 구조에서는 제외하고 보아도 무관합니다.

기본적인 WebView에 대한 구조도 붙여두었으며, assets에 html파일을 선언하여 테스트했습니다.

## Gradle
Gradle에서의 공통된 코드르 최소화하고, 관리의 용의성을 높이기 위하여 Gradle을 공통화 하였습니다.

Modular Architecture에 작업한 Gradle의 형태의 이전 버전으로, dependencies에 대한 설정을 따로 관리하지 않는 형태입니다.
좀 더 확장된 Gradle 공통화 코드를 확인하고 싶으 경우, [Modular Architecture](https://github.com/HeeGyeong/ModuleArchitecture)에서 확인하면 됩니다.

## Lint
여러가지 Custom Lint에 대한 조건을 작성하여 Module로 붙여두었습니다.

각 Detector Class에 어느 부분을 감지하는지에 대한 주석을 추가해두었습니다.

@SuppressLint("Lint-ID")를 통해 Lint를 무시할 수 있습니다.

## DI
Koin에서 Hilt로 마이그레이션 작업을 진행하였으며,

두 가지 DI의 사용 방법을 모두 확인할 수 있도록 Koin을 완전히 제거하지 않고 Application단에서 주석처리만 해두었습니다.

Koin은 Module, Hilt는 Hilt Package를 확인하면 됩니다.

## Test Code
### Instrumented Test
Presentation Layer에서 Espresso를 사용하 기본적은 Test Code를 작성해두었습니다.

### Lint Unit Test
Lint Unit Test도 간단하게 작성을 해두었으며, 추후에 확인하여 작업하기 위한 기본 베이스 입니다.


**위의 두 가지 Test 모두, Detail한 Test Code가 아닌 이러한 형태로 사용할 수 있다 정도의 가이드입니다.**

## Android 12
Splash Screen 관련하여 확인할 수 있는 코드 추가.

## Blog
Clean Architecture에 대한 설명은 다음 블로그에 작성해 두었습니다.

[Tistory Blog](https://heegs.tistory.com/61?category=915533 "Clean Architecture Example")
