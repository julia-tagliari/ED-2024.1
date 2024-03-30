package ex_07;
public class Expressao {
    public static double avaliarExpressao(String expressao) throws Exception {
        PilhaGenerica<Double> operandos = new PilhaGenerica<>(expressao.length());
        PilhaGenerica<Character> operadores = new PilhaGenerica<>(expressao.length());

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                while (i < expressao.length() - 1 && Character.isDigit(expressao.charAt(i + 1))) {
                    sb.append(expressao.charAt(++i));
                }
                operandos.push(Double.parseDouble(sb.toString()));
            } else if (c == '(') {
                operadores.push(c);
            } else if (c == ')') {
                while (operadores.retornaTopo() != '(') {
                    char op = operadores.pop();
                    double op2 = operandos.pop();
                    double op1 = operandos.pop();
                    operandos.push(realizarOperacao(op, op1, op2));
                }
                operadores.pop();
            } else if (isOperador(c)) {
                while (!operadores.pilhaVazia() && precedencia(operadores.retornaTopo()) >= precedencia(c)) {
                    char op = operadores.pop();
                    double op2 = operandos.pop();
                    double op1 = operandos.pop();
                    operandos.push(realizarOperacao(op, op1, op2));
                }
                operadores.push(c);
            }
        }

        while (!operadores.pilhaVazia()) {
            char op = operadores.pop();
            double op2 = operandos.pop();
            double op1 = operandos.pop();
            operandos.push(realizarOperacao(op, op1, op2));
        }

        return operandos.pop();
    }

    private static double realizarOperacao(char op, double op1, double op2) {
        switch (op) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                if (op2 == 0) {
                    throw new ArithmeticException("Divisão por zero");
                }
                return op1 / op2;
            default:
                throw new IllegalArgumentException("Operador inválido");
        }
    }

    private static int precedencia(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    private static boolean isOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

}
