package defpackage;

import com.google.android.apps.messaging.gaia.signoutaccount.SignOutAccountViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdp implements fdat {
    final /* synthetic */ acec a;
    final /* synthetic */ dayp b;

    public acdp(acec acecVar, dayp daypVar) {
        this.a = acecVar;
        this.b = daypVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            acec acecVar = this.a;
            if (acecVar.a() == null) {
                hmlVar.v(1271951649);
                acex acexVar = (acex) ((SignOutAccountViewModel) acecVar.k.a()).a;
                acfl.f(fdtg.b(new fdui(new aceq(acexVar, null)), acexVar.b, fdur.a(0L, 3), null), hmlVar, 0);
                hmlVar.o();
            } else {
                hmlVar.v(1272042324);
                dayz.c(this.b, hmlVar, 0);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
