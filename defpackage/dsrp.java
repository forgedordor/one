package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsrp {
    private final dspg a;

    public dsrp(dspg dspgVar) {
        this.a = dspgVar;
    }

    public final View a(eg egVar, etoh etohVar) {
        int i = etohVar.c;
        int iA = etog.a(i);
        if (iA == 0) {
            throw null;
        }
        int i2 = iA - 1;
        if (i2 == 0) {
            return this.a.a(egVar, null, i == 1 ? (String) etohVar.d : "");
        }
        if (i2 == 1) {
            return this.a.b(egVar, null, i == 8 ? (String) etohVar.d : "");
        }
        if (i2 != 2) {
            return null;
        }
        dspg dspgVar = this.a;
        if (i == 9) {
            ((Integer) etohVar.d).intValue();
        }
        return dspgVar.d(egVar);
    }
}
