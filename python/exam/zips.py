import zipfile
zf1=zipfile.ZipFile("new1.zip",'w')
zf1.write("D:\\img",compress_type=zipfile.ZIP_DEFLATED)
zf1.close()

zf2=zipfile.ZipFile("n.zip")
print(zf2.namelist())
zf2.extractall()
