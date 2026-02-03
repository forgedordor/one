package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjk {
    public final String a;
    public final qbo b;

    public qjk(String str, qbo qboVar) {
        str.getClass();
        qboVar.getClass();
        this.a = str;
        this.b = qboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjk)) {
            return false;
        }
        qjk qjkVar = (qjk) obj;
        return fdbq.f(this.a, qjkVar.a) && this.b == qjkVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
