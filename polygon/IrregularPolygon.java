package polygon;

import java.awt.geom.*; // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*; // for DrawingTool

public class IrregularPolygon {
    private ArrayList<Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();

    // constructor
    public IrregularPolygon() {}

    // public methods
    public void add(Point2D.Double aPoint)
    {
        // todo: Add a point to the IrregularPolygon.
        myPolygon.add(aPoint);
    }

    public double perimeter() 
    {
        if(myPolygon.size() < 2)
        {
            return 0.0;
        }

        double sum = 0;
        for(int i = 0; i < myPolygon.size(); i++)
        {
            Point2D.Double point = myPolygon.get(i);
            Point2D.Double next = myPolygon.get((i + 1) % myPolygon.size());
            sum += point.distance(next);
        }
        // todo: Calculate the perimeter.
        return sum;
    }

    public double area() 
    {
        if (myPolygon.size() < 3) 
        {
            return 0.0;
        }
        // todo: Calculate the area.
        Double area = 0.0;
        double first = 0.0;
        double second = 0.0;
        for (int i = 0; i < myPolygon.size(); i++) 
        {
            Point2D.Double point = myPolygon.get(i);
            Point2D.Double next = myPolygon.get((i + 1) % myPolygon.size());
            first += point.x * next.y;
            second += point.y * next.x;
        }
        return Math.abs((first - second) / 2);
    }

    public void draw()
    {
        // Wrap the DrawingTool in a try/catch to allow development without need for graphics.
        try 
        {
            // todo: Draw the polygon.
            // Documents: https://pavao.org/compsci/gpdraw/html/gpdraw/DrawingTool.html
            DrawingTool myDrawingTool = new DrawingTool(new SketchPad(500, 500));
            myDrawingTool.move(50, 50);
        } 
        catch (java.awt.HeadlessException e) 
        {
            System.out.println("Exception: No graphics support available.");
        }
    }

}
