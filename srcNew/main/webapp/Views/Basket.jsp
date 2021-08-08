<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/5/2021
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" href="/Views/Basket.css">
   <script src="/Views/Basket.js"></script>
</head>
<body>
<h1>Shopping Cart</h1>
<br>
<br>

<div class="shopping-cart">
    <form action="/show?action=receipt" method="post">
    <div><a href="/show"  class="btn btn-lg btn-primary text-uppercase" >Buy again</a> </div>

    <div class="column-labels">
        <label class="product-image">Image</label>
        <label class="product-details">Product</label>
        <label class="product-price">Price</label>
        <label class="product-quantity">Quantity</label>
        <label class="product-removal">Remove</label>
        <label class="product-line-price">Total</label>
    </div>
<c:forEach items="${listBasket}" var="Basket" varStatus="loop">
    <div class="product">
        <div class="product-image">
            <img src="${Basket.imageLaptop}">
        </div>
        <div class="product-details">
            <div class="product-title">${Basket.nameLaptop}</div>
            <p class="product-description"> ${Basket.hardwareLaptop}</p>
        </div>
        <div class="product-price">${Basket.priceLaptop}</div>
        <div class="product-quantity">
           <input  name ="numberBuy${loop.index}" type="number" value="${Basket.number}" min="1">
        </div>
        <div class="product-removal">
            <a class="remove-product" href="/show?action=remove&index=${loop.index}" >
                Remove
            </a>
        </div>
        <div class="product-line-price">${Basket.priceLaptop}</div>
    </div>
</c:forEach>


    <div class="totals">
        <div class="totals-item">
            <label>Subtotal</label>
            <div class="totals-value" id="cart-subtotal">0</div>
        </div>


    <button type="submit"  class="checkout">Checkout</button>
    </div>
</form>

</div>
</body>
</html>
