<div>
<!-- <div id="vegId" style="background-color: #222d32;height: 30px;width:200px;border-radius:2px;"><h3 style="color:white" ng-mouseover="changeCursorPointer('vegId');" ng-mouseleave="changeCursorNormal('vegId');"  ng-click="getVegFood();">Veg</h3></div> -->
<div id="vegId" class="info-box" style="height: 30px;width:200px"  ng-mouseover="changeCursorPointer('vegId');" ng-mouseleave="changeCursorNormal('vegId');"  ng-click="getVegFood();">
            <span class="info-box-icon bg-green"></span>

            <div class="info-box-content">
              <span class="info-box-text">Vegetarian</span>
            </div>
            <!-- /.info-box-content -->
          </div>


<div id="nonVegId" class="info-box" style="height: 30px;width:200px" ng-mouseover="changeCursorPointer('nonVegId');" ng-mouseleave="changeCursorNormal('nonVegId');"  ng-click="getNonVegFood();">
            <span class="info-box-icon bg-reddish">
</span>
            <div class="info-box-content">
              <span class="info-box-text">Non Vegetarian</span>
            </div>
            <!-- /.info-box-content -->
          </div>
<div id="beveragesId" class="info-box" style="height: 30px;width:200px" ng-mouseover="changeCursorPointer('beveragesId');" ng-mouseleave="changeCursorNormal('beveragesId');"  ng-click="getBeverages();">
            <span class="info-box-icon bg-aquaish"></span>

            <div class="info-box-content">
              <span class="info-box-text">Beverages</span>
            </div>
            <!-- /.info-box-content -->
          </div>

<!-- <div id="nonVegId" style="background-color: #222d32;height: 30px;width:200px;border-radius:2px;"><h3 style="color:white" ng-mouseover="changeCursorPointer('nonVegId');" ng-mouseleave="changeCursorNormal('nonVegId');"  ng-click="getNonVegFood();">Non-Veg</h3></div>-->
<!-- <div id="beveragesId" style="background-color: #222d32;height: 30px;width:200px;border-radius:2px;"><h3 style="color:white" ng-mouseover="changeCursorPointer('beveragesId');" ng-mouseleave="changeCursorNormal('beveragesId');"  ng-click="getBeverages();">beverages</h3></div>-->
<a href="extras.htm">click here</a>
<div class ="box box-success ScrollStyle" ng-show="showVegDishesFlag">
<div class="box-header with-border">
              <h2 class="box-title"><strong>Veggies in store</strong></h2>
              </div>

<div  id="multilayoutIdVeg" class="multilayout">
<ul  class=" users-list clearfix" id ="displayVegId" ng-repeat="vegFood in vegFoodArray track by $index" class=" users-list clearfix">
<li id="{{$index}}">
<div style="width: 110px;height: 90px" class="restaurantItem">

<img  alt="" src="resources/images/1371595164628.jpeg" width="80px" height="60px" style="border-radius:2px">
<span class="users-list-name" id="" ng-bind="removeColon(vegFood.restaurant_id);"></span>
<input type="hidden" name="">
</div>
</li>

</ul>
</div>
</div>
<!-- chat start -->
<div class ="box box-success ScrollStyle" ng-show="showNonVegDishesFlag">
<div class="box-header with-border">
              <h2 class="box-title"><strong>NonVeg Dishes in store</strong></h2>
              </div>
<div  id="multilayoutIdNonVeg" class="multilayout">

<ul class=" users-list clearfix" id ="displayNonVegId" ng-repeat="vegFood in vegFoodArray track by $index" >
<li id="{{$index}}">
<div style="width: 110px;height: 90px" class="restaurantItem">

<img  alt="" src="resources/images/chicken-leg_318-36078.jpg" width="80px" height="60px" style="border-radius:2px">
<span class="users-list-name" id="" ng-bind="removeColon(vegFood.restaurant_id);"></span>
<input type="hidden" name="">
</div>
</li>

</ul>
</div>
</div>
<!-- chat stop -->
<div class ="box box-success ScrollStyle" ng-show="showBeveragesFlag">
<div class="box-header with-border">
              <h2 class="box-title"><strong>Beveragres in store</strong></h2>
              </div>
<div  id="multilayoutIdbeverages" class="multilayout">

<ul class=" users-list clearfix" id ="displayBeveragesId" ng-repeat="vegFood in vegFoodArray track by $index" >
<li id="{{$index}}">
<div style="width: 110px;height: 90px" class="restaurantItem">
<img  alt="" src="resources/images/summer_whiskey_cocktails_teaser.jpg" width="80px" height="60px" style="border-radius:2px">
<span class="users-list-name" id="" ng-bind="removeColon(vegFood.restaurant_id);"></span>
<input type="hidden" name="">
</div>
</li>

</ul>
</div>
</div>
</div>

<br>
  <button type="button"  data-toggle="modal"style="background-color:#337ab7;color:white;height:30px;width: 150px" data-target="#myModal">Add New Item</button>

<!--  pankaj modl start-->

 <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title" align="center">Modal Header</h4>
        </div>
        <form>
        <div class="modal-body">
        
          <p>Enter a new dish.</p>
          <label>Dish name:</label>
          <input type="text" placeholder="Enter the dish name"  name="dishname"><br>
           <label>Dish Type:</label>
           <select>
           <option value="vegetarian">Vegetarian</option>
            <option value="nonvegetarian">Non vegetarian</option>
            <option value="beverage">beverage</option>
           </select>
          <br>
           <label>Upload an image:</label>
           <input type="file" name="">
        </div>
        <div class="modal-footer">
          <button type="button" style="background-color:#337ab7;width:106px;height:34px;color:white;float:left !important" data-dismiss="modal">Cancel</button>
                    <button  type="button"   style="background-color:#337ab7;width:106px;height:34px;color:white" data-dismiss="modal">ok</button>
          
        </div>
        </form>
      </div>
      
    </div>
  </div>

<!-- pankaj modal stop -->
</div>