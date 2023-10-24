# String Calculator Kata

Create a simple calculator that takes a String and returns a integer

```
int add(string numbers)
```

## Requirements

1. The method can take up to two numbers, separated by commas, and will return
their sum as a result. So the inputs can be: `“”`, `“1”`, `“1,2”`. For an empty
string, it will return `0`.
2. Allow `add()` to handle an unknown number of arguments
3. Allow `add()` to handle newlines as separators, instead of comas
    * `“1,2\n3”` should return `“6”`
    * `“2,\n3”` is invalid, should throw a generic `IllegalArgumentException`
4. Add validation to not allow a separator at the end
    * `“1,2,”` should return an error (or throw an exception)
5. Allow the add method to handle different delimiters: To change the delimiter,
the beginning of the input will contain a separate line with the format:
`//[delimiter]\n[numbers]`
    * `“//;\n1;3”` should return `“4”`
    * `“//|\n1|2|3”` should return `“6”`
    * `“//sep\n2sep5”` should return `“7”`
    * `“//|\n1|2,3”` is invalid and should return an error (or throw an
    exception) with the message `“‘|’ expected but ‘,’ found at position 3.`”

**Notes**:
* start with the simplest case (empty string) and extend it with the more
advanced cases (`“1”` and `“1,2”`) step by step
* Keep the three rules in mind and always write just sufficient code
* Do not forget to refactor your code after each passing test
* Write your assertions relating to the exact requirements

**STOP HERE** if you are a beginner. Continue with advanced if you could finish
steps 1-5 within 30 minutes.

## Advanced

6. Calling add with negative numbers will return the message `“Negative number(s)
not allowed: <negativeNumbers>”`
    * `“1,-2”` is invalid and should return the message `“Negative number(s)
   not allowed: -2”`
    * `“2,-4,-9”` is invalid and should return the message `“Negative number(s)
   not allowed: -4, -9”`
7. Calling `add()` with multiple errors will return all error messages separated
by newlines.
    * `“//|\n1|2,-3”` is invalid and return the message `“Negative number(s) not
   allowed: -3\n’|’ expected but ‘,’ found at position 3.”`
8. Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2