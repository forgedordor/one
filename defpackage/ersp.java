package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersp extends ertn {
    public final ersx a;
    public final erwp b;

    private ersp(ersx ersxVar, erwp erwpVar) {
        this.a = ersxVar;
        this.b = erwpVar;
    }

    public static ersp c(ersx ersxVar, erwp erwpVar) throws GeneralSecurityException {
        if (ersxVar.d() == erwpVar.a()) {
            return new ersp(ersxVar, erwpVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // defpackage.ertn, defpackage.eqsg
    public final /* synthetic */ eqst a() {
        return this.a;
    }
}
