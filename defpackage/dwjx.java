package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwjx extends dwkf {
    private final String a;

    public dwjx(String str) {
        this.a = str;
    }

    @Override // defpackage.dwji
    public final dwjj a() {
        return dwjj.CUSTOM_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwji) {
            dwji dwjiVar = (dwji) obj;
            if (dwjj.CUSTOM_ACTION == dwjiVar.a() && this.a.equals(dwjiVar.i())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dwkf, defpackage.dwji
    public final String i() {
        return this.a;
    }

    public final String toString() {
        return "ActionPayload{customAction=" + this.a + "}";
    }
}
