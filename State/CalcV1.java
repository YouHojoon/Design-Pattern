import java.util.Scanner;

public class CalcV1 {
    private final State STATE_START;
    private final State STATE_FIRST_OPERAND;
    private final State STATE_OPERATOR;
    private final State STATE_SECOND_OPERAND;

    private Scanner scanner;
    private String inputStr;
    private int operand1; // 첫 번째 피 연산자값 저장
    private int operand2; // 두 번째 피 연산자값 저장
    private State state;
    private char operator; // 사칙 연산자 저장

    CalcV1() {
        scanner = new Scanner(System.in);  // Create a Scanner object
        STATE_START = new StateStart(this);
        STATE_FIRST_OPERAND = new StateFirstOperand(this);
        STATE_OPERATOR = new StateOperator(this);
        STATE_SECOND_OPERAND = new StateSecondOperand(this);
        state = STATE_START;
    }

    String getInput(String s) {
        System.out.println(s);
        return scanner.next();
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSTATE_START() {
        return STATE_START;
    }

    public State getSTATE_FIRST_OPERAND() {
        return STATE_FIRST_OPERAND;
    }

    public State getSTATE_OPERATOR() {
        return STATE_OPERATOR;
    }

    public State getSTATE_SECOND_OPERAND() {
        return STATE_SECOND_OPERAND;
    }

    void printOutResult() {
        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d\n", operand1, operand2, operand1 + operand2);
                break;

            case '-':
                System.out.printf("%d - %d = %d\n", operand1, operand2, operand1 - operand2);
                break;

            case '*':
                System.out.printf("%d * %d = %d\n", operand1, operand2, operand1 * operand2);
                break;

            case '/':
                System.out.printf("%d / %d = %d\n", operand1, operand2, operand1 / operand2);
                break;
        }
    }

    /* 프로그램의 주 로직을 담당하는 함수
       사용자 입력을 기다렸다가 q 또는 Q가 입력되면 종료
       그렇지 않으면 정수가 입력되었는지 혹은 연산자가 입력되었는지에 따라 processNumber 또는 processOperator 함수를 호출
     */
    boolean run() {
        inputStr = getInput("정수 또는 +,-,*,/,= 기호 중 한 개를 입력하세요");
        char ch = inputStr.charAt(0);

        if (ch == 'q' || ch == 'Q')// q를 입력하면 프로그램 종료
            return false;

        else if (ch >= '0' && ch <= '9') // 정수가 입력되면
            state.processNumber(ch);

        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=')// 연산자 처리
            state.processOperator(ch);

        return true;
    }
}
