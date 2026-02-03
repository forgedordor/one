package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsib extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etlm etlmVar = (etlm) obj;
        int iOrdinal = etlmVar.ordinal();
        if (iOrdinal == 0) {
            return evlw.ALIGNMENT_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return evlw.TRAILING;
        }
        if (iOrdinal == 2) {
            return evlw.CENTER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etlmVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evlw evlwVar = (evlw) obj;
        int iOrdinal = evlwVar.ordinal();
        if (iOrdinal == 0) {
            return etlm.UNKNOWN_ALIGNMENT;
        }
        if (iOrdinal == 1) {
            return etlm.RIGHT;
        }
        if (iOrdinal == 2) {
            return etlm.CENTER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evlwVar.toString()));
    }
}
