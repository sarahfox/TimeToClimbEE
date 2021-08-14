import './TimeToClimbEE.css';
import About from './About.js';

import "antd/dist/antd.css";

import { Layout, Tabs } from 'antd';

const { TabPane } = Tabs;
const { Header, Content } = Layout;

function TimeToClimbEE() {
  return (
    <Layout className="TimeToClimbEE">
	    <Header className="TimeToClimbEEHeader">
			<h1>
				Time to Climb - Overengineered Edition
			</h1>
	    </Header>
		<Content>
		    <Tabs defaultActiveKey="1">
			    <TabPane tab="Flight Plan" key="1">
			      Flight Plan
			    </TabPane>
			    <TabPane tab="Aircraft Performance" key="2">
			      Aircraft Performance
			    </TabPane>
			    <TabPane tab="About this App" key="3">
			      <About />
			    </TabPane>
		    </Tabs>
		</Content>
    </Layout>
  );
}

export default TimeToClimbEE;
