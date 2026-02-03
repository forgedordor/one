package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcn implements kbh {
    public final int a;
    public final kca b;
    private final kcc d;
    private final int e = 0;
    public final int c = 0;

    public kcn(int i, kcc kccVar, kca kcaVar) {
        this.a = i;
        this.d = kccVar;
        this.b = kcaVar;
    }

    @Override // defpackage.kbh
    public final int a() {
        return 0;
    }

    @Override // defpackage.kbh
    public final kcc b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcn)) {
            return false;
        }
        kcn kcnVar = (kcn) obj;
        if (this.a == kcnVar.a && fdbq.f(this.d, kcnVar.d)) {
            int i = kcnVar.e;
            if (kbw.b(0, 0) && fdbq.f(this.b, kcnVar.b)) {
                int i2 = kcnVar.c;
                return kbv.a(0, 0);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.d.i) * 29791) + this.b.hashCode();
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.d + ", style=" + ((Object) kbw.a(0)) + ", loadingStrategy=" + ((Object) kbv.b()) + ')';
    }

    @Override // defpackage.kbh
    public final void c() {
    }
}
