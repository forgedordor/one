package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmg {
    public static final int a(hml hmlVar) {
        return hmlVar.a();
    }

    public static final long b(hml hmlVar) {
        return hmlVar.b();
    }

    public static final hnb c(hml hmlVar) {
        hmw hmwVar = (hmw) hmlVar;
        hmwVar.ae(206, hmz.e);
        if (hmwVar.z) {
            hre.Y(hmwVar.u);
        }
        Object objR = hmwVar.R();
        hms hmsVar = objR instanceof hms ? (hms) objR : null;
        if (hmsVar == null) {
            hmsVar = new hms(new hmt(hmwVar, hmwVar.A, hmwVar.h, hmwVar.q));
            hmwVar.ai(hmsVar);
        }
        hxi hxiVarAk = hmwVar.ak();
        hmt hmtVar = hmsVar.a;
        hmtVar.b.b(hxiVarAk);
        hmwVar.ab();
        return hmtVar;
    }

    public static final hpx d(hml hmlVar) {
        hpx hpxVarP = ((hmw) hmlVar).P();
        if (hpxVarP == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        hpxVarP.n();
        return hpxVarP;
    }
}
