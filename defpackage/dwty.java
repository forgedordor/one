package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwty extends dwua {
    private final dwwg a;

    public dwty(dwwg dwwgVar) {
        this.a = dwwgVar;
    }

    @Override // defpackage.dwwh
    public final dwwe a() {
        return dwwe.STACK_COMPONENT;
    }

    @Override // defpackage.dwua, defpackage.dwwh
    public final dwwg b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwwh) {
            dwwh dwwhVar = (dwwh) obj;
            if (dwwe.STACK_COMPONENT == dwwhVar.a() && this.a.equals(dwwhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UiComponent{stackComponent=" + this.a.toString() + "}";
    }
}
