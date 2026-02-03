package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecug extends ecsm {
    public ecqr ag;
    private TextView ah;
    public String d;
    public int e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(R.layout.survey_question_rating_fragment, viewGroup, false);
        Bundle bundle2 = this.m;
        ecrq.c((ImageView) viewInflate.findViewById(R.id.survey_prompt_banner_logo), bundle2.containsKey("DisplayLogoResId") ? Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)) : null);
        CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            charSequence = Html.fromHtml(this.a.g.isEmpty() ? this.a.f : this.a.g, 0);
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.survey_question_text);
        this.ah = textView;
        textView.setText(charSequence);
        this.ah.setContentDescription(charSequence.toString());
        ecuv ecuvVar = new ecuv(z());
        exqd exqdVar = this.a;
        ecuvVar.d(exqdVar.c == 6 ? (exqi) exqdVar.d : exqi.a);
        ecuvVar.a = new ecuu() { // from class: ecuf
            @Override // defpackage.ecuu
            public final void a(int i) {
                ecug ecugVar = this.a;
                ecugVar.d = Integer.toString(i);
                ecugVar.e = i;
                ecugVar.ag.a();
                int iA = exqc.a(ecugVar.a.i);
                if (iA == 0) {
                    iA = 1;
                }
                ecvr ecvrVarB = ecugVar.b();
                if (ecvrVarB == null) {
                    Log.w("SurveyRatingFragment", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                } else if (iA == 5) {
                    ecvrVarB.p();
                } else {
                    ecvrVarB.q(ecugVar.r(), ecugVar);
                }
            }
        };
        ((ViewGroup) viewInflate.findViewById(R.id.survey_rating_container)).addView(ecuvVar);
        return viewInflate;
    }

    @Override // defpackage.ecsm
    public final exoz e() {
        exon exonVar = (exon) exoz.a.createBuilder();
        if (this.ag.c() && this.d != null) {
            exov exovVar = (exov) exow.a.createBuilder();
            int i = this.e;
            exovVar.copyOnWrite();
            ((exow) exovVar.instance).c = i;
            exovVar.copyOnWrite();
            ((exow) exovVar.instance).b = exou.a(3);
            String str = this.d;
            exovVar.copyOnWrite();
            exow exowVar = (exow) exovVar.instance;
            str.getClass();
            exowVar.d = str;
            exow exowVar2 = (exow) exovVar.build();
            exos exosVar = (exos) exot.a.createBuilder();
            exosVar.copyOnWrite();
            exot exotVar = (exot) exosVar.instance;
            exowVar2.getClass();
            exotVar.c = exowVar2;
            exotVar.b |= 1;
            exot exotVar2 = (exot) exosVar.build();
            int i2 = this.a.e;
            exonVar.copyOnWrite();
            ((exoz) exonVar.instance).d = i2;
            exonVar.copyOnWrite();
            exoz exozVar = (exoz) exonVar.instance;
            exotVar2.getClass();
            exozVar.c = exotVar2;
            exozVar.b = 4;
            long j = ecse.a;
        }
        return (exoz) exonVar.build();
    }

    @Override // defpackage.ecsm, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.ag = (ecqr) bundle.getParcelable("QuestionMetrics");
        }
        if (this.ag == null) {
            this.ag = new ecqr();
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.ag);
        TextView textView = this.ah;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }

    @Override // defpackage.ecsm
    public final void p() {
        TextView textView;
        this.ag.b();
        if (b() != null) {
            b().aZ();
        }
        b().q(r(), this);
        if (!ecse.j(z()) || (textView = this.ah) == null) {
            return;
        }
        textView.requestFocus();
        this.ah.sendAccessibilityEvent(8);
    }

    @Override // defpackage.ecsm
    public final void q(String str) {
        ecsj ecsjVar = ecrz.c;
        if (ecrz.b(fblh.c(ecrz.b)) && (z() == null || this.ah == null)) {
            return;
        }
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        this.ah.setText(spannedFromHtml);
        this.ah.setContentDescription(spannedFromHtml.toString());
    }

    public final boolean r() {
        return this.d != null;
    }
}
