package app.ui

import com.vaadin.annotations.Theme
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import groovy.transform.CompileStatic
import org.vaadin.spring.VaadinUI

@VaadinUI
@Theme('app')
@CompileStatic
class AppUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Label headline = new Label('Hello World')
        headline.with{
            addStyleName('h1')
        }
        setContent(headline)
    }

}
