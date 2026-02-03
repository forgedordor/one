package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecsq extends ecuy {
    private boolean[] ak;
    private ViewGroup al;
    public ecqr d;
    public ecsx e;

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        b().q(t(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecsm
    public final exoz e() {
        exon exonVar = (exon) exoz.a.createBuilder();
        if (this.d.c()) {
            exoo exooVar = (exoo) exop.a.createBuilder();
            exqd exqdVar = this.a;
            exnl exnlVar = (exqdVar.c == 5 ? (expm) exqdVar.d : expm.a).c;
            if (exnlVar == null) {
                exnlVar = exnl.a;
            }
            evtg evtgVar = exnlVar.b;
            int i = 0;
            while (true) {
                boolean[] zArr = this.e.b;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    String str = ((exnj) evtgVar.get(i)).e;
                    int iA = exnh.a(((exnj) evtgVar.get(i)).c);
                    int i2 = 4;
                    if (iA != 0 && iA == 4 && !TextUtils.isEmpty(this.e.a)) {
                        str = this.e.a;
                    }
                    exov exovVar = (exov) exow.a.createBuilder();
                    int i3 = ((exnj) evtgVar.get(i)).d;
                    exovVar.copyOnWrite();
                    ((exow) exovVar.instance).c = i3;
                    exovVar.copyOnWrite();
                    exow exowVar = (exow) exovVar.instance;
                    str.getClass();
                    exowVar.d = str;
                    int iA2 = exnh.a(((exnj) evtgVar.get(i)).c);
                    if (iA2 == 0) {
                        iA2 = 1;
                    }
                    int i4 = iA2 - 2;
                    if (i4 == 1) {
                        i2 = 3;
                    } else if (i4 != 2) {
                        i2 = i4 != 3 ? 2 : 5;
                    }
                    exovVar.copyOnWrite();
                    ((exow) exovVar.instance).b = exou.a(i2);
                    exooVar.a((exow) exovVar.build());
                    this.d.a();
                }
                int i5 = this.a.e;
                exonVar.copyOnWrite();
                ((exoz) exonVar.instance).d = i5;
                exop exopVar = (exop) exooVar.build();
                exonVar.copyOnWrite();
                exoz exozVar = (exoz) exonVar.instance;
                exopVar.getClass();
                exozVar.c = exopVar;
                exozVar.b = 3;
                i++;
            }
        }
        return (exoz) exonVar.build();
    }

    @Override // defpackage.ecsm
    public final void f() {
        if (this.al != null) {
            int i = 0;
            while (i < this.al.getChildCount()) {
                View childAt = this.al.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.ecsm, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.d = (ecqr) bundle.getParcelable("QuestionMetrics");
            this.ak = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.d == null) {
            this.d = new ecqr();
        }
        boolean[] zArr = this.ak;
        if (zArr == null) {
            exqd exqdVar = this.a;
            exnl exnlVar = (exqdVar.c == 5 ? (expm) exqdVar.d : expm.a).c;
            if (exnlVar == null) {
                exnlVar = exnl.a;
            }
            this.ak = new boolean[exnlVar.b.size()];
            return;
        }
        exqd exqdVar2 = this.a;
        exnl exnlVar2 = (exqdVar2.c == 5 ? (expm) exqdVar2.d : expm.a).c;
        if (exnlVar2 == null) {
            exnlVar2 = exnl.a;
        }
        if (zArr.length != exnlVar2.b.size()) {
            Log.e("SurveyMultiSelectFrag", "Saved instance state responses had incorrect length: " + this.ak.length);
            exqd exqdVar3 = this.a;
            exnl exnlVar3 = (exqdVar3.c == 5 ? (expm) exqdVar3.d : expm.a).c;
            if (exnlVar3 == null) {
                exnlVar3 = exnl.a;
            }
            this.ak = new boolean[exnlVar3.b.size()];
        }
    }

    @Override // defpackage.ecuy, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putParcelable("QuestionMetrics", this.d);
        bundle.putBooleanArray("ResponsesAsArray", this.ak);
    }

    @Override // defpackage.ecuy, defpackage.ecsm
    public final void p() {
        super.p();
        this.d.b();
        ecvr ecvrVarB = b();
        if (ecvrVarB != null) {
            ecvrVarB.q(t(), this);
        }
    }

    @Override // defpackage.ecuy
    public final View r() {
        this.al = (LinearLayout) LayoutInflater.from(z()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        ecsz ecszVar = new ecsz(z());
        ecszVar.c = new ecsy() { // from class: ecsp
            @Override // defpackage.ecsy
            public final void a(ecsx ecsxVar) {
                ecsq ecsqVar = this.a;
                ecvr ecvrVarB = ecsqVar.b();
                if (ecvrVarB == null) {
                    Log.w("SurveyMultiSelectFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                } else {
                    if (!ecsxVar.a()) {
                        ecvrVarB.t(false);
                        return;
                    }
                    ecsqVar.e = ecsxVar;
                    ecsqVar.d.a();
                    ecvrVarB.q(ecsqVar.t(), ecsqVar);
                }
            }
        };
        exqd exqdVar = this.a;
        ecszVar.a(exqdVar.c == 5 ? (expm) exqdVar.d : expm.a, this.ak);
        this.al.addView(ecszVar);
        return this.al;
    }

    @Override // defpackage.ecuy
    public final String s() {
        return this.a.g.isEmpty() ? this.a.f : this.a.g;
    }

    public final boolean t() {
        ecsx ecsxVar = this.e;
        if (ecsxVar == null) {
            return false;
        }
        return ecsxVar.a();
    }
}
