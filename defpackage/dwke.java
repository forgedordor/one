package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwke extends dwkf {
    private final String a;

    public dwke(String str) {
        this.a = str;
    }

    @Override // defpackage.dwji
    public final dwjj a() {
        return dwjj.WEB_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwji) {
            dwji dwjiVar = (dwji) obj;
            if (dwjj.WEB_ACTION == dwjiVar.a() && this.a.equals(dwjiVar.k())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dwkf, defpackage.dwji
    public final String k() {
        return this.a;
    }

    public final String toString() {
        return "ActionPayload{webAction=" + this.a + "}";
    }
}
