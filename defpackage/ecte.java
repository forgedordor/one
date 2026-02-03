package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecte extends ecuy {
    public String d;
    private ecqr e;

    private final ecth t(String str) {
        ecth ecthVar = new ecth(z());
        ((EditText) ecthVar.findViewById(R.id.survey_open_text)).setText(str);
        exqd exqdVar = this.a;
        ecthVar.a(exqdVar.c == 7 ? (expo) exqdVar.d : expo.a);
        ecthVar.a = new ectg() { // from class: ectd
            @Override // defpackage.ectg
            public final void a(String str2) {
                this.a.d = str2;
            }
        };
        return ecthVar;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        ecvr ecvrVarB = b();
        if (ecvrVarB != null) {
            ecvrVarB.q(true, this);
        }
    }

    @Override // defpackage.ecsm
    public final exoz e() {
        exon exonVar = (exon) exoz.a.createBuilder();
        if (this.e.c()) {
            this.e.a();
            String strB = ejwk.b(this.d);
            exoq exoqVar = (exoq) exor.a.createBuilder();
            exoqVar.copyOnWrite();
            ((exor) exoqVar.instance).b = strB;
            exor exorVar = (exor) exoqVar.build();
            int i = this.a.e;
            exonVar.copyOnWrite();
            ((exoz) exonVar.instance).d = i;
            exonVar.copyOnWrite();
            exoz exozVar = (exoz) exonVar.instance;
            exorVar.getClass();
            exozVar.c = exorVar;
            exozVar.b = 5;
        }
        return (exoz) exonVar.build();
    }

    @Override // defpackage.ecsm, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            this.e = new ecqr();
        } else {
            this.e = (ecqr) bundle.getParcelable("QuestionMetrics");
        }
    }

    @Override // defpackage.ecuy, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putParcelable("QuestionMetrics", this.e);
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        View view;
        super.onConfigurationChanged(configuration);
        ecsj ecsjVar = ecrz.c;
        if (fblb.a.get().a(z()) && configuration.orientation == 2 && (view = this.Q) != null) {
            EditText editText = (EditText) view.findViewById(R.id.survey_open_text);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.survey_answers_container);
            if (linearLayout == null || editText == null) {
                return;
            }
            linearLayout.removeAllViews();
            linearLayout.addView(t(editText.getText().toString()));
        }
    }

    @Override // defpackage.ecuy, defpackage.ecsm
    public final void p() {
        super.p();
        this.e.b();
        ecvr ecvrVarB = b();
        if (ecvrVarB != null) {
            ecvrVarB.q(true, this);
        }
    }

    @Override // defpackage.ecuy
    public final View r() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(z()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        linearLayout.addView(t(""));
        return linearLayout;
    }

    @Override // defpackage.ecuy
    public final String s() {
        return this.a.g.isEmpty() ? this.a.f : this.a.g;
    }
}
