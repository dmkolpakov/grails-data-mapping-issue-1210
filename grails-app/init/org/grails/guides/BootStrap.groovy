package org.grails.guides

class BootStrap {

    def init = { servletContext ->

        def nissan = new Make(name: 'Nissan').save()
        def ford = new Make(name: 'Ford').save()

        def titan = new Model(name: 'Titan', make: nissan).save()
        def leaf = new Model(name: 'Leaf', make: nissan).save()
        def windstar = new Model(name: 'Windstar', make: ford).save()

        def v1 = new Vehicle(name: 'Pickup', make: nissan, model: titan, year: 2012).save()
        def v2 = new Vehicle(name: 'Economy', make: nissan, model: leaf, year: 2014).save()
        def v3 = new Vehicle(name: 'Minivan', make: ford, model: windstar, year: 1990).save()

        def ow1 = new Owner(name: 'Jon3', vechile: v1).save()
        def ow2 = new Owner(name: 'Jon2', vechile: v1).save()
    }
    def destroy = {
    }
}
