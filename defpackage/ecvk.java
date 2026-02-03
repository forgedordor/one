package defpackage;

import android.content.Intent;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecvk extends abs {
    final /* synthetic */ SurveyActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecvk(SurveyActivity surveyActivity) {
        super(true);
        this.a = surveyActivity;
    }

    @Override // defpackage.abs
    public final void b() {
        ecvq ecvqVar = this.a.n;
        ecvqVar.o(6);
        if (ecvqVar.k) {
            ecvqVar.v.setResult(-1, new Intent().putExtra("EXTRA_BACK_BUTTON_PRESSED", true));
        }
        ecvqVar.v.finish();
    }
}
