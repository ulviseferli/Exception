void main() {

    //Task A1

    Scanner scanner = new Scanner(System.in);
    while(true){
        try {
            System.out.print("birinci ededi daxil edin: ");
            int num1 = scanner.nextInt();
            System.out.print("ikinci ededi daxil edin: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println(result);
            break;
        }
        catch (InputMismatchException ex){
            System.out.print("Eded daxil edin: ");
            scanner.nextLine();
        }
        catch (ArithmeticException ex){
            System.out.println("sifira bolmek olmaz");
        }
    }

    //Task A2

    String[] names = {"Ali", "Vüsal", "Aysel"};
    System.out.print("indeks daxil edin: ");
    Scanner scanner = new Scanner(System.in);
    int index = scanner.nextInt();
    try {
        System.out.println(names[index]);
    }catch (ArrayIndexOutOfBoundsException ex){
        System.out.println(ex.getMessage());
    }

    //Task A3

    String[] arr = {"12", "abc", "7", "", "3.5", "-4"};
    int sum = 0;
    for (int i = 0; i <= arr.length - 1; i++) {
        try {
            int number = Integer.parseInt(arr[i]);
            System.out.println(number);
            sum += number;
        }
        catch (NumberFormatException ex){
            System.out.println(arr[i] + ": reqem deyil");
        }
    }

    System.out.println("Cem: " + sum);

    //Task B1

    try {
        registerUser("Ulvi",21);
    }catch (InvalidAgeException ex){
        System.out.println(ex.getMessage());
    }

    try {
        registerUser("Ulvi",121);
    }catch (InvalidAgeException ex){
        System.out.println(ex.getMessage());
    }


}
     //Task B1

public void registerUser(String name, Integer age) throws InvalidAgeException{
    if(age < 18 || age > 120){
        throw new InvalidAgeException("yas 18 ile 120 arasinda olmalidir");
    }
}

     //Task C1

static int parseIntOrDefault(String s, int def){
    try{
        return Integer.parseInt(s);
    }catch (NumberFormatException ex){
        return def;
    }
}

static double parseDoubleOrDefault(String s, double def){
    try{
        return Double.parseDouble(s);
    }catch (NumberFormatException ex){
        return def;
    }
}

