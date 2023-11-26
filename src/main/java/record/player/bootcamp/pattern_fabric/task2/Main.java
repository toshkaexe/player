package record.player.bootcamp.pattern_fabric.task2;
/*
1 Создайте абстрактные классы AbstractShape, AbstractCircle, AbstractRectangle и AbstractLine,
представляющие базовые типы графических объектов.
2 Реализуйте конкретные классы Circle, Rectangle и Line, которые наследуются от соответствующих абстрактных классов.
3 Создайте абстрактную фабрику AbstractShapeFactory, которая содержит методы для создания объектов каждого типа (круг, прямоугольник, линия).
4 Реализуйте конкретные фабрики ConcreteShapeFactory1 и ConcreteShapeFactory2, каждая из которых реализует абстрактную фабрику и возвращает экземпляры конкретных классов.
5 В основном коде графического редактора используйте абстрактную фабрику для создания объектов без явного указания их конкретных классов. Таким образом,
при добавлении нового типа графического объекта в систему, вам не придется изменять существующий код редактора.
 */
// Абстрактный класс для базовой геометрической фигуры
abstract class AbstractShape {
    abstract void draw();
}

// Абстрактный класс для круга
abstract class AbstractCircle extends AbstractShape {
    abstract void drawCircle();
}

// Абстрактный класс для прямоугольника
abstract class AbstractRectangle extends AbstractShape {
    abstract void drawRectangle();
}

// Абстрактный класс для линии
abstract class AbstractLine extends AbstractShape {
    abstract void drawLine();
}

// Класс для круга
class Circle extends AbstractCircle {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    void drawCircle() {
        System.out.println("Drawing the circle");
    }
}

// Класс для прямоугольника
class Rectangle extends AbstractRectangle {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    void drawRectangle() {
        System.out.println("Drawing the rectangle");
    }
}

// Класс для линии
class Line extends AbstractLine {
    @Override
    void draw() {
        System.out.println("Drawing a line");
    }

    @Override
    void drawLine() {
        System.out.println("Drawing the line");
    }
}

// Абстрактная фабрика для создания геометрических фигур
abstract class AbstractShapeFactory {
    abstract AbstractCircle createCircle();
    abstract AbstractRectangle createRectangle();
    abstract AbstractLine createLine();
}
// Конкретная фабрика 1
 class ConcreteShapeFactory1 extends AbstractShapeFactory {
    @Override
    AbstractCircle createCircle() {
        return new Circle();
    }

    @Override
    AbstractRectangle createRectangle() {
        return new Rectangle();
    }

    @Override
    AbstractLine createLine() {
        return new Line();
    }
}

// Конкретная фабрика 2
class ConcreteShapeFactory2 extends AbstractShapeFactory {
    @Override
    AbstractCircle createCircle() {

        return new Circle();
    }

    @Override
    AbstractRectangle createRectangle() {

        return new Rectangle();
    }

    @Override
    AbstractLine createLine() {

        return new Line();
    }
}
public class Main {
    public static void main(String[] args) {

        AbstractShapeFactory factory1 = new ConcreteShapeFactory1();
        AbstractCircle circle1 = factory1.createCircle();
        AbstractRectangle rectangle1 = factory1.createRectangle();
        AbstractLine line1 = factory1.createLine();

        AbstractShapeFactory factory2 = new ConcreteShapeFactory2();
        AbstractCircle circle2 = factory2.createCircle();
        AbstractRectangle rectangle2 = factory2.createRectangle();
        AbstractLine line2 = factory2.createLine();

        circle1.draw();
        rectangle1.draw();
        line1.draw();

        circle2.draw();
        rectangle2.draw();
        line2.draw();
    }
}
