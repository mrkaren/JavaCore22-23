package homework.homework1;

public class FigurePainterDemo {

    public static void main(String[] args) {
        FigurePainter fp = new FigurePainter();
        fp.figureOne(5, '%', true);
        fp.figureOne(7, '&', false);
        fp.figureOne(10, '$', true);
        fp.figureOne(3, '#', false);
    }
}
