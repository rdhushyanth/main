var React = require('react');
var ReactDOM = require('react-dom');
var myview_1 = require("./myview");
function main(el) {
    var divcode = React.createElement(myview_1.MyView, {"foo": "not so dummy"}, "  ");
    ReactDOM.render(divcode, el);
}
exports.main = main;
