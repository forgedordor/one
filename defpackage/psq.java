package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psq {
    private final psn a;
    private final pso b;
    private final pso c;
    private final pso d;

    public psq(psn psnVar, pso psoVar, pso psoVar2, pso psoVar3) {
        this.a = psnVar;
        this.b = psoVar;
        this.c = psoVar2;
        this.d = psoVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psq)) {
            return false;
        }
        psq psqVar = (psq) obj;
        return fdbq.f(this.a, psqVar.a) && fdbq.f(this.b, psqVar.b) && fdbq.f(this.c, psqVar.c) && fdbq.f(this.d, psqVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "psq:{animationBackground=" + this.a + ", openAnimation=" + this.b + ", closeAnimation=" + this.c + ", changeAnimation=" + this.d + " }";
    }
}
