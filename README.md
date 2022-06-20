# TheQuizWizard

<h2>Description</h2>
A lab where I complete an application called ’QuizWizard’ that allows academic staff to create and manage exam papers with multiple choice questions.

<h2>Skills learnt</h2>

<ul>
<li>Introduce “responsive” software, that reacts to user input in a human-like fashion.</li>
<li>Practicing with the Scanner and Random classes.</li>
<li>Improve skills with analysing a specification and designing the appropriate software solution</li>
<li>Reinforce TDD compliant implementation.</li> 
</ul>


<h2>Languages and Utilities Used</h2>

- <b>Java</b> 
- <b>Bluej</b>

<h2>Environments Used </h2>

- <b>Windows 10</b> (21H2)

<h1>General description</h1>
The ’QuizWizard’ is a software tool meant to support lecturers with creating exam papers.
A Quiz can contain an arbitrary number of questions (they can be added, replaced or
removed at any time). A Question may have a set number of answers, labelled with letters
(e.g., (a), (b), etc.). The number of answers has to be specified when creating a question.
Questions are tagged with unique codes, namely sequences of 3 alphanumeric characters
(e.g., AC3). Besides the actual questions, a quiz must also contain a reference to the
module it assesses (e.g., “DC1000: Foundations of Technology Solutions”). Each
’QuizWizard’ is compiled specifically for a purchaser, and every Quiz associated with the
application contains an OWNER of its own; a fixed value that is set when run; the OWNER
indicates the name of the purchaser of this particular ’QuizWizard’ and cannot be changed
later on when the program is executing. The OWNER is internal information and should not be
printed with the quiz contents. However, it should be possible to retrieve that value
associated with the quiz, even before starting to use the system to create it.
<h1>Required Functionality</h1>  
The QuizMaker facility should interactively allow users to:
<ul>
<li>Create a new quiz and populate it with questions. Questions can be added, removed or replaced based on their unique code.</li>
<li>Print the quiz.</li>
<li>Return the quiz tag (for internal use only).</li> 
</ul>
  
<!--
 ```diff
- text in red
+ text in green
! text in orange
# text in gray
@@ text in purple (and bold)@@
```
--!>
