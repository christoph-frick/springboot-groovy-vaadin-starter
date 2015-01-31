=================================
Spring Boot Groovy Vaadin Starter
=================================

Ready to rock starter/sample project to get going a Vaadin app using Groovy.

This uses by default:

 - `Groovy <https://github.com/groovy/groovy-core>`_ for quick results

 - `Gradle <https://github.com/gradle/gradle>`_ for building

 - `Vaadin <https://github.com/vaadin/vaadin>`_ for the web GUI

 - `Spring Boot <https://github.com/spring-projects/spring-boot>`_ (for ``bootRun`` and ``jar`` capabilities

 - `Vaadin4Spring <https://github.com/peholmst/vaadin4spring>`_ (to make Spring and Vaadin play together)

 - `Gradle Vaadin Plugin <https://github.com/johndevs/gradle-vaadin-plugin>`_ (for style and widgetset compilation)

 - `Spock <https://github.com/spockframework/spock>`_ for tests

 - `CodeNarc <https://github.com/CodeNarc/CodeNarc>`_ to ensure code quality


About
=====

Like many other starters or bootstraps, this project makes some assumptions,
what is needed and where it is.  The focus is to have an easy way to build web
apps using newest Vaadin 7.3 and Groovy 2.3 on Java 8, run it for development
and build a fat jar for deployment. It configures a theme and a widgetset
right away (both named ``app``).  The theme derives from Valo. New widgets get
picked up automatically for widgetset compilation.  There is a spring profile
named ``dev`` to gather configs (like to tell Vaadin, it is not in production
mode) for development.


Usage
-----

Checking the starter out into directory ``app`` and get rid of the origin.

.. code:: sh

   git clone https://github.com/christoph-frick/springboot-groovy-vaadin-starter app
   cd app
   git remote rm origin
   ./gradlew bootRun
   # check http://localhost:8080


Code Tour
---------

:``build.gradle``: Versions and general setup of the project. (Sadly) contains
                   some black magic (annotated with comments) to make the
                   different Gradle plugins play nicely together.  Add Vaadin
                   widgets/addons to the ``dependencies`` and be sure to
                   exclude their transitive dependencies (see example there).

:``config/codenarc/ruleset.groovy``: Default ruleset with few commented rules
                                     resulting in errors.

:``src/main/groovy/app/Application.groovy``: ``main`` and Spring Boot setup

:``src/main/groovy/app/ui/AppUI.groovy``: Trivial UI with the theme set.

:``src/main/resources/VAADIN/themes/app/``: The theme

:``src/main/resources/application.yaml``: Application config and Spring
                                          profile ``dev`` defined.

:``src/main/resources/logback.xml``: Default logging with package ``app`` set
                                     to ``DEBUG``
