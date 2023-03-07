import zipfile
# zf1=zipfile.ZipFile("n.zip")
# print(zf1.namelist())
zf2=zipfile.ZipFile("m.zip",'w')
zf2.write("D:\\",compress_type=zipfile.Z_DEFLATED)
zf.close()