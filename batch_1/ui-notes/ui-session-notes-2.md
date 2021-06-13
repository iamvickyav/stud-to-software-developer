# UI Session Notes 

## Javascript + JQuery + HTML Template 

JQuery - Javascript Library

$() -> To select an element

### Every JQuery Script begins with 

```js
$(document).ready(function(){

});
```

## Creating an Array in JS

```js
var eletronicItems = [
        {
            image : "img1.png",
            name : "HAVELLS 6A Four-Way Extension Board",
            rating : "4.4",
            reviews : "1,234"
        },
        {
            image : "img2.png",
            name : "Syska Four-Way Extension Board",
            rating : "4.3",
            reviews : "11,344"
        },
        {
            image : "img3.png",
            name : "Anchor Extension Board",
            rating : "3.5",
            reviews : "535"
        },
        {
            image : "img1.png",
            name : "HAVELLS 6A Four-Way Extension Board",
            rating : "4.4",
            reviews : "1,234"
        },
        {
            image : "img1.png",
            name : "HAVELLS 6A Four-Way Extension Board",
            rating : "4.4",
            reviews : "1,234"
        },
        {
            image : "img1.png",
            name : "HAVELLS 6A Four-Way Extension Board",
            rating : "4.4",
            reviews : "1,234"
        }
    ];
```

### How to iterate an Array in JQuery 


```js
$.each(eletronicItems, function(index, electionicItem) {

});
```

### Logging in Console

```js
console.log("Hello")
```

In webpage, right click -> inspect -> console tab 


### Final Content from Demo


```js
$(document).ready(function(){

    var eletronicItems = [
        {
            image : "img1.png",
            name : "HAVELLS 6A Four-Way Extension Board",
            rating : "4.4",
            reviews : "1,234"
        },
        {
            image : "img2.png",
            name : "Syska Four-Way Extension Board",
            rating : "4.3",
            reviews : "11,344"
        },
        {
            image : "img3.png",
            name : "Anchor Extension Board",
            rating : "3.5",
            reviews : "535"
        },
        {
            image : "img1.png",
            name : "HAVELLS 6A Four-Way Extension Board",
            rating : "4.4",
            reviews : "1,234"
        },
        {
            image : "img1.png",
            name : "HAVELLS 6A Four-Way Extension Board",
            rating : "4.4",
            reviews : "1,234"
        },
        {
            image : "img1.png",
            name : "HAVELLS 6A Four-Way Extension Board",
            rating : "4.4",
            reviews : "1,234"
        }
    ];

    $.each(eletronicItems, function(index, electronicItem) {
       var template = document.querySelector("#my-template");
       template.content.querySelector(".element-img").src = "images/" + electronicItem.image;
       template.content.querySelector(".element-title").innerHTML = electronicItem.name;
       template.content.querySelector(".element-rating").innerHTML = electronicItem.rating + ' <i class="fa fa-star" aria-hidden="true"></i>';
       template.content.querySelector(".element-reviews").innerHTML = "(" + electronicItem.reviews + ")";

       var clone = document.importNode(template.content, true); 
       $("#element-print-section").append(clone);
    })
});
```

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

    <style>
        .element-container {
            height: 400px;
            overflow: auto;
        }
    </style>

    <script src="shopping.js"></script>
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

        <h1>Dynamic Eletronics Section</h1>
        <div id="element-print-section" class="row element-container flex-row flex-nowrap">

        </div>
    </div>

    <template id="my-template">
        <div class="element" style="width: 320px; margin: 20px;">
            <div class="row">
                <div class="col" style="text-align: center;">
                    <img class="element-img" src="" width="250px" height="280px">
                </div>
            </div>
            <div class="row">
                <div class="col" style="text-align: center;">
                    <div class="element-title">
                        <!-- Title content comes here -->
                    </div>
                </div>
            </div>
            <div class="row" style="margin: 10px;">
                <div class="col-5" style="text-align: center;">
                    <button type="button" class="btn btn-success element-rating">
                        <!-- Rating content comes here -->
                        <i class="fa fa-star" aria-hidden="true"></i>
                    </button>
                </div>
                <div class="col-3 element-reviews" style="text-align: center;">
                    <!-- Review content comes here -->
                </div>
            </div>
        </div>
    </template>
</body>

</html>
```
