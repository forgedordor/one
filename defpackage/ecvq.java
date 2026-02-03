package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecvq {
    public static ekgp a;
    public expq b;
    public exqw c;
    public SurveyViewPager d;
    public ecqp e;
    public ecqv f;
    public ScrollView h;
    public MaterialCardView i;
    public LinearLayout j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Integer s;
    public boolean t;
    public ecpo u;
    public final Activity v;
    public final ecvr w;
    public final fr x;
    public Bundle g = new Bundle();
    public final Handler q = new Handler();
    public final Runnable r = new Runnable() { // from class: ecvm
        @Override // java.lang.Runnable
        public final void run() {
            ecvq ecvqVar = this.a;
            ecvqVar.k = true;
            ecvqVar.v.finish();
        }
    };

    public ecvq(Activity activity, fr frVar, ecvr ecvrVar) {
        this.v = activity;
        this.x = frVar;
        this.w = ecvrVar;
    }

    private final void q() {
        if (this.d.B() || !ecuw.a(a(), this.b, this.e)) {
            t();
        } else {
            s(this.d.c + 1);
        }
    }

    private final void r(ViewGroup viewGroup, boolean z) {
        viewGroup.setEnabled(z);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                r((ViewGroup) childAt, z);
            } else if (childAt.getId() == R.id.survey_next && z) {
                b(R.id.survey_next).setEnabled(this.l);
            } else {
                childAt.setEnabled(z);
            }
        }
    }

    private final void s(int i) {
        ecsj ecsjVar = ecrz.c;
        if (ecrz.b(fblh.c(ecrz.b))) {
            j(m());
        }
        h();
        o(5);
        this.d.y(i);
        l();
        k();
        this.d.v().Q.sendAccessibilityEvent(32);
        long j = ecse.a;
    }

    private final void t() {
        long j = ecse.a;
        o(5);
        this.k = true;
        i(false);
        Intent intent = new Intent();
        Activity activity = this.v;
        activity.setResult(-1, intent);
        ecsj ecsjVar = ecrz.c;
        if (!ecrz.c(fblk.b(ecrz.b))) {
            this.d.x();
            return;
        }
        if (this.u == ecpo.CARD) {
            this.d.x();
            return;
        }
        this.i.setVisibility(8);
        ecpo ecpoVar = this.u;
        if (ecpoVar != ecpo.TOAST) {
            if (ecpoVar == ecpo.SILENT) {
                Log.v("SurveyActivityImpl", "Silent SurveyCompletionStyle, client apps will display their own completion dialog if need");
                activity.finish();
                return;
            }
            return;
        }
        View viewFindViewById = activity.getWindow().findViewById(android.R.id.content);
        exoc exocVar = this.b.d;
        if (exocVar == null) {
            exocVar = exoc.b;
        }
        Snackbar.q(viewFindViewById, exocVar.c, -1).i();
        e();
    }

    public final int a() {
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = surveyViewPager.c;
        return ecrz.a() ? i + this.m : this.t ? i + 1 : i;
    }

    public final View b(int i) {
        return this.v.findViewById(i);
    }

    public final ecqk c() {
        String stringExtra = this.v.getIntent().getStringExtra("TriggerId");
        exqw exqwVar = this.c;
        if (exqwVar == null || stringExtra == null) {
            long j = ecse.a;
            return null;
        }
        ecqh ecqhVar = new ecqh();
        ecqhVar.b(exqwVar.b);
        ecqhVar.d(stringExtra);
        ecqhVar.c(ecqu.POPUP);
        return ecqhVar.a();
    }

    public final exoz d() {
        return this.e.a;
    }

    public final void e() {
        this.v.setResult(-1, new Intent());
        this.q.postDelayed(this.r, 2400L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        int iA;
        int iA2;
        int iA3;
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager != null && surveyViewPager.A()) {
            expi expiVar = this.b.c;
            if (expiVar == null) {
                expiVar = expi.a;
            }
            if (!expiVar.b) {
                o(3);
            }
        }
        ecse.h(this.j);
        p();
        ecqk ecqkVarC = c();
        if (ecqkVarC != null) {
            int iA4 = exqc.a(((exqd) this.b.g.get(a())).i);
            if (iA4 == 0) {
                iA4 = 1;
            }
            int i = iA4 - 2;
            if (i == 1) {
                exoz exozVarW = this.d.w();
                exow exowVar = (exozVarW.b == 2 ? (exoy) exozVarW.c : exoy.a).c;
                if (exowVar == null) {
                    exowVar = exow.a;
                }
                int i2 = exowVar.c;
                ecql.a.h(ecqkVarC);
            } else if (i == 2) {
                ArrayList arrayList = new ArrayList();
                exoz exozVarW2 = this.d.w();
                Iterator<E> it = (exozVarW2.b == 3 ? (exop) exozVarW2.c : exop.a).b.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((exow) it.next()).c - 1));
                }
                ecqd ecqdVar = ecql.a;
                ekgb.n(arrayList);
                ecqdVar.f(ecqkVarC);
            } else if (i == 3) {
                exoz exozVarW3 = this.d.w();
                exow exowVar2 = (exozVarW3.b == 4 ? (exot) exozVarW3.c : exot.a).c;
                if (exowVar2 == null) {
                    exowVar2 = exow.a;
                }
                int i3 = exowVar2.c;
                ecql.a.g(ecqkVarC);
            } else if (i == 4) {
                ecql.a.a(ecqkVarC);
            }
        }
        ecsj ecsjVar = ecrz.c;
        if (!ecrz.b(fblh.c(ecrz.b))) {
            exqd exqdVar = (exqd) this.b.g.get(a());
            if (m() && (iA3 = exqc.a(exqdVar.i)) != 0 && iA3 == 5) {
                j(true);
            }
        }
        exoz exozVarW4 = this.d.w();
        if (exozVarW4 != null) {
            this.e.a = exozVarW4;
        }
        if (!ecrz.a()) {
            q();
            return;
        }
        SurveyViewPager surveyViewPager2 = this.d;
        if (surveyViewPager2 == null) {
            q();
            return;
        }
        exqd exqdVar2 = surveyViewPager2.v().a;
        exqb exqbVar = exqdVar2.k;
        if (exqbVar == null) {
            exqbVar = exqb.a;
        }
        if ((exqbVar.b & 1) != 0) {
            exqb exqbVar2 = exqdVar2.k;
            if (exqbVar2 == null) {
                exqbVar2 = exqb.a;
            }
            exno exnoVar = exqbVar2.d;
            if (exnoVar == null) {
                exnoVar = exno.a;
            }
            int iA5 = exnn.a(exnoVar.b);
            if (iA5 != 0 && iA5 == 5) {
                t();
                return;
            }
        }
        ecsj ecsjVar2 = ecrz.c;
        if (ecrz.c(fbkj.c(ecrz.b)) && (iA2 = exqc.a(exqdVar2.i)) != 0 && iA2 == 5) {
            exoz exozVarW5 = this.d.w();
            exow exowVar3 = (exozVarW5.b == 4 ? (exot) exozVarW5.c : exot.a).c;
            if (exowVar3 == null) {
                exowVar3 = exow.a;
            }
            int iA6 = new ecqa().a(a, this.b.g.size(), exowVar3.c, exqdVar2);
            if (iA6 == -1) {
                q();
                return;
            } else if (iA6 - 1 == this.b.g.size()) {
                t();
                return;
            } else {
                ecwe ecweVar = (ecwe) this.d.b;
                s(ecweVar != null ? ecweVar.n(iA6) : 0);
                return;
            }
        }
        ecsj ecsjVar3 = ecrz.c;
        if (!ecrz.c(fbkj.b(ecrz.b)) || (iA = exqc.a(exqdVar2.i)) == 0 || iA != 3) {
            q();
            return;
        }
        exnj exnjVar = exnj.a;
        exnl exnlVar = (exqdVar2.c == 4 ? (exqz) exqdVar2.d : exqz.a).c;
        if (exnlVar == null) {
            exnlVar = exnl.a;
        }
        Iterator<E> it2 = exnlVar.b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            exnj exnjVar2 = (exnj) it2.next();
            int i4 = exnjVar2.d;
            exoz exozVarW6 = this.d.w();
            exow exowVar4 = (exozVarW6.b == 2 ? (exoy) exozVarW6.c : exoy.a).c;
            if (exowVar4 == null) {
                exowVar4 = exow.a;
            }
            if (i4 == exowVar4.c) {
                exnjVar = exnjVar2;
                break;
            }
        }
        if (((exqdVar2.c == 4 ? (exqz) exqdVar2.d : exqz.a).b & 1) == 0 || (exnjVar.b & 1) == 0) {
            q();
            return;
        }
        exno exnoVar2 = exnjVar.g;
        if (exnoVar2 == null) {
            exnoVar2 = exno.a;
        }
        int iA7 = exnn.a(exnoVar2.b);
        int i5 = (iA7 != 0 ? iA7 : 1) - 2;
        if (i5 != 2) {
            if (i5 != 3) {
                q();
                return;
            } else {
                t();
                return;
            }
        }
        exno exnoVar3 = exnjVar.g;
        if (exnoVar3 == null) {
            exnoVar3 = exno.a;
        }
        String str = exnoVar3.c;
        ecwe ecweVar2 = (ecwe) this.d.b;
        if (ecweVar2 != null && a.containsKey(str)) {
            iN = ecweVar2.n(((Integer) a.get(str)).intValue());
        }
        s(iN);
    }

    public final void g(boolean z) {
        this.j.setDescendantFocusability(true != z ? 262144 : 393216);
        this.j.setAlpha(true != z ? 1.0f : 0.4f);
        if (z) {
            this.l = b(R.id.survey_next).isEnabled();
        }
        r(this.j, !z);
    }

    public final void h() {
        int iA = exom.a(d().b);
        if (iA == 0) {
            throw null;
        }
        if (iA == 1) {
            Bundle bundle = this.g;
            String strValueOf = String.valueOf(d().d);
            exoz exozVarD = d();
            exow exowVar = (exozVarD.b == 2 ? (exoy) exozVarD.c : exoy.a).c;
            if (exowVar == null) {
                exowVar = exow.a;
            }
            bundle.putString(strValueOf, exowVar.d);
        }
    }

    public final void i(boolean z) {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null && materialButton.isEnabled() != z) {
            materialButton.setEnabled(z);
        }
        this.l = z;
    }

    public final void j(boolean z) {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null) {
            materialButton.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void k() {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton == null || !this.d.B() || this.n) {
            return;
        }
        materialButton.setText(R.string.survey_submit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager == null || !surveyViewPager.C()) {
            exqd exqdVar = (exqd) this.b.g.get(a());
            String str = exqdVar.g.isEmpty() ? exqdVar.f : exqdVar.g;
            int size = exqdVar.h.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i = 0; i < size; i++) {
                exre exreVar = (exre) exqdVar.h.get(i);
                int i2 = exreVar.b;
                if (exrd.a(i2) == 3) {
                    int i3 = (i2 == 2 ? (exrb) exreVar.c : exrb.a).b;
                    String string = this.g.getString(String.valueOf(i3));
                    if (string != null) {
                        strArr[i] = exreVar.d;
                        strArr2[i] = string;
                    } else {
                        Log.e("SurveyActivityImpl", a.e(i3, "No single-select question with ordinal ", " was found."));
                    }
                }
            }
            this.d.z(TextUtils.replace(str, strArr, strArr2).toString());
        }
    }

    public final boolean m() {
        return ecse.m(this.b);
    }

    public final boolean n(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            this.i.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && this.k) {
                long j = ecse.a;
                this.v.finish();
                return true;
            }
        }
        ecsj ecsjVar = ecrz.c;
        Activity activity = this.v;
        if (fbkv.b(activity)) {
            return false;
        }
        return activity.onTouchEvent(motionEvent);
    }

    public final void o(int i) {
        ecqp ecqpVar = this.e;
        ecqpVar.g = i;
        this.f.a(ecqpVar, ecse.k(this.b));
    }

    public final void p() {
        b(R.id.survey_controls_divider).setVisibility(8);
        b(R.id.survey_controls_legal_text).setVisibility(8);
    }
}
