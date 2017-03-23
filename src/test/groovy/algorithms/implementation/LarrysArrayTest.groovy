package algorithms.implementation

import spock.lang.Specification
import spock.lang.Unroll

class LarrysArrayTest extends Specification {

    @Unroll
    def 'Should determine whether robot can perform sorting or not. #sequence -> #expectedResult'() {
        expect:
        LarrysArray.determineIfSolvable(sequence.toArray(new int[0])) == expectedResult

        where:
        sequence                                                  || expectedResult
        [3, 1, 2]                                                 || 'YES'
        [1, 3, 4, 2]                                              || 'YES'
        [1, 2, 3, 5, 4]                                           || 'NO'
        [2, 1, 8, 12, 10, 5, 14, 3, 11, 7, 6, 13, 4, 9]           || 'YES'
        [10, 12, 6, 11, 1, 7, 8, 3, 9, 2, 4, 5]                   || 'YES'
        [1, 9, 2, 7, 6, 8, 3, 5, 10, 4]                           || 'NO'
        [14, 13, 15, 7, 16, 3, 9, 10, 8, 2, 6, 5, 1, 12, 11, 4]   || 'YES'
        [9, 8, 10, 7, 3, 5, 2, 11, 4, 6, 1]                       || 'NO'
        [19, 8, 22, 7, 5, 13, 10, 2, 16, 27, 9, 1, 21,
         3, 23, 4, 14, 15, 6, 20, 18, 12, 28, 25, 24, 26, 17, 11] || 'YES'
        [16, 17, 23, 3, 13, 8, 15, 20, 2, 27, 10, 6, 29, 14, 24,
         7, 9, 21, 22, 18, 12, 19, 26, 1, 28, 11, 25, 5, 4]       || 'NO'
    }
}
