# Shopping Site Sample

```html
<html>
  <head>
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous"
    />

    <script
      src="https://code.jquery.com/jquery-3.4.1.min.js"
      integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
      crossorigin="anonymous"
    ></script>

    <!-- Slim version breaks AJAX Calls-->
    <!-- <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script> -->
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
      integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
      integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
      crossorigin="anonymous"
    ></script>

    <!-- For loading Icons-->
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link rel="stylesheet" href="style.css" />
    <script src="script.js"></script>
  </head>

  <body>
    <nav class="navbar navbar-dark bg-dark justify-content-between">
      <a class="navbar-brand" href="#">
        <img
          src="images/shops.svg"
          width="30"
          height="30"
          class="d-inline-block align-top"
          alt=""
        />
        <span style="margin-left: 10px;">BookBazzar</span>
      </a>
      <form class="form-inline">
        <input
          class="form-control mr-sm-2"
          type="search"
          placeholder="Search"
          aria-label="Search"
        />
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">
          Search
        </button>
      </form>
    </nav>
    <hr />

    <div class="container">
      <div
        class="row scrollable flex-row flex-nowrap"
        id="search-results"
      ></div>
    </div>

    <template id="search-result-template">
      <div style="width:200px; margin:20px;">
        <div class="row">
          <div class="col-12">
            <img
              class="search-img"
              src="images/java_1.jpeg"
              width="200"
              height="280"
            />
          </div>
        </div>
        <div class="row">
          <div class="col-12">
            <h6 class="search-name">Java complete reference</h6>
          </div>
        </div>
        <div class="row">
          <div class="col-4">
            <span>
              <button
                type="button"
                class="btn btn-success btn-sm search-rating"
              >
                4.3
                <i class="fa fa-star" aria-hidden="true"></i>
              </button>
            </span>
          </div>
          <div class="col-8 search-review">Reviews (1,234)</div>
        </div>
        <div class="row" style="margin-left: 2px; margin-top: 4px;">
          <h5 class="search-price"><b>$ 590</b></h5>
        </div>
      </div>
    </template>
  </body>
</html>
```

```css
.scrollable {
  height: 400px;
  overflow: auto;
}
```

```js
$(document).ready(function () {
  var books = [
    {
      id: '1',
      img: 'java_1.jpeg',
      name: 'Java the beacon',
      rating: '4',
      review: '1234',
      price: '$ 20',
    },
    {
      id: '2',
      img: 'java_1.jpeg',
      name: 'Java Complete Reference',
      rating: '3.5',
      review: '1234',
      price: '$ 20',
    },
    {
      id: '3',
      img: 'java_1.jpeg',
      name: 'Java the beast',
      rating: '4.1',
      review: '1234',
      price: '$ 20',
    },
    {
      id: '3',
      img: 'java_1.jpeg',
      name: 'Java the beast',
      rating: '4.1',
      review: '1234',
      price: '$ 20',
    },
    {
      id: '3',
      img: 'java_1.jpeg',
      name: 'Java the beast',
      rating: '4.1',
      review: '1234',
      price: '$ 20',
    },
    {
      id: '3',
      img: 'java_1.jpeg',
      name: 'Java the beast',
      rating: '4.1',
      review: '1234',
      price: '$ 20',
    },
    {
      id: '3',
      img: 'java_1.jpeg',
      name: 'Java the beast',
      rating: '4.1',
      review: '1234',
      price: '$ 20',
    },
    {
      id: '3',
      img: 'java_1.jpeg',
      name: 'Java the beast',
      rating: '4.1',
      review: '1234',
      price: '$ 20',
    },
  ];

  $.each(books, function (i, book) {
    var t = document.querySelector('#search-result-template');
    t.content.querySelector('.search-name').innerHTML = book.name;
    t.content.querySelector('.search-rating').innerHTML =
      book.rating + " <i class='fa fa-star' aria-hidden='true'></i>";
    t.content.querySelector('.search-img').src = 'images/' + book.img;
    var clone = document.importNode(t.content, true);
    $('#search-results').append(clone);
  });
});
```

## Static Design Final

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
        <div class="row element-container flex-row flex-nowrap">
            <div class="element" style="width: 320px; margin: 20px;">
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
            <div class="element" style="width: 320px; margin: 20px;">
                <div class="row">
                    <div class="col" style="text-align: center;">
                        <img src="images/img2.png" width="250px" height="280px">
                    </div>
                </div>
                <div class="row">
                    <div class="col" style="text-align: center;">
                        Syska Four-Way Extension Board
                    </div>
                </div>
                <div class="row" style="margin: 10px;">
                    <div class="col-5" style="text-align: center;">
                        <button type="button" class="btn btn-success">
                            4.3
                            <i class="fa fa-star" aria-hidden="true"></i>
                        </button>
                    </div>
                    <div class="col-3" style="text-align: center;">
                        (234)
                    </div>
                </div>
            </div>
            <div class="element" style="width: 320px; margin: 20px;">
                <div class="row">
                    <div class="col" style="text-align: center;">
                        <img src="images/img3.png" width="250px" height="280px">
                    </div>
                </div>
                <div class="row">
                    <div class="col" style="text-align: center;">
                        Anchor Extension Board
                    </div>
                </div>
                <div class="row" style="width: 320px; margin: 20px;">
                    <div class="col-5" style="text-align: center;">
                        <button type="button" class="btn btn-success">
                            4.2
                            <i class="fa fa-star" aria-hidden="true"></i>
                        </button>
                    </div>
                    <div class="col-3" style="text-align: center;">
                        (32,454)
                    </div>
                </div>
            </div>
            <div class="element" style="width: 320px; margin: 20px;">
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
            <div class="element" style="width: 320px; margin: 20px;">
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
            <div class="element" style="width: 320px; margin: 20px;">
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
    </div>
</body>

</html>
```
