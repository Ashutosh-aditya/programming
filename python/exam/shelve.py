import shelve
sf=shelve.open('mydata')
sf['a']='hi'
sf['b']='hello'
sf['c']='hello'
sf.close()
