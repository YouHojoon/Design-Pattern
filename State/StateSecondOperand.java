public class StateSecondOperand implements State{
    private CalcV1 calc;

    StateSecondOperand(CalcV1 calc){
        this.calc = calc;
    }

    @Override
    public void processNumber(char ch) {
        calc.setOperand2(Integer.parseInt("" + ch));
    }

    @Override
    public void processOperator(char ch) {

        if(ch != '='){
            System.out.println("= 기호를 입력해주세요");
            return;
        }

        calc.printOutResult();
        calc.setState(calc.getSTATE_START());
    }

}
