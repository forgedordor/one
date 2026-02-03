package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dxum extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evby evbyVar = (evby) obj;
        int iOrdinal = evbyVar.ordinal();
        if (iOrdinal == 0) {
            return evhb.CHANNEL_GROUP_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return evhb.ALLOWED;
        }
        if (iOrdinal == 2) {
            return evhb.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evbyVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evhb evhbVar = (evhb) obj;
        int iOrdinal = evhbVar.ordinal();
        if (iOrdinal == 0) {
            return evby.CHANNEL_GROUP_STATE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return evby.ALLOWED;
        }
        if (iOrdinal == 2) {
            return evby.BANNED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evhbVar.toString()));
    }
}
