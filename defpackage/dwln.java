package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwln extends dwlz {
    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.BOLD;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwrv)) {
            return false;
        }
        dwrv dwrvVar = (dwrv) obj;
        if (dwrx.BOLD != dwrvVar.b()) {
            return false;
        }
        dwrvVar.c();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{bold=true}";
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final void c() {
    }
}
