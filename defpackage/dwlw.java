package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwlw extends dwlz {
    private final ekgb a;

    public dwlw(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.dwrv
    public final dwrx b() {
        return dwrx.TYPEFACE_LIST;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwrv) {
            dwrv dwrvVar = (dwrv) obj;
            if (dwrx.TYPEFACE_LIST == dwrvVar.b() && ekjz.h(this.a, dwrvVar.l())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dwlz, defpackage.dwrv
    public final ekgb l() {
        return this.a;
    }

    public final String toString() {
        return "TextStyle{typefaceList=" + this.a.toString() + "}";
    }
}
