# Spring_Study

Framework
	뼈대나 근간을 이루는 코드들의 묶음.	
	라이브러리나, 개발자가 작성해놓은 코드파일을 의미하며
	API란, 여러 라이브러리가 모여있는 패키지(JAR)를 의미한다.	
	프레임워크란, API가 굉장히 많이 모여져서 덩치가 커져있는 것을 의미한다.
	개발자는 각 개개인의 능력차이가 큰 직종이고, 개발자 구성에 따라 프로젝트 결과 역시
	큰 차이를 낳는다. 이런 상황을 극복하기 위한 코드의 결과물이 바로 프레임워크이다.	
	프로그램의 기본 흐름이나 구조를 정하고 모든 팀원이 이 구조에 자신의 코드를 추가하는 방식으로 개발하게 된다.

Framework의 장점
	개발에 필요한 구조를 이미 코드로 만들어 놓았기 때문에, 실력이 부족한 개발자라 하더라도
	반쯤 완성된 상태에서 필요한 부분을 조립하는 형태의 개발이 가능하다.
	회사 입장에서는 프레임워크를 사용하면 일정한 품질이 보장되는 결과물을 얻을 수 있고,
   	개발자 입장에서는 완성된 구조에 자신이 맡은 서비스에 대한 코드를 개발해서 넣기 때문에
   	개발 시간을 단축할 수 있다.

Spring Framework
	경량 프레임워크.
	예전 프레임워크는 다양한 경우를 처리하기 위해 여러 기능들을 넣다 보니
	하나의 기능을 위해서 아주 많은 구조가 필요했다. 기술이 너무나 복잡하고 방대했기 때문에,
	전체를 이해하고 개발하기에는 어려움이 많았다. 그래서 Spring Framework가 등장했고,
	특정 기능을 위주로 간단한 JAR파일 등을 선택하여 모든 개발이 가능하도록 구성되어 있다.

Spring Framework의 장점	
	- 프로젝트 전체 구조를 설계할 때 유용하다(빠른 속도로 서버 제작 가능).
	- 다른 프레임워크들의 포용, 여러 프레임워크를 혼용해서 사용 가능하며 이를 접착성이 좋다고 한다.
	- 개발 생산성과 개발도구의 지원

Spring Boot	
	Spring Framework를 사용함에 있어서 초기 설정 및 필요한 라이브러리에 대한 설정의 어려움이 많으며,
	시간이 너무 오래 걸리기 때문에 자동 설정(AutoConfiguration)과 개발에 필요한 모든 것을 관리해주는
	스프링 부트를 선호한다. 각 코어 및 라이브러리의 버전들도 맞추어야 하지만 스프링 부트를 사용하면
	이러한 복잡성을 해결하기에도 좋다.

Spring Framework의 특징	
	- POJO 기반의 구성
	- DI를 통한 객체간의 관계 구성
	- AOP 지원	
	- Transaction 관리
	- 편리한 MVC 구조
	- WAS에 종속적이지 않은 개발 환경

▶ POJO 기반의 구성
	오래된 방식의 간단한 자바 객체라는 의미이며, JAVA코드에서 일반적으로 객체를 구성하는 방식을 
	Spring Framework에서 그대로 사용할 수 있다는 의미이다.


▶ 의존성 주입(DI)을 통한 객체간의 관계 구성
	의존성(Dependency)이란 하나의 객체가 다른 객체 없이 제대로 된 역할을 할 수 없다는 것을 의미한다.
	예를 들어 A객체가 B객체 없이 동작이 불가능한 상황을 "A가 B에 의존적이다"라고 표현한다.
	하지만 직접 A필드에 B객체를 선언하면 결합도가 단단해지기 때문에 유연성이 떨어진다.

	주입(Injection)은 외부에서 내부로 밀어 넣는 것을 의미한다.
	필요한 객체를 외부에서 밀어 넣어 유연성을 높이고 결합도를 느슨하게 해준다.
	주입을 받는 입장에서는 어떤 객체인지 신경 쓸 필요가 없고 어떤 객체에 의존하든 자신의 역할은 변하지 않는다.
	
	***의존성
	A →→→→→→→→→→→→→ B
	A객체에서 B객체를 필드로 직접 생성

  	***의존성 주입
  	A ↔↔↔↔↔ ? ↔↔↔↔↔ B	
	A는 B가 필요하다고 신호를 보내고, ?가 B객체를 외부에서 생성하여 주입하게 된다.	
	Spring Framework에서는 ApplicationContext가 ?이며,
	필요한 객체들을 생성 및 주입해주는 역할을 한다. 따라서 개발자들은 기존의 프로그래밍과는 달리
	객체와 객체를 분리해서 생성하고, 이러한 객체를 엮는 wiring 작업의 형태로 개발하게 된다.
	
	AplicationContext가 관리하는 객체들을 빈(Bean)이라 부르고, 
	빈과 빈 사이의  의존 관계를 처리하는 방식으로는 XML,  어노테이션, JAVA 방식이 있다.


▶ AOP의 지원 
	관점 지향 프로그래밍.   
	좋은 개발 환경에서는 개발자가 비지니스 로직에만 집중할 수 있게 한다.
	Spring Framework는 반복적인 코드를 제거해줌으로써 핵심 비지니스 로직에만 집중할 수 있는 방법을 제공한다.
	보안이나 로그, 트랜잭션, 예외처리와 같이 비지니스 로직은 아니지만,
	반드시 처리가 필요한 부분을 주변 로직 (횡단 관심사)라고 하고, 개발해야할 서비스는 메인 로직(종단 관심사)라고 한다.
	Spring Framework는 이러한 횡단 관심사를 분리해서 설계하는 것이 가능하고, 
	횡단 관심사를 모듈로 분리하는 프로그래밍을 AOP라고 한다. 	=>횡단 관심사를 모듈로 분리 (메소드 생성)
	핵심 비지니스 로직에만 집중하여 코드 개발이 가능해지고, 각 프로젝트마다 다른 관심사 적용 시 코드 수정을 최소화
	할 수 있으며, 원하는 관심사의 유지보수가 수월한 코드로 구성이 가능해진다.
	※ 비지니스 로직 : 서비스를 개발하기 위한 소스 코드 및 알고리즘 
	

▶ 트랙잭션의 지원 			트랜잭션 => 서비스를 기준으로 작업의 최소단위
	DB 작업 시 트랜잭션을 매번 상황에 맞게 코드로 작성하지 않고, 어노테이션이나
	MXL로 트랜잭션을 쉽게 관리할 수 있다. 


▶ 단위 테스트 
	전체 Apllication을 실행하지 않아도 기능별 단위 테스트가 용이하기 때문에
	버그를 줄이고 개발 시간을 단축할 수 있다.

프로젝트 기본 경로 
	1) src/main/java			: 서버단 JAVA 파일 
	2) src/test/java			: 단위 테스트 JAVA 파일
	3) src/main/resources		: 설정 파일 뷰단 
	4) src/main/resources/static		: css, js, image 등 정적 파일 경로 
	5) src/main/resources/templates	: hrml 파일 경로
	6) build.gradle			: 라이브러리 관리
	7) application.yml			: Spring의 모든 설정


-------------------------------------------------------------------------------------------------


![AOP1](https://user-images.githubusercontent.com/122762442/231747985-ea7af821-0daf-4c8f-91a4-8a802a1e3072.png)

![AOP2](https://user-images.githubusercontent.com/122762442/231748035-090525c6-5c7e-4c7c-8fbb-0935383e2af6.png)

Spring MVC(Front-Controller Pattern)

			HandlerMaping
REQUEST		  ①	      ②↕	   ③		       ④
	]	  ↔	DispatcherServlet   ↔  HandlerAdapter   ↔  Controller
RESPONSE	  ⑦	⑥↕	     ⑤↕
			View	ViewResolver
			   ↕
			HTML 및 기타

Spring MVC 패턴의 특징
	- HttpServletRequest, HttpServletResponse를 거의 사용할 필요 없이 구현 가능
	- 다양한 타입의 파라미터 처리, 다양한 타입의 리턴 타입 사용 가능
	- GET방식, POST방식 등 전송 방식에 대한 처리를 어노테이션으로 처리 가능
	- 상속/인터페이스 방식 대신 어노테이션으로만 설정 가능

-------------------------------------------------------------------------------------------------

![Uploading front_controller.png…]()


3-tier
   스프링 프로젝트는 3-tier 방식으로 구성한다.

   ▶ Presentation Tier - 화면 계층
      화면에 보여주는 기술을 사용하는 영역

   ▶ Buisiness Tier - 비지니스 계층, 로직 계층
      순수한 비지니스 로직을 담고 있는 영역

   ▶ Persistence Tier - 영속 계층, 데이터 계층
      데이터를 어떤 방식으로 보관하고, 사용하는 가에 대한 설계가 들어가는 영역

3-tier의 목적
   각 영역은 독립적으로 설계되어 
   나중에 특정 기술이 변하더라도 필요한 부분을 전자제품의 부품처럼 쉽게 교환할 수 있게 하자는 방식이다.

3-tier의 구조
   Presentation ↔ Business ↔ Persistence ↔ DBMS
           ↑      ↑         ↑
      Controller   Service       Mapper
-------------------------------------------------------------------------------------------------
REST
   Representational State Transfer.
   자원(데이터), 행위(get, post 등), 표현(CRUD)로 구성되어 있다.
   언제 어디서든 누구든 서버에 요청을 보낼 때 URI만으로도 데이터 및 CRUD의 상태를 이해할 수 있도록 설계하는 규칙.

REST URI 규칙
   1. 소문자로 작성한다.
      대문자로 작성시 문제가 발생할 수 있기 때문에 소문자로 작성한다.

   2. 언더바 대신 하이픈을 사용한다.
      가독성을 높이기 위해서 하이픈으로 구분하는 것이 좋다.

   3. URI 마지막에 슬래시를 작성하지 않는다.
      마지막에 작성하는 슬래시는 의미가 없다.

   4. 계층 관계 표현 시 슬래시 구분자로 사용한다.
      계층 관계(포함 관계)에서는 슬래시로 구분해준다.

   5. 동사는 작성하면 안된다.
      행위는 URI로 표현하지 않고 HTTP METHOD를 통해 전달한다.

   6. 파일 확장자는 포함시키지 않는다.
      파일 확장자는 URI로 표현하지 않고 Header의 Content-Type을 사용하여
      body의 내용을 처리하도록 설계한다.

   7. 데이터를 대표할 때에는 명사를 사용하지만, 상태를 대표할 때에는 동사를 허용한다.
      http://www.app.com/writing (X)
      http://www.app.com/write (O)

   8. URI에 사용되는 영어단어는 복수로 작성한다.

RESTful API
   설계 방식이 모두 REST 규칙에 의해 작성된 API.
   
-------------------------------------------------------------------------------------------------

AOP (Aspect Oriented Programming)

	기존 코드와 부가 기능 코드를 따로 정의한 뒤 다시 합쳐서 모듈로 만드는 것이다.
	코드의 중복을 줄일 수 있으며, 핵심 로직과 주변 로직을 분리하여 관리할 수 있다.
	핵심 로직은 아니지만 반복적으로 개발에 필요한 관심사들을 주변 로직이라고 한다.
	따라서 AOP는 이러한 주변 로직을 횡단 관심사로 분리하여 작성하고 종단 관심사인 
	핵심 비지니스 로직만을 해당 서버에서 작성하도록 한다.

	예) 나눗셈 프로그램 개발 시 두 개의 숫자를 나누는 것 (핵심, 종단)
	0으로 나누는 지 검사하는 것(주변, 횡단)

	즉, 반복적으로 나타나는 횡단 관심사를 모듈로 분리한 후 적절한 시점에 로직을 주입하는 것이 AOP이다.
	스프링에서는 별도의 복잡한 설정 없이 간편하게 AOP의 기능들을 구현할 수 있기 때문에 중요한 특징 중 하나이다.

AOP를 사용할 수 있는 시점 
	- Around (전 구역)  => 주변로직이 핵심로직이 됨. 
	- Before (메소드 시작 직후)
	- After (메소드 종료 직전)
	- AfterReturning (메소드 리턴 후)
	- AfterThrowing (메소드 예외 발생 후)


AOP 설계 순서
	1. 구현할 횡단 관심사를 의미할 수 있는 어노테이션 만들기
	2. 어노테이션을 Asepect로 등록하기
	3. 종단 관심사에 등록된 어노테이션 사용하기








-------------------------------------------------------------------------------------------------


*JPA


![Uploading PersistenceContext.png…]()



ORM(Object Relational Mapping)
	객체 진영과 RDB 진영을 자동으로 매핑하여 구조의 불일치를 개발자 대신 해결해주는 기술의 총칭이다.
 	객체 지향 구조에서 프로그래밍 언어를 사용하여 RDB의 데이터를 조작하는 방법이다.
 	ORM을 사용하면 개발자가 SQL문을 직접 작성하지 않아도 RDB와 상호 작용할 수 있다.

	JPA(Java Persistence API)
 	ORM을 사용하기 위한 설계도(틀)이다.
 	Java Application용 RDB 매핑 관리를 위한 인터페이스이며, DBMS 벤더사에 의존하지 않고 독립적으로
 	ORM을 사용할 수 있는 ORM 표준이다. 인터페이스이기 때문에 구현되어 있지 않은 틀만 제공하며,
 	자체적인 작업을 수행하지 않는다. JPA에 설계된 구조에 맞춰서 각 메소드를 재정의하여 
 	직접 ORM을 구현하여 사용한다. JPA는 ORM을 사용할 수 있는 ORM 접근 방식이며, 구현되지 않은
 	JPA를 ORM이라고 말하기는 어렵다.

Hibernate Framework
 	모든 Java Application에 대해 객체 관계를 그대로 유지한 채 쿼리 서비스를 제공하는 오픈 소스의 경량 ORM이다.
 	JPA를 구현한 구현체이며, 여러 구현체 중 가장 대표적인 구현체이다.
 	객체 간 관계 구성을 지원하며, 상속, 지연성, 페이징 처리, 예외 처리 불필요를 지원한다.

Spring Data JPA
 	JPA를 추상화한 Repository 인터페이스를 제공하여 JPA를 쓰기 편하게 다양한 기능을 지원한다.
 	내부적으로는 JPA를 사용하기 때문에 JPA를 모르면 내부 구조를 이해하기 힘들 수 있다.


객체와 관계형 데이터베이스의 차이

1. 상속

 ▶ RDB의 상속

	[개발자]		[기획자]

	번호		번호
	-----------	-----------
	이름		이름
	생년월일		생년월일
	경력		경력
	기술등급		OA등급
	프로젝트 수	클라이언트 수

 또는

	[사원]

	번호
	-----------
	이름
	생년월일
	경력
	기술등급
	OA등급
	프로젝트 수
	클라이언트 수

또는

	[사원] - 슈퍼

	번호(PK)
	-----------	
	이름
	생년월일
	경력

	[개발자] - 서브	[기획자] - 서브

	번호(PK, FK)	번호(PK, FK)
	-----------	-----------
	기술등급		OA등급
	프로젝트 수	클라이언트 수

	1:1 관계에서 INSERT를 하기 위해서는 쿼리를 2번 작성해야하는 불편함이 생긴다.
	게다가 SELECT를 하기 위해서는 JOIN을 사용해야 하는데 쿼리가 굉장히 복잡해진다.
	만약에 이런 RDB의 테이블 관계를 자바 컬렉션으로 바꿀 수 있다면,

 ▶ 컬렉션 사용

	Developer developer = list.get(developerId);
	위와 같이 간단하게 조회할 수 있다.

2. 연관관계
	
 ▶ 객체 연관 관계: 단방향으로 흘러간다(Flower에서 Pot접근은 가능, Pot에서 Flower접근 불가능)
	
	Flower	→	Pot
	
	id		id
	name		shape
	Pot pot		color


 ▶ RDB 연관 관계: 양방향으로 흘러간다(FLOWER에서 POT을, POT에서 FLOWER를 접근할 수 있다)

	FLOWER	↔	POT

	ID(PK)		ID(PK)
	--------	--------
	NAME		SHAPE
	POT_ID(FK)	COLOR


 ▶ RDB 중심 설계
	
	class Flower{
		Long id;
		String name;
		String potId; //FK는 RDB방식에서의 연관관계이기 때문에 객체방식으로 바꿔야 함.
	}

	RDB 방식으로 설계하면, 조회 시 JOIN을 하여 FLOWER테이블과 POT테이블에서 각각 필요한 정보를 가져와
	각 객체에 담아주거나 DTO에 담아주어야 한다.

 ▶ 객체 중심 설계

	class Flower{
		Long id;
		String name;
		Pot pot; // 참조로 연관관계를 맺도록 함.
	}

	flower.setPot(pot)형태와 같이 복잡하게 작업해야 한다.

 ▶ 컬렉션 사용

	하지만 만약 자바 컬렉션으로 관리가 가능하다면,

	list.add(flower);
	Flower flower = list.get(flowerId);
	Pot pot = flower.getPot();

	훨씬 편하게 작업이 가능하다.

3. 그래프 탐색

	┌─Market─┐
	│        │
Client──Order	Flower──Pot
	│
	Delivery  

	객체는 모든 객체 그래프를 탐색할 수 있어야 한다.

	하지만 SQL 작성 시 이미 탐색 범위가 결정된다.
	만약 Market과 Flower를 JOIN해서 조회를 한다면,
	market.getFlower()는 사용 가능하지만
	market.getPot()는 null일 수 밖에 없다.

	따라서 엔티티에 대한 신뢰가 무너질 수 밖에 없다.

	Market market = marketDAO.findById(marketId);
	market.getFlower(); // null이 아니라고 확신할 수 없다.
	market.getOrder().getClient(); // null이 아니라고 확신할 수 없다.

	marketDAO에 있는 findById()를 분석하지 않는 이상 각 엔티티에 대해 신뢰할 수 없다.
	따라서 상황에 따라 조회에 대한 메소드를 여러 개 선언해놓아야 한다.

	marketDAO.getFlower();
	marketDAO.getOrderWithClient();
	marketDAO.getOrderWithClientWithDelivery();
	...

	하지만 위와 같은 방법은 사실상 불가능에 가깝다.

4. 값 비교
	SQL 실행 결과를 담은 뒤 생성자를 호출하여 객체에 담으면 매번 new가 사용되기 때문에
	동일한 조회 결과의 객체일지라도 주소가 모두 다르다.

 ▶ 컬렉션 사용

	하지만 만약 자바 컬렉션에서 객체 조회가 가능하다면
	list.get(memberId) == list.get(memberId);

※ 1.2.3.4. 결론

	즉, 객체지향으로 설계할 수록 작업이 오히려 복잡해지고 늘어나기 때문에 RDB 중심으로 설계할 수밖에 없다.
	RDB를 자바 컬렉션에 저장하듯 사용하면 굉장히 편해지고 많은 문제가 해결되는데,
	바로 이 기술을 JPA라고 한다.
-----------------------------------------------------------------------------------------------

JPA를 사용해야 하는 이유
	1. SQL 중심 개발에서 객체 중심으로 개발

	2. 생산성
		저장: jpa.persist(market);
		조회: jpa.findById(marketId);
		수정: market.setMarketName("이마트");
		삭제: jpa.remove(market);

	3. 유지보수
		클라이언트가 새로운 필드를 요청하여 새로운 필드 추가 시
		클래스 안에 필드만 한 개 추가하면 끝. SQL문을 수정할 필요 없음.

	4. 패러다임의 불일치 해결

		▶ JPA와 상속
		 
		 Employee	Developer extends Employee

		 employeeId	developerId
		 employeeName	developerLevel
				developerProjectCount


		 - INSERT
		
			▷ 개발자
				jpa.persist(developer);

			▷ JPA
				INSERT 두 번 해줌.

			자식 필드에 부모 필드가 포함되어 있기 때문에 필요한 데이터를 자식 객체에 채우기만 하면 됨.

		 - SELECT
			
			▷ 개발자
				jpa.findById(Developer.class, developerId);

			▷ JPA
				부모 테이블과 JOIN해서 데이터를 가져옴

		▶ JPA와 연관관계
		
		 Flower	→	Pot
	
		 id		id
		 name		shape
		 Pot pot	color

		 flower.setPot(pot);
		 jpa.persist(flower);

		 jpa.findById(Flower.class, flowerId);

		▶ JPA와 객체 그래프 탐색

		 	 ┌─Market─┐
		 	 │        │
	 	 Client──Order	Flower──Pot
		 	 │
		 	 Delivery  

	
		 Flower flower = jpa.findById(Flower.class, flowerId);
		 Pot pot = flower.getPot();
		 market.getOrder().getClient();

		 ※ SELECT 결과가 없으면 문제가 생기기 때문에 NPE 체크는 반드시 해야한다.

		▶ JPA와 값 비교
			
			Market market1 = jpa.findById(Market.class, marketId);
			Market market2 = jpa.findById(Market.class, marketId);

			market1 == market2;

			동일한 트랜잭션에서 조회한 엔티티는 무조건 같다.



