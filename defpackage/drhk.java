package defpackage;

import android.view.View;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhk implements View.OnClickListener {
    final /* synthetic */ SurveyPromptActivity a;

    public drhk(SurveyPromptActivity surveyPromptActivity) {
        this.a = surveyPromptActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SurveyPromptActivity surveyPromptActivity = this.a;
        surveyPromptActivity.G("o");
        surveyPromptActivity.C();
        surveyPromptActivity.finish();
    }
}
