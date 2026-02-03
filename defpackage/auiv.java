package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auiv {
    public final aubt a;
    public final eyga b;

    public auiv(aubt aubtVar, eyga eygaVar) {
        this.a = aubtVar;
        this.b = eygaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auiv)) {
            return false;
        }
        auiv auivVar = (auiv) obj;
        return fdbq.f(this.a, auivVar.a) && fdbq.f(this.b, auivVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConvertResult(chatMessageContent=" + this.a + ", customCpimHeaders=" + this.b + ")";
    }
}
