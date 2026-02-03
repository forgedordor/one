package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import defpackage.ea;
import defpackage.ecpo;
import defpackage.ecrq;
import defpackage.ecrz;
import defpackage.ecsj;
import defpackage.ecsm;
import defpackage.ecvr;
import defpackage.ecvs;
import defpackage.ecwd;
import defpackage.ecwe;
import defpackage.exnn;
import defpackage.exno;
import defpackage.exoz;
import defpackage.exqb;
import defpackage.fblk;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SurveyViewPager extends ViewPager {
    public ecvr l;

    public SurveyViewPager(Context context) {
        super(context);
        E();
    }

    private final View D() {
        ecsm ecsmVarV;
        if (this.b == null || (ecsmVarV = v()) == null) {
            return null;
        }
        return ecsmVarV.Q;
    }

    private final void E() {
        final ecwd ecwdVar = new ecwd(this);
        d(ecwdVar);
        post(new Runnable() { // from class: ecwc
            @Override // java.lang.Runnable
            public final void run() {
                ecwdVar.b(this.a.c);
            }
        });
    }

    public final boolean A() {
        return this.c == 0;
    }

    public final boolean B() {
        ecwe ecweVar = (ecwe) this.b;
        if (ecweVar == null) {
            Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
            return false;
        }
        if (!ecrz.a() || v() == null || ecweVar.o(this.c) == null || (ecweVar.o(this.c).b & 1) == 0) {
            ecsj ecsjVar = ecrz.c;
            if (ecrz.c(fblk.b(ecrz.b))) {
                return this.c == ecweVar.j() - (ecweVar.b == ecpo.CARD ? 2 : 1);
            }
            return this.c == ecweVar.j() + (-2);
        }
        exqb exqbVar = ((ecwe) this.b).o(this.c).k;
        if (exqbVar == null) {
            exqbVar = exqb.a;
        }
        exno exnoVar = exqbVar.d;
        if (exnoVar == null) {
            exnoVar = exno.a;
        }
        int iA = exnn.a(exnoVar.b);
        return iA != 0 && iA == 5;
    }

    public final boolean C() {
        ecsj ecsjVar = ecrz.c;
        if (!ecrz.c(fblk.b(ecrz.b))) {
            return this.c == this.b.j() + (-1);
        }
        ecwe ecweVar = (ecwe) this.b;
        if (ecweVar != null) {
            return ((ecvs) ecweVar.a.get(this.c)).b == 5;
        }
        Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                switch (keyCode) {
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                        return false;
                    default:
                        return super.dispatchKeyEvent(keyEvent);
                }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        ecsj ecsjVar = ecrz.c;
        if (ecrz.c(fblk.a.get().a(ecrz.b))) {
            View viewD = D();
            if (viewD == null) {
                super.onMeasure(i, i2);
                return;
            }
            ecvr ecvrVar = this.l;
            View viewFindViewById = ecvrVar != null ? ecvrVar.b().findViewById(R.id.survey_controls_container) : null;
            ecvr ecvrVar2 = this.l;
            super.onMeasure(i, ecrq.b(this, viewD, i, i2, viewD.findViewById(R.id.survey_question_header_logo_text), viewFindViewById, ecvrVar2 == null || ecvrVar2.aX()));
            return;
        }
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
        }
        View viewD2 = D();
        if (viewD2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        viewD2.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = viewD2.getMeasuredHeight();
        Rect rect = new Rect();
        viewD2.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - viewD2.findViewById(R.id.survey_question_header_logo_text).getHeight();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.survey_card_vertical_margin);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(measuredHeight, iHeight - (dimensionPixelSize + dimensionPixelSize)), 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final ecsm v() {
        ecvr ecvrVar = this.l;
        if (ecvrVar == null) {
            return null;
        }
        int i = this.c;
        for (ea eaVar : ecvrVar.a().o()) {
            if (ecwe.m(eaVar) == i && (eaVar instanceof ecsm)) {
                return (ecsm) eaVar;
            }
        }
        return null;
    }

    public final exoz w() {
        ecsm ecsmVarV = v();
        if (ecsmVarV == null) {
            return null;
        }
        return ecsmVarV.e();
    }

    public final void x() {
        l(this.b.j() - 1, true);
        v().f();
    }

    public final void y(int i) {
        l(i, true);
        v().f();
    }

    public final void z(final String str) {
        ecsm ecsmVarV = v();
        if (ecsmVarV != null) {
            ecsmVarV.q(str);
        } else {
            post(new Runnable() { // from class: ecwb
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.v().q(str);
                }
            });
        }
    }

    public SurveyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        E();
    }
}
