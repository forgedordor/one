package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsig implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evlt evltVar = (evlt) obj;
        int iOrdinal = evltVar.ordinal();
        if (iOrdinal == 0) {
            return etlr.BUTTONS_ORDER_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return etlr.ACTION_BUTTON_PRIMARY;
        }
        if (iOrdinal == 2) {
            return etlr.ACK_BUTTON_PRIMARY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(evltVar))));
    }
}
