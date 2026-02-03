package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dxuk extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evdv evdvVar = (evdv) obj;
        int iOrdinal = evdvVar.ordinal();
        if (iOrdinal == 0) {
            return evgr.APP_BLOCK_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return evgr.ALLOWED;
        }
        if (iOrdinal == 2) {
            return evgr.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evdvVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evgr evgrVar = (evgr) obj;
        int iOrdinal = evgrVar.ordinal();
        if (iOrdinal == 0) {
            return evdv.APP_BLOCK_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return evdv.ALLOWED;
        }
        if (iOrdinal == 2) {
            return evdv.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evgrVar.toString()));
    }
}
