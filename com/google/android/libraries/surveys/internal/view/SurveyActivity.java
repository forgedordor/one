package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import defpackage.abs;
import defpackage.ea;
import defpackage.ecqk;
import defpackage.ecql;
import defpackage.ecrz;
import defpackage.ecsj;
import defpackage.ecvk;
import defpackage.ecvq;
import defpackage.ecvr;
import defpackage.ecwe;
import defpackage.fbkv;
import defpackage.fblh;
import defpackage.iy;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SurveyActivity extends iy implements ecvr {
    public ecvq n;
    private final abs o = new ecvk(this);

    @Override // defpackage.ecvl
    public final boolean aX() {
        return false;
    }

    @Override // defpackage.ecvl
    public final boolean aY() {
        return this.n.m();
    }

    @Override // defpackage.ecta
    public final void aZ() {
        this.n.j(false);
    }

    @Override // defpackage.ecvl
    public final void e() {
        this.n.e();
    }

    @Override // defpackage.ecvl
    public final void f() {
        ImageButton imageButton = (ImageButton) this.n.b(R.id.survey_close_button);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a0  */
    @Override // defpackage.eg, defpackage.abi, defpackage.hl, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onCreate(android.os.Bundle r24) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.view.SurveyActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        ecvq ecvqVar = this.n;
        if (ecrz.b == null) {
            return;
        }
        if (ecrz.d()) {
            ecqk ecqkVarC = ecvqVar.c();
            if (ecvqVar.v.isFinishing() && ecqkVarC != null) {
                ecql.a.c(ecqkVarC);
            }
        } else if (ecvqVar.v.isFinishing()) {
            ecql.a.b();
        }
        ecvqVar.q.removeCallbacks(ecvqVar.r);
    }

    @Override // defpackage.abi, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ecvq ecvqVar = this.n;
        if (intent.getBooleanExtra("IsDismissing", false)) {
            ecvqVar.v.finish();
        }
        if (intent.hasExtra("IsPausing")) {
            ecvqVar.g(intent.getBooleanExtra("IsPausing", false));
        }
    }

    @Override // defpackage.abi, defpackage.hl, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ecvq ecvqVar = this.n;
        ecsj ecsjVar = ecrz.c;
        if (ecrz.b(fblh.c(ecrz.b))) {
            SurveyViewPager surveyViewPager = ecvqVar.d;
            bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? surveyViewPager.c : 0);
        } else {
            bundle.putInt("CurrentQuestionIndexForViewPager", ecvqVar.a());
        }
        bundle.putBoolean("IsSubmitting", ecvqVar.k);
        bundle.putParcelable("Answer", ecvqVar.e);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", ecvqVar.g);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ecsj ecsjVar = ecrz.c;
        if (!fbkv.b(this)) {
            return this.n.n(motionEvent);
        }
        if (this.n.n(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.ecta
    public final void p() {
        this.n.f();
    }

    @Override // defpackage.ectb
    public final void q(boolean z, ea eaVar) {
        ecvq ecvqVar = this.n;
        if (ecvqVar.k || ecwe.m(eaVar) != ecvqVar.d.c) {
            return;
        }
        ecvqVar.i(z);
    }

    @Override // defpackage.ecta
    public final void t(boolean z) {
        this.n.i(z);
    }

    @Override // defpackage.ecvr
    public final Activity b() {
        return this;
    }
}
