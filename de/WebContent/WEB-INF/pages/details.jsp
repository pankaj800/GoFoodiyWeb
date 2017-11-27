 <div class="box box-info">
<form id="showDetailsFormId">
<div class="main">
      <div class="one">
        <div class="">
          <h3>Manage your account</h3>
          
            <div style="width: 450px">
             <label style="width: 160px;color:#337ab7" for="name"> Restaurant Name*:</label>
             <input id="restaurantNameId" class="detailInputElmnt" ng-disabled="true"  style="width: 200px;border-radius:3px" type="text" id="restaurantName" spellcheck="false" placeholder="Enter the Restaurant Name" />
            </div>
            <div style="width: 450px">
              <label style="width: 160px;color:#337ab7" for="email">Restaurant Type*:</label>
            <Select id="restaurantTypeId"  name="restaurantType" value=""  ng-disabled="true"><option value="AC">AC</option><option value="AC">Non AC</option></Select></div><br>
<div >
<label style="width: 160px;color:#337ab7" >Restaurant Timings:</label>
<Select  name="startTime" value="" id="restaurantStartTimingId"  ng-disabled="true">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>

</Select>
            
            
            <input type="radio" name="starttimeamorpm" id="startTimeamId" value="am" ng-disabled="true" >am</input>
<input type="radio" name="starttimeamorpm" value="pm"  id="startTimepmId" ng-disabled="true">pm</input>

<Select  name="stopTime"  id="restaurantStopTimingId" value=""  ng-disabled="true">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
</Select>
<input type="radio" name="stoptimeamorpm" value="am" id="stopTimeamId" ng-disabled="true">am</input>
<input type="radio" name="stoptimeamorpm" value="pm" id="stopTimepmId"  ng-disabled="true">pm</input>
</div>
            
            <div style="width: 450px">
              <label style="width: 160px;color:#337ab7">Seat Capacity*:</label>
              <input class="detailInputElmnt" style="width: 200px;border-radius:3px" type="text" id="seatCapacityId"  ng-disabled="true" />
            </div>
            
             <div style="width: 450px">
              <label style="width: 160px;color:#337ab7">Phone Number*:</label>
              <input class="detailInputElmnt" style="width: 200px;border-radius:3px" type="text" id="seatCapacityId"  ng-disabled="true" />
            </div>
            
<div style="width: 450px">
              <label style="width: 160px;color:#337ab7">Food Type served*:</label>     
              <input class="detailInputElmnt"  style="width: 200px;border-radius:3px" type="text" id="foodTypeServedId" ng-disabled="true" />
          </div>
          
          
          <div style="width: 560px">
              <label style="width: 160px;color:#337ab7">Description:</label>     
              <textarea class="detailInputElmnt"  ng-disabled="true" id="descriptionId" style="border-radius:3px" rows="5" cols="60" placeholder="write something about your restaurant.."></textarea>
                        </div>
                        
                        <div style="width: 450px">
              <label style="width: 160px;color:#337ab7">Food Type served*:</label>     
              <input class="detailInputElmnt"  style="width: 200px;border-radius:3px" type="text" id="foodTypeServedId" ng-disabled="true" />
          </div>
          
           <div style="width: 450px">
              <label style="width: 160px;color:#337ab7">Address*:</label>     
              </div>
                        <div style="width: 900px">
              <label style="width: 160px;color:#337ab7">Line1*:</label>     
              <input class="detailInputElmnt"  style="width: 200px;border-radius:3px" type="text" id="foodTypeServedId" ng-disabled="true" />
         
          <label style="width: 160px;color:#337ab7">Line2*:</label>     
              <input class="detailInputElmnt"  style="width: 200px;border-radius:3px" type="text" id="foodTypeServedId" ng-disabled="true" />
          
          </div>
          
           <div style="width: 450px">
              <label style="width: 160px;color:#337ab7">City*:</label>     
              <input class="detailInputElmnt"  style="width: 200px;border-radius:3px" type="text" id="foodTypeServedId" ng-disabled="true" />
          </div>
           <div style="width: 450px">
              <label style="width: 160px;color:#337ab7">Pin*:</label>     
              <input class="detailInputElmnt"  style="width: 200px;border-radius:3px" type="text" id="foodTypeServedId" ng-disabled="true" />
          </div>
           <div style="width: 450px">
              <label style="width: 160px;color:#337ab7">State*:</label>     
              <input class="detailInputElmnt"  style="width: 200px;border-radius:3px" type="text" id="foodTypeServedId" ng-disabled="true" />
          </div>
                        
                       <div style="width: 560px">
                       <input type="button" value="save"  style="width:70px;margin-left:10px ;border-radius:3px;background-color:#337ab7;color:white" ng-click="saveAndReadOnly();">  
                       <input type="button" value="Edit" style="width:70px;border-radius:3px;background-color:#337ab7;color:white" ng-click="makeEditable();">
                     </div>  
                     <br> 
        </div>
      </div>
   </div>
</form>
</div>
