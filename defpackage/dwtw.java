package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwtw extends dwtx {
    private final dwwb b;

    public dwtw(dwwb dwwbVar) {
        this.b = dwwbVar;
    }

    @Override // defpackage.dwvx
    public final dwvw b() {
        return dwvw.STANDALONE_CARD;
    }

    @Override // defpackage.dwtx, defpackage.dwvx
    public final dwwb d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwvx) {
            dwvx dwvxVar = (dwvx) obj;
            if (dwvw.STANDALONE_CARD == dwvxVar.b() && this.b.equals(dwvxVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RichCard{standaloneCard=" + this.b.toString() + "}";
    }
}
