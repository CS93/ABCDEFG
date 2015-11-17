package de.fhdw.bfws114a.login;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import de.fhdw.bfws114asc.counter1.R;

public class Gui {
	
	private Button mLoginButton, mProfileManagementButton;
	private Spinner mChoiceList;
	//Beim initialisieren mancher Objekte ist der Context notwendig. 
	//Um auf diesen jederzeit zugreifen zu k�nnen wird er hier als static definiert	
	private Context context;

	public Gui(Activity act) {
		act.setContentView(R.layout.activity_login);
		context = act;
		mLoginButton = (Button) act.findViewById(R.id.login);
		mProfileManagementButton = (Button) act.findViewById(R.id.profile_management_start);		
		mChoiceList = (Spinner) act.findViewById(R.id.choose_profile);
	}

	public Button getLoginButton() {
		return mLoginButton;
	}

	public Button getProfileManagementButton() {
		return mProfileManagementButton;
	}

	public Spinner getChoiceList() {
		return mChoiceList;
	}
	
	public void setChoiceList(ArrayList<String> choiceList) {		
		ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, choiceList);
		mChoiceList.setAdapter(spinnerAdapter);
		
	}	
}
