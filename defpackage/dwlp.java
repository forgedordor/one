package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlp extends dwlz {
    private final int a;

    public dwlp(int i) {
        this.a = i;
    }

    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.HORIZONTAL_ALIGNMENT;
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwrv) {
            dwrv dwrvVar = (dwrv) obj;
            if (dwrx.HORIZONTAL_ALIGNMENT == dwrvVar.b() && this.a == dwrvVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TextStyle{horizontalAlignment=" + this.a + "}";
    }
}
