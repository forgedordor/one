package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivc implements ixk {
    private final ivt a;
    private final int b;
    private final int c;

    public ivc(ivt ivtVar, int i, int i2) {
        this.a = ivtVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ivt
    public final int a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.ivt
    public final int b(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.ivt
    public final int c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.ivt
    public final int d(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.ixk
    public final iyl e(long j) {
        if (this.c == 1) {
            return new ivf(this.b == 2 ? this.a.b(kil.a(j)) : this.a.d(kil.a(j)), kil.h(j) ? kil.a(j) : 32767);
        }
        return new ivf(kil.i(j) ? kil.b(j) : 32767, this.b == 2 ? this.a.a(kil.b(j)) : this.a.c(kil.b(j)));
    }

    @Override // defpackage.ivt
    public final Object f() {
        return this.a.f();
    }
}
