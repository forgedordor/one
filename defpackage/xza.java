package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xza {
    public final xzl a;
    public final boolean b;
    public final String c;
    public final xzk d;
    public final fdae e;
    private final String f;

    public xza(String str, xzl xzlVar, boolean z, String str2, xzk xzkVar, fdae fdaeVar) {
        xzlVar.getClass();
        this.f = str;
        this.a = xzlVar;
        this.b = z;
        this.c = str2;
        this.d = xzkVar;
        this.e = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xza)) {
            return false;
        }
        xza xzaVar = (xza) obj;
        return fdbq.f(this.f, xzaVar.f) && fdbq.f(this.a, xzaVar.a) && this.b == xzaVar.b && fdbq.f(this.c, xzaVar.c) && fdbq.f(this.d, xzaVar.d) && fdbq.f(this.e, xzaVar.e);
    }

    public final int hashCode() {
        return (((((((((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Reply(messageId=" + this.f + ", metatext=" + this.a + ", error=" + this.b + ", contentDescription=" + this.c + ", content=" + this.d + ", onClick=" + this.e + ")";
    }
}
