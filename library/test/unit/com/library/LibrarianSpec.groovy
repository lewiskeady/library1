package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }


    void "test toString"() {

when: "A Librarian has name, email, userName, password and telephone"
def librarian=new Librarian(name:'James',
email:'james@hotmail.com',
userName:'james',
password:'password',
telephone:'01902335444')

then: "the to String method will merge them. "
librarian.toString()=='James,james@hotmail.com,james,password,01902335444'

    }
}

