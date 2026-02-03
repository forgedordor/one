package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwlq extends dwlz {
    private final dwrp a;

    public dwlq(dwrp dwrpVar) {
        this.a = dwrpVar;
    }

    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.HYPER_LINK;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwrv) {
            dwrv dwrvVar = (dwrv) obj;
            if (dwrx.HYPER_LINK == dwrvVar.b() && this.a.equals(dwrvVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final dwrp f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TextStyle{hyperLink=" + this.a.toString() + "}";
    }
}
