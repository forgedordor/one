package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwku extends dwkv {
    public final dwox a;

    public dwku(dwox dwoxVar) {
        this.a = dwoxVar;
    }

    @Override // defpackage.dwkv, defpackage.dwqy
    public final dwox a() {
        return this.a;
    }

    @Override // defpackage.dwqy
    public final dwqx b() {
        return dwqx.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwqy) {
            dwqy dwqyVar = (dwqy) obj;
            if (dwqx.a == dwqyVar.b() && this.a.equals(dwqyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageDecorationContent{buttonPrompt=" + this.a.toString() + "}";
    }
}
