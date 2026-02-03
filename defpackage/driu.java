package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class driu extends drje {
    public ViewGroup ag;
    private final drio al = new drio();
    private dria am;
    public boolean[] d;
    public boolean e;

    private final void aV(String str, boolean z, int i, String str2) {
        LayoutInflater.from(z()).inflate(R.layout.hats_survey_question_multiple_select_item, this.ag, true);
        FrameLayout frameLayout = (FrameLayout) this.ag.getChildAt(i);
        CheckBox checkBox = (CheckBox) frameLayout.findViewById(R.id.hats_lib_multiple_select_checkbox);
        checkBox.setText(str);
        checkBox.setContentDescription(str);
        checkBox.setChecked(z);
        checkBox.setOnCheckedChangeListener(new drit(this, i));
        frameLayout.setOnClickListener(new dris(checkBox));
        if (str2 != null) {
            checkBox.setTag(str2);
        }
    }

    @Override // defpackage.drje, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM = super.M(layoutInflater, viewGroup, bundle);
        viewM.setContentDescription(this.a.c);
        if (!this.J) {
            this.al.b((drin) G(), viewM);
        }
        return viewM;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        ((driw) G()).F(t(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.drim
    public final erxa b() {
        erwz erwzVar = (erwz) erxa.a.createBuilder();
        if (this.am.e()) {
            if (this.e) {
                erwv erwvVar = (erwv) erww.a.createBuilder();
                erwvVar.copyOnWrite();
                ((erww) erwvVar.instance).d = erws.a(4);
                erwzVar.a((erww) erwvVar.build());
                this.am.b();
            } else {
                evtg evtgVar = this.a.e;
                int i = 0;
                while (true) {
                    boolean[] zArr = this.d;
                    if (i >= zArr.length) {
                        break;
                    }
                    if (zArr[i]) {
                        erwv erwvVar2 = (erwv) erww.a.createBuilder();
                        erwvVar2.copyOnWrite();
                        ((erww) erwvVar2.instance).b = i;
                        erwvVar2.copyOnWrite();
                        ((erww) erwvVar2.instance).d = erws.a(3);
                        String str = ((erwr) evtgVar.get(i)).b;
                        erwvVar2.copyOnWrite();
                        erww erwwVar = (erww) erwvVar2.instance;
                        str.getClass();
                        erwwVar.e = str;
                        erwzVar.a((erww) erwvVar2.build());
                        this.am.b();
                    }
                    i++;
                }
                if (((erxa) erwzVar.instance).g.size() > 0) {
                    int iNextInt = ((drhu) drhw.c()).b.nextInt(((erxa) erwzVar.instance).g.size());
                    erwv erwvVar3 = (erwv) ((erww) ((erxa) erwzVar.instance).g.get(iNextInt)).toBuilder();
                    erwvVar3.copyOnWrite();
                    ((erww) erwvVar3.instance).g = true;
                    erww erwwVar2 = (erww) erwvVar3.build();
                    erwzVar.copyOnWrite();
                    erxa erxaVar = (erxa) erwzVar.instance;
                    erxaVar.a();
                    erxaVar.g.remove(iNextInt);
                    erwzVar.copyOnWrite();
                    erxa erxaVar2 = (erxa) erwzVar.instance;
                    erwwVar2.getClass();
                    erxaVar2.a();
                    erxaVar2.g.add(iNextInt, erwwVar2);
                }
            }
            if (this.am.d()) {
                erwzVar.copyOnWrite();
                ((erxa) erwzVar.instance).e = erxb.a(3);
            }
            int i2 = this.c;
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).b = i2;
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).c = erxc.a(4);
            int iA = (int) this.am.a();
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).d = iA;
        }
        return (erxa) erwzVar.build();
    }

    @Override // defpackage.drim
    public final void f() {
        boolean z = ((drhu) drhw.c()).c;
        if (this.ag != null) {
            int i = 0;
            while (i < this.ag.getChildCount()) {
                View childAt = this.ag.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.drim, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.e = bundle.getBoolean("NoneOfTheAboveAsBoolean", false);
            this.am = (dria) bundle.getParcelable("QuestionMetrics");
            this.d = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.am == null) {
            this.am = new dria();
        }
        boolean[] zArr = this.d;
        if (zArr == null) {
            this.d = new boolean[this.a.e.size()];
            return;
        }
        if (zArr.length != this.a.e.size()) {
            Log.e("HatsLibMultiSelectFrag", "Saved instance state responses had incorrect length: " + this.d.length);
            this.d = new boolean[this.a.e.size()];
        }
    }

    @Override // defpackage.ea
    public final void j() {
        this.al.a();
        super.j();
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putBoolean("NoneOfTheAboveAsBoolean", this.e);
        bundle.putParcelable("QuestionMetrics", this.am);
        bundle.putBooleanArray("ResponsesAsArray", this.d);
    }

    @Override // defpackage.drim
    public final void p() {
        this.am.c();
        ((driw) G()).F(t(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.drje
    public final View r() {
        this.ag = (LinearLayout) LayoutInflater.from(z()).inflate(R.layout.hats_survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.hats_lib_survey_answers_container);
        evtg evtgVar = this.a.e;
        for (int i = 0; i < evtgVar.size(); i++) {
            aV(((erwr) evtgVar.get(i)).b, this.d[i], i, null);
        }
        aV(B().getString(R.string.hats_lib_none_of_the_above), this.e, evtgVar.size(), "NoneOfTheAbove");
        return this.ag;
    }

    @Override // defpackage.drje
    public final String s() {
        return this.a.c;
    }

    public final boolean t() {
        if (this.e) {
            return true;
        }
        for (boolean z : this.d) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
