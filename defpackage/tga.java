package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tga implements adaq {
    public final tfh a;
    private final Context b;
    private final fdjx c;
    private final teu d;
    private final String e;
    private TextView f;
    private cpdw g;

    public tga(Context context, fdjx fdjxVar, tfh tfhVar, teu teuVar) {
        context.getClass();
        fdjxVar.getClass();
        teuVar.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.a = tfhVar;
        this.d = teuVar;
        this.e = "BirthdayViewPart";
    }

    @Override // defpackage.adaq
    public final adao a(adao adaoVar) {
        adaoVar.getClass();
        adan adanVarM = adaoVar.m();
        d(adanVarM, adaoVar.k());
        return adanVarM.a();
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        adaoVar.getClass();
        if (adaoVar.Y() || !TextUtils.isEmpty(adaoVar.I())) {
            return;
        }
        cpdw cpdwVar = null;
        if (!adaoVar.U()) {
            if (crbf.g() && adaoVar.W()) {
                return;
            }
            cpdw cpdwVar2 = this.g;
            if (cpdwVar2 == null) {
                fdbq.c("birthdayTextViewStubber");
            } else {
                cpdwVar = cpdwVar2;
            }
            cpdwVar.g(8);
            return;
        }
        cpdw cpdwVar3 = this.g;
        if (cpdwVar3 == null) {
            fdbq.c("birthdayTextViewStubber");
            cpdwVar3 = null;
        }
        cpdwVar3.g(0);
        cpdw cpdwVar4 = this.g;
        if (cpdwVar4 == null) {
            fdbq.c("birthdayTextViewStubber");
        } else {
            cpdwVar = cpdwVar4;
        }
        TextView textView = (TextView) cpdwVar.b();
        this.f = textView;
        if (textView != null) {
            String strD = adaoVar.D();
            strD.getClass();
            textView.setText(strD);
        }
        int iD = eehg.d(this.b, R.attr.colorPrimaryBrandNonIcon, this.e);
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.setTextColor(iD);
        }
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.g = new cpdw(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        acyxVar.getClass();
        if (!tfy.a(acyxVar)) {
            adanVar.f(false);
            return;
        }
        String strA = this.d.a(acyxVar.L(), acyxVar.M());
        adanVar.f(true);
        ((adaj) adanVar).B = strA;
        auvw.k(this.c, null, null, new tfz(this, acyxVar, null), 3);
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        adaoVar.getClass();
        adaoVar2.getClass();
        return (adaoVar.U() == adaoVar2.U() && TextUtils.equals(adaoVar.D(), adaoVar2.D())) ? false : true;
    }
}
