package de.fhdw.bfws114a.statistics;

import android.view.View;
import android.view.View.OnClickListener;
import de.fhdw.bfws114a.lernKartei.R;

public class EventToListenerMapping implements OnClickListener {

	private ApplicationLogic mApplicationLogic;

	public EventToListenerMapping(Gui gui, ApplicationLogic applicationLogic){
		mApplicationLogic = applicationLogic;
		gui.getContinueButton().setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		mApplicationLogic.onContinueClicked();
		
	}
	
}
