package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsik extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etof etofVar = (etof) obj;
        int iOrdinal = etofVar.ordinal();
        if (iOrdinal == 0) {
            return evnj.PLACEMENT_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return evnj.ABOVE;
        }
        if (iOrdinal == 2) {
            return evnj.BELOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etofVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evnj evnjVar = (evnj) obj;
        int iOrdinal = evnjVar.ordinal();
        if (iOrdinal == 0) {
            return etof.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etof.ABOVE;
        }
        if (iOrdinal == 2) {
            return etof.BELOW;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evnjVar.toString()));
    }
}
