package com.xenon.application.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class MainLayout extends AppLayout {

    public MainLayout() {
        addHeader();
        addFooter();
    }

    private void addHeader() {
        addToNavbar(getHeader());
    }

    private Header getHeader() {
        Header header = new Header();
        header.setId("header");

        //NavigationBar navbar = new NavigationBar();
        //navbar.add(personIcon);
        //header.add(navbar);

        return header;
    }

    private void addFooter() {
        Text text = new Text("This is a footer");

        HorizontalLayout footer = new HorizontalLayout(text);
        footer.setWidth("100%");
        footer.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
    }

}