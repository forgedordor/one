package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ims {
    public kio a;
    public kji b;
    public ijb c;
    public long d = 0;

    public ims(kio kioVar, kji kjiVar, ijb ijbVar) {
        this.a = kioVar;
        this.b = kjiVar;
        this.c = ijbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ims)) {
            return false;
        }
        ims imsVar = (ims) obj;
        return fdbq.f(this.a, imsVar.a) && this.b == imsVar.b && fdbq.f(this.c, imsVar.c) && ihz.f(this.d, imsVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + ihy.a(this.d);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) ihz.d(this.d)) + ')';
    }
}
