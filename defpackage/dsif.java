package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsif implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evkn evknVar = (evkn) obj;
        int iOrdinal = evknVar.ordinal();
        if (iOrdinal == 0) {
            return etgo.CONNECTIVITY_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etgo.OFFLINE;
        }
        if (iOrdinal == 2) {
            return etgo.ONLINE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(evknVar))));
    }
}
