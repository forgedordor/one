package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlm extends dwlz {
    private final int a;

    public dwlm(int i) {
        this.a = i;
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.BACKGROUND_COLOR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwrv) {
            dwrv dwrvVar = (dwrv) obj;
            if (dwrx.BACKGROUND_COLOR == dwrvVar.b() && this.a == dwrvVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TextStyle{backgroundColor=" + this.a + "}";
    }
}
