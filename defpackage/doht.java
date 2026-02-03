package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doht {
    public final dogm a;
    public final dogo b;
    private final dogk c;

    public doht() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doht)) {
            return false;
        }
        doht dohtVar = (doht) obj;
        return fdbq.f(this.a, dohtVar.a) && fdbq.f(this.b, dohtVar.b) && fdbq.f(this.c, dohtVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MediaCapabilities(image=" + this.a + ", video=" + this.b + ", audio=" + this.c + ")";
    }

    public /* synthetic */ doht(dogm dogmVar, int i) {
        dogmVar = (i & 1) != 0 ? new dogm(3) : dogmVar;
        dogo dogoVar = new dogo(null);
        dogk dogkVar = dogk.a;
        dogmVar.getClass();
        this.a = dogmVar;
        this.b = dogoVar;
        this.c = dogkVar;
    }
}
