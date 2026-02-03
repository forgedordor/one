package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eren extends eqsg {
    public final erfv a;
    public final erwn b;

    public eren(erfv erfvVar) throws GeneralSecurityException {
        erwn erwnVarA;
        this.a = erfvVar;
        if (erfvVar.d.equals(ermy.RAW)) {
            erwnVarA = erwn.b(new byte[0]);
        } else if (erfvVar.d.equals(ermy.TINK)) {
            erwnVarA = erfc.b(erfvVar.e.intValue());
        } else {
            if (!erfvVar.d.equals(ermy.LEGACY) && !erfvVar.d.equals(ermy.CRUNCHY)) {
                throw new GeneralSecurityException("Unknown output prefix type");
            }
            erwnVarA = erfc.a(erfvVar.e.intValue());
        }
        this.b = erwnVarA;
    }

    @Override // defpackage.eqsg
    public final eqst a() {
        erfv erfvVar = this.a;
        return new erem(erfvVar.a, erfvVar.d);
    }

    @Override // defpackage.eqsg
    public final Integer b() {
        return this.a.e;
    }
}
