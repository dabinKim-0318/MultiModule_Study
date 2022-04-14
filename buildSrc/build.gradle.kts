/*
1.빌드도구: ‘빌드도구’는 소스코드를 실행가능한 애플리케이션 생성물을 자동으로 만드는 프로그램이다.
2.빌드 자동화:의존성 라이브러리 다운로드/컴파일: 소스코드 → 바이너리코드/테스트 실행
/바이너리코드 패키징/운영시스템 배포
3.빌드도구
- Gradle(오픈소스), Maven,,
4.우리는 지금까지 Groovy언어로 Gradle에서 build를 위한 buildScript를 작성함
개불편해서 Kotlin으로 buildScript좀 써보자 해서
Kotlin DSL은 코틀린의 언어적인 특징으로 가독성이 좋고 간략한 코드를 사용하여 Gradle 스크립팅을 하는 것을 목적으로 하는 DSL이다
5.Groovy DSL 과 Kotlin DSL 스크립트 파일은 빌드스크립트 확장자명으로 구분된다. 멀티 프로젝트를 빌드할 때는
각 모듈별로 각각 Groovy DSL 과 Kotlin DSL 을 작성하여 사용가능하다.

+  DSL : Domain Specific Language의 약어로 특정 분야에 최적화된 프로그래밍 언어를 뜻한다.
    상용구 코드를 최소화 하기 위해 명령형 코드 대신 선언적 코드 형식을 따른다.
    Kotlin DSL은 코틀린의 언어적인 특징으로 가독성이 좋고 간략한 코드를 사용하여 Gradle 스크립팅을 하는 것을 목적으로 하는 DSL이다.
*/




plugins {
    `kotlin-dsl`  //kotlin dsl 이용해서 스크립트 짜볼게
}
repositories {
    gradlePluginPortal()
}

kotlin {

/*    gradle을 활용하여 다양한 방법으로 build를 할 수 있다.
    우선, gradle build를 통해 자바 파일을 빌드하게 되면 default로 프로젝트 하위의 src/main/java 디렉토리의 파일이 target이 되어 빌드된다.
    하지만, 내가 원하는 것은 그 폴더 이외의 java파일을 build하는것이다.
    이 목적을 달성하기 위해서 sourceSet이라는 gradle에 기능을 찾아보고 발견한 사실을 정리해 보도록 하겠다.
    기본으로 제공되는 sourceSet
    sourceSet 추가
    gradle build시 default로 target으로 잡히도록 srcDir 추가
    sourceSet 동적으로 추가
    gradle build시 default로 target으로 잡히는 srcDir 동적으로 추가
    sourceSet의 output파일을 어디에 생성할지 설정 추가
    sourceSet의 특정 파일 또는 디렉토리를 target에서 제거 (exclude)*/
    sourceSets.getByName("main").kotlin.srcDir("src/main/kotlin")
}
