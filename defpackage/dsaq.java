package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsaq extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etja etjaVar = (etja) obj;
        int iOrdinal = etjaVar.ordinal();
        if (iOrdinal == 0) {
            return evnz.ORIENTATION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return evnz.ORIENTATION_PORTRAIT;
        }
        if (iOrdinal == 2) {
            return evnz.ORIENTATION_LANDSCAPE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etjaVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evnz evnzVar = (evnz) obj;
        int iOrdinal = evnzVar.ordinal();
        if (iOrdinal == 0) {
            return etja.ORIENTATION_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etja.ORIENTATION_PORTRAIT;
        }
        if (iOrdinal == 2) {
            return etja.ORIENTATION_LANDSCAPE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evnzVar.toString()));
    }
}
