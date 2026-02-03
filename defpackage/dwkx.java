package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwkx extends dwlb {
    private final dwqn a;

    public dwkx(dwqn dwqnVar) {
        this.a = dwqnVar;
    }

    @Override // defpackage.dwqo
    public final int a() {
        return 3;
    }

    @Override // defpackage.dwlb, defpackage.dwqo
    public final dwqn b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwqo) {
            dwqo dwqoVar = (dwqo) obj;
            if (dwqoVar.a() == 3 && this.a.equals(dwqoVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{custom=" + this.a.toString() + "}";
    }
}
