// LEX : 2.l

%{
#include "y.tab.h"
%}
%%
a {return A;}
b {return B;}
. {return yytext[0];}
[\n] {return '\n';}
%%
// YACC :2.y
%{
#include<stdio.h>
#include<stdlib.h>
%}
%token A B
%%
input:S'\n' {printf("successful grammar\n"); exit(0);}
S:s1 B
s1:;|A s1
%%
main()
{
printf("enter string\n");
yyparse();
}
yyerror()
{
printf("error\n");
exit(0);
}
