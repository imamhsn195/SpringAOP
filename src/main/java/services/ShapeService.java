package services;

import models.Circle;
import models.Triangle;

public class ShapeService {
    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    private Triangle triangle;
    private Circle circle;
}
