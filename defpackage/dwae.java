package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwae extends dwbd {
    public final String a;
    public final dwbc b;

    public dwae(String str, dwbc dwbcVar) {
        this.a = str;
        this.b = dwbcVar;
    }

    @Override // defpackage.dwbd
    public final dwbc a() {
        return this.b;
    }

    @Override // defpackage.dwbd
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwbd) {
            dwbd dwbdVar = (dwbd) obj;
            if (this.a.equals(dwbdVar.b()) && this.b.equals(dwbdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Push{pushId=" + this.a + ", oneOfType=" + this.b.toString() + "}";
    }
}
