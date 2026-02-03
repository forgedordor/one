package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class axlq extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aiyi aiyiVar = (aiyi) obj;
        int iOrdinal = aiyiVar.ordinal();
        if (iOrdinal == 0) {
            return elhk.TRANSPORT_OTHER;
        }
        if (iOrdinal == 1) {
            return elhk.TRANSPORT_BLUETOOTH;
        }
        if (iOrdinal == 2) {
            return elhk.TRANSPORT_CELLULAR;
        }
        if (iOrdinal == 3) {
            return elhk.TRANSPORT_ETHERNET;
        }
        if (iOrdinal == 4) {
            return elhk.TRANSPORT_VPN;
        }
        if (iOrdinal == 5) {
            return elhk.TRANSPORT_WIFI;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aiyiVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        elhk elhkVar = (elhk) obj;
        int iOrdinal = elhkVar.ordinal();
        if (iOrdinal == 0) {
            return aiyi.TRANSPORT_OTHER;
        }
        if (iOrdinal == 1) {
            return aiyi.TRANSPORT_BLUETOOTH;
        }
        if (iOrdinal == 2) {
            return aiyi.TRANSPORT_CELLULAR;
        }
        if (iOrdinal == 3) {
            return aiyi.TRANSPORT_ETHERNET;
        }
        if (iOrdinal == 4) {
            return aiyi.TRANSPORT_VPN;
        }
        if (iOrdinal == 5) {
            return aiyi.TRANSPORT_WIFI;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(elhkVar.toString()));
    }
}
