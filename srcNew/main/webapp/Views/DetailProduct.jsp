<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/5/2021
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link href="/Views/DetailProduct.css">
</head>
<body>
<div class="container">

    <hr>


    <div class="card">
        <div class="row">
            <aside class="col-sm-5 border-right">
                <article class="gallery-wrap">
                    <div class="img-big-wrap">
                        <div><a href="#"><img src="${Laptop.image}" width="100%"></a></div>
                    </div> <!-- slider-product.// -->
                </article> <!-- gallery-wrap .end// -->
            </aside>
            <aside class="col-sm-7">
                <article class="card-body p-5">
                    <h3 class="title mb-3">${Laptop.name}</h3>

                    <p class="price-detail-wrap">
	<span class="price h3 text-warning">
		<span class="currency">${Laptop.price}</span>
	</span>

                    </p> <!-- price-detail-wrap .// -->
                    <dl class="item-property">
                        <dt>Description</dt>
                        <dd><p>${Laptop.description} </p></dd>
                    </dl>
                    <dl class="param param-feature">
                        <dt>Trademark</dt>
                        <dd>${Laptop.trademark}</dd>
                    </dl>  <!-- item-property-hor .// -->
                    <dl class="param param-feature">
                        <dt>HarkWare</dt>
                        <dd>${Laptop.hardWare}</dd>
                    </dl>  <!-- item-property-hor .// -->
                    <dl class="param param-feature">
                        <dt>ProductionTime</dt>
                        <dd>${Laptop.productionTime}</dd>
                    </dl>  <!-- item-property-hor .// -->
                    <dl class="param param-feature">
                        <dt>Number</dt>
                        <dd>${Laptop.number}</dd>
                    </dl>
                    <hr>
                    <div class="row">
                        <div class="col-sm-5">

                        </div> <!-- col.// -->
                        <div class="col-sm-7">

                        </div> <!-- col.// -->
                    </div> <!-- row.// -->
                    <hr>
                    <a href="/show?action=basketNow&indexLaptop=${Laptop.id}&number=1" class="btn btn-lg btn-primary text-uppercase"> Buy now </a>
                    <a href="/show?action=basket&indexLaptop=${Laptop.id}&number=1" class="btn btn-lg btn-outline-primary text-uppercase"> <i
                            class="fas fa-shopping-cart"></i> Add to cart </a>
                </article> <!-- card-body.// -->
            </aside> <!-- col.// -->
        </div> <!-- row.// -->
    </div> <!-- card.// -->


</div>
<!--container.//-->




</body>
</html>
