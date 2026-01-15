import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Todo {
    public int id;
    public String title;
    public boolean completed;

    //Empty default constructor required for JSON deserialization
    public Todo() {}

    public Todo(int id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}

class JSONFileStorageDemo {
    public static void main(String[] args) {
        //Creating a new ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //Creates an empty list "todos"
        List<Todo> todos = new ArrayList<>();

        //Adds items to "todos"
        todos.add(new Todo(1, "Buy Milk", false));
        todos.add(new Todo(2, "Study Java", true));

        try {
            //Converts the todos list to JSON, and writes it to a file
            mapper.writeValue(new File("todos.json"), todos);

            System.out.println("Todos saved to JSON file");
        } catch (IOException e) {
            System.out.println("Error saving todos.json");
        }

        try {
            // creates an array "loadedTodos"
            Todo[] loadedTodos =
                    mapper.readValue(new File("todos.json"), Todo[].class); // Reads todos.json and converts the JSON into an array

            //prints out the todos in the terminal
            for (Todo t : loadedTodos) {
                System.out.println(t.id + " | " + t.title + " | " + t.completed);
            }
        } catch (IOException e) {
            System.out.println("Error loading todos.json");
        }
    }
}

