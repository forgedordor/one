package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class asru extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        enxk enxkVar = (enxk) obj;
        int iOrdinal = enxkVar.ordinal();
        if (iOrdinal == 0) {
            return aubk.UNKNOWN_STATUS;
        }
        if (iOrdinal == 1) {
            return aubk.OK;
        }
        if (iOrdinal == 2) {
            return aubk.PENDING;
        }
        if (iOrdinal == 3) {
            return aubk.FAILED_TRANSIENTLY;
        }
        if (iOrdinal == 4) {
            return aubk.FAILED_PERMANENTLY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(enxkVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aubk aubkVar = (aubk) obj;
        int iOrdinal = aubkVar.ordinal();
        if (iOrdinal == 0) {
            return enxk.CHAT_API_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return enxk.CHAT_API_OK;
        }
        if (iOrdinal == 2) {
            return enxk.CHAT_API_PENDING;
        }
        if (iOrdinal == 3) {
            return enxk.CHAT_API_FAILED_TRANSIENTLY;
        }
        if (iOrdinal == 4) {
            return enxk.CHAT_API_FAILED_PERMANENTLY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aubkVar.toString()));
    }
}
