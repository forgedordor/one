package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlv extends dwlz {
    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.SUPERSCRIPT;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwrv)) {
            return false;
        }
        dwrv dwrvVar = (dwrv) obj;
        if (dwrx.SUPERSCRIPT != dwrvVar.b()) {
            return false;
        }
        dwrvVar.k();
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "TextStyle{superscript=true}";
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final void k() {
    }
}
