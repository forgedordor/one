package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class aixo extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        elhk elhkVar = (elhk) obj;
        int iOrdinal = elhkVar.ordinal();
        if (iOrdinal == 0) {
            return cqex.OTHER;
        }
        if (iOrdinal == 1) {
            return cqex.BLUETOOTH;
        }
        if (iOrdinal == 2) {
            return cqex.CELLULAR;
        }
        if (iOrdinal == 3) {
            return cqex.ETHERNET;
        }
        if (iOrdinal == 4) {
            return cqex.VPN;
        }
        if (iOrdinal == 5) {
            return cqex.WIFI;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(elhkVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cqex cqexVar = (cqex) obj;
        int iOrdinal = cqexVar.ordinal();
        if (iOrdinal == 0) {
            return elhk.TRANSPORT_BLUETOOTH;
        }
        if (iOrdinal == 1) {
            return elhk.TRANSPORT_CELLULAR;
        }
        if (iOrdinal == 2) {
            return elhk.TRANSPORT_ETHERNET;
        }
        if (iOrdinal == 3) {
            return elhk.TRANSPORT_VPN;
        }
        if (iOrdinal == 4) {
            return elhk.TRANSPORT_WIFI;
        }
        if (iOrdinal == 5) {
            return elhk.TRANSPORT_OTHER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cqexVar.toString()));
    }
}
