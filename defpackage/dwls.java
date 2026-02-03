package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwls extends dwlz {
    private final int a;

    public dwls(int i) {
        this.a = i;
    }

    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.SIZE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwrv) {
            dwrv dwrvVar = (dwrv) obj;
            if (dwrx.SIZE == dwrvVar.b() && this.a == dwrvVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final int h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "TextStyle{size=" + this.a + "}";
    }
}
