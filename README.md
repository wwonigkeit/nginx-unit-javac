# Java (JSP) Hello World

Hello World is a simple web application to use as an introduction to Vorteil running on NGINX Unit. It hosts a webpage containing a simple hello world message with Vorteil's logo. The background colour of the page can be controlled by setting the `-Dhelloworld.colour` argument to any valid HTML colour code.

No changes were needed for the [NGINX Unit platform!](https://unit.nginx.org/)

## Running

The helloworld web appliction requires a `-Dhelloworld.colour` system argument

```sh
java helloworld -Dhelloworld.colour=#FFFFFF
```

The argument colour: must be six characters of hexadecimal (like '#FFFFFF')

Should return something like

```
2017/10/13 11:14:32 Listening on port 3000
```

You can connect to the web server by visiting http://localhost/
