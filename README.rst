=================================
Spring Boot Groovy Vaadin Starter
=================================

Ready to rock starter/sample project to get going a Vaadin app using Groovy.

This uses by default:

 - `Groovy <https://github.com/groovy/groovy-core>`_ for quick results

 - `Gradle <https://github.com/gradle/gradle>`_ for building

 - `Vaadin <https://github.com/vaadin/vaadin>`_ for the web GUI

 - `Spring Boot <https://github.com/spring-projects/spring-boot>`_ for ``bootRun`` and ``jar`` capabilities

 - `Vaadin4Spring <https://github.com/peholmst/vaadin4spring>`_ to make Spring and Vaadin play together

 - `Gradle Vaadin Plugin <https://github.com/johndevs/gradle-vaadin-plugin>`_ for style and widgetset compilation

 - `Spock <https://github.com/spockframework/spock>`_ for tests

 - `CodeNarc <https://github.com/CodeNarc/CodeNarc>`_ to ensure code quality


About
=====

Like many other starters or bootstraps, this project makes some assumptions,
what is needed and where it is.  The focus is to have an easy way to build web
apps using newest Vaadin 7.4 and Groovy 2.4 on Java 8, run it for development
and build a fat jar for deployment (yet development started with earlier
version and it is most likely that in general Vaadin 7, Groovy 2, and also
Java 7 would work).

It configures a theme and a widgetset right away (both named ``app``).  The
theme derives from Valo. There is a spring profile named ``dev`` to gather
configs (like to tell Vaadin, it is not in production mode) for development.


Usage
-----

Checking the starter out into directory ``app`` and get rid of the origin.

.. code:: sh

   git clone https://github.com/christoph-frick/springboot-groovy-vaadin-starter app
   cd app
   # git remote rm origin # get rid of the origin so you can add your own
   # git reset $(git commit-tree HEAD^{tree} -m "bootstrap") # squash all commits into one
   ./gradlew bootRun
   # check http://localhost:8080

If you are running IntelliJ IDEA, you can create the projects files with:

.. code:: sh

   ./gradlew idea

This sets up a ``.ipr`` file you can open with IDEA.

The created project has some additional configurations.  First the default for the
version control is ``git``.  Second the Gradle settings are already
added/changed to use the wrapper.  Third there are two configurations setup up
to run and reload the project.

This this is using ``springloaded`` to handle the reloading of live changes.
If you run *run dev* in debug mode you can then simply run *reload* to update
changes to the running process, while keeping the container running as long as
possible.


Code Tour
---------

:``build.gradle``: Versions and general setup of the project.  Add Vaadin
                   widgets/addons to the ``dependencies`` and be sure to
                   exclude their transitive dependencies (see example there),
                   then add them to the widgetset (the ``*.gwt.xml`` file).

:``gradle/groovyOptions.groovy``: Default config for the groovy compiler.
                                  ``@CompileStatic`` is enabled by default.

:``gradle/springboot-vaadin-fixes.gradle``: All configs to make both the
                                            Springboot and the Vaadin Gradle
                                            plug-in play nicely together.

:``gradle/idea.gradle``: Config for the IDEA project (see above)

:``config/codenarc/ruleset.groovy``: Default ruleset with few commented rules
                                     resulting in errors.

:``src/main/groovy/app/Application.groovy``: ``main`` and Spring Boot setup

:``src/main/groovy/app/ui/AppUI.groovy``: Trivial UI with the theme set.

:``src/main/resources/VAADIN/themes/app/``: The theme

:``src/main/resources/application.yaml``: Application config and Spring
                                          profile ``dev`` defined.

:``src/main/resources/app.gwt.xml``: The widgetset (use the same name as in
                                     the ``build.gradle`` and the
                                     ``application.yaml``).

:``src/main/resources/logback.xml``: Default logging with package ``app`` set
                                     to ``DEBUG``
