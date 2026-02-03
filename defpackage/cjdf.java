package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjdf extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cjie cjieVar = (cjie) obj;
        int iOrdinal = cjieVar.ordinal();
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
        throw new IllegalArgumentException("unknown enum value: ".concat(cjieVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aufu aufuVar = (aufu) obj;
        int iOrdinal = aufuVar.ordinal();
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
        throw new IllegalArgumentException("unknown enum value: ".concat(aufuVar.toString()));
    }
}
