package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eear implements fdau {
    final /* synthetic */ edxi a;
    final /* synthetic */ Account b;

    public eear(edxi edxiVar, Account account) {
        this.a = edxiVar;
        this.b = account;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ecyg ecygVar = (ecyg) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ecygVar.getClass();
        hmlVar.v(-1633490746);
        final edxi edxiVar = this.a;
        boolean zF = hmlVar.F(edxiVar);
        final Account account = this.b;
        boolean zF2 = zF | hmlVar.F(account);
        Object objF = hmlVar.f();
        if (zF2 || objF == hmk.a) {
            objF = new fdae() { // from class: eeaq
                @Override // defpackage.fdae
                public final Object invoke() {
                    edxiVar.a(account);
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        dtdi.c(ecygVar.a((fdae) objF), null, false, null, null, null, null, edxr.a, hmlVar, 805306368, 510);
        return fctx.a;
    }
}
