import * as React from 'react';
import * as ReactDOM from 'react-dom';
import App from './components/App';
export function main(el: HTMLElement): void {

// in this example, we create only  simple div code which will be
// put under <div id='content'> </div> defined in index.html
var divcode = <App />
ReactDOM.render(divcode, el);
}
