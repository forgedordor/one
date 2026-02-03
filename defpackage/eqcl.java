package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqcl {
    public final ezoe a;
    public final String b;
    public final boolean c;

    public eqcl(ezoe ezoeVar, String str, boolean z) {
        this.a = ezoeVar;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqcl)) {
            return false;
        }
        eqcl eqclVar = (eqcl) obj;
        return fdbq.f(this.a, eqclVar.a) && fdbq.f(this.b, eqclVar.b) && this.c == eqclVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "Configuration(clientInfo=" + this.a + ", appName=" + this.b + ", enableRequestHeaderModification=" + this.c + ")";
    }
}
