package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ygk {
    public final fdjx a;
    public final hox b;
    public final ddp c;
    public final ains d;

    public ygk(fdjx fdjxVar, hox hoxVar, ddp ddpVar, ains ainsVar) {
        fdjxVar.getClass();
        hoxVar.getClass();
        ddpVar.getClass();
        this.a = fdjxVar;
        this.b = hoxVar;
        this.c = ddpVar;
        this.d = ainsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygk)) {
            return false;
        }
        ygk ygkVar = (ygk) obj;
        return fdbq.f(this.a, ygkVar.a) && fdbq.f(this.b, ygkVar.b) && fdbq.f(this.c, ygkVar.c) && fdbq.f(this.d, ygkVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SwipeData(coroutineScope=" + this.a + ", dragOffsetX=" + this.b + ", offsetX=" + this.c + ", counterEventLogger=" + this.d + ")";
    }
}
