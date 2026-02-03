package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjdg extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cjig cjigVar = (cjig) obj;
        int iOrdinal = cjigVar.ordinal();
        if (iOrdinal == 0) {
            return aufw.UNKNOWN_MESSAGE_SOURCE;
        }
        if (iOrdinal == 1) {
            return aufw.USER;
        }
        if (iOrdinal == 2) {
            return aufw.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cjigVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aufw aufwVar = (aufw) obj;
        int iOrdinal = aufwVar.ordinal();
        if (iOrdinal == 0) {
            return cjig.UNKNOWN_MESSAGE_SOURCE;
        }
        if (iOrdinal == 1) {
            return cjig.USER;
        }
        if (iOrdinal == 2) {
            return cjig.CONTROL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aufwVar.toString()));
    }
}
