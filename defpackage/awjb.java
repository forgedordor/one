package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awjb {
    public final awjl a;
    public final awja b;
    public final String c;

    public awjb(awjl awjlVar, awja awjaVar, String str) {
        awjaVar.getClass();
        str.getClass();
        this.a = awjlVar;
        this.b = awjaVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awjb)) {
            return false;
        }
        awjb awjbVar = (awjb) obj;
        return fdbq.f(this.a, awjbVar.a) && this.b == awjbVar.b && fdbq.f(this.c, awjbVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Destination(token=" + this.a + ", type=" + this.b + ", address=" + this.c + ")";
    }
}
