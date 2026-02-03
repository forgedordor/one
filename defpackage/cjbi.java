package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjbi extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        efjx efjxVar = (efjx) obj;
        int iOrdinal = efjxVar.ordinal();
        if (iOrdinal == 0) {
            return aufu.UNKNOWN_MESSAGE_PRIORITY;
        }
        if (iOrdinal == 1) {
            return aufu.HIGH;
        }
        if (iOrdinal == 2) {
            return aufu.NORMAL;
        }
        if (iOrdinal == 3) {
            return aufu.LOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(efjxVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aufu aufuVar = (aufu) obj;
        int iOrdinal = aufuVar.ordinal();
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
        throw new IllegalArgumentException("unknown enum value: ".concat(aufuVar.toString()));
    }
}
