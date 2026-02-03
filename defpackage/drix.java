package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drix extends drje {
    private dria ag;
    public EditText d;
    private final drio e = new drio();

    @Override // defpackage.drje, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM = super.M(layoutInflater, viewGroup, bundle);
        viewM.setContentDescription(this.a.c);
        if (!this.J) {
            this.e.b((drin) G(), viewM);
        }
        return viewM;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        ((driw) G()).F(true, this);
    }

    @Override // defpackage.drim
    public final erxa b() {
        erwz erwzVar = (erwz) erxa.a.createBuilder();
        if (this.ag.e()) {
            this.ag.b();
            int iA = (int) this.ag.a();
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).d = iA;
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).c = erxc.a(5);
            int i = this.c;
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).b = i;
            String string = this.d.getText().toString();
            if (string.trim().isEmpty()) {
                erwv erwvVar = (erwv) erww.a.createBuilder();
                erwvVar.copyOnWrite();
                ((erww) erwvVar.instance).f = "skipped";
                erwzVar.a((erww) erwvVar.build());
                erwzVar.copyOnWrite();
                ((erxa) erwzVar.instance).e = erxb.a(4);
            } else {
                erwv erwvVar2 = (erwv) erww.a.createBuilder();
                String strTrim = string.trim();
                erwvVar2.copyOnWrite();
                erww erwwVar = (erww) erwvVar2.instance;
                strTrim.getClass();
                erwwVar.f = strTrim;
                erwzVar.a((erww) erwvVar2.build());
                erwzVar.copyOnWrite();
                ((erxa) erwzVar.instance).e = erxb.a(3);
            }
        }
        return (erxa) erwzVar.build();
    }

    @Override // defpackage.drim, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            this.ag = new dria();
        } else {
            this.ag = (dria) bundle.getParcelable("QuestionMetrics");
        }
    }

    @Override // defpackage.ea
    public final void j() {
        this.e.a();
        super.j();
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putParcelable("QuestionMetrics", this.ag);
    }

    @Override // defpackage.drim
    public final void p() {
        this.ag.c();
        ((driw) G()).F(true, this);
    }

    @Override // defpackage.drje
    public final View r() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(z());
        View viewInflate = layoutInflaterFrom.inflate(R.layout.hats_survey_scrollable_answer_content_container, (ViewGroup) null);
        viewInflate.setMinimumHeight(B().getDimensionPixelSize(R.dimen.hats_lib_open_text_question_min_height));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.hats_lib_survey_answers_container);
        layoutInflaterFrom.inflate(R.layout.hats_survey_question_open_text_item, (ViewGroup) linearLayout, true);
        EditText editText = (EditText) linearLayout.findViewById(R.id.hats_lib_survey_open_text);
        this.d = editText;
        editText.setSingleLine(false);
        this.d.setHint(B().getString(R.string.hats_lib_open_text_hint));
        return linearLayout;
    }

    @Override // defpackage.drje
    public final String s() {
        return this.a.c;
    }
}
