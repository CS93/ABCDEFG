package de.fhdw.bfws114a.Navigation;

import android.app.Activity;
import android.content.Intent;
import android.widget.CheckBox;
import de.fhdw.bfws114a.data.Constants;
import de.fhdw.bfws114a.dataInterface.Challenge;

public class Navigation {
	
	/*
	private static final Class<?> ACTIVITY_MAIN_CLASS = 
			de.fhdw.bfws114a.he.activities.main.Init.class;
			*/
	private static final Class<?> ACTIVITY_LOGIN_CLASS = de.fhdw.bfws114a.login.Init.class, 
									ACTIVITY_USER_MENU_CLASS = de.fhdw.bfws114a.userMenu.Init.class,
									ACTIVITY_PROFILE_MANAGEMENT_CLASS = de.fhdw.bfws114a.profileManagement.Init.class,
									ACTIVITY_CHOOSE_CATEGORY_CLASS = de.fhdw.bfws114a.chooseCategory.Init.class,
									ACTIVITY_CLASS_MANAGEMENT_CLASS = de.fhdw.bfws114a.classManagement.Init.class,
									ACTIVITY_CHALLENGE_CLASS = de.fhdw.bfws114a.challenge.Init.class,
									ACTIVITY_SOLUTION_CLASS = de.fhdw.bfws114a.solution.Init.class;	
	/*
	public static void startActivityLogin(Activity callingActivity, int counterValue) {
		startActivity(callingActivity, ACTIVITY_Class_CLASS,
				Constants.KEY_PAR_COUNTER_VALUE, counterValue);
	}
	*/
	
	public static void startActivityLogin(Activity callingActivity){
		startActivity(callingActivity, ACTIVITY_LOGIN_CLASS);
		
	}
	
	public static void startActivityUserMenu(Activity callingActivity, String user){
		startActivityWithParam(callingActivity, ACTIVITY_USER_MENU_CLASS, Constants.KEY_PAR_CURRENT_USER_VALUE, user);		
	}	

	public static void startActivityProfileManagement(Activity callingActivity) {
		startActivity(callingActivity, ACTIVITY_PROFILE_MANAGEMENT_CLASS);		
	}
	
	public static void startActivityChooseCategory(Activity callingActivity, String user){
		startActivityWithParam(callingActivity, ACTIVITY_CHOOSE_CATEGORY_CLASS, Constants.KEY_PAR_CURRENT_USER_VALUE, user);		
	}	

	public static void startActivityClassManagement(Activity callingActivity, String user){
		startActivityWithParam(callingActivity, ACTIVITY_CLASS_MANAGEMENT_CLASS, Constants.KEY_PAR_CURRENT_USER_VALUE, user);		
	}	
	
	public static void startActivityChallenge(Activity callingActivity, String user, String category) {
		startActivityWithParams(callingActivity, ACTIVITY_CHALLENGE_CLASS, Constants.KEY_PAR_CURRENT_USER_VALUE, user, Constants.KEY_PAR_CURRENT_CATEGORY_VALUE, category);
	}
	
	public static void startActivitySolution(Activity callingActivity, CheckBox[] userAnswers, Challenge currentChallenge) {
		startActivitySolutionForResult(callingActivity, ACTIVITY_SOLUTION_CLASS, Constants.KEY_USER_ANSWERS_CHECKBOXES, userAnswers, Constants.KEY_PAR_CURRENT_CATEGORY_VALUE, currentChallenge);
	}

	private static void startActivity(Activity callingActivity,
			Class <?> classOfActivityToStart){
		Intent intent;
		
		intent = new Intent();
		intent.setClass(callingActivity, classOfActivityToStart);
		callingActivity.startActivity(intent);
	} 

	//Diese Methode dient der �bergabe eines Parameters (z.B. des aktuellen Users) f�r die aufzurufende Activity
	private static void startActivityWithParam(Activity callingActivity,
			Class <?> classOfActivityToStart,
			String key, String value){
		Intent intent;		
		intent = new Intent();
		intent.putExtra(key, value);	
		intent.setClass(callingActivity, classOfActivityToStart);		
		callingActivity.startActivity(intent);
	}
	
	private static void startActivityWithParams(Activity callingActivity, Class<?> classOfActivityToStart,
			String key1, String value1, String key2, String value2) {
		Intent intent;		
		intent = new Intent();
		intent.putExtra(key1, value1);
		intent.putExtra(key2, value2);
		intent.setClass(callingActivity, classOfActivityToStart);		
		callingActivity.startActivity(intent);
	}
	
	
	
	
	
	
	private static void startActivitySolutionForResult(Activity callingActivity, Class<?> classOfActivityToStart, String keyCheckBoxex, CheckBox[] userAnswers, String keyChallenge, Challenge currentChallenge){
		Intent intent;
		
		intent = new Intent();
		intent.setClass(callingActivity, classOfActivityToStart);
		intent.putExtra(keyCheckBoxex, userAnswers);	
		//in einen Intent kann man keine Challenge "putten", eine M�glichkeit w�ren mehrere Keys und damit die Frage und korrekten Antworten als Strings �bergeben
//		intent.putExtra(keyChallenge, currentChallenge);
		callingActivity.startActivityForResult(intent, Constants.REQUESTCODE_ACTIVITY_SOLUTIONS);
	}
	
	public static void setActivitySolutionReturnValues(Activity returningActivity, boolean userAnswerCorrect) {
		setActivityReturnValues(returningActivity, Constants.KEY_RETURN_CHALLENGE_ANSWER_BOOL, userAnswerCorrect);
	}
	
	private static void setActivityReturnValues(Activity returningActivity,
			String key, boolean value) {
		Intent intent;		
		intent = new Intent();
		intent.putExtra(key, value);
		returningActivity.setResult(Activity.RESULT_OK, intent);		
	}
	
}
