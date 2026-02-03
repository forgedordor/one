package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efpj extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        efjx efjxVar = (efjx) obj;
        int iOrdinal = efjxVar.ordinal();
        if (iOrdinal == 0) {
            return cjie.UNKNOWN_MESSAGE_PRIORITY;
        }
        if (iOrdinal == 1) {
            return cjie.HIGH;
        }
        if (iOrdinal == 2) {
            return cjie.NORMAL;
        }
        if (iOrdinal == 3) {
            return cjie.LOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(efjxVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjie cjieVar = (cjie) obj;
        int iOrdinal = cjieVar.ordinal();
        if (iOrdinal == 0) {
            return efjx.UNKNOWN_MESSAGE_PRIORITY;
        }
        if (iOrdinal == 1) {
            return efjx.HIGH;
        }
        if (iOrdinal == 2) {
            return efjx.NORMAL;
        }
        if (iOrdinal == 3) {
            return efjx.LOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cjieVar.toString()));
    }
}
