package evenDigitsOnly

/**
 * Checks if all digits of the given integer are even.
 * @author Zainab Mahmood
 * @param n A one-digit or multi-digit integer
 * @return True if all digits are even or False otherwise.
 * @see [evenDigitsOnly/evenDigitsOnly_description.md]
 */
fun evenDigitsOnly(n: Int) = n.toString().filter { it in '1'..'9' step 2 } == ""









