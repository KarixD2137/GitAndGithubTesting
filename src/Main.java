void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int number1 = scanner.nextInt();
    System.out.print("Select operation [+] [-] [*] [/]: ");
    char operation = scanner.next().charAt(0);
    System.out.print("Enter second number: ");
    int number2 = scanner.nextInt();

    int result;
    switch (operation) {
        case '+':
            result = number1 + number2;
            System.out.println(result);
            break;
        case '-':
            result = number1 - number2;
            System.out.println(result);
            break;
        case '*':
            result = number1 * number2;
            System.out.println(result);
            break;
        case '/':
            try {
                result = number1 / number2;
                System.out.println(result);
                break;
            } catch (Exception e) {
                System.out.println("Stop. Exeption: " + e);
                break;
            }
        default:
            System.out.println("Invalid operation");
    }
}
