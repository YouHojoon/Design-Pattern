public class StateFirstOperand implements State {
    private CalcV1 calc;

    StateFirstOperand(CalcV1 calc) {
        this.calc = calc;
    }

    @Override
    public void processNumber(char ch) {
        calc.setOperand1(Integer.parseInt("" + ch));
    }

    @Override
    public void processOperator(char ch) {
        if (ch == '=') {
            System.out.println("+, -, *, / 기호 중 한 개를 입력해주세요");
            return;
        }

        calc.setOperator(ch);
        calc.setState(calc.getSTATE_OPERATOR());
    }
}
