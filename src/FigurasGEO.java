import java.util.Scanner;

public class FigurasGEO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            String[] opciones = {"CÍRCULO", "CUADRADO", "TRIÁNGULO", "RECTÁNGULO", "PENTÁGONO"};

            System.out.println("\n   LISTA DE OPCIONES \n");
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }

            int seleccionFigura;
            while (true) {
                System.out.print("\nSeleccione el número de la figura: ");
                seleccionFigura = scanner.nextInt();

                if (seleccionFigura > 5 || seleccionFigura < 1) {
                    System.out.println("¡Error! Por favor, seleccione un número válido de la lista.");
                } else {
                    break;
                }
            }

            String[] selecciona = {"Área", "Perímetro"};

            System.out.println("\n   LISTA DE OPCIONES ");
            for (int i = 0; i < selecciona.length; i++) {
                System.out.println((i + 1) + ". " + selecciona[i]);
            }

            int seleccionOperacion;
            while (true) {
                System.out.print("\nSeleccione un número: ");
                seleccionOperacion = scanner.nextInt();

                if (seleccionOperacion > 2 || seleccionOperacion < 1) {
                    System.out.println("¡Error! El número ingresado no se encuentra en la lista.");
                } else {
                    break;
                }
            }

            switch (seleccionFigura) {
                case 1: // Círculo
                    if (seleccionOperacion == 1) { // Área
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = scanner.nextDouble();
                        double areaCirculo = Math.PI * Math.pow(radio, 2);
                        System.out.println("El área del círculo es: " + areaCirculo);
                    } else if (seleccionOperacion == 2) { // Perímetro
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = scanner.nextDouble();
                        double perimetroCirculo = 2 * Math.PI * radio;
                        System.out.println("El perímetro del círculo es: " + perimetroCirculo);
                    }
                    break;

                case 2: // Cuadrado
                    if (seleccionOperacion == 1) { // Área
                        System.out.print("Ingrese el lado del cuadrado: ");
                        double ladoCuadrado = scanner.nextDouble();
                        double areaCuadrado = Math.pow(ladoCuadrado, 2);
                        System.out.println("El área del cuadrado es: " + areaCuadrado);
                    } else if (seleccionOperacion == 2) { // Perímetro
                        System.out.print("Ingrese el lado del cuadrado: ");
                        double ladoCuadrado = scanner.nextDouble();
                        double perimetroCuadrado = 4 * ladoCuadrado;
                        System.out.println("El perímetro del cuadrado es: " + perimetroCuadrado);
                    }
                    break;

                case 3: // Triángulo
                    if (seleccionOperacion == 1) { // Área
                        System.out.print("Ingrese la base del triángulo: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese la altura del triángulo: ");
                        double altura = scanner.nextDouble();
                        double areaTriangulo = (base * altura) / 2;
                        System.out.println("El área del triángulo es: " + areaTriangulo);
                    } else if (seleccionOperacion == 2) { // Perímetro
                        System.out.print("Ingrese el lado del triángulo: ");
                        double ladoTriangulo = scanner.nextDouble();
                        double perimetroTriangulo = 3 * ladoTriangulo;
                        System.out.println("El perímetro del triángulo es: " + perimetroTriangulo);
                    }
                    break;

                case 4: // Rectángulo
                    if (seleccionOperacion == 1) { // Área
                        System.out.print("Ingrese la base del rectángulo: ");
                        double baseRectangulo = scanner.nextDouble();
                        System.out.print("Ingrese la altura del rectángulo: ");
                        double alturaRectangulo = scanner.nextDouble();
                        double areaRectangulo = baseRectangulo * alturaRectangulo;
                        System.out.println("El área del rectángulo es: " + areaRectangulo);
                    } else if (seleccionOperacion == 2) { // Perímetro
                        System.out.print("Ingrese la base del rectángulo: ");
                        double baseRectangulo = scanner.nextDouble();
                        System.out.print("Ingrese la altura del rectángulo: ");
                        double alturaRectangulo = scanner.nextDouble();
                        double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
                        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);
                    }
                    break;

                case 5: // Pentágono
                    if (seleccionOperacion == 1) { // Área
                        System.out.print("Ingrese el perímetro del pentágono: ");
                        double perimetroPentagono = scanner.nextDouble();
                        System.out.print("Ingrese la apotema del pentágono: ");
                        double apotemaPentagono = scanner.nextDouble();
                        double areaPentagono = (perimetroPentagono * apotemaPentagono / 2);
                        System.out.println("El área del pentágono es: " + areaPentagono);
                    } else if (seleccionOperacion == 2) { // Perímetro
                        System.out.print("ingresa el lado del pentagono");
                        double ladopentagono = scanner.nextDouble();
                        double perimetropentagono = 5 * ladopentagono;
                        System.out.println("el perímetro de un pentágono es:" + perimetropentagono);
                    }
                    break;

                default:
                    System.out.println("Selección inválida. Por favor, elija una opción válida.");
            }

            System.out.print("\n¿Desea ingresar nuevos datos? (si/no): ");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
                System.out.println("¡Hasta la próxima!");
            }

            }
    }
}
