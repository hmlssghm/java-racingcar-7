# java-racingcar-precourse

> 1. 입출력   
1.1. 입력   
1.2. 출력
> 2. 파싱
> 3. 검증(예외 처리)   
3.1. 자동차 이름 관련   
3.2. 시도 횟수 관련   
> 4. 비즈니스 로직   
4.1. Car (Model)   
4.2. 🤔🤔🤔 AllCars (Model)   
4.3. 전진orNot   
4.4. 우승자 판별   


### 1. 입출력
#### 1.1. 입력
- 경주할 자동차 이름 입력 받기
- 시도 횟수 입력 받기
#### 1.2. 출력
>출력 문구는 enum으로 관리
- `경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)`
- `시도할 횟수는 몇 회인가요?`
- `실행 결과`
- 실행 횟수 만큼, 각 유저의 실행 결과 출력 반복 (`{이름} : {전진 칸 -}`)
- `최종 우승자 : {이름}, {이름}`

### 2. 파싱
- 입력을 `,`를 기준으로 split

### 3. 검증(예외 처리)
**🤔🤔🤔 공백은 어떻게 처리할지?**
>예외 문구는 enum으로 관리
#### 3.1. 자동차 이름 관련
- 경주할 자동차 이름 입력이 없을 경우
- 중복된 자동차 이름이 있을 경우
#### 3.2. 시도 횟수 관련
- 시도할 횟수가 입력이 없을 경우
- 자연수가 입력되지 않을 경우 (0일 경우도 예외 처리)


### 4. 비즈니스 로직
#### 4.1. Car (Model)
- 이름(String) , 전진 칸 수(int)
- 이름 getter, setter
- 전진 칸수 getter, setter
#### 4.2. 🤔🤔🤔 AllCars (Model)
- 🤔🤔🤔 List<Car> allCars
#### 4.2. 전진orNot
- `시도 횟수 * 자동차 수` 만큼 랜덤 정수 뽑기 (List<Integer>)
- 4이상이냐 아니냐에 따라, boolean 타입으로 변환 (List<Boolean>)
- 시도 횟수 만큼 아래 로직 반복
  - 자동차 수 만큼(ex: 3대의 자동차 -> 0,1,2) List<Boolean> 결과에 따라 Car 전진 칸 수 add
  - add 이후 실행 결과 출력   
🤔🤔🤔 클래스 분리 필요, 로직 재검토
#### 4.3. 우승자 판별
- 제일 전진 칸 수가 큰 자동차들 반환