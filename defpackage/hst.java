package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hst extends hty {
    public static final hst a = new hst();

    private hst() {
        super(0, 4, 1);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [hnq, hpz] */
    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        how howVar = (how) hudVar.c(2);
        how howVar2 = (how) hudVar.c(3);
        hnb hnbVar = (hnb) hudVar.c(1);
        hov hovVarC = (hov) hudVar.c(0);
        if (hovVarC == null && (hovVarC = hnbVar.c(howVar)) == null) {
            hmz.h("Could not resolve state for movable content");
            throw new fcta();
        }
        if (hreVar.n > 0 || hreVar.j(hreVar.q + 1) != 1) {
            hmz.j("Check failed");
        }
        hra hraVar = hovVarC.a;
        int i = hreVar.q;
        int i2 = hreVar.i;
        int i3 = hreVar.j;
        hreVar.y(1);
        hreVar.M();
        hreVar.z();
        hre hreVarD = hraVar.d();
        try {
            List listA = hrd.a(hreVarD, 2, hreVar, false, true, true);
            hreVarD.A(true);
            hreVar.B();
            hreVar.X();
            hreVar.q = i;
            hreVar.i = i2;
            hreVar.j = i3;
            hpw.a(hreVar, listA, howVar2.c);
        } catch (Throwable th) {
            hreVarD.A(false);
            throw th;
        }
    }
}
