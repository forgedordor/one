package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erox extends erqv {
    public final eroq a;
    public final erwn b;
    public final erwn c;
    public final Integer d;

    private erox(eroq eroqVar, erwn erwnVar, erwn erwnVar2, Integer num) {
        this.a = eroqVar;
        this.b = erwnVar;
        this.c = erwnVar2;
        this.d = num;
    }

    public static erox d(erop eropVar, erwn erwnVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarA;
        eroq eroqVar = new eroq(eropVar);
        erop eropVar2 = erop.d;
        if (!eropVar.equals(eropVar2) && num == null) {
            throw new GeneralSecurityException("For given Variant " + eropVar.e + " the value of idRequirement must be non-null");
        }
        if (eropVar.equals(eropVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (erwnVar.a() != 32) {
            throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + erwnVar.a());
        }
        erop eropVar3 = eroqVar.a;
        if (eropVar3 == eropVar2) {
            erwnVarA = erfc.a;
        } else if (eropVar3 == erop.b || eropVar3 == erop.c) {
            erwnVarA = erfc.a(num.intValue());
        } else {
            if (eropVar3 != erop.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(eropVar3.e));
            }
            erwnVarA = erfc.b(num.intValue());
        }
        return new erox(eroqVar, erwnVar, erwnVarA, num);
    }

    @Override // defpackage.erqv, defpackage.eqsg
    public final /* synthetic */ eqst a() {
        return this.a;
    }

    @Override // defpackage.eqsg
    public final Integer b() {
        return this.d;
    }

    @Override // defpackage.erqv
    public final erwn c() {
        return this.c;
    }
}
