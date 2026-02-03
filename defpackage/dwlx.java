package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlx extends dwlz {
    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.UNDERLINE;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwrv)) {
            return false;
        }
        dwrv dwrvVar = (dwrv) obj;
        if (dwrx.UNDERLINE != dwrvVar.b()) {
            return false;
        }
        dwrvVar.m();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{underline=true}";
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final void m() {
    }
}
