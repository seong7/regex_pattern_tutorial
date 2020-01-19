# Regex Pattern
<br/>

<h2>References</h2>
<ul>
 <li>
  Website to practice
  <a href="https://regexone.com/">
   >>
  </a>
 </li>
 <li>
  video Lecture
  <a href="https://www.youtube.com/watch?v=s_PfopWcMwI">
   >>
  </a>
 </li>
 </ul>

<h2>Regex Special Characters (meta characters)</h2>
<pre>
 \  ^  $  .  |  ?  *  +  (  )  [  {
 해당 문자들을 검색할 때는 \\를 앞에 붙여야함
</pre>


<h2>Summary</h2>
<ul>
  <li>
   Special Character
   <pre>
{n}  : length = n
{n,m} : minimum length = n, maximum length = m
{n,}  : minimum length = n
+  : 최소 길이 1 이상 ({1,} 와 동일)
^ (caret)  : not ("[^A-G]"  : not A - G (upper case))
.  : anything of length 1 (".{3}"  : 길이 3인 아무 문자 또는 숫자)
?  : 해당 부분이 없을 수 있을 때 사용  (예시: "\\(?"  또는  "([a-z]{3})?")
*  : 앞에 쓰인 문자 또는 숫자의 길이를 0 이상으로 정함 (예시:  "a*p" - p, ap, aaap 등 찾음)
  </pre>
 </li>
 <li>
  Characters
  <pre>
[A-Za-f] : Any characters (alphabet)
\\s  : white space (\s 하나 당 길이 1로 인식됨)
\\S  : not white space 
[ABC]  : A, B, C 중 길이 1인 character
[abc]{2}  : a, b, c 의 조합으로 길이 2인 character sequence

=> eg. [A-Za-z]{2, 20}
  </pre>
 </li>
 <li>
  Word
  <pre>
\\w  : any type of word 검색   ("[A-Za-z0-9_]" 와 동일)
\\W  : not \\w
\\w*  : any type of word 중 길이 0 또는 0 이상인 모든 것 검색
  </pre>
 </li>
 <li>
  Numbers
  <pre>
[0-9] : digit		
\\d  : digit  ([0-9] 와 동일)
\\D  : not digit
{5}  : length = 5
  </pre>
 </li>
</ul>
