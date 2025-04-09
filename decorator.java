// Lab Final
// Name : Sahil Uddin Ishmam
// ID : 222-115-071
// Section : B
// Course : SE&DP
// Date : 09/04/2025

// Strategy Desgin pattern

import java.util.*;

// //Decorator Design Pattern
interface Dashboard {
    String getDescription();
}

// base class
class BasicDashboard implements Dashboard {
    public String getDescription() {
        return "# Dashboard : Base + ";
    }

    
}

// abstract decorator
abstract class WidgetDecorator implements Dashboard {
    protected Dashboard decoratedWidget;

    public WidgetDecorator(Dashboard Widget) {
        this.decoratedWidget = Widget;
    }

    public String getDescription() {
        return decoratedWidget.getDescription();
    }

    
}

// //Weather Widget (decorator)
class WeatherWidget extends WidgetDecorator {
    public WeatherWidget(Dashboard widget) {
        super(widget);
    }

    public String getDescription() {
        return decoratedWidget.getDescription() + " weather + ";
    }

    
}

// //News Widget ( decorator)
class NewsWidget extends WidgetDecorator {
    public NewsWidget(Dashboard widget) {
        super(widget);
    }

    public String getDescription() {
        return decoratedWidget.getDescription() + " News +";
    }

    
}

// //Stock widget  (decorater)
class StockWidget extends WidgetDecorator {
    public StockWidget(Dashboard widget) {
        super(widget);
    }

    public String getDescription() {
        return decoratedWidget.getDescription() + " Stock ";
    }

    
}
// //Calender Widget (decoator)
class CalenderWidget extends WidgetDecorator {
    public CalenderWidget(Dashboard widget) {
        super(widget);
    }

    public String getDescription() {
        return decoratedWidget.getDescription() + " Calender + ";
    }

    
}




public class decorator {
    public static void main(String[] args) {


        // // For decorator Design pattern
        System.out.println("\n Decoeator Design pattern \n");

        Dashboard widget1 = new BasicDashboard();
        widget1 = new WeatherWidget(widget1);
        widget1 = new StockWidget(widget1);

        
        System.out.println(widget1.getDescription());
        
        System.out.println();

        
    }
}