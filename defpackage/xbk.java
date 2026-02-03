package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbk {
    private final boolean a;

    public xbk(boolean z) {
        this.a = z;
    }

    public final vwk a(vwl vwlVar) {
        int iOrdinal = vwlVar.ordinal();
        if (iOrdinal == 0) {
            return this.a ? vwk.b : vwk.a;
        }
        if (iOrdinal == 1) {
            return vwk.c;
        }
        if (iOrdinal == 2) {
            return vwk.d;
        }
        if (iOrdinal == 3) {
            return vwk.e;
        }
        throw new fctg();
    }
}
