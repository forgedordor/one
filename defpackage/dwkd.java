package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwkd extends dwkf {
    private final dwsk a;

    public dwkd(dwsk dwskVar) {
        this.a = dwskVar;
    }

    @Override // defpackage.dwji
    public final dwjj a() {
        return dwjj.URL_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwji) {
            dwji dwjiVar = (dwji) obj;
            if (dwjj.URL_ACTION == dwjiVar.a() && this.a.equals(dwjiVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwkf, defpackage.dwji
    public final dwsk g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{urlAction=" + this.a.toString() + "}";
    }
}
