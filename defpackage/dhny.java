package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dhny implements dhnz {
    private static final evqs b = evqs.A("hades-persephone");
    public final eqsj a;

    public dhny() throws GeneralSecurityException {
        erbc.a();
        this.a = new eqsj(erex.a.c());
    }

    protected abstract eqso a();

    @Override // defpackage.dhnz
    public final eqso b() {
        return a().e();
    }

    @Override // defpackage.dhnz
    public final byte[] c(evqs evqsVar, evqs evqsVar2) {
        byte[] bArrI;
        eqse eqseVar = (eqse) a().h(erfz.a, eqse.class);
        byte[] bArrI2 = evqsVar.I();
        if (evqsVar2 == null || (bArrI = evqsVar2.I()) == null) {
            bArrI = b.I();
        }
        byte[] bArrA = eqseVar.a(bArrI2, bArrI);
        bArrA.getClass();
        return bArrA;
    }
}
