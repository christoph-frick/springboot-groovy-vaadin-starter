package app.ui

import com.vaadin.annotations.Theme
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.Button
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.themes.ValoTheme
import org.vaadin.viritin.layouts.MVerticalLayout

import java.time.Instant

@SpringUI
@Theme('app')
class AppUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        def layout = new MVerticalLayout().withSpacing(true).withMargin(true)

        layout.addComponent(new Label('Hello Vaadin').with {
            setStyleName(ValoTheme.LABEL_H1)
            it
        })

        // def editor = new org.vaadin.openesignforms.ckeditor.CKEditorTextField()
        // layout.addComponent(editor)

        layout.addComponents(new Button('Click for time', {
            layout.addComponent(new Label("The time on server is ${Instant.now()}"))
        } as Button.ClickListener))

        setContent(layout)
    }

}
