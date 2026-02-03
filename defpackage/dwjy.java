package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwjy extends dwkf {
    private final dwqc a;

    public dwjy(dwqc dwqcVar) {
        this.a = dwqcVar;
    }

    @Override // defpackage.dwji
    public final dwjj a() {
        return dwjj.DECORATION_TRANSITION_ACTION;
    }

    @Override // defpackage.dwkf, defpackage.dwji
    public final dwqc e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwji) {
            dwji dwjiVar = (dwji) obj;
            if (dwjj.DECORATION_TRANSITION_ACTION == dwjiVar.a() && this.a.equals(dwjiVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{decorationTransitionAction=" + this.a.toString() + "}";
    }
}
