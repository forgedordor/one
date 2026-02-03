package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwka extends dwkf {
    private final dwjq a;

    public dwka(dwjq dwjqVar) {
        this.a = dwjqVar;
    }

    @Override // defpackage.dwji
    public final dwjj a() {
        return dwjj.PREFILL_MESSAGE;
    }

    @Override // defpackage.dwkf, defpackage.dwji
    public final dwjq c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwji) {
            dwji dwjiVar = (dwji) obj;
            if (dwjj.PREFILL_MESSAGE == dwjiVar.a() && this.a.equals(dwjiVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{prefillMessage=" + this.a.toString() + "}";
    }
}
