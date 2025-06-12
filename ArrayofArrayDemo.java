public class ArrayofArrayDemo {
    public static void main(String[] args) {
        String[][] cars = {
            {"Ford", "Hyundai", "Honda", "Renault"},
            {"Nissan", "Rolls Royce", "Ferri", "Suzuki"},
            {"Tata", "Skoda", "Benz", "Volkswagen"},
            {"Tesla", "Toyota", "BMW", "Audi"}
        };

        for(int i = 0; i < cars.length; i++){
            System.out.print(cars[i][0] + ":");
            for(int j = 0; j < cars[i].length; j++){
            System.out.print(cars[i][j] + ":");
            }
        }
    }
}
