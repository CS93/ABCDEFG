package de.fhdw.bfws114a.chooseCategory;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EventToListenerMapping implements OnClickListener {

	private ApplicationLogic mApplicationLogic;

	public EventToListenerMapping(Gui gui, ApplicationLogic applicationLogic){
		mApplicationLogic = applicationLogic;
		for(int i=0; i < gui.getCategories().length; i++){
			gui.getCategory(i).setOnClickListener(this);
		}
	}

	@Override
	public void onClick(View v) {
		//Beim Klick wird v zun�chst zum Button gecastet und daraufhin als String an die Methode onCategoryClicked() �bergeben
		Button b = (Button) v;
		mApplicationLogic.onCategoryClicked(b.getText().toString());		
	}
	
}
