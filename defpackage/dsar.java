package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsar extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etjc etjcVar = (etjc) obj;
        int iOrdinal = etjcVar.ordinal();
        if (iOrdinal == 0) {
            return evob.THEME_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return evob.THEME_LIGHT;
        }
        if (iOrdinal == 2) {
            return evob.THEME_DARK;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etjcVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evob evobVar = (evob) obj;
        int iOrdinal = evobVar.ordinal();
        if (iOrdinal == 0) {
            return etjc.THEME_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etjc.THEME_LIGHT;
        }
        if (iOrdinal == 2) {
            return etjc.THEME_DARK;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evobVar.toString()));
    }
}
