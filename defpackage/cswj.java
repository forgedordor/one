package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cswj {
    private static final cqce d = cqce.g("Bugle", "VerifiedSmsKeyService");
    public final csve a;
    public final csvt b;
    public final eosc c;

    public cswj(csve csveVar, csvt csvtVar, eosc eoscVar) {
        this.a = csveVar;
        this.b = csvtVar;
        this.c = eoscVar;
        ejxx.a(new ejxr() { // from class: csvu
            @Override // defpackage.ejxr
            public final Object get() {
                return new eovc();
            }
        });
    }

    public static cswh a(KeyPair keyPair, csvg csvgVar) {
        evvp evvpVar;
        if (byew.a().booleanValue()) {
            throw new IllegalStateException();
        }
        evqs evqsVarX = evqs.x(keyPair.getPublic().getEncoded());
        if ((csvgVar.b & 1) != 0) {
            evvpVar = csvgVar.e;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
        } else {
            evvpVar = evxc.c;
        }
        return new csvh(evqsVarX, evvpVar);
    }

    static /* synthetic */ KeyPair b() {
        try {
            cqce cqceVar = d;
            cqceVar.p("Generating keys...");
            KeyPair keyPairC = erva.c(erdw.b);
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.I("Key pair info");
            cqbdVarC.y("private_size", keyPairC.getPrivate().getEncoded().length);
            cqbdVarC.y("public_size", keyPairC.getPublic().getEncoded().length);
            cqbdVarC.M("private_class", keyPairC.getPrivate().getClass().getName());
            cqbdVarC.M("public_class", keyPairC.getPublic().getClass().getName());
            cqbdVarC.r();
            return keyPairC;
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e) {
            cqbd cqbdVarB = d.b();
            cqbdVarB.I("Error while generating key pair.");
            cqbdVarB.s(e);
            throw new RuntimeException("Error while generating new key pair.", e);
        }
    }
}
