package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }


    void "test toString"() {

when: "A Course has title, code, tutor, department and description"
def course=new Course(title:'Web',
code:'12423',
tutor:'Mr Smith',
department:'Computing',
description:'Web systems desgin')
then: "the to String method will merge them. "
course.toString()=='Web,12423,Mr Smith,Computing,Web systems desgin'

    }
}

