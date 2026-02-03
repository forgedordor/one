package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsim implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evmw evmwVar = (evmw) obj;
        int iOrdinal = evmwVar.ordinal();
        if (iOrdinal == 0) {
            return etng.UITHEME_DEFAULT;
        }
        if (iOrdinal == 1) {
            return etng.UITHEME_GOOGLE_MATERIAL;
        }
        if (iOrdinal == 2) {
            return etng.UITHEME_GOOGLE_MATERIAL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(evmwVar))));
    }
}
