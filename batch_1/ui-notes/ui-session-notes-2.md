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
