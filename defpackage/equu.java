package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equu extends eqtd {
    public final equz a;
    public final erwp b;
    public final erwn c;
    public final Integer d;

    private equu(equz equzVar, erwp erwpVar, erwn erwnVar, Integer num) {
        this.a = equzVar;
        this.b = erwpVar;
        this.c = erwnVar;
        this.d = num;
    }

    public static equu d(equy equyVar, erwp erwpVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarB;
        equy equyVar2 = equy.c;
        if (equyVar != equyVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + equyVar.d + " the value of idRequirement must be non-null");
        }
        if (equyVar == equyVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (erwpVar.a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + erwpVar.a());
        }
        equz equzVar = new equz(equyVar);
        equy equyVar3 = equzVar.a;
        if (equyVar3 == equyVar2) {
            erwnVarB = erfc.a;
        } else if (equyVar3 == equy.b) {
            erwnVarB = erfc.a(num.intValue());
        } else {
            if (equyVar3 != equy.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(equyVar3.d));
            }
            erwnVarB = erfc.b(num.intValue());
        }
        return new equu(equzVar, erwpVar, erwnVarB, num);
    }

    @Override // defpackage.eqtd, defpackage.eqsg
    public final /* synthetic */ eqst a() {
        return this.a;
    }

    @Override // defpackage.eqsg
    public final Integer b() {
        throw null;
    }

    @Override // defpackage.eqtd
    public final erwn c() {
        return this.c;
    }
}
