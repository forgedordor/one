package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwkb extends dwkf {
    private final dwjq a;

    public dwkb(dwjq dwjqVar) {
        this.a = dwjqVar;
    }

    @Override // defpackage.dwji
    public final dwjj a() {
        return dwjj.SEND_MESSAGE;
    }

    @Override // defpackage.dwkf, defpackage.dwji
    public final dwjq d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwji) {
            dwji dwjiVar = (dwji) obj;
            if (dwjj.SEND_MESSAGE == dwjiVar.a() && this.a.equals(dwjiVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{sendMessage=" + this.a.toString() + "}";
    }
}
