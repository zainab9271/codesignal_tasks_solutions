package array_replace

/**
 * Replaces all the occurrences of elemToReplace value in the given array of integers with the substitutionElem.
 * @author Zainab Mahmood
 * @sample
 * @param inputArray A mutable list of integers.
 * @param elemToReplace An integer element involved in the inputArray to be replaced.
 * @param substitutionElem An integer value to take place of the elemToReplace in the inputArray.
 * @return An array or list of integers with substituted values.
 * @see [array_replace/array_replace_description.md]
 */


fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int) = inputArray.map { if (it == elemToReplace) substitutionElem else it }




