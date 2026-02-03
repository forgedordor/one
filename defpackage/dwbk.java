package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwbk {
    public abstract dwbj a();

    public abstract dwsg b();

    public abstract boolean c();

    public final dwas d() {
        return a().a();
    }

    public final dwbd e() {
        return a().e();
    }

    public final dwbf f() {
        return a().f();
    }

    public final dwbg g() {
        return a().d();
    }

    public final dwbm h() {
        return a().g();
    }

    public final dwpx i() {
        int iK = k() - 1;
        if (iK == 0) {
            return ((dwnq) j()).c;
        }
        if (iK == 2) {
            return ((dwag) f()).e;
        }
        if (iK == 3) {
            return ((dwal) h()).b;
        }
        if (iK == 4) {
            d();
            return ((dvzx) d().b()).a;
        }
        if (iK != 5) {
            return null;
        }
        return ((dwah) g()).a;
    }

    public final dwqw j() {
        return a().c();
    }

    public final int k() {
        return a().b();
    }
}
