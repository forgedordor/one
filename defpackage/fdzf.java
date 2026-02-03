package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdzf extends fdxy implements fdmm {
    public final long b;
    private final fdhx c;

    public fdzf(long j, fdzf fdzfVar, int i) {
        super(fdzfVar);
        this.b = j;
        this.c = new fdhx(i << 16, fdia.a);
    }

    public abstract int a();

    public abstract void l(int i);

    @Override // defpackage.fdxy
    public final boolean r() {
        return this.c.c == a() && !s();
    }

    public final void t() {
        if (this.c.b() == a()) {
            q();
        }
    }

    public final boolean u() {
        return fdhx.a.addAndGet(this.c, -65536) == a() && !s();
    }

    public final boolean v() {
        fdhx fdhxVar;
        int i;
        do {
            fdhxVar = this.c;
            i = fdhxVar.c;
            if (i == a() && !s()) {
                return false;
            }
        } while (!fdhxVar.c(i, 65536 + i));
        return true;
    }
}
