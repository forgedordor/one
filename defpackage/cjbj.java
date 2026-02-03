package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjbj extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        efjy efjyVar = (efjy) obj;
        int iOrdinal = efjyVar.ordinal();
        if (iOrdinal == 0) {
            return aufw.UNKNOWN_MESSAGE_SOURCE;
        }
        if (iOrdinal == 1) {
            return aufw.USER;
        }
        if (iOrdinal == 2) {
            return aufw.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(efjyVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aufw aufwVar = (aufw) obj;
        int iOrdinal = aufwVar.ordinal();
        if (iOrdinal == 0) {
            return efjy.UNKNOWN_MESSAGE_SOURCE;
        }
        if (iOrdinal == 1) {
            return efjy.USER;
        }
        if (iOrdinal == 2) {
            return efjy.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aufwVar.toString()));
    }
}
