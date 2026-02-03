package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersi extends ertn {
    public final erso a;
    public final erwp b;

    private ersi(erso ersoVar, erwp erwpVar) {
        this.a = ersoVar;
        this.b = erwpVar;
    }

    public static ersi c(erso ersoVar, erwp erwpVar) throws GeneralSecurityException {
        if (ersoVar.e() == erwpVar.a()) {
            return new ersi(ersoVar, erwpVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // defpackage.ertn, defpackage.eqsg
    public final /* synthetic */ eqst a() {
        return this.a;
    }
}
