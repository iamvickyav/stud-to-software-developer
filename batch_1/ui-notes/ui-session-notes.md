# UI Session Notes

## Tools

* Visual Studio Code
* Live Server Plugin
  * Live Server by Ritwick Dey


## Understanding

* http://127.0.0.1/ -> localhost are same
* Library -> Somebody created it. We are just going to use it

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

**Create Javascript to change value in document**

```html
<!DOCTYPE html>
<html>

<head>
    <!-- Refer CSS/Javascript/Icons -->
    <link href="style.css" rel="stylesheet">
    <script>
        function increment() {
            var currentCount = parseInt(document.getElementById("result").innerHTML);
            currentCount = currentCount + 1;
            document.getElementById("result").innerHTML = currentCount;
        }
    </script>
</head>

<body>
    <!-- Design -->
    <h1 class="heading-style">Welcome to the session</h1>

    <h2>Click Counter Sample</h2>
    <button onclick="increment()">Click me</button>
    <h2>You have clicked : </h2>
    <h2 id="result">0</h2>
</body>

</html>
```

**Javascript in separate file**

```html
<!DOCTYPE html>
<html>

<head>
    <!-- Refer CSS/Javascript/Icons -->
    <link href="style.css" rel="stylesheet">
    <script src="script.js">
    </script>
</head>

<body>
    <!-- Design -->
    <h1 class="heading-style">Welcome to the session</h1>

    <h2>Click Counter Sample</h2>
    <button onclick="increment()">Click me</button>
    <h2>You have clicked : </h2>
    <h2 id="result">0</h2>
</body>

</html>
```

```js
function increment() {
    var currentCount = parseInt(document.getElementById("result").innerHTML);
    currentCount = currentCount + 1;
    document.getElementById("result").innerHTML = currentCount;
}
```

## Bootstrap

### How to include Bootstrap library

```html
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>

    <!-- Slim version breaks AJAX Calls-->
    <!-- <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script> -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</head>
```

## How Bootstrap behaves

* It segregate the webpage into 12 equal halves

```html
<!DOCTYPE html>
<html>

<head>
    <!-- For Reference, use https://getbootstrap.com/docs/5.0/getting-started/introduction/ -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>

    <!-- Slim version breaks AJAX Calls-->
    <!-- <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
                crossorigin="anonymous"></script> -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</head>

<body>
    <nav class="navbar navbar-dark bg-primary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                <img src="/images/icon.svg" alt="" width="45" height="40" class="d-inline-block align-text-top">
                Shopper's Stop
            </a>
        </div>
    </nav>

    <div class="container">
        <div class="row" style="height:100px">
            <div class="col" style="background-color: orange;">
                RAVI
            </div>
            <div class="col" style="background-color: red;">
                1
            </div>
            <div class="col" style="background-color: aqua;">
                2
            </div>
            <div class="col" style="background-color: brown;">
                6
            </div>
            <div class="col" style="background-color: orange;">
                RAVI
            </div>
        </div>
        <div class="row" style="height:200px">
            <div class="col" style="background-color: green;">
                3
            </div>
            <div class="col" style="background-color: yellow;">
                4
            </div>
            <div class="col" style="background-color: pink;">
                5
            </div>
        </div>
    </div>
</body>

</html>
```

## Design of single element 

```html
<!DOCTYPE html>
<html>

<head>
    <!-- For Reference, use https://getbootstrap.com/docs/5.0/getting-started/introduction/ -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>

    <!-- Slim version breaks AJAX Calls-->
    <!-- <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
                crossorigin="anonymous"></script> -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

    <!-- Font Awesome CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
    <nav class="navbar navbar-dark bg-primary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                <img src="/images/icon.svg" alt="" width="45" height="40" class="d-inline-block align-text-top">
                Shopper's Stop
            </a>
        </div>
    </nav>

    <div class="container">
        <div class="element" style="width: 320px;">
            <div class="row">
                <div class="col" style="text-align: center;">
                    <img src="images/img1.png" width="250px" height="280px">
                </div>
            </div>
            <div class="row">
                <div class="col" style="text-align: center;">
                    HAVELLS 6A Four-Way Extension Board
                </div>
            </div>
            <div class="row" style="margin: 10px;">
                <div class="col-5" style="text-align: center;">
                    <button type="button" class="btn btn-success">
                        4.4
                        <i class="fa fa-star" aria-hidden="true"></i>
                    </button>
                </div>
                <div class="col-3" style="text-align: center;">
                    (1,234)
                </div>
            </div>
        </div>
    </div>
</body>

</html>
```
