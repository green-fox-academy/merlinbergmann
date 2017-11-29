
public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indentation

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder builder = new StringBuilder(todoText);
        builder.insert(0, "My todo:\n");
        builder.append(" - Download games\n");
        builder.append("    - Diablo");

        System.out.println(builder);

    }
}