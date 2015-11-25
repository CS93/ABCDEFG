package de.fhdw.bfws114a.chooseCategory;

import android.app.Activity;
import android.widget.TextView;
import de.fhdw.bfws114asc.counter1.R;

public class Gui {
	
	private TextView[] mCategories = new TextView[8];
	private TextView[] mOverallChallengesPerCategory = new TextView[8];
	private TextView[] mDueChallengesPerCategory = new TextView[8];


	public Gui(Activity act) {
		act.setContentView(R.layout.activity_category_choose);
		
		mCategories[0] = (TextView) act.findViewById(R.id.b_cardfile1_category);
		mCategories[1] = (TextView) act.findViewById(R.id.b_cardfile2_category);
		mCategories[2] = (TextView) act.findViewById(R.id.b_cardfile3_category);
		mCategories[3] = (TextView) act.findViewById(R.id.b_cardfile4_category);
		mCategories[4] = (TextView) act.findViewById(R.id.b_cardfile5_category);
		mCategories[5] = (TextView) act.findViewById(R.id.b_cardfile6_category);
		mCategories[6] = (TextView) act.findViewById(R.id.b_cardfile7_category);
		mCategories[7] = (TextView) act.findViewById(R.id.b_cardfile8_category);
		
		mOverallChallengesPerCategory[0] = (TextView) act.findViewById(R.id.t_cardfile1_overall_statistic_category);
		mOverallChallengesPerCategory[1] = (TextView) act.findViewById(R.id.t_cardfile2_overall_statistic_category);
		mOverallChallengesPerCategory[2] = (TextView) act.findViewById(R.id.t_cardfile3_overall_statistic_category);
		mOverallChallengesPerCategory[3] = (TextView) act.findViewById(R.id.t_cardfile4_overall_statistic_category);
		mOverallChallengesPerCategory[4] = (TextView) act.findViewById(R.id.t_cardfile5_overall_statistic_category);
		mOverallChallengesPerCategory[5] = (TextView) act.findViewById(R.id.t_cardfile6_overall_statistic_category);
		mOverallChallengesPerCategory[6] = (TextView) act.findViewById(R.id.t_cardfile7_overall_statistic_category);
		mOverallChallengesPerCategory[7] = (TextView) act.findViewById(R.id.t_cardfile8_overall_statistic_category);
		
		mDueChallengesPerCategory[0] = (TextView) act.findViewById(R.id.t_cardfile1_due_statistic_category);
		mDueChallengesPerCategory[1] = (TextView) act.findViewById(R.id.t_cardfile2_due_statistic_category);
		mDueChallengesPerCategory[2] = (TextView) act.findViewById(R.id.t_cardfile3_due_statistic_category);
		mDueChallengesPerCategory[3] = (TextView) act.findViewById(R.id.t_cardfile4_due_statistic_category);
		mDueChallengesPerCategory[4] = (TextView) act.findViewById(R.id.t_cardfile5_due_statistic_category);
		mDueChallengesPerCategory[5] = (TextView) act.findViewById(R.id.t_cardfile6_due_statistic_category);
		mDueChallengesPerCategory[6] = (TextView) act.findViewById(R.id.t_cardfile7_due_statistic_category);
		mDueChallengesPerCategory[7] = (TextView) act.findViewById(R.id.t_cardfile8_due_statistic_category);
	}

	public TextView[] getCategories() {
		return mCategories;
	}

	public TextView getCategory(int index) {
		return mCategories[index];
	}	
	
	public void setCategories(TextView[] categories) {
		this.mCategories = categories;
	}

	public TextView[] getOverallChallengesPerCategory() {
		return mOverallChallengesPerCategory;
	}

	public TextView getOverallChallengePerCategory(int index) {
		return mOverallChallengesPerCategory[index];
	}
	
	public void setOverallChallengesPerCategory(TextView[] mOverallChallengesPerCategory) {
		this.mOverallChallengesPerCategory = mOverallChallengesPerCategory;
	}
	
	public TextView[] getDueChallengesPerCategory() {
		return mDueChallengesPerCategory;
	}
	
	public TextView getDueChallengePerCategory(int index) {
		return mDueChallengesPerCategory[index];
	}
	
	public void setDueChallengesPerCategory(TextView[] mDueChallengesPerCategory) {
		this.mDueChallengesPerCategory = mDueChallengesPerCategory;
	}
}
