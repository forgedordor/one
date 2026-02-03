package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erbh {
    private static final ereb a = b();

    public static eqsc a() throws GeneralSecurityException {
        if (eqzb.a()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV1 in FIPS mode");
        }
        return a;
    }

    private static ereb b() {
        try {
            erfr erfrVar = new erfr();
            erfrVar.b(erbp.a);
            erfrVar.a(new erfn(eram.class, eqsf.class, new erfo() { // from class: erbd
                @Override // defpackage.erfo
                public final Object a(eqsg eqsgVar) {
                    return erus.b((eram) eqsgVar);
                }
            }));
            erfrVar.a(new erfn(erbb.class, eqsf.class, new erfo() { // from class: erbe
                @Override // defpackage.erfo
                public final Object a(eqsg eqsgVar) {
                    return ercm.b((erbb) eqsgVar);
                }
            }));
            erfrVar.b(erbl.a);
            erfrVar.a(new erfn(eral.class, eqse.class, new erfo() { // from class: erbf
                @Override // defpackage.erfo
                public final Object a(eqsg eqsgVar) {
                    return erur.b((eral) eqsgVar);
                }
            }));
            erfrVar.a(new erfn(erat.class, eqse.class, new erfo() { // from class: erbg
                @Override // defpackage.erfo
                public final Object a(eqsg eqsgVar) {
                    return ercl.b((erat) eqsgVar);
                }
            }));
            return new erea(new erft(erfrVar));
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
