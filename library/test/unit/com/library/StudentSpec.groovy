package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }


    void "test toString"() {

when: "A Student has name, email, studentId and course"
def student=new Student(name:'Lewis',
email:'lewiskeady@hotmail.com',
studentId:'1234',
course:'Web')
then: "the to String method will merge them. "
student.toString()=='Lewis,lewiskeady@hotmail.com,1234,Web'

    }
}

