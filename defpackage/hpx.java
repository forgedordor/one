package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpx {
    public int a;
    public hpz b;
    public hlv c;
    public fdat d;
    public int e;
    public cuq f;
    public cuz g;

    public hpx(hpz hpzVar) {
        this.b = hpzVar;
    }

    public static final boolean p(hnu hnuVar, cuz cuzVar) {
        hnuVar.getClass();
        hrn hrnVarC = hnuVar.c();
        if (hrnVarC == null) {
            hrnVarC = hsi.a;
        }
        return !hrnVarC.a(hnuVar.f().e, cuzVar.f(hnuVar));
    }

    public final void a() {
        hpz hpzVar = this.b;
        if (hpzVar != null) {
            hpzVar.c(this, null);
        }
    }

    public final void b() {
        hpz hpzVar = this.b;
        if (hpzVar != null) {
            hpzVar.b();
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void c(boolean z) {
        this.a = z ? this.a | 4 : this.a & (-5);
    }

    public final void d(boolean z) {
        this.a = z ? this.a | 8 : this.a & (-9);
    }

    public final void e(boolean z) {
        this.a = z ? this.a | 32 : this.a & (-33);
    }

    public final void f(boolean z) {
        this.a = z ? this.a | 512 : this.a & (-513);
    }

    public final void g(boolean z) {
        this.a = z ? this.a | 16 : this.a & (-17);
    }

    public final void h(int i) {
        this.e = i;
        g(false);
    }

    public final boolean i() {
        return (this.a & 128) != 0;
    }

    public final boolean j() {
        return (this.a & 16) != 0;
    }

    public final boolean k() {
        return (this.a & 1) != 0;
    }

    public final boolean l() {
        hlv hlvVar;
        return (this.b == null || (hlvVar = this.c) == null || !hlvVar.a()) ? false : true;
    }

    public final boolean m() {
        return this.g != null;
    }

    public final void n() {
        this.a |= 1;
    }

    public final int o(Object obj) {
        hpz hpzVar = this.b;
        if (hpzVar != null) {
            return hpzVar.c(this, obj);
        }
        return 1;
    }
}
