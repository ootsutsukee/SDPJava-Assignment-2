package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MyObserver implements PropertyChangeListener {
    public MyObserver(MyModel model) {
        model.addChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println(event.getPropertyName() + " [before -> "
                + event.getOldValue() + "] | [after -> " + event.getNewValue() +"]");
    }
}