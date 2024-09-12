import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Arena {
    private Rectangle arena;
    private Rectangle cell;
    private Cell[][] cells;
    private int cols;
    private int rows;
    public static final int CELL_SIZE = 25;
    public final int PADDING = 10;

    public Arena(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        cells = new Cell[cols][rows];
    }

    public Rectangle getArena() {
        return arena;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCELL_SIZE() {
        return CELL_SIZE;
    }

    public Cell getCell(int col, int row) {
        return cells[col][row];
    }

    public void paintCell(int col, int row) {
        getCell(col, row).paintCell();
    }

    public void wipeCell(int col, int row) {
        getCell(col, row).wipeCell();
    }

    public int getPADDING() {
        return PADDING;
    }

    public void arenaMaker() {
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                cells[x][y] = new Cell(PADDING + x * CELL_SIZE, PADDING + y * CELL_SIZE);
            }
        }
    }

    public void init() {
        arena = new Rectangle(PADDING, PADDING, getCols() * CELL_SIZE, getRows() * CELL_SIZE);
        arena.draw();
        arenaMaker();
    }
}
