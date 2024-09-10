import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {
    private boolean isPainted;
    private int col;
    private int row;
    private Rectangle cell;

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        isPainted = false;

        cell = new Rectangle(col, row, Arena.CELL_SIZE, Arena.CELL_SIZE);
        cell.draw();
    }
    public void paintCell(){
        cell.setColor(Color.BLUE);
        cell.fill();
        isPainted = true;
    }

    public void clearCell(){
        cell.draw();
        isPainted = false;
    }

    public boolean isPainted() {
        return isPainted;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
