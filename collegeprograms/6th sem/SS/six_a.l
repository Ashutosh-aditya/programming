%{
int scl=0,mcl=0;
%}
%x CML CSL
%%
"/*" {BEGIN CML;}
<CML>. ;
<CML>"*/" {BEGIN 0;mcl++;}
"//" {BEGIN CSL;scl++;}
<CSL>. ;
<CSL>\n {BEGIN 0;}
%%
int main(int argc,char* argv[])
{
if(argc!=3)
{
printf("Usage is %s <src file><dest file>\n",argv[0]);
return ;
}
yyin=fopen(argv[1],"r");
yyout=fopen(argv[2],"w");
yylex();
printf("Number of single comment lines : %d\n",scl);
printf("Number of multi comment lines : %d\n",mcl);
fclose(yyout);
yyout=fopen(argv[2],"r");
char C;
C=fgetc(yyout);
while(C!=EOF)
{
Printf(“%c”, C);
C=Fgetc(yyout);
}
flose(yyout);
}
