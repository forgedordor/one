package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ertl {
    private static final ereb a = b();

    public static eqsc a() throws GeneralSecurityException {
        if (eqzb.a()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant StreamingAead in FIPS mode");
        }
        return a;
    }

    private static ereb b() {
        try {
            erfr erfrVar = new erfr();
            erfrVar.b(ertq.a);
            erfrVar.a(new erfn(ersp.class, eqsz.class, new erfo() { // from class: ertj
                @Override // defpackage.erfo
                public final Object a(eqsg eqsgVar) {
                    return new erul((ersp) eqsgVar);
                }
            }));
            erfrVar.a(new erfn(ersi.class, eqsz.class, new erfo() { // from class: ertk
                @Override // defpackage.erfo
                public final Object a(eqsg eqsgVar) {
                    return new erud((ersi) eqsgVar);
                }
            }));
            return new erea(new erft(erfrVar));
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
