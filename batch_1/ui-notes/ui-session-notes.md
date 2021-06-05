# UI Session Notes

## Tools

* Visual Studio Code
* Live Server Plugin
  * Live Server by Ritwick Dey

## First website

* Create a folder
* Create a file called index.html inside that folder
* HTML is interpreted


### HTML

* Markup Language

<html> </html> <h1 style=""> </h1>

**Basic Sample without CSS**

```html
<!DOCTYPE html>
<html>

<head>
    <!-- Refer CSS/Javascript/Icons -->
</head>

<body>
    <!-- Design -->
    <h1 style="color:red; font-size: 80px; background-color: pink;">Welcome to the session</h1>
    <h2> This is our second session </h2>

    <h1 style="color:red; font-size: 80px; background-color: pink;"> Topics for today </h1>

    <h1 style="color:red; font-size: 80px; background-color: pink;">Post Session Links</h1>
</body>

</html>
```

**Basic sample with CSS**

```html
<!DOCTYPE html>
<html>

<head>
    <!-- Refer CSS/Javascript/Icons -->
    <style>
        .heading-style {
            color: green;
            font-size: 80px;
            background-color: pink;
        }
    </style>
</head>

<body>
    <!-- Design -->
    <h1 class="heading-style">Welcome to the session</h1>
    <h2> This is our second session </h2>

    <h1 class="heading-style"> Topics for today </h1>

    <h1 class="heading-style">Post Session Links</h1>
</body>

</html>
```

**Basic sample with CSS in separate file**

```html
<!DOCTYPE html>
<html>

<head>
    <!-- Refer CSS/Javascript/Icons -->
    <link href="style.css" rel="stylesheet">
</head>

<body>
    <!-- Design -->
    <h1 class="heading-style">Welcome to the session</h1>
    <h2> This is our second session </h2>

    <h1 class="heading-style"> Topics for today </h1>

    <h1 class="heading-style">Post Session Links</h1>

    <a href="contact.html">Contact Details can be found here</a>
</body>

</html>
```

```css
.heading-style {
  color: green;
  font-size: 80px;
  background-color: pink;
}
```
