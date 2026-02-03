package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzb extends hza {
    private final hza l;
    private boolean m;

    public hzb(long j, hzn hznVar, fdap fdapVar, fdap fdapVar2, hza hzaVar) {
        super(j, hznVar, fdapVar, fdapVar2);
        this.l = hzaVar;
        hzaVar.f();
    }

    private final void F() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.l.g();
    }

    @Override // defpackage.hza
    public final hzj c() throws Throwable {
        hzb hzbVar;
        hza hzaVar = this.l;
        if (hzaVar.g || hzaVar.j) {
            return new hzh();
        }
        cva cvaVar = this.d;
        long j = this.i;
        Map mapO = cvaVar != null ? hzt.o(hzaVar.v(), this, hzaVar.x()) : null;
        Object obj = hzt.c;
        synchronized (obj) {
            try {
                hzt.w(this);
                try {
                    if (cvaVar == null || cvaVar.d == 0) {
                        hzbVar = this;
                        y();
                    } else {
                        hzbVar = this;
                        hzj hzjVarJ = hzbVar.j(hzaVar.v(), cvaVar, mapO, hzaVar.x());
                        if (!fdbq.f(hzjVarJ, hzi.a)) {
                            return hzjVarJ;
                        }
                        cva cvaVarI = hzaVar.i();
                        if (cvaVarI != null) {
                            cvaVarI.c(cvaVar);
                        } else {
                            hzaVar.s(cvaVar);
                            hzbVar.d = null;
                        }
                    }
                    if (fdbq.b(hzaVar.v(), j) < 0) {
                        hzaVar.n();
                    }
                    hzaVar.A(hzaVar.x().b(j).a(hzbVar.e));
                    hzaVar.q(j);
                    int i = hzbVar.k;
                    hzbVar.k = -1;
                    if (i >= 0) {
                        int[] iArr = hzaVar.f;
                        iArr.getClass();
                        int length = iArr.length;
                        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i;
                        iArrCopyOf.getClass();
                        hzaVar.f = iArrCopyOf;
                    }
                    hzn hznVar = hzbVar.e;
                    synchronized (obj) {
                        hzaVar.e = hzaVar.e.c(hznVar);
                        hza hzaVar2 = hzbVar.l;
                        int[] iArrF = hzbVar.f;
                        if (iArrF.length != 0) {
                            int[] iArr2 = hzaVar2.f;
                            if (iArr2.length != 0) {
                                iArrF = fcur.f(iArr2, iArrF);
                            }
                            hzaVar2.f = iArrF;
                        }
                    }
                    hzbVar.g = true;
                    F();
                    return hzi.a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.hza, defpackage.hzg
    public final void d() {
        if (this.j) {
            return;
        }
        super.d();
        F();
    }
}
