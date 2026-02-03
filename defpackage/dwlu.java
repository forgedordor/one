package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlu extends dwlz {
    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.SUBSCRIPT;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwrv)) {
            return false;
        }
        dwrv dwrvVar = (dwrv) obj;
        if (dwrx.SUBSCRIPT != dwrvVar.b()) {
            return false;
        }
        dwrvVar.j();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{subscript=true}";
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final void j() {
    }
}
