package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class odt implements odl {
    public final odl a;
    public long b;
    final /* synthetic */ odu c;
    private final int d;

    public odt(odu oduVar, odl odlVar, int i) {
        this.c = oduVar;
        this.a = odlVar;
        this.d = i;
    }

    @Override // defpackage.odl
    public final int a() {
        throw null;
    }

    @Override // defpackage.odl
    public final Surface b() {
        throw null;
    }

    @Override // defpackage.odl
    public final mix c() {
        return this.a.c();
    }

    public final void d() {
        this.c.e.b(new Runnable() { // from class: ods
            @Override // java.lang.Runnable
            public final void run() {
                odt odtVar = this.a;
                try {
                    odu oduVar = odtVar.c;
                    if (oduVar.n) {
                        return;
                    }
                    oduVar.k();
                    odtVar.b += oduVar.o;
                    oduVar.k.g();
                    int i = 0;
                    oduVar.i = false;
                    int i2 = oduVar.j + 1;
                    oduVar.j = i2;
                    List list = oduVar.b;
                    if (i2 == ((ekoe) list).c) {
                        oduVar.j = 0;
                        oduVar.m++;
                    } else {
                        i = i2;
                    }
                    obt obtVar = (obt) list.get(i);
                    oaj oajVar = oduVar.c;
                    Looper looperMyLooper = Looper.myLooper();
                    mee.f(looperMyLooper);
                    oduVar.k = oajVar.a(obtVar, looperMyLooper, oduVar, oduVar.d);
                    oduVar.k.h();
                } catch (RuntimeException e) {
                    odtVar.c.b(new ocp("Asset loader error", e, 1000));
                }
            }
        });
    }

    @Override // defpackage.odl
    public final void f() {
        odu oduVar = this.c;
        AtomicInteger atomicInteger = oduVar.h;
        atomicInteger.decrementAndGet();
        if (oduVar.m()) {
            this.a.f();
        } else if (atomicInteger.get() == 0) {
            d();
        }
    }

    @Override // defpackage.odl
    public final int h(Bitmap bitmap, men menVar) {
        return this.a.h(bitmap, new men(menVar.c, menVar.a, null));
    }

    @Override // defpackage.odl
    public final void i() {
        odl odlVar = this.a;
        mix mixVarC = odlVar.c();
        mee.g(mixVarC);
        if (mixVarC.eS()) {
            odu oduVar = this.c;
            AtomicInteger atomicInteger = oduVar.h;
            atomicInteger.decrementAndGet();
            if (!oduVar.m()) {
                if (this.d == 1 && oduVar.l) {
                    odlVar.i();
                    mee.c(true);
                } else {
                    mixVarC.eP();
                    mixVarC.f = 0L;
                }
                if (atomicInteger.get() == 0) {
                    d();
                    return;
                }
                return;
            }
        }
        odlVar.i();
        mee.c(true);
    }

    @Override // defpackage.odl
    public final boolean j() {
        throw null;
    }
}
