package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljm {
    public final des a;
    public final des b;
    public final des c;
    public final des d;
    public final des e;
    public final des f;
    private final des g;

    public dljm() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dljm)) {
            return false;
        }
        dljm dljmVar = (dljm) obj;
        return fdbq.f(this.a, dljmVar.a) && fdbq.f(this.b, dljmVar.b) && fdbq.f(this.c, dljmVar.c) && fdbq.f(this.d, dljmVar.d) && fdbq.f(this.e, dljmVar.e) && fdbq.f(this.g, dljmVar.g) && fdbq.f(this.f, dljmVar.f);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.g.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Easing(emphasized=" + this.a + ", emphasizedAccelerate=" + this.b + ", emphasizedDecelerate=" + this.c + ", linear=" + this.d + ", standard=" + this.e + ", standardAccelerate=" + this.g + ", standardDecelerate=" + this.f + ")";
    }

    public /* synthetic */ dljm(byte[] bArr) {
        den denVar = new den(0.2f, 0.0f, 0.0f, 1.0f);
        den denVar2 = new den(0.3f, 0.0f, 0.8f, 0.15f);
        den denVar3 = new den(0.05f, 0.7f, 0.1f, 1.0f);
        des desVar = dev.d;
        den denVar4 = new den(0.2f, 0.0f, 0.0f, 1.0f);
        den denVar5 = new den(0.3f, 0.0f, 1.0f, 1.0f);
        den denVar6 = new den(0.0f, 0.0f, 0.0f, 1.0f);
        desVar.getClass();
        this.a = denVar;
        this.b = denVar2;
        this.c = denVar3;
        this.d = desVar;
        this.e = denVar4;
        this.g = denVar5;
        this.f = denVar6;
    }
}
