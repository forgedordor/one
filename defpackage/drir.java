package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drir extends drje {
    private static final ekgp al;
    public dria ag;
    private LinearLayout am;
    public String d;
    private final drio an = new drio();
    public int e = -1;

    static {
        csq csqVar = new csq();
        csqVar.put(0, Integer.valueOf(R.drawable.ic_sentiment_very_satisfied_grey600_36dp));
        csqVar.put(1, Integer.valueOf(R.drawable.ic_sentiment_satisfied_grey600_36dp));
        csqVar.put(2, Integer.valueOf(R.drawable.ic_sentiment_neutral_grey600_36dp));
        csqVar.put(3, Integer.valueOf(R.drawable.ic_sentiment_dissatisfied_grey600_36dp));
        csqVar.put(4, Integer.valueOf(R.drawable.ic_sentiment_very_dissatisfied_grey600_36dp));
        al = ekgp.j(csqVar);
    }

    @Override // defpackage.drje, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM = super.M(layoutInflater, viewGroup, bundle);
        viewM.setContentDescription(this.a.c);
        if (!this.J) {
            this.an.b((drin) G(), viewM);
        }
        return viewM;
    }

    @Override // defpackage.drim
    public final erxa b() {
        erwz erwzVar = (erwz) erxa.a.createBuilder();
        if (this.ag.d()) {
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).e = erxb.a(3);
        }
        if (this.ag.e()) {
            if (this.d != null) {
                erwv erwvVar = (erwv) erww.a.createBuilder();
                int i = this.e;
                erwvVar.copyOnWrite();
                ((erww) erwvVar.instance).b = i;
                erwvVar.copyOnWrite();
                ((erww) erwvVar.instance).d = erws.a(3);
                String str = this.d;
                erwvVar.copyOnWrite();
                erww erwwVar = (erww) erwvVar.instance;
                str.getClass();
                erwwVar.e = str;
                erwvVar.copyOnWrite();
                ((erww) erwvVar.instance).g = true;
                erwzVar.a((erww) erwvVar.build());
            }
            int i2 = this.c;
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).b = i2;
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).c = erxc.a(3);
            int iA = (int) this.ag.a();
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).d = iA;
            evsx evsxVar = this.a.h;
            erwzVar.copyOnWrite();
            erxa erxaVar = (erxa) erwzVar.instance;
            evsx evsxVar2 = erxaVar.f;
            if (!evsxVar2.c()) {
                erxaVar.f = evsn.mutableCopy(evsxVar2);
            }
            evpz.addAll(evsxVar, erxaVar.f);
        }
        return (erxa) erwzVar.build();
    }

    @Override // defpackage.drim
    public final void f() {
        boolean z = ((drhu) drhw.c()).c;
        if (this.am != null) {
            int i = 0;
            while (i < this.am.getChildCount()) {
                View childAt = this.am.getChildAt(i);
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
            this.d = bundle.getString("SelectedResponse", null);
            this.ag = (dria) bundle.getParcelable("QuestionMetrics");
        }
        if (this.ag == null) {
            this.ag = new dria();
        }
    }

    @Override // defpackage.ea
    public final void j() {
        this.an.a();
        super.j();
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.ag);
    }

    @Override // defpackage.drim
    public final void p() {
        this.ag.c();
        ((driw) G()).F(false, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.drje
    public final View r() {
        List arrayList;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(z());
        View viewInflate = layoutInflaterFrom.inflate(R.layout.hats_survey_scrollable_answer_content_container, (ViewGroup) null);
        this.am = (LinearLayout) viewInflate.findViewById(R.id.hats_lib_survey_answers_container);
        View[] viewArr = new View[this.a.e.size()];
        evsx evsxVar = this.a.h;
        if (evsxVar.isEmpty() || evsxVar.size() != this.a.e.size()) {
            arrayList = this.a.e;
        } else {
            arrayList = new ArrayList();
            evtg evtgVar = this.a.e;
            for (int i = 0; i < evtgVar.size(); i++) {
                arrayList.add(i, (erwr) evtgVar.get(evsxVar.indexOf(Integer.valueOf(i))));
            }
        }
        boolean z = this.a.g && arrayList.size() == 5;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (z) {
                layoutInflaterFrom.inflate(R.layout.hats_survey_question_multiple_choice_with_smileys_item, (ViewGroup) this.am, true);
                View childAt = this.am.getChildAt(r8.getChildCount() - 1);
                viewArr[i2] = childAt;
                TextView textView = (TextView) childAt.findViewById(R.id.hats_lib_survey_multiple_choice_text);
                textView.setText(((erwr) arrayList.get(i2)).b);
                textView.setContentDescription(((erwr) arrayList.get(i2)).b);
                ((ImageView) viewArr[i2].findViewById(R.id.hats_lib_survey_multiple_choice_icon)).setImageDrawable(pop.b(B(), ((Integer) al.get(Integer.valueOf(i2))).intValue(), null));
            } else {
                layoutInflaterFrom.inflate(R.layout.hats_survey_question_multiple_choice_item, (ViewGroup) this.am, true);
                View childAt2 = this.am.getChildAt(r8.getChildCount() - 1);
                viewArr[i2] = childAt2;
                ((Button) childAt2).setText(((erwr) arrayList.get(i2)).b);
                ((Button) viewArr[i2]).setContentDescription(((erwr) arrayList.get(i2)).b);
            }
            viewArr[i2].setOnClickListener(new driq(this, viewArr, arrayList, i2));
        }
        return viewInflate;
    }

    @Override // defpackage.drje
    public final String s() {
        return this.a.c;
    }
}
