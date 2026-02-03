package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eror extends erqu {
    public final erox a;
    public final erwp b;

    private eror(erox eroxVar, erwp erwpVar) {
        this.a = eroxVar;
        this.b = erwpVar;
    }

    public static eror f(erox eroxVar, erwp erwpVar) throws GeneralSecurityException {
        if (erwpVar.a() == 32) {
            if (Arrays.equals(eroxVar.b.c(), erds.j(erds.i(erwpVar.d())))) {
                return new eror(eroxVar, erwpVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + erwpVar.a());
    }

    @Override // defpackage.erqu, defpackage.eqsu
    public final /* synthetic */ eqsg c() {
        return this.a;
    }

    @Override // defpackage.erqu, defpackage.eqsg
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final eroq a() {
        return this.a.a;
    }

    @Override // defpackage.erqu
    public final /* synthetic */ erqv e() {
        return this.a;
    }
}
