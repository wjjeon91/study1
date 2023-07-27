# springBootStudy1 실습

## 1.Project 환경 설정 및 동작 이해
### 프로젝트 생성
- Spring Boot Starter
- Spring Boot Starter 설정
- 프로젝트 설명
### Library 살펴보기
- Library
### View 환경설정
- 정적 page 만들기
- 동적 page 만들기 - thymeleaf 템플릿 엔진
- 동작 원리

## 2.Spring Web 개발 기초
### 정적 컨텐츠
- 스프링 부트 정적 컨텐츠 기능
- 스프링 부트 정적 컨텐츠 원리
### MVC와 템플릿 엔진
- MVC (Model, View, Controller)
- MVC (Model, View, Controller) 원리 설명
- MVC (Model, View, Controller) 그림 설명
### API
- API 기초
- API 활용
- API 원리

## 3.Back-End 개발
### 비즈니스 요구사항 정리
- 웹 어플리케이션 계층 구조
- 클래스 의존관계
### 회원 도메인과 리포지토리 만들기
- 회원 도메인
- 회원 리포지토리 interface
- 회원 리포지토리 메서드
### 회원 리포지토리 테스트 케이스 작성
- 테스트 케이스 작성 준비
- 테스트 케이스 작성 1
- 테스트 케이스 작성 2
- 테스트 케이스 전체 코드
### 회원 서비스 개발
- 회원 서비스 개발
- 회원 서비스 테스트
- 회원 서비스 테스트 환경
- 회원 서비스 테스트 코드 1
- 회원 서비스 테스트 코드 2
- 회원 서비스 테스트 코드 3

## 4.Spring Bean과 의존관계
### 컴포넌트 스캔과 자동 의존관계 설정
- 멤버 컨트롤러 생성
- 스프링 컨테이너에 스프링 빈 연결
- 스프링 빈 정리
### 자바 코드로 직접 스프링 빈 등록하기
- 스프링 빈 등록 전 사전 설정
- JAVA 코드로 스프링 빈 연결
### DI (Dependency Injection) 추가자료
- 의존관계(Dependency)란?
- DI 방법 1 (필드 주입)
- DI 방법 2 (수정자 주입)
- DI 방법 3 (생성자 주입)

## 5.Web MVC 개발
### 회원 웹 기능 - 홈 화면 추가
- 컨트롤러 설명
### 회원 웹 기능 - 등록
- 회원 등록 폼 컨트롤러, HTML
- 회원 등록 컨트롤러
- 회원 등록 컨트롤러 설명
### 회원 웹 기능 - 조회
- 회원 조회 화면 추가
- 회원 조회 설명

## 6.Spring DB 접근 기술1
### H2 데이터베이스 설치
- H2 데이터베이스 설치 및 접속
- H2 데이터베이스 테이블 생성 및 실행
### 순수 JDBC
- 순수 Jdbc 환경설정
- Jdbc 리포지토리 생성
- 스프링 설정 변경
- 설정 변경 설명
### 스프링 통합 테스트
- 회원 서비스 스프링 통합 테스트
- 스프링 통합 테스트 설명
### 스프링 JdbcTemplate
- 스프링 JdbcTemplate 회원 리포지토리

## 7.Spring DB 접근 기술2
### JPA
- Spring Boot에 JPA 설정 추가
- JPA 추가
- JPA 실행
### Spring Data JPA
- Spring Data JPA 회원 리포지토리
###Spring Data JPA 설명
- 스프링 데이터 JPA 제공 기능

## 8.AOP 적용
### AOP가 필요한 상황
- MemberService 회원 조회 시간 측정
- 시간 측정 문제점
### AOP 적용
- AOP 설명
- 시간 측정 AOP 등록
- 시간 측정 AOP 실행
- 스프링의 AOP 동작 방식

