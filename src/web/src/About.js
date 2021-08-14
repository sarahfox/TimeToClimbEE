import './About.css';
import React from 'react';

class About extends React.Component {
	render() {
		return (
			<div className="About">
				<p>Time to Climb is a calculator for pilots to calculate how long it will take a given aircraft to climb from a given elevation to a given elevation.
			</p>
				<p>This version is severely overengineered for what it's doing.  It could be done as a pure JS app (the original version was), but I need a project I can show off to demonstrate my coding skills.
			</p>
			</div>
		);
	}
}

export default About;
