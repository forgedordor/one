package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lgh {
    private final lgt a;
    kzc[] b;

    public lgh(lgt lgtVar) {
        this.a = lgtVar;
    }

    public lgt a() {
        h();
        return this.a;
    }

    public void g(int i, kzc kzcVar) {
        if (this.b == null) {
            this.b = new kzc[10];
        }
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                this.b[lgq.a(i2)] = kzcVar;
            }
        }
    }

    protected final void h() {
        kzc[] kzcVarArr = this.b;
        if (kzcVarArr != null) {
            kzc kzcVarF = kzcVarArr[lgq.a(1)];
            kzc kzcVarF2 = this.b[lgq.a(2)];
            if (kzcVarF2 == null) {
                kzcVarF2 = this.a.f(2);
            }
            if (kzcVarF == null) {
                kzcVarF = this.a.f(1);
            }
            c(kzc.b(kzcVarF, kzcVarF2));
            kzc kzcVar = this.b[lgq.a(16)];
            if (kzcVar != null) {
                e(kzcVar);
            }
            kzc kzcVar2 = this.b[lgq.a(32)];
            if (kzcVar2 != null) {
                d(kzcVar2);
            }
            kzc kzcVar3 = this.b[lgq.a(64)];
            if (kzcVar3 != null) {
                f(kzcVar3);
            }
        }
    }

    public lgh() {
        this(new lgt((lgt) null));
    }

    public void b(kzc kzcVar) {
    }

    public void c(kzc kzcVar) {
    }

    public void d(kzc kzcVar) {
    }

    public void e(kzc kzcVar) {
    }

    public void f(kzc kzcVar) {
    }
}
