package org.grails.guides

class Owner {

    String name
    static belongsTo = [vechile: Vehicle]
    static constraints = {
    }
}
