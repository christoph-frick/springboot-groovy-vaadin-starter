package app.ui

import com.vaadin.annotations.Theme
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Button
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import groovy.transform.CompileStatic
import org.vaadin.spring.VaadinUI

@VaadinUI
@Theme('app')
@CompileStatic
class AppUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final layout = new VerticalLayout()
        layout.setSpacing(true)
        layout.setMargin(true)
        final headline = new Label('Hello World')
        headline.addStyleName('h1')
        final button = new Button("more!", {
            layout.addComponent(new Label(new Date().toString()))
        } as Button.ClickListener)
        layout.addComponents(headline, button)
        setContent(layout)
    }

}
