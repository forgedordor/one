package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwjv extends dwkf {
    private final String a;

    public dwjv(String str) {
        this.a = str;
    }

    @Override // defpackage.dwji
    public final dwjj a() {
        return dwjj.CALL_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwji) {
            dwji dwjiVar = (dwji) obj;
            if (dwjj.CALL_ACTION == dwjiVar.a() && this.a.equals(dwjiVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwkf, defpackage.dwji
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionPayload{callAction=" + this.a + "}";
    }
}
