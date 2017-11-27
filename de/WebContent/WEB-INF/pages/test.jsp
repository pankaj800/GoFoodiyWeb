<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container" style="padding-top:20px;">
    <div ng-app="vehicleApp" ng-controller="testingController" class="container">
        <div ng-show="error" class="alert alert-danger alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
            <p>{{ error }}</p>
        </div>

        <div class="modal fade" id="vehicleModel" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">X</button>
                        <h4 class="modal-title" id="myModalLabel" ng-hide="editMode">Add vehicle</h4>
                        <h4 class="modal-title" id="myModalLabel" ng-show="editMode">Edit vehicle: {{ vehicle.Id }}</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" role="form" name="addvehicleform">
                            <div class="form-group">
                                <label for="title" class="col-sm-3 control-label">vehicle Name</label>
                                <div class="col-sm-7">
                                    <input type="text" ng-model="vehicle.Name" class="form-control" id="vehiclename" placeholder="vehicle Name" required title="Enter your vehicle Name" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="title" class="col-sm-3 control-label">Identification Account</label>
                                <div class="col-sm-7">
                                    <input type="number" ng-model="vehicle.vehicleIdentificationAccountId" class="form-control" id="vehicleIdentificationAccountId" placeholder="vehicle Identification Account" required title="Enter your Identification Account" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-3 col-sm-7">
                                    <span ng-hide="editMode">
                                        <input type="submit" value="Add" ng-disabled="addvehicleform.$invalid" ng-click="add()" class="btn btn-primary normal-button" />
                                    </span>
                                    <span ng-show="editMode">
                                        <input type="submit" value="Update" ng-disabled="addvehicleform.$invalid" ng-click="update()" class="btn btn-primary normal-button" />
                                    </span>
                                    <input type="button" value="Cancel" ng-click="cancel()" class="btn btn-primary" />
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <h1>Vehicle List</h1>
        <p><a ng-click="showadd()" href="javascript:;" class="btn btn-primary">Add New vehicle</a></p>
        <table class="table table-striped table-bordered table-hover table-condensed">
            <thead>
                <tr>
                    <th>Vehicle ID</th>
                    <th>Name</th>
                    <th>Identification Account</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <tr ng-hide="agencies || agencies.length > 0">
                    <td colspan="4">
                        <div class="text-center text-warning">
                            <strong>No Agencies Retrieved</strong>
                        </div>
                    </td>
                </tr>

                <tr ng-repeat="vehicle in agencies">
                    <td>{{vehicle.Id}}</td>
                    <td>{{vehicle.Name}}</td>
                    <td>{{vehicle.vehicleIdentificationAccountId}}</td>
                    <td>
                        <a ng-click="get(vehicle)" href=""><span class="glyphicon glyphicon-open"></span>View</a>
                        &nbsp;
                        <a ng-click="edit(vehicle)" href=""><span class="glyphicon glyphicon-edit"></span>Edit</a>
                        &nbsp;
                        <a ng-click="showConfirm(vehicle)" href=""><span class="glyphicon glyphicon-remove-circle"></span>Delete</a>
                    </td>
                </tr>
            </tbody>
        </table>

        <hr />

        <div class="modal fade" id="viewModal" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">X</button>
                        <h4 class="modal-title" id="myModalLabel">View vehicle Detail</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal" role="form" name="viewuser">
                            <div class="form-group">
                                <label for="ID" class="col-sm-3 control-label">ID</label>
                                <div class="col-sm-7">
                                    {{vehicle.Id}}
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="Name" class="col-sm-3 control-label">Name</label>
                                <div class="col-sm-7">
                                    {{vehicle.Name}}
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="vehicleIdentificationAccountId" class="col-sm-3 control-label">Identification Account</label>
                                <div class="col-sm-7">
                                    {{vehicle.vehicleIdentificationAccountId}}
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="confirmModal" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">X</button>
                        <h4 class="modal-title" id="myModalLabel">Confirm</h4>
                    </div>
                    <div class="modal-body">
                        Are you sure you want to delete vehicle: {{ vehicle.Name}}?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-warning" ng-click="delete()" style="width:100px;">Ok</button>
                        <button type="button" class="btn btn-primary" data-dismiss="modal" style="width:100px;">Cancel</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>