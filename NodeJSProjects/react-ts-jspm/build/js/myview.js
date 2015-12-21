"use strict";
var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var React = require('react');
var material_ui_1 = require('material-ui');
var MyView = (function (_super) {
    __extends(MyView, _super);
    function MyView() {
        _super.apply(this, arguments);
    }
    MyView.prototype.render = function () {
        return (React.createElement("div", null, React.createElement(material_ui_1.FlatButton, {label: this.props.foo, primary: true}, " ")));
    };
    MyView.defaultProps = {
        foo: "dummy"
    };
    return MyView;
})(React.Component);
exports.MyView = MyView;
//# sourceMappingURL=myview.js.map