6b.l
%{
#include<stdio.h>
#include"y.tab.h"
extern int yylval;
%}
%%
[\t] ;
[+|-|*|?|=|<|>] {printf("operator is %s\n",yytext);return OP;}
[0-9]+ {yylval=atoi(yytext); printf("number is %d\n",yylval);return
DIGIT;}
int|char|float|bool|void|for|do|while|if|else|return|main
{printf("keyword is %s\n",yytext); return KEY;}
[a-zA-Z0-9]+ {printf("identifier is %s\n",yytext); return ID;}
. ;
%%
//6b.y
%{
#include<stdio.h>
#include<stdlib.h>
int id=0,key=0,op=0,dig=0;
%}
%token KEY,OP,ID,DIGIT
%%
input:
ID input {id++;}
|KEY input e{key++;}
|OP input {op++;}
|DIGIT input {dig++;}
|ID {id++;}
|KEY {key++;}
|OP {op++;}
|DIGIT {dig++;}
%%
extern FILE *yyin;
main(int argc,char *argv[])
{
yyin=fopen(argv[1],"r");
yyparse();
printf("no of dig=%d no of keywords=%d\t no of identifiers=%d\t no of
operators=%d",dig,key,id,op);
}
yyerror()
{
printf("invalid");
exit(0)}