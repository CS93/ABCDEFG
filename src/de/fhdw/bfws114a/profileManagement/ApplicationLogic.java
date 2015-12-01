package de.fhdw.bfws114a.profileManagement;

import android.util.Log;
import de.fhdw.bfws114a.profileManagement.Data;
import de.fhdw.bfws114a.profileManagement.Gui;

public class ApplicationLogic {

	private Data mData;
	private Gui mGui;
	
	ApplicationLogic(Data data, Gui gui){
		mData=data;
		mGui=gui;
		applyDataToGui();
	}

	private void applyDataToGui() {
		mGui.setChoiceList(mData.getUser());		
		
	}
	
	public void onAddUserClicked(){
		Log.d("DEBUG", "Der AddUser Button wurde gedrückt");
		mData.getDataInterface().addUser(mData.getUser(), mGui.getAddUser().getText().toString()); //Am Besten diesen Teil in den Activityaufruf
		//Aktvity schlie�en
		mData.getActivity().finish();
	}
		
	
	public void onDelUserButtonClicked(){
		mData.getDataInterface().delUser(mData.getUser(), mGui.getChoiceList().getSelectedItem().toString());
//		kommt man an das Ausgew�hlte Element: mGui.getChoiceList().getSelectedItem().toString()
		//Aktvity schlie�en
		mData.getActivity().finish();
	}
	
//	public void processActivityReturnValues(int requestCode, int resultCode, Intent intent) {
//		if(resultCode==Activity.RESULT_OK) {
//			if(requestCode==Constants.REQUESTCODE_ACTIVITY_EDIT) {
//				int value;
//				value = intent.getIntExtra(Constants.KEY_RETURN_COUNTER_VALUE, mData.getCounterValue());
//				mData.setCounterValue(value);
//				mGui.setCounterValue(value);
//			}
//		}
//	}
	
}
