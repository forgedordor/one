package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efpk extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        efjy efjyVar = (efjy) obj;
        int iOrdinal = efjyVar.ordinal();
        if (iOrdinal == 0) {
            return cjig.UNKNOWN_MESSAGE_SOURCE;
        }
        if (iOrdinal == 1) {
            return cjig.USER;
        }
        if (iOrdinal == 2) {
            return cjig.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(efjyVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjig cjigVar = (cjig) obj;
        int iOrdinal = cjigVar.ordinal();
        if (iOrdinal == 0) {
            return efjy.UNKNOWN_MESSAGE_SOURCE;
        }
        if (iOrdinal == 1) {
            return efjy.USER;
        }
        if (iOrdinal == 2) {
            return efjy.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cjigVar.toString()));
    }
}
