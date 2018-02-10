# About

Shoes size conversion function, based on `fnproject.io`

# Deploy

`fn deploy --app services-app --local`

# Example requests

`echo  '{"size":"4","type":"US"}' | fn run`

```
  curl -X POST -d '{"size":"4","type":"US"}' http://localhost:8080/r/testapp/shoe-size-conversion-fn
  
  {"result":"Success","size":{"CM":"20.8","Europe":"35","UK":"2","US":"4","Inc":"8.1875"}}
  
```  