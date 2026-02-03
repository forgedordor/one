package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlr extends dwlz {
    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.ITALIC;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwrv)) {
            return false;
        }
        dwrv dwrvVar = (dwrv) obj;
        if (dwrx.ITALIC != dwrvVar.b()) {
            return false;
        }
        dwrvVar.g();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{italic=true}";
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final void g() {
    }
}
