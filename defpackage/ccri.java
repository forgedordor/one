package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
class ccri implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        efkk efkkVar = (efkk) obj;
        efkk efkkVar2 = efkk.UNKNOWN;
        int iOrdinal = efkkVar.ordinal();
        if (iOrdinal == 0) {
            return enaw.UNKNOWN_MESSAGE_RECEIPT_TYPE;
        }
        if (iOrdinal == 1) {
            return enaw.DELIVERY;
        }
        if (iOrdinal == 2) {
            return enaw.DISPLAY;
        }
        if (iOrdinal == 3) {
            return enaw.PROCESSING;
        }
        if (iOrdinal == 4) {
            return enaw.INTERWORKING;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(efkkVar))));
    }
}
