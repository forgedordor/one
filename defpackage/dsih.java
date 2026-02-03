package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsih extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etok etokVar = (etok) obj;
        int iOrdinal = etokVar.ordinal();
        if (iOrdinal == 0) {
            return evkp.DASHER_DEVICE_FILTER_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return evkp.BLOCK_WHEN_DASHER_ON_DEVICE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etokVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evkp evkpVar = (evkp) obj;
        int iOrdinal = evkpVar.ordinal();
        if (iOrdinal == 0) {
            return etok.DASHER_DEVICE_FILTER_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etok.BLOCK_WHEN_DASHER_ON_DEVICE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evkpVar.toString()));
    }
}
