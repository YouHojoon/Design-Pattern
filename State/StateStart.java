public class StateStart implements State{
    private CalcV1 calc;

    public StateStart(CalcV1 calc){
        this.calc = calc;
    }

    @Override
    public void processNumber(char ch) {
        calc.setOperand1(Integer.parseInt("" + ch));
        calc.setState(calc.getSTATE_FIRST_OPERAND());
    }

    @Override
    public void processOperator(char ch) {
        System.out.println("정수를 입력하세요");
    }
}
