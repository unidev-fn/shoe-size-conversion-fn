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

License
=======
 
    Copyright (c) 2018 Denis O <denis.o@linux.com>
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
       http://www.apache.org/licenses/LICENSE-2.0
 
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.