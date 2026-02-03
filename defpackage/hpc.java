package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpc implements hlw {
    private final hlw a;
    private final int b;
    private int c;

    public hpc(hlw hlwVar, int i) {
        this.a = hlwVar;
        this.b = i;
    }

    @Override // defpackage.hlw
    public final Object a() {
        throw null;
    }

    @Override // defpackage.hlw
    public final void b(fdat fdatVar, Object obj) {
        this.a.b(fdatVar, obj);
    }

    @Override // defpackage.hlw
    public final void c() {
        throw null;
    }

    @Override // defpackage.hlw
    public final void d(Object obj) {
        this.c++;
        this.a.d(obj);
    }

    @Override // defpackage.hlw
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.hlw
    public final void h() {
        if (this.c <= 0) {
            hmz.j("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.h();
    }

    @Override // defpackage.hlw
    public final void i(int i, Object obj) {
        this.a.i(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.hlw
    public final void j(int i, Object obj) {
        this.a.j(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.hlw
    public final void k(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.k(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.hlw
    public final void l(int i, int i2) {
        this.a.l(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.hlw
    public final /* synthetic */ void f() {
    }
}
