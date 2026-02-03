package defpackage;

import com.google.android.gms.auth.folsom.SharedKey;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpht implements cphr {
    private final fcsu a;
    private final ekgb b;
    private final eqrz c;

    /* JADX WARN: Multi-variable type inference failed */
    public cpht(fcsu fcsuVar, ekgb ekgbVar) throws GeneralSecurityException {
        this.a = fcsuVar;
        this.b = ekgbVar;
        eqtc.a();
        eqsm eqsmVar = new eqsm();
        ekqh it = ekgbVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            SharedKey sharedKey = (SharedKey) it.next();
            sharedKey.getClass();
            erwp erwpVarC = erwp.c(sharedKey.b);
            equi equiVar = new equi();
            equiVar.d();
            equiVar.c(erwpVarC.a());
            equiVar.b();
            equd equdVarA = equc.a(equiVar.a(), erwpVarC, null);
            eqsk eqskVar = new eqsk(equdVarA);
            Integer num = equdVarA.d;
            if (num != null) {
                eqskVar.b(num.intValue());
            }
            eqskVar.b(sharedKey.a);
            eqsmVar.c(eqskVar);
        }
        ((eqsk) eqsmVar.a.get(0)).a();
        this.c = (eqrz) eqsmVar.a().h(erfz.a, eqrz.class);
    }

    @Override // defpackage.cphr
    public final evqs a(evqs evqsVar) throws GeneralSecurityException {
        evqsVar.getClass();
        try {
            evqs evqsVarX = evqs.x(this.c.a(evqsVar.I(), null));
            ((ains) this.a.b()).c("Bugle.Gms.Folsom.Cryptor.Decryption.Succeeded.Count");
            return evqsVarX;
        } catch (GeneralSecurityException e) {
            ((ains) this.a.b()).c("Bugle.Gms.Folsom.Cryptor.Decryption.Failed.Count");
            throw e;
        }
    }

    @Override // defpackage.cphr
    public final evqs b(evqs evqsVar) throws GeneralSecurityException {
        try {
            evqs evqsVarX = evqs.x(this.c.b(evqsVar.I(), null));
            ((ains) this.a.b()).c("Bugle.Gms.Folsom.Cryptor.Encryption.Succeeded.Count");
            return evqsVarX;
        } catch (GeneralSecurityException e) {
            ((ains) this.a.b()).c("Bugle.Gms.Folsom.Cryptor.Encryption.Failed.Count");
            throw e;
        }
    }
}
