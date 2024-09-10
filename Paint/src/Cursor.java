import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Cursor implements KeyboardHandler {
    private Arena arena;
    private Rectangle cursor;
    private Keyboard keyboard;
    public boolean isPainted;

    public Cursor(Arena arena){
        this.arena = arena;
        keyboard = new Keyboard(this);
    }

    public void createCursor(){
        cursor = new Rectangle(arena.getPADDING(), arena.getPADDING(), arena.getCELL_SIZE(), arena.getCELL_SIZE());
        cursor.setColor(Color.PINK);
        cursor.fill();
        addKeyboard();
    }

    public void addKeyboard(){

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveLeft);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveDown);

        KeyboardEvent clear = new KeyboardEvent();
        clear.setKey(KeyboardEvent.KEY_C);
        clear.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(clear);

        KeyboardEvent paint = new KeyboardEvent();
        paint.setKey(KeyboardEvent.KEY_SPACE);
        paint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(paint);

    }


    public void moveUp(){
        this.cursor.translate(0, -Arena.CELL_SIZE);
    }
    public void moveDown(){
        this.cursor.translate(0, Arena.CELL_SIZE);
    }
    public void moveLeft(){
        this.cursor.translate(-Arena.CELL_SIZE, 0);
    }
    public void moveRight(){
        this.cursor.translate(Arena.CELL_SIZE,0);
    }
    //public void paint(){

    //}


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        int keyPressed = keyboardEvent.getKey();

        if(keyPressed == KeyboardEvent.KEY_RIGHT){
            moveRight();
        }
        if (keyPressed == KeyboardEvent.KEY_LEFT){
            moveLeft();
        }
        if(keyPressed == keyboardEvent.KEY_UP){
            moveUp();
        }
        if(keyPressed == keyboardEvent.KEY_DOWN){
            moveDown();
        }
       /* if(keyPressed == keyboardEvent.KEY_SPACE){
            paint();
        }
        if(keyPressed == keyboardEvent.KEY_C){
            clear();
        }*/

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
