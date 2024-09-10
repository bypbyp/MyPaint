public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena(10,10);
        Cursor cursor = new Cursor(arena);
        cursor.createCursor();
        arena.init();
    }
}