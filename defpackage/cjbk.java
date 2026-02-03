package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjbk extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aufg aufgVar = (aufg) obj;
        int iOrdinal = aufgVar.ordinal();
        if (iOrdinal == 1) {
            return efjs.POSITIVE_DELIVERY;
        }
        if (iOrdinal == 2) {
            return efjs.DISPLAY;
        }
        if (iOrdinal == 3) {
            return efjs.NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aufgVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        efjs efjsVar = (efjs) obj;
        int iOrdinal = efjsVar.ordinal();
        if (iOrdinal == 0) {
            return aufg.POSITIVE_DELIVERY;
        }
        if (iOrdinal == 1) {
            return aufg.DISPLAY;
        }
        if (iOrdinal == 2) {
            return aufg.NEGATIVE_DELIVERY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(efjsVar.toString()));
    }
}
