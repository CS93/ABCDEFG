package de.fhdw.bfws114a.challenge;

import de.fhdw.bfws114a.dataInterface.Challenge;

public class ApplicationLogic {
	private Data mData;
	private Gui1 mGui1;
	private Gui2 mGui2;
	private Gui3 mGui3;
	private int indexOfCurrentChallenge = 0;
	private int currentQuestionType;
	
	ApplicationLogic(Data data, Gui1 gui1, Gui2 gui2, Gui3 gui3){
		mData=data;
		mGui1=gui1;
		mGui2=gui2;
		mGui3=gui3;
		applyDataToGui();
	}

	private void applyDataToGui(){
		Challenge currentChallenge = mData.getFaelligeChallenges().get(indexOfCurrentChallenge);
		currentQuestionType = currentChallenge.getFrageTyp();
		if(currentQuestionType == 1){
			applyDataToGui1(currentChallenge);
		}
		
		if(currentQuestionType == 2){
			applyDataToGui2(currentChallenge);
		}
		
		if(currentQuestionType == 3){
			applyDataToGui3(currentChallenge);
		}
	}
	
	//Wenn es FrageTyp 1 ist diese Methode ausf�hren
	private void applyDataToGui1(Challenge currentChallenge) {
		mGui1.getQuestion().setText(currentChallenge.getFrage());
		for(int i = 0; i < 6; i++){
			mGui1.getOption(i).setText(currentChallenge.getAntwort(i));
		}
		mGui1.showThisGui();
	}
	
	//Wenn es FrageTyp 2 ist diese Methode ausf�hren
	private void applyDataToGui2(Challenge currentChallenge) {
		mGui2.getQuestion().setText(currentChallenge.getFrage());
	}
		
	//Wenn es FrageTyp 3 ist diese Methode ausf�hren
	private void applyDataToGui3(Challenge currentChallenge) {
		mGui3.getQuestion().setText(currentChallenge.getFrage());	
	}
		
	
	public void onContinueClicked(){
		//�berpr�fen der Antworten aus der entsprechenden Gui (1, 2 oder 3) und einblenden der Solution.
		
		indexOfCurrentChallenge++;
//		Navigation.startActivityChallenge(mData.getActivity(), mData.getUser(), category);
	}
}

