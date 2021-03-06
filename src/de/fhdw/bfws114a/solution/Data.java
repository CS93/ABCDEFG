/**
 * @author Carsten Schlender
 */
 
package de.fhdw.bfws114a.solution;

import android.app.Activity;
import android.os.Bundle;
import de.fhdw.bfws114a.data.Challenge;

public class Data {
	
	private String mUserAnswerText;
	private boolean [] mUserAnswerCheckbox;
	private Activity mActivity;
	private Challenge mCurrentChallenge;
	
	public Data(Bundle b, Activity activity, Challenge currentChallenge, boolean[] userAnswerCheckbox, String userAnswerText){	
		mActivity = activity;
		mUserAnswerCheckbox = userAnswerCheckbox;
		mUserAnswerText = userAnswerText;
		mCurrentChallenge = currentChallenge;
	}
	
	public Activity getActivity() {
		return mActivity;
	}

	public String getUserAnswerText() {
		return mUserAnswerText;
	}

	public boolean[] getUserAnswerCheckbox() {
		return mUserAnswerCheckbox;
	}		
	
	public Challenge getCurrentChallenge() {
		return mCurrentChallenge;
	}
	
}
