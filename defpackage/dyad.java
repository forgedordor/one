package defpackage;

import android.widget.TextView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyad {
    public final TextView a;
    private final TextView b;
    private final TextView c;
    private final AccountParticleDisc d;
    private final dxxk e;
    private final dyaf f;

    public dyad(dyae dyaeVar, dxxk dxxkVar, dyaf dyafVar) {
        this.d = dyaeVar.i();
        this.b = dyaeVar.g();
        this.c = dyaeVar.h();
        this.a = dyaeVar.f();
        dxxkVar.getClass();
        this.e = dxxkVar;
        this.f = dyafVar;
    }

    private static String b(String str) {
        return str.replace('-', (char) 8209);
    }

    private static String c(String str) {
        if (str != null) {
            return ejwk.a(str.trim());
        }
        return null;
    }

    public final void a(Object obj, dyac dyacVar) {
        dxxk dxxkVar = this.e;
        String strC = c(dxxkVar.e(obj));
        String strC2 = c(dxxkVar.c(obj));
        dyaf dyafVar = this.f;
        dxxr dxxrVar = dyafVar.b;
        if (true == ((dxxq) dxxr.a(obj, dxxkVar)).a) {
            strC2 = null;
        }
        if (strC == null) {
            strC = strC2;
        }
        String str = true != ecei.a(strC, strC2) ? strC2 : null;
        strC.getClass();
        String strB = b(strC);
        TextView textView = this.b;
        textView.setText(strB);
        if (str != null) {
            TextView textView2 = this.c;
            String strB2 = b(str);
            int[] iArr = ley.a;
            textView2.setImportantForAccessibility(2);
            strB = a.q(strB2, strB, "\n");
            textView2.setText(strB2);
            textView2.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        TextView textView3 = this.a;
        if (textView3 != null) {
            this.c.getVisibility();
            ejwi ejwiVar = dyafVar.a;
            if (ejwiVar.g()) {
                ejwiVar.c();
            }
            textView3.setVisibility(8);
        }
        String strA = dyacVar.a(strB);
        AccountParticleDisc accountParticleDisc = this.d;
        accountParticleDisc.l(obj);
        String strE = accountParticleDisc.e();
        if (strE != null) {
            strA = a.q(strE, strA, "\n");
        }
        textView.setContentDescription(strA);
    }
}
