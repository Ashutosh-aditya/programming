import zipfile
# zp=zipfile.ZipFile('new.zip','w')
# zp.write("D:\\img\\",compress_type=zipfile.ZIP_DEFLATED)
# zp.close()
z1=zipfile.ZipFile('new.zip')
print(z1.namelist())
z1.extractall()