package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsij extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etjy etjyVar = (etjy) obj;
        int iOrdinal = etjyVar.ordinal();
        if (iOrdinal == 0) {
            return evnn.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return evnn.ACTIVITY;
        }
        if (iOrdinal == 2) {
            return evnn.SERVICE;
        }
        if (iOrdinal == 3) {
            return evnn.BROADCAST;
        }
        if (iOrdinal == 4) {
            return evnn.ACTIVITY_WITH_RESULT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etjyVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evnn evnnVar = (evnn) obj;
        int iOrdinal = evnnVar.ordinal();
        if (iOrdinal == 0) {
            return etjy.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etjy.ACTIVITY;
        }
        if (iOrdinal == 2) {
            return etjy.SERVICE;
        }
        if (iOrdinal == 3) {
            return etjy.BROADCAST;
        }
        if (iOrdinal == 4) {
            return etjy.ACTIVITY_WITH_RESULT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evnnVar.toString()));
    }
}
