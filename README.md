**Singleton Scope**
It is the default scope in spring applications .
If we use this scope to the bean then IOC Container will create Single Bean object for single bean definitions in Spring config file .
This approach will return the same bean object for every time requesting the bean object .
When we request the bean object first time then IOC Container will create bean object really and it will be stored in the cache memory then every time accessing the bean object , 
IOC Container will return the Same bean object reference value without creating the Bean objects . 
