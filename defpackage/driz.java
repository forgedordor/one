package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.RatingView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class driz extends drim {
    public dria ag;
    private final drio ah = new drio();
    private TextView ai;
    public String d;
    public int e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.hats_survey_question_rating, viewGroup, false);
        viewInflate.setContentDescription(this.a.c);
        drij.b((ImageView) viewInflate.findViewById(R.id.hats_lib_rating_banner_logo), this.m.getInt("DispalyLogoResId", 0));
        TextView textView = (TextView) viewInflate.findViewById(R.id.hats_lib_survey_question_text);
        this.ai = textView;
        textView.setText(dril.a(this.a.c));
        this.ai.setContentDescription(this.a.c);
        RatingView ratingView = (RatingView) viewInflate.findViewById(R.id.hats_lib_rating_view);
        erwy erwyVar = this.a.f;
        if (erwyVar == null) {
            erwyVar = erwy.a;
        }
        ratingView.b(erwyVar, this.a.g);
        ratingView.a = new driy(this);
        if (!this.J) {
            this.ah.b((drin) G(), viewInflate);
        }
        return viewInflate;
    }

    @Override // defpackage.drim
    public final erxa b() {
        erwz erwzVar = (erwz) erxa.a.createBuilder();
        if (this.ag.e()) {
            int iA = (int) this.ag.a();
            erwzVar.copyOnWrite();
            ((erxa) erwzVar.instance).d = iA;
            if (this.d != null) {
                erwzVar.copyOnWrite();
                ((erxa) erwzVar.instance).e = erxb.a(3);
                erwv erwvVar = (erwv) erww.a.createBuilder();
                int i = this.e;
                erwvVar.copyOnWrite();
                ((erww) erwvVar.instance).b = i;
                float f = this.e;
                erwvVar.copyOnWrite();
                ((erww) erwvVar.instance).c = f;
                String str = this.d;
                erwvVar.copyOnWrite();
                erww erwwVar = (erww) erwvVar.instance;
                str.getClass();
                erwwVar.e = str;
                erwzVar.a((erww) erwvVar.build());
                Log.d("HatsLibRatingFragment", "Selected response: ".concat(String.valueOf(this.d)));
            }
        }
        return (erxa) erwzVar.build();
    }

    @Override // defpackage.drim
    public final String e() {
        return this.ai.getText().toString();
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
        this.ah.a();
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
        ((driw) G()).F(r(), this);
    }

    @Override // defpackage.drim
    public final void q(String str) {
        this.ai.setText(dril.a(str));
        this.ai.setContentDescription(str);
    }

    public final boolean r() {
        return this.d != null;
    }
}
