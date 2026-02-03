package defpackage;

import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drho implements Runnable {
    final /* synthetic */ SurveyPromptActivity a;

    public drho(SurveyPromptActivity surveyPromptActivity) {
        this.a = surveyPromptActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurveyPromptActivity surveyPromptActivity = this.a;
        surveyPromptActivity.q = true;
        drhw.c().b().a = false;
        surveyPromptActivity.finish();
    }
}
