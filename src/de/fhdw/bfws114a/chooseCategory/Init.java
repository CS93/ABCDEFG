package de.fhdw.bfws114a.chooseCategory;

import android.app.Activity;
import android.os.Bundle;
import de.fhdw.bfws114a.data.Constants;

public class Init extends Activity {

	private Data mData;
	private Gui mGui;
	private ApplicationLogic mApplicationLogic;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		

		//Der zweite Parameter den aktuellen User als String
		initData(savedInstanceState, getIntent().getStringExtra(Constants.KEY_PAR_CURRENT_USER_VALUE));		
		initGui();
		initApplicationLogic();
		initEventToListenerMapping();
		
					
	}

	private void initData(Bundle savedInstanceState, String user) {
		mData = new Data(savedInstanceState, this,  user);
		
	}
	
	private void initGui() {
		mGui = new Gui(this);
		
	}

	private void initApplicationLogic() {
		mApplicationLogic = new ApplicationLogic(mData, mGui);
	}

	private void initEventToListenerMapping() {
		new EventToListenerMapping(mGui, mApplicationLogic);
		
	}
	



}
