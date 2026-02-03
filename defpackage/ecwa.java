package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecwa extends ecqb implements ecvu {
    public final expq c;
    public final LayoutInflater d;
    public SurveyViewPager e;
    public final ecqp f;
    public final Bundle g;
    public final MaterialCardView h;
    public final LinearLayout i;
    public boolean j;
    public final ecvw k;
    public final ecvr l;
    public final fr m;
    private final ecqv n;
    private ekgp o;

    public ecwa(LayoutInflater layoutInflater, fr frVar, ecvr ecvrVar, ecvw ecvwVar) {
        this.a = layoutInflater.inflate(R.layout.survey_container, (ViewGroup) null, false);
        this.d = layoutInflater;
        this.m = frVar;
        ecsl ecslVar = (ecsl) ecvwVar;
        expq expqVar = ecslVar.a;
        this.c = expqVar;
        this.f = ecslVar.b;
        this.j = ecslVar.c;
        this.k = ecvwVar;
        this.l = ecvrVar;
        this.g = ecslVar.m;
        HashMap map = new HashMap();
        for (exqd exqdVar : expqVar.g) {
            if ((exqdVar.b & 1) != 0) {
                exqb exqbVar = exqdVar.k;
                if (!map.containsKey((exqbVar == null ? exqb.a : exqbVar).c)) {
                    exqb exqbVar2 = exqdVar.k;
                    map.put((exqbVar2 == null ? exqb.a : exqbVar2).c, Integer.valueOf(exqdVar.e - 1));
                }
            }
        }
        this.o = ekgp.j(map);
        this.n = new ecqv(o(), ecslVar.e, ecslVar.f);
        this.i = (LinearLayout) p(R.id.survey_container);
        this.h = (MaterialCardView) p(R.id.survey_overall_container);
    }

    private final void l() {
        if (this.e.B() || !ecuw.a(e(), this.c, this.f)) {
            n();
        } else {
            m(this.e.c + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(int i) {
        ecsj ecsjVar = ecrz.c;
        if (ecrz.b(fblh.c(ecrz.b))) {
            c(d());
        }
        int iA = exom.a(g().b);
        if (iA == 0) {
            throw null;
        }
        if (iA == 1) {
            Bundle bundle = this.g;
            String strValueOf = String.valueOf(g().d);
            exoz exozVarG = g();
            exow exowVar = (exozVarG.b == 2 ? (exoy) exozVarG.c : exoy.a).c;
            if (exowVar == null) {
                exowVar = exow.a;
            }
            bundle.putString(strValueOf, exowVar.d);
        }
        j(5);
        this.e.y(i);
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager == null || !surveyViewPager.C()) {
            exqd exqdVar = (exqd) this.c.g.get(e());
            String str = exqdVar.g.isEmpty() ? exqdVar.f : exqdVar.g;
            int size = exqdVar.h.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                exre exreVar = (exre) exqdVar.h.get(i2);
                int i3 = exreVar.b;
                if (exrd.a(i3) == 3) {
                    exrb exrbVar = i3 == 2 ? (exrb) exreVar.c : exrb.a;
                    Bundle bundle2 = this.g;
                    int i4 = exrbVar.b;
                    String string = bundle2.getString(String.valueOf(i4));
                    if (string != null) {
                        strArr[i2] = exreVar.d;
                        strArr2[i2] = string;
                    } else {
                        Log.e("SurveyContainer", a.e(i4, "No single-select question with ordinal ", " was found."));
                    }
                }
            }
            this.e.z(TextUtils.replace(str, strArr, strArr2).toString());
        }
        i();
        this.e.v().Q.sendAccessibilityEvent(32);
        long j = ecse.a;
    }

    private final void n() {
        long j = ecse.a;
        j(5);
        this.j = true;
        b(false);
        Iterator it = q().iterator();
        while (it.hasNext()) {
            ((ecvt) it.next()).s();
        }
        ecsj ecsjVar = ecrz.c;
        if (!ecrz.c(fblk.b(ecrz.b))) {
            this.e.x();
            return;
        }
        ecvw ecvwVar = this.k;
        if (((ecsl) ecvwVar).i == ecpo.CARD) {
            this.e.x();
            return;
        }
        p(R.id.survey_main_scroll_view).setVisibility(8);
        for (ecvt ecvtVar : q()) {
            exoc exocVar = this.c.d;
            if (exocVar == null) {
                exocVar = exoc.b;
            }
            ecvtVar.aV(exocVar.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecvu
    public final void a() {
        int iA;
        int iA2;
        int iA3;
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager != null && surveyViewPager.A()) {
            expi expiVar = this.c.c;
            if (expiVar == null) {
                expiVar = expi.a;
            }
            if (!expiVar.b) {
                j(3);
            }
        }
        ecse.h(this.i);
        k();
        ecqk ecqkVarF = f();
        expq expqVar = this.c;
        int iA4 = exqc.a(((exqd) expqVar.g.get(e())).i);
        if (iA4 == 0) {
            iA4 = 1;
        }
        int i = iA4 - 2;
        if (i == 1) {
            exoz exozVarW = this.e.w();
            exow exowVar = (exozVarW.b == 2 ? (exoy) exozVarW.c : exoy.a).c;
            if (exowVar == null) {
                exowVar = exow.a;
            }
            int i2 = exowVar.c;
            ecql.a.h(ecqkVarF);
        } else if (i == 2) {
            ArrayList arrayList = new ArrayList();
            exoz exozVarW2 = this.e.w();
            Iterator<E> it = (exozVarW2.b == 3 ? (exop) exozVarW2.c : exop.a).b.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((exow) it.next()).c - 1));
            }
            ecqd ecqdVar = ecql.a;
            ekgb.n(arrayList);
            ecqdVar.f(ecqkVarF);
        } else if (i == 3) {
            exoz exozVarW3 = this.e.w();
            exow exowVar2 = (exozVarW3.b == 4 ? (exot) exozVarW3.c : exot.a).c;
            if (exowVar2 == null) {
                exowVar2 = exow.a;
            }
            int i3 = exowVar2.c;
            ecql.a.g(ecqkVarF);
        } else if (i == 4) {
            ecql.a.a(ecqkVarF);
        }
        ecsj ecsjVar = ecrz.c;
        if (!ecrz.b(fblh.c(ecrz.b))) {
            exqd exqdVar = (exqd) expqVar.g.get(e());
            if (d() && (iA3 = exqc.a(exqdVar.i)) != 0 && iA3 == 5) {
                c(true);
            }
        }
        exoz exozVarW4 = this.e.w();
        if (exozVarW4 != null) {
            this.f.a = exozVarW4;
        }
        if (!ecrz.a()) {
            l();
            return;
        }
        SurveyViewPager surveyViewPager2 = this.e;
        if (surveyViewPager2 == null) {
            l();
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
                n();
                return;
            }
        }
        ecsj ecsjVar2 = ecrz.c;
        if (ecrz.c(fbkj.c(ecrz.b)) && (iA2 = exqc.a(exqdVar2.i)) != 0 && iA2 == 5) {
            exoz exozVarW5 = this.e.w();
            exow exowVar3 = (exozVarW5.b == 4 ? (exot) exozVarW5.c : exot.a).c;
            if (exowVar3 == null) {
                exowVar3 = exow.a;
            }
            int iA6 = new ecqa().a(this.o, expqVar.g.size(), exowVar3.c, exqdVar2);
            if (iA6 == -1) {
                l();
                return;
            } else if (iA6 - 1 == expqVar.g.size()) {
                n();
                return;
            } else {
                ecwe ecweVar = (ecwe) this.e.b;
                m(ecweVar != null ? ecweVar.n(iA6) : 0);
                return;
            }
        }
        ecsj ecsjVar3 = ecrz.c;
        if (!ecrz.c(fbkj.b(ecrz.b)) || (iA = exqc.a(exqdVar2.i)) == 0 || iA != 3) {
            l();
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
            exoz exozVarW6 = this.e.w();
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
            l();
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
                l();
                return;
            } else {
                n();
                return;
            }
        }
        exno exnoVar3 = exnjVar.g;
        if (exnoVar3 == null) {
            exnoVar3 = exno.a;
        }
        String str = exnoVar3.c;
        ecwe ecweVar2 = (ecwe) this.e.b;
        if (ecweVar2 != null && this.o.containsKey(str)) {
            iN = ecweVar2.n(((Integer) this.o.get(str)).intValue());
        }
        m(iN);
    }

    @Override // defpackage.ecvu
    public final void b(boolean z) {
        MaterialButton materialButton = (MaterialButton) p(R.id.survey_next);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    @Override // defpackage.ecvu
    public final void c(boolean z) {
        MaterialButton materialButton = (MaterialButton) p(R.id.survey_next);
        if (materialButton != null) {
            materialButton.setVisibility(true != z ? 8 : 0);
        }
    }

    @Override // defpackage.ecvu
    public final boolean d() {
        return ecse.m(this.c);
    }

    public final int e() {
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = surveyViewPager.c;
        return ecrz.a() ? i + ((ecsl) this.k).g : i;
    }

    public final ecqk f() {
        ecqh ecqhVar = new ecqh();
        ecsl ecslVar = (ecsl) this.k;
        ecqhVar.b(ecslVar.f.b);
        ecqhVar.d(ecslVar.e);
        ecqhVar.c(ecslVar.l);
        return ecqhVar.a();
    }

    public final exoz g() {
        return this.f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(final java.lang.String r8) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            ecvz r6 = new ecvz
            r6.<init>()
            expq r0 = r7.c
            expk r1 = r0.i
            if (r1 != 0) goto Ld
            expk r1 = defpackage.expk.a
        Ld:
            int r1 = r1.b
            r1 = r1 & 1
            r2 = 0
            if (r1 == 0) goto L2c
            expk r1 = r0.i
            if (r1 != 0) goto L1a
            expk r1 = defpackage.expk.a
        L1a:
            java.lang.String r1 = r1.c
            int r1 = r1.length()
            if (r1 <= 0) goto L2c
            expk r1 = r0.i
            if (r1 != 0) goto L28
            expk r1 = defpackage.expk.a
        L28:
            java.lang.String r1 = r1.c
            r3 = r1
            goto L2d
        L2c:
            r3 = r2
        L2d:
            expk r1 = r0.i
            if (r1 != 0) goto L34
            expk r4 = defpackage.expk.a
            goto L35
        L34:
            r4 = r1
        L35:
            int r4 = r4.b
            r4 = r4 & 2
            if (r4 == 0) goto L51
            if (r1 != 0) goto L3f
            expk r1 = defpackage.expk.a
        L3f:
            java.lang.String r1 = r1.d
            int r1 = r1.length()
            if (r1 <= 0) goto L51
            expk r1 = r0.i
            if (r1 != 0) goto L4d
            expk r1 = defpackage.expk.a
        L4d:
            java.lang.String r1 = r1.d
            r4 = r1
            goto L52
        L51:
            r4 = r2
        L52:
            expk r1 = r0.i
            if (r1 != 0) goto L59
            expk r5 = defpackage.expk.a
            goto L5a
        L59:
            r5 = r1
        L5a:
            int r5 = r5.b
            r5 = r5 & 4
            if (r5 == 0) goto L74
            if (r1 != 0) goto L64
            expk r1 = defpackage.expk.a
        L64:
            java.lang.String r1 = r1.e
            int r1 = r1.length()
            if (r1 <= 0) goto L74
            expk r0 = r0.i
            if (r0 != 0) goto L72
            expk r0 = defpackage.expk.a
        L72:
            java.lang.String r2 = r0.e
        L74:
            r5 = r2
            android.content.Context r0 = r7.o()
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 2131430673(0x7f0b0d11, float:1.8483054E38)
            android.view.View r1 = r7.p(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r8
            defpackage.ecrw.c(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecwa.h(java.lang.String):void");
    }

    public final void i() {
        MaterialButton materialButton = (MaterialButton) p(R.id.survey_next);
        if (materialButton == null || !this.e.B()) {
            return;
        }
        materialButton.setText(R.string.survey_submit);
    }

    public final void j(int i) {
        ecqp ecqpVar = this.f;
        ecqpVar.g = i;
        this.n.a(ecqpVar, ecse.k(this.c));
    }

    public final void k() {
        p(R.id.survey_controls_divider).setVisibility(8);
        p(R.id.survey_controls_legal_text).setVisibility(8);
    }
}
