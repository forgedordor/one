package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efpl extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        efkm efkmVar = (efkm) obj;
        int iOrdinal = efkmVar.ordinal();
        if (iOrdinal == 0) {
            return cjix.MESSAGING_METHOD_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return cjix.MESSAGING_METHOD_CHAT;
        }
        if (iOrdinal == 2) {
            return cjix.MESSAGING_METHOD_SLM;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(efkmVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjix cjixVar = (cjix) obj;
        int iOrdinal = cjixVar.ordinal();
        if (iOrdinal == 0) {
            return efkm.MESSAGING_METHOD_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return efkm.MESSAGING_METHOD_CHAT;
        }
        if (iOrdinal == 2) {
            return efkm.MESSAGING_METHOD_SLM;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cjixVar.toString()));
    }
}
