package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecvb extends ecuy {
    public int ak;
    private LinearLayout al;
    private ecqr am;
    public String d;
    public int e = -1;

    @Override // defpackage.ecsm
    public final exoz e() {
        exon exonVar = (exon) exoz.a.createBuilder();
        if (this.am.c() && this.d != null) {
            this.am.a();
            exov exovVar = (exov) exow.a.createBuilder();
            int i = this.e;
            exovVar.copyOnWrite();
            ((exow) exovVar.instance).c = i;
            int i2 = this.ak;
            exovVar.copyOnWrite();
            ((exow) exovVar.instance).b = exou.a(i2);
            String str = this.d;
            exovVar.copyOnWrite();
            exow exowVar = (exow) exovVar.instance;
            str.getClass();
            exowVar.d = str;
            exow exowVar2 = (exow) exovVar.build();
            exox exoxVar = (exox) exoy.a.createBuilder();
            exoxVar.copyOnWrite();
            exoy exoyVar = (exoy) exoxVar.instance;
            exowVar2.getClass();
            exoyVar.c = exowVar2;
            exoyVar.b |= 1;
            exoy exoyVar2 = (exoy) exoxVar.build();
            exonVar.copyOnWrite();
            exoz exozVar = (exoz) exonVar.instance;
            exoyVar2.getClass();
            exozVar.c = exoyVar2;
            exozVar.b = 2;
            int i3 = this.a.e;
            exonVar.copyOnWrite();
            ((exoz) exonVar.instance).d = i3;
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
            this.d = bundle.getString("SelectedResponse", null);
            this.am = (ecqr) bundle.getParcelable("QuestionMetrics");
        }
        if (this.am == null) {
            this.am = new ecqr();
        }
    }

    @Override // defpackage.ecuy, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.am);
    }

    @Override // defpackage.ecuy, defpackage.ecsm
    public final void p() {
        EditText editText;
        super.p();
        this.am.b();
        ecvr ecvrVarB = b();
        if (ecvrVarB != null) {
            LinearLayout linearLayout = this.al;
            boolean z = false;
            if (linearLayout != null && (editText = (EditText) linearLayout.findViewById(R.id.survey_other_option)) != null && editText.hasFocus()) {
                z = true;
            }
            ecvrVarB.q(z, this);
        }
    }

    @Override // defpackage.ecuy
    public final View r() {
        View viewInflate = LayoutInflater.from(z()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null);
        this.al = (LinearLayout) viewInflate.findViewById(R.id.survey_answers_container);
        ecvj ecvjVar = new ecvj(z());
        ecvjVar.a = new ecvh() { // from class: ecva
            @Override // defpackage.ecvh
            public final void a(ecvi ecviVar) {
                ecvb ecvbVar = this.a;
                ecvr ecvrVarB = ecvbVar.b();
                if (ecvrVarB == null) {
                    Log.w("SurveyMultiChoiceFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                    return;
                }
                int i = ecviVar.c;
                ecvbVar.ak = i;
                ecvbVar.d = ecviVar.a;
                ecvbVar.e = ecviVar.b;
                if (i == 4) {
                    ecvrVarB.t(true);
                } else {
                    ecvrVarB.p();
                }
            }
        };
        exqd exqdVar = this.a;
        ecvjVar.a(exqdVar.c == 4 ? (exqz) exqdVar.d : exqz.a);
        this.al.addView(ecvjVar);
        if (!b().aY()) {
            viewInflate.setPadding(viewInflate.getPaddingLeft(), viewInflate.getPaddingTop(), viewInflate.getPaddingRight(), B().getDimensionPixelSize(R.dimen.survey_bottom_padding));
        }
        return viewInflate;
    }

    @Override // defpackage.ecuy
    public final String s() {
        return this.a.g.isEmpty() ? this.a.f : this.a.g;
    }
}
