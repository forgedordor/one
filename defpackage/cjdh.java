package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjdh extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auej auejVar = (auej) obj;
        int iOrdinal = auejVar.ordinal();
        if (iOrdinal == 0) {
            return cjhx.UNKNOWN_TYPE;
        }
        if (iOrdinal == 1) {
            return cjhx.PRESENT;
        }
        if (iOrdinal == 2) {
            return cjhx.ABSENT;
        }
        if (iOrdinal == 3) {
            return cjhx.PENDING;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(auejVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjhx cjhxVar = (cjhx) obj;
        int iOrdinal = cjhxVar.ordinal();
        if (iOrdinal == 0) {
            return auej.UNKNOWN_STATE;
        }
        if (iOrdinal == 1) {
            return auej.JOINED;
        }
        if (iOrdinal == 2) {
            return auej.DEPARTED;
        }
        if (iOrdinal == 3) {
            return auej.PENDING;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cjhxVar.toString()));
    }
}
