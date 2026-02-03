package defpackage;

import android.view.View;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecwd extends pph {
    final /* synthetic */ SurveyViewPager a;

    public ecwd(SurveyViewPager surveyViewPager) {
        this.a = surveyViewPager;
    }

    @Override // defpackage.pph, defpackage.ppd
    public final void b(int i) {
        SurveyViewPager surveyViewPager = this.a;
        surveyViewPager.invalidate();
        ecsm ecsmVarV = surveyViewPager.v();
        if (ecsmVarV != null) {
            ecsmVarV.p();
            ecsmVarV.f();
            View view = ecsmVarV.Q;
            if (view != null) {
                view.sendAccessibilityEvent(32);
            }
        }
        surveyViewPager.requestLayout();
    }
}
