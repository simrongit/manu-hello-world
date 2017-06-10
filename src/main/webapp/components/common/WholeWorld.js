angular.module('wholeWorldApp', ['ngAnimate', 'ngSanitize', 'ui.bootstrap']);
angular.module('wholeWorldApp').controller('wholeWorldCtrl', function ($scope) {
  $scope.isNavCollapsed = true;
  $scope.isCollapsed = false;
  $scope.isCollapsedHorizontal = false;
});