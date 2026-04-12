package section1;

public class operators {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not a alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater then second top score and less then 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        // Operador ternario
        // Si la condición devuelva true se asigna el signo posterior al signo de interrogación
        // a la variable de la izquierda, si la condición es falsa se le asigna a la variable el
        // valor que aparece después de los dos puntos.

        // El operador ternario sse utiliza un atajo para asignar un valor a una variable según
        // una condición dada.
        String makeOfCar = "Volswagen";
        boolean isDomestic = makeOfCar == "Volswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is " + ageText);

        // Aqui como la variable isDomestic es falsa, el operador ternario añade a la variable s, la segunda parte del operador ternario
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
    }
}
