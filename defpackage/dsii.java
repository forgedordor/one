package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsii extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etlx etlxVar = (etlx) obj;
        int iOrdinal = etlxVar.ordinal();
        if (iOrdinal == 0) {
            return evma.FONT_SIZE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return evma.SMALL;
        }
        if (iOrdinal == 2) {
            return evma.LARGE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etlxVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evma evmaVar = (evma) obj;
        int iOrdinal = evmaVar.ordinal();
        if (iOrdinal == 0) {
            return etlx.TEXT_SIZE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etlx.MATERIAL_SUBHEAD_1;
        }
        if (iOrdinal == 2) {
            return etlx.MATERIAL_HEADLINE_5;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evmaVar.toString()));
    }
}
