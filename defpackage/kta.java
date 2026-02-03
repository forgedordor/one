package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kta implements ksn {
    public int c;
    public krz d;
    ksw e;
    protected int k;
    public final ksq f = new ksq(this);
    public int g = 0;
    public boolean h = false;
    public final ksp i = new ksp(this);
    public final ksp j = new ksp(this);
    protected int l = 1;

    public kta(krz krzVar) {
        this.d = krzVar;
    }

    protected static final void j(ksp kspVar, ksp kspVar2, int i) {
        kspVar.k.add(kspVar2);
        kspVar.e = i;
        kspVar2.j.add(kspVar);
    }

    protected static final ksp k(kry kryVar) {
        kry kryVar2 = kryVar.e;
        if (kryVar2 == null) {
            return null;
        }
        int i = kryVar2.i;
        krz krzVar = kryVar2.d;
        int i2 = i - 1;
        if (i2 == 1) {
            return krzVar.o.i;
        }
        if (i2 == 2) {
            return krzVar.p.i;
        }
        if (i2 == 3) {
            return krzVar.o.j;
        }
        if (i2 == 4) {
            return krzVar.p.j;
        }
        if (i2 != 5) {
            return null;
        }
        return krzVar.p.a;
    }

    protected static final ksp l(kry kryVar, int i) {
        kry kryVar2 = kryVar.e;
        if (kryVar2 == null) {
            return null;
        }
        krz krzVar = kryVar2.d;
        kta ktaVar = i == 0 ? krzVar.o : krzVar.p;
        int i2 = kryVar2.i - 1;
        if (i2 == 1 || i2 == 2) {
            return ktaVar.i;
        }
        if (i2 == 3 || i2 == 4) {
            return ktaVar.j;
        }
        return null;
    }

    public long a() {
        if (this.f.i) {
            return r0.f;
        }
        return 0L;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean e();

    @Override // defpackage.ksn
    public void f() {
        throw null;
    }

    protected final int h(int i, int i2) {
        if (i2 == 0) {
            krz krzVar = this.d;
            int i3 = krzVar.G;
            int iMax = Math.max(krzVar.F, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            krz krzVar2 = this.d;
            int i4 = krzVar2.J;
            int iMax2 = Math.max(krzVar2.I, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    protected final void i(ksp kspVar, ksp kspVar2, int i, ksq ksqVar) {
        List list = kspVar.k;
        list.add(kspVar2);
        list.add(this.f);
        kspVar.g = i;
        kspVar.h = ksqVar;
        kspVar2.j.add(kspVar);
        ksqVar.j.add(kspVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[PHI: r9
      0x00a4: PHI (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:44:0x008c, B:32:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void m(defpackage.kry r13, defpackage.kry r14, int r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kta.m(kry, kry, int):void");
    }
}
