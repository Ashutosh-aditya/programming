%{
#include "y.tab.h"
extern int yylval;
%}
%%
[0-9]+ {yylval=atoi(yytext); return NUM;}
[\t] ;
. {return yytext[0];}
\n {return 0;}
%%

//yacc part
%{
#include<stdio.h>
#include<stdlib.h>
%}
%token NUM
%left '+' '-'
%left '*' '/'
%%
S:e {printf("result=%d\n",$$);return 0;}
;
e:e'+'e {$$=$1+$3;}
|e'-'e {$$=$1-$3;}
|e'*'e {$$=$1*$3;}
|e'/'e {if($3==0){printf("Divide by zero");exit(0);}else{$$=$1/$3;}}
|'('e')' {$$=$2;}
|NUM {$$=$1;}
;
%%
main()
{
printf("enter expression\n");
yyparse();
}
yyerror()
{
printf("error\n");
exit(0);
}
