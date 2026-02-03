package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpos {
    public final ics a;
    public final fdaw b;
    public final fdaw c;
    public final fdaw d;
    public final fdaw e;
    public final fdaw f;
    public final fdaw g;
    public final fdav h;

    public /* synthetic */ dpos(fdaw fdawVar, fdaw fdawVar2, fdaw fdawVar3, fdaw fdawVar4, fdaw fdawVar5, fdaw fdawVar6, fdav fdavVar, int i) {
        ico icoVar = (i & 1) != 0 ? ics.e : null;
        fdawVar = (i & 2) != 0 ? dpls.a : fdawVar;
        fdawVar2 = (i & 4) != 0 ? dpls.b : fdawVar2;
        fdawVar3 = (i & 8) != 0 ? dpls.c : fdawVar3;
        fdawVar5 = (i & 32) != 0 ? dpls.d : fdawVar5;
        fdawVar6 = (i & 64) != 0 ? dpls.e : fdawVar6;
        fdavVar = (i & 128) != 0 ? dpls.f : fdavVar;
        icoVar.getClass();
        fdawVar5.getClass();
        fdawVar6.getClass();
        fdavVar.getClass();
        this.a = icoVar;
        this.b = fdawVar;
        this.c = fdawVar2;
        this.d = fdawVar3;
        this.e = fdawVar4;
        this.f = fdawVar5;
        this.g = fdawVar6;
        this.h = fdavVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpos)) {
            return false;
        }
        dpos dposVar = (dpos) obj;
        return fdbq.f(this.a, dposVar.a) && fdbq.f(this.b, dposVar.b) && fdbq.f(this.c, dposVar.c) && fdbq.f(this.d, dposVar.d) && fdbq.f(this.e, dposVar.e) && fdbq.f(this.f, dposVar.f) && fdbq.f(this.g, dposVar.g) && fdbq.f(this.h, dposVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "UiSpec(modifier=" + this.a + ", background=" + this.b + ", header=" + this.c + ", footer=" + this.d + ", content=" + this.e + ", contentOverlay=" + this.f + ", screenOverlay=" + this.g + ", snackbar=" + this.h + ")";
    }
}
