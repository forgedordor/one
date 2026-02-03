package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwly extends dwlz {
    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwrv)) {
            return false;
        }
        dwrv dwrvVar = (dwrv) obj;
        if (dwrx.UNKNOWN != dwrvVar.b()) {
            return false;
        }
        dwrvVar.n();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{unknown=true}";
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final void n() {
    }
}
