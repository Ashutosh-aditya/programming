import re,pprint

ph=re.compile("(\d\d\d)-(\d\d\d)-(\d\d\d\d)")
ph1=re.compile("\d{3}-\d{3}-\d{4}")
mo=ph1.search("my phone no. is 451-258-1677")
print(mo.group())

hero=re.compile(r"batman |superman")
mo1=hero.search("batsman vs superman")
print(mo1.group())

heros=re.compile(r"bat(|wo)+man")
mo2=heros.search("adventures of batman ")
print(mo2.group())

grdy=re.compile(r"(ha){3,5}")
grdy1=grdy.search("hahahahahahahahahahahahahahahahahaha ")
print(grdy1.group())

ngrdy=re.compile(r"(ha){3,5}?")
ngrdy1=ngrdy.search("hahahahahahahahahahahahahahahahahaha ")
print(ngrdy1.group())

mo4=ph1.findall("hii123-456-7789,hrr123-456-7779,hello147-852-3698,qwety159-357-8462 ")
print(mo4)

vov=re.compile(r"[aeiouAEIOU]",re.IGNORECASE,re.v)
op=vov.findall("THE QUICK BROWN FOX JUMP OVER THE LAZY DOG ,the quick brown fox jumps over the lazy dog")
print(op)

alp=re.compile(r"[a-zA-Z0-9]+")
op1=alp.findall("THE QUICK BROWN FOX JUMP OVER THE LAZY DOG ,the quick brown fox jumps over the lazy dog")
print(op1)










































































