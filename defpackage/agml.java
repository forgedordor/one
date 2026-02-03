package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agml implements adaq {
    private final Context a;
    private final cgry b;
    private final cgrz c;
    private final crbi d;
    private TextView e;
    private cpdw f;

    public agml(Context context, cgry cgryVar, cgrz cgrzVar, crbi crbiVar) {
        context.getClass();
        cgryVar.getClass();
        cgrzVar.getClass();
        crbiVar.getClass();
        this.a = context;
        this.b = cgryVar;
        this.c = cgrzVar;
        this.d = crbiVar;
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
        if (adaoVar.Y()) {
            return;
        }
        String strI = adaoVar.I();
        if (strI == null || strI.length() == 0) {
            if (tet.a() && adaoVar.U()) {
                return;
            }
            cpdw cpdwVar = null;
            if (!adaoVar.W()) {
                cpdw cpdwVar2 = this.f;
                if (cpdwVar2 == null) {
                    fdbq.c("nudgeTextViewStubber");
                } else {
                    cpdwVar = cpdwVar2;
                }
                cpdwVar.g(8);
                return;
            }
            cpdw cpdwVar3 = this.f;
            if (cpdwVar3 == null) {
                fdbq.c("nudgeTextViewStubber");
                cpdwVar3 = null;
            }
            cpdwVar3.g(0);
            cpdw cpdwVar4 = this.f;
            if (cpdwVar4 == null) {
                fdbq.c("nudgeTextViewStubber");
            } else {
                cpdwVar = cpdwVar4;
            }
            TextView textView = (TextView) cpdwVar.b();
            this.e = textView;
            if (textView != null) {
                String strG = adaoVar.G();
                if (strG == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                textView.setText(strG);
            }
            int iD = eehg.d(this.a, R.attr.colorPrimaryBrandNonIcon, "NudgeViewPart");
            TextView textView2 = this.e;
            if (textView2 != null) {
                textView2.setTextColor(iD);
            }
            MessageIdType messageIdTypeX = adaoVar.k().x();
            ConversationIdType conversationIdTypeW = adaoVar.k().w();
            ezgd ezgdVarC = adaoVar.k().C();
            if (messageIdTypeX.c() || conversationIdTypeW.b() || ezgdVarC == null) {
                return;
            }
            this.d.j(messageIdTypeX, conversationIdTypeW, ezgdVarC, elpn.SHOWN);
        }
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.f = new cpdw(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        acyxVar.getClass();
        boolean z = false;
        if (!crbf.g()) {
            adanVar.h(false);
            return;
        }
        long jO = acyxVar.o();
        boolean zAa = baea.aa(acyxVar.i());
        if (acyxVar.C() != null && this.b.a(jO)) {
            z = true;
        }
        adanVar.h(z);
        if (z) {
            ((adaj) adanVar).r = this.c.a(jO, zAa);
        }
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        adaoVar.getClass();
        adaoVar2.getClass();
        return (adaoVar.W() == adaoVar2.W() && fdbq.f(adaoVar.G(), adaoVar2.G())) ? false : true;
    }
}
