package String;


/** META CHARACTERS
\d -Any digit, short for [0-9]
\D -A non-digit, short for [^0-9]
\s -A whitespace character, short for [ \t\n\x0b\r\f]
\S -A non-whitespace character, short for
\w -A word character, short for [a-zA-Z_0-9]
\W -A non-word character [^\w]
\S+ -Several non-whitespace characters
\b- Matches a word boundary where a word character is [a-zA-Z0-9_]
 ^ - DO NOT MATCH- [a-z]  means everything except a-z.
 . - Any character except line break.For ex-  in AAA - A. means replace A.A means AAA
 * The * (zero or more) is "greedy" - means anything
 .* means - replace anything
? - it will return shortest match 
Let's compare these two patterns: A.*Z and A.*?Z.

Given the following input:

eeeAiiZuuuuAoooZeeee
The patterns yield the following matches:

A.*Z yields 1 match: AiiZuuuuAoooZ (see on rubular.com)
A.*?Z yields 2 matches: AiiZ and AoooZ (see on rubular.com)
 *
 */

public class RegularExpressionExamples {

	public static void main(String[] args) {
		String A="Hellow there hi 987 ==;%^$%";
		
		/*Remove digits from String */
		System.out.println("\\d:-"+A.replaceAll("\\d", ""));
		/*Remove everything except digits */
		System.out.println("\\D:-"+A.replaceAll("\\D", ""));
		/*Remove space from a string */
		System.out.println("\\s:-"+A.replaceAll("\\s", ""));
		/*Remove all except space*/
		System.out.println("\\S:-"+A.replaceAll("\\S", ""));
		/* Several non-whitespace characters */
		System.out.println("\\s+:-"+A.replaceAll("\\s+", ""));
		/*Remove all  word characters[A-z 0-9]*/
		System.out.println("\\w:-"+A.replaceAll("\\w", ""));
		//Remove all non word characters[=%<>]
		System.out.println("\\W:-"+A.replaceAll("\\W", ""));
		
		
		System.out.println(A.replaceAll("[A-Z a-z \\W]", ""));
		
	}
	
}
