package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlo extends dwlz {
    private final int a;

    public dwlo(int i) {
        this.a = i;
    }

    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.COLOR;
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwrv) {
            dwrv dwrvVar = (dwrv) obj;
            if (dwrx.COLOR == dwrvVar.b() && this.a == dwrvVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TextStyle{color=" + this.a + "}";
    }
}
