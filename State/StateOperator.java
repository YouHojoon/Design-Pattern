public class StateOperator implements  State{
    private CalcV1 calc;

    StateOperator(CalcV1 calc){
        this.calc = calc;
    }

    @Override
    public void processNumber(char ch) {
        calc.setOperand2(Integer.parseInt("" + ch));
        calc.setState(calc.getSTATE_SECOND_OPERAND());
    }

    @Override
    public void processOperator(char ch) {
        if(ch == '='){
            System.out.println("+, -, *, / 기호 중 하나를 입력해주세요");
        }
        calc.setOperator(ch);
    }
}
