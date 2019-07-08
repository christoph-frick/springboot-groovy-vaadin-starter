package app.ui

import com.vaadin.annotations.Theme
import com.vaadin.annotations.Widgetset
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.*
import com.vaadin.ui.themes.ValoTheme

@SpringUI
@Theme('app')
@Widgetset('app')
class AppUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        def output, input
        setContent(new VerticalLayout(
            output = new Label('Hello ???').tap {
                setStyleName(ValoTheme.LABEL_H1)
            },
            input = new TextField("Greet whom?").tap {
                value = 'World'
            },
            new Button('Click to greet', {
                output.value = "Hello ${input.value ?: "Vaadin"}"
            } as Button.ClickListener)
        ))
    }

}
