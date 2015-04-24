package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }


    void "test toString"() {

when: "A Library has location, openingHours, book, student and librarian"
def library=new Library(location:'Sheffield',
openingHours:'9-5 Mon-Fri',
book:'50 Shades of Grey',
student:'Lewis',
librarian:'James')

then: "the to String method will merge them. "
library.toString()=='Sheffield,9-5 Mon-Fri,50 Shades of Grey,Lewis,James'

    }
}

