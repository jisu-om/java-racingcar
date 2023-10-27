# [ 구현 기능 목록 ]
- [X] 시작 문구를 출력한다. 
  - GameController#printStart()
  - OutputView#printStartMessage()


- [X] 자동차 이름을 입력받는다. 
  - InputView가 아니라 GameController#getCarNames()


- [ ] 입력 받은 이름의 예외 처리 진행한다. Validator#validateCarNames()
  - 이름 파싱 
    - , 로 나눈 후 각각 5자 이하인지 검증 후, Car에게 배분 
      - , 로 나눠지지 않는 경우 예외 발생 
      - ,로 나눠져도 각 원소의 길이가 6자 이상인 경우 예외 발생 
  - (참고) , 로 구분된 값들이 각각 5자 이하인지 Car#validateName()
    - 어떤 방식이 더 좋을지 모르겠다. 한번에 validateCarNames()에서 validation 진행하는게 좋을지
  - 이름이 하나만 입력된 경우는 어떻게 처리할까? (-> 진행 가능하도록 하자)


- [ ] 몇 회 시도할지 입력 받기 (n회) InputView#getNumberOfRoundsFromUser()
  - [ ] 예외 처리 Validator#validateNumberOfRounds()
    - 0
    - 숫자가 아닌 값 


- [ ] 각 자동차는 랜덤 값을 뽑는다.
  - NumberGenerator#generateRandomNumber()
  - Car#getRandomNumber()


- [ ] 뽑은 값이 4 이상이면 전진한다.
  - Car#move()


- [ ] 라운드 결과를 저장한다. 
  - Car 객체의 인스턴스 필드(List<Integer> roundResultList)에 각자 저장  


- [ ] 라운드를 n회 반복한다. GameController#play()


- [ ] 실행 결과를 출력한다. 
  - GameController#printResult()
  - OutputView#printRoundResult() 를 라운드 총 횟수 만큼 반복 출력


- [ ] 최종 우승자를 뽑고 출력한다. 
  - GameController#determineWinner()
  - OutputView#printWinnerMessage()



---
## [ 플로우 ] 
1. 시작 문구 출력 
    - "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"


2. 이름 입력 받기 
    - 예외 처리
      - , 로 구분된 값들이 각각 5자 이하인지 체크 
      - 이름이 하나만 입력된 경우?


3. 해당 이름을 가진 자동차 객체 생성 


4. 몇 회 시도할지 입력 받기 (n회)
    - "시도할 회수는 몇회인가요?"
    - 예외 처리 
      - 0인 경우
      - 숫자가 아닌 값


5. 각 자동차 랜덤 값(0~9) 뽑기 


6. 4 이상이면 전진 ("-" 추가)


7. 라운드 결과 저장 

* (5,6,7번을 n회 반복)

8. 실행 결과 출력


9. 최종 우승자 출력 