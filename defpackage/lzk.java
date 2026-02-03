package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzk extends lxd {
    public static final lxk a = new lzj();
    public final cvx b = new cvx();
    public boolean c = false;

    final lzh a(int i) {
        return (lzh) cvy.a(this.b, i);
    }

    final void b() {
        this.c = false;
    }

    @Override // defpackage.lxd
    protected final void fC() {
        cvx cvxVar = this.b;
        int iC = cvxVar.c();
        for (int i = 0; i < iC; i++) {
            ((lzh) cvxVar.e(i)).c();
        }
        int i2 = cvxVar.d;
        Object[] objArr = cvxVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        cvxVar.d = 0;
        cvxVar.a = false;
    }
}
