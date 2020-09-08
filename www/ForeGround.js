var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'ForeGround', 'coolMethod', []);
};

module.exports.service2 = function(arg0,success,error){
    exec(success, error, 'ForeGround', 'service2', []);
   
   };
