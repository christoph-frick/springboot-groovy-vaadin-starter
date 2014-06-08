ruleset {
    description 'Codenarc ruleset for Groovy project'

    ruleset('rulesets/basic.xml')
    ruleset('rulesets/braces.xml')
    ruleset('rulesets/concurrency.xml')
    ruleset('rulesets/convention.xml')
    ruleset('rulesets/design.xml')
    ruleset('rulesets/dry.xml')
    // gives compile error from codenarc
    // ruleset('rulesets/enhanced.xml')
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/groovyism.xml')
    ruleset('rulesets/imports.xml')
    ruleset('rulesets/logging.xml') {
        'Println' priority: 1
        'PrintStackTrace' priority: 1
    }
    ruleset('rulesets/naming.xml')
    ruleset('rulesets/security.xml')
    ruleset('rulesets/unnecessary.xml')
    ruleset('rulesets/unused.xml')
}
