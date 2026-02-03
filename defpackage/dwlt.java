package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlt extends dwlz {
    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.STRIKETHROUGH;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwrv)) {
            return false;
        }
        dwrv dwrvVar = (dwrv) obj;
        if (dwrx.STRIKETHROUGH != dwrvVar.b()) {
            return false;
        }
        dwrvVar.i();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{strikethrough=true}";
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final void i() {
    }
}
