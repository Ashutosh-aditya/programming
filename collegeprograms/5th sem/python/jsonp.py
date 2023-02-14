import json
data = '{"name": "John Smith", "age": 35, "isStudent": false}'
str = json.loads(data)
print(str)
dmp=json.dumps(str)
print(dmp)