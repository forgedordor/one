package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efph extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        efjs efjsVar = (efjs) obj;
        int iOrdinal = efjsVar.ordinal();
        if (iOrdinal == 0) {
            return cjhb.DISPOSITION_NOTIFICATION_TYPE_POSITIVE_DELIVERY;
        }
        if (iOrdinal == 1) {
            return cjhb.DISPOSITION_NOTIFICATION_TYPE_DISPLAY;
        }
        if (iOrdinal == 2) {
            return cjhb.DISPOSITION_NOTIFICATION_TYPE_NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(efjsVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjhb cjhbVar = (cjhb) obj;
        int iOrdinal = cjhbVar.ordinal();
        if (iOrdinal == 1) {
            return efjs.POSITIVE_DELIVERY;
        }
        if (iOrdinal == 2) {
            return efjs.DISPLAY;
        }
        if (iOrdinal == 3) {
            return efjs.NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cjhbVar.toString()));
    }
}
