package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjde extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aufg aufgVar = (aufg) obj;
        int iOrdinal = aufgVar.ordinal();
        if (iOrdinal == 0) {
            return cjhb.DISPOSITION_NOTIFICATION_TYPE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return cjhb.DISPOSITION_NOTIFICATION_TYPE_POSITIVE_DELIVERY;
        }
        if (iOrdinal == 2) {
            return cjhb.DISPOSITION_NOTIFICATION_TYPE_DISPLAY;
        }
        if (iOrdinal == 3) {
            return cjhb.DISPOSITION_NOTIFICATION_TYPE_NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aufgVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjhb cjhbVar = (cjhb) obj;
        int iOrdinal = cjhbVar.ordinal();
        if (iOrdinal == 0) {
            return aufg.UNKNOWN_REQUESTED_REPORT;
        }
        if (iOrdinal == 1) {
            return aufg.POSITIVE_DELIVERY;
        }
        if (iOrdinal == 2) {
            return aufg.DISPLAY;
        }
        if (iOrdinal == 3) {
            return aufg.NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cjhbVar.toString()));
    }
}
