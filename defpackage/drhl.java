package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhl implements View.OnClickListener {
    final /* synthetic */ SurveyPromptActivity a;

    public drhl(SurveyPromptActivity surveyPromptActivity) {
        this.a = surveyPromptActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SurveyPromptActivity surveyPromptActivity = this.a;
        surveyPromptActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(surveyPromptActivity.p)));
        surveyPromptActivity.finish();
    }
}
