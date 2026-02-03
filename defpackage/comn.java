package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class comn extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cong congVar = (cong) obj;
        int iOrdinal = congVar.ordinal();
        if (iOrdinal == 0) {
            return efis.FILE;
        }
        if (iOrdinal == 1) {
            return efis.THUMBNAIL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(congVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        efis efisVar = (efis) obj;
        int iOrdinal = efisVar.ordinal();
        if (iOrdinal == 0) {
            return cong.FILE;
        }
        if (iOrdinal == 1) {
            return cong.THUMBNAIL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(efisVar.toString()));
    }
}
