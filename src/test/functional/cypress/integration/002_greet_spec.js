describe('Greeting', function() {
    beforeEach(function() {
		cy.visit("/")
        cy.get(".h1").contains("Hello ???")
    })
	it('Greet a name', function() {
        cy.get("#input").clear().type("Belphegor")
        cy.get("#trigger").click()
        cy.get(".h1").should("contain", "Hello Belphegor")
	})
	it('Greet the world, if no name is given', function() {
        cy.get("#input").clear()
        cy.get("#trigger").click()
        cy.get(".h1").should("contain", "Hello World")
	})
})
