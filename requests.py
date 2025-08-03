import requests
from requests.auth import HTTPBasicAuth
#GET
username = "user"
password = "pass"

response = requests.get( "https://httpbin.org/basic-auth/user/pass", auth =HTTPBasicAuth(username, password));

print(response.status_code)
assert response.status_code == 200, "failed"

#POST
headers = {"Content-Type": "application/json"};
response = requests.post("https://httpbin.org/post", json = {"name": "Ponchithra", "email": "pon@example.com"}, headers = headers)
print(response.status_code)
assert response.status_code==200, "failed"

#Bad request
response = requests.get( "https://httpbin.org/this-does-not-exist", auth =HTTPBasicAuth(username, password));
print(response.status_code)

#PUT
url = "https://httpbin.org/put"
data = {
    "id": 1,
    "name": "Ponchithra",
    "email": "pon@example.com"
}

response = requests.put(url, json=data)
print(response.status_code)
print(response.json())

url = "https://httpbin.org/delete"

response = requests.delete(url)
print(response.status_code)
print(response.json())
