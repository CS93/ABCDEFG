package de.fhdw.bfws114a.challenge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import de.fhdw.bfws114a.data.Constants;

public class Init extends Activity {

	private Data mData;
	private Gui1 mGui1; //Eine GUI je Fragetyp
	private Gui2 mGui2;
	private Gui3 mGui3; 
	private ApplicationLogic mApplicationLogic;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Im folgenden Log werden der aktuelle User und die Kategorie aus dem Intent geladen und an Data weitergegeben
		initData(savedInstanceState, getIntent().getStringExtra(Constants.KEY_PAR_CURRENT_USER_VALUE), getIntent().getStringExtra(Constants.KEY_PAR_CURRENT_CATEGORY_VALUE));		
//		initGui(); //Guis werden von der Applicationlogi initialisiert, da zun�chst unbekannt ist, welcher Challenge-Typ anzuzeigen ist
		initApplicationLogic();
//		initEventToListenerMapping(); //Da die Gui erst w�hrend der ApplicationLogic angelegt wird, muss auch das EventToListenerMapping versp�tet stattfinden
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		//Aus dem Intent wird der boolean-wert hinsichtlich Korrektheit der Frage zur�ckgeliefert
		mApplicationLogic.answerFromSolution(data.getBooleanExtra(Constants.KEY_RETURN_CHALLENGE_ANSWER_BOOL, false));
		
	}
	
	@Override
	public void onBackPressed() {
		//Sie muss hier �berschrieben werden um nicht zur Karteiauswahl zur�ckzukehren sondern die Statistics.Init zu �ffnen
		//Au�erdem m�ssen Anzahl richtiger und falscher Antworten dieses Lernmodi �berschrieben werden
		
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		mData.saveDataInBundle(outState);
		super.onSaveInstanceState(outState);
	}


	private void initData(Bundle savedInstanceState, String user, String category) {
		mData = new Data(savedInstanceState, this, user, category);
		
	}
	
//	private void initGui() {
//		mGui1 = new Gui1(this); //Fragetyp1 = Checkboxes (Auswahl)
//		mGui2 = new Gui2(this); //Fragetyp2 = Text-Antwort
//		mGui3 = new Gui3(this); //Fragetyp3 = Eigenkontrolle
//		
//	}

	private void initApplicationLogic() {
		mApplicationLogic = new ApplicationLogic(mData, this);
	}

	private void initEventToListenerMapping() {
		new EventToListenerMapping(mGui1, mApplicationLogic);
		
	}
}
