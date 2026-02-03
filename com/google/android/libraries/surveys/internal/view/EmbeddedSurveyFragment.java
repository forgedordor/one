package com.google.android.libraries.surveys.internal.view;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import com.google.android.material.snackbar.Snackbar;
import defpackage.ea;
import defpackage.ecqb;
import defpackage.ecsl;
import defpackage.ecvr;
import defpackage.ecvt;
import defpackage.ecvu;
import defpackage.ecwa;
import defpackage.ecwe;
import defpackage.fr;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class EmbeddedSurveyFragment extends ea implements ecvr, ecvt {
    private ecvu a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0236  */
    @Override // defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View M(android.view.LayoutInflater r31, android.view.ViewGroup r32, android.os.Bundle r33) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.EmbeddedSurveyFragment.M(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.ecvl
    public final fr a() {
        return I();
    }

    @Override // defpackage.ecvt
    public final void aV(String str) {
        Snackbar.q(fg().getWindow().findViewById(R.id.content), str, -1).i();
    }

    @Override // defpackage.ecvl
    public final boolean aX() {
        return true;
    }

    @Override // defpackage.ecvl
    public final boolean aY() {
        return this.a.d();
    }

    @Override // defpackage.ecta
    public final void aZ() {
        this.a.c(false);
    }

    @Override // defpackage.ecvr
    public final /* bridge */ /* synthetic */ Activity b() {
        return super.G();
    }

    @Override // defpackage.ecvl
    public final void f() {
        ImageButton imageButton = (ImageButton) ((ecqb) this.a).p(com.google.android.apps.messaging.R.id.survey_close_button);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        SurveyViewPager surveyViewPager = ((ecwa) this.a).e;
        bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? surveyViewPager.c : 0);
        bundle.putBoolean("IsSubmitting", ((ecwa) this.a).j);
        bundle.putParcelable("Answer", ((ecwa) this.a).f);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", ((ecwa) this.a).g);
    }

    @Override // defpackage.ecta
    public final void p() {
        this.a.a();
    }

    @Override // defpackage.ectb
    public final void q(boolean z, ea eaVar) {
        ecwa ecwaVar = (ecwa) this.a;
        if (ecwaVar.j || ecwe.m(eaVar) != ecwaVar.e.c || ((ecsl) ecwaVar.k).k) {
            return;
        }
        ecwaVar.b(z);
    }

    @Override // defpackage.ecta
    public final void t(boolean z) {
        this.a.b(z);
    }

    @Override // defpackage.ecvt
    public final void aW() {
    }

    @Override // defpackage.ecvl
    public final void e() {
    }

    @Override // defpackage.ecvt
    public final void r() {
    }

    @Override // defpackage.ecvt
    public final void s() {
    }
}
