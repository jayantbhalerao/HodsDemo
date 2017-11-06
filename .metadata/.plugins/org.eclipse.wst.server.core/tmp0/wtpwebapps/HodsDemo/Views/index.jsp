<!doctype html>
<html lang="en" ng-app="webixApp">
    <head>
        <meta charset="utf-8">
        <title>Webix - Angular  : Layouts</title>
       <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/flatly/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.4/angular.js"></script>
        <script src="https://angular-ui.github.io/ui-router/release/angular-ui-router.js"></script>

        <link rel="stylesheet" type="text/css" href="https://cdn.webix.com/edge/webix.css">
        <script type="text/javascript" src="https://cdn.webix.com/edge/webix.js"></script>
        <script type="text/javascript" src="JS/index.js"></script>
        <script type="text/javascript" src="JS/controller.js"></script>
        <link rel="stylesheet" type="text/css" href="CSS/cust.css">      
    </head>
    <body ng-controller="TreeController">

        <div webix-ui type="space">
            <div height="35">Super Micro Flow Module </div>
            <div view="resizer"></div>
            <div view="cols" type="wide" margin="10" height="850px">
            
                <div id="" width="250" height="500">
                    <div webix-ui="advanceSearch"></div>
                     <div webix-ui="treeCombo"></div>
                    <div webix-ui="imagebuttons"></div>
                    <input type="text" placeholder="Search" ng-model="app">
                    <input type="button" value="Go" style="width:50px;">
                    <div webix-ui="myTree" webix-data ="data_a" style="height: 500px; overflow-y: scroll"></div>
                </div>
                
                <div view="resizer"></div>
                <div view="tabview" css="headerStyle" ng-controller="addCtrl" style="height: 4px; overflow-y: scroll">
                    <div  id="id_headersup" header="Super Micro Flow">
                        <div webix-ui="comboGroup"></div>
                        <div ui-view></div>
                    </div>
                </div>
            </div>
           
            <div></div>
        </div>
    </body>
</html>