package defpackage;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bax implements bnh, bkt {
    public final bli a;

    public bax() {
        this(bli.a());
    }

    public static bax a(bjq bjqVar) {
        return new bax(bli.b(bjqVar));
    }

    public final bbf b() {
        bli bliVar = this.a;
        Integer num = (Integer) bliVar.n(bkp.d, null);
        if (num != null) {
            bliVar.c(bkr.D, num);
        } else if (bbf.u(bliVar)) {
            bliVar.c(bkr.D, 32);
        } else if (bbf.v(bliVar)) {
            bliVar.c(bkr.D, 32);
            bliVar.c(bkr.E, 256);
        } else if (bbf.w(bliVar)) {
            bliVar.c(bkr.D, 4101);
            bliVar.c(bkr.o, azv.a);
        } else {
            bliVar.c(bkr.D, 256);
        }
        bkp bkpVarC = c();
        bks.d(bkpVarC);
        bbf bbfVar = new bbf(bkpVarC);
        Size size = (Size) bliVar.n(bkp.J, null);
        if (size != null) {
            bbfVar.e = new Rational(size.getWidth(), size.getHeight());
        }
        lcg.j((Executor) bliVar.n(bkp.P, bpm.a()), "The IO executor can't be null");
        bjo bjoVar = bkp.b;
        if (bliVar.t(bjoVar)) {
            Integer num2 = (Integer) bliVar.m(bjoVar);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                Objects.toString(num2);
                throw new IllegalArgumentException("The flash mode is not allowed to set: ".concat(String.valueOf(num2)));
            }
            if (num2.intValue() == 3 && bliVar.n(bkp.j, null) == null) {
                throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
            }
        }
        return bbfVar;
    }

    @Override // defpackage.bnh
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final bkp c() {
        return new bkp(blo.f(this.a));
    }

    @Override // defpackage.azw
    public final bli f() {
        return this.a;
    }

    @Override // defpackage.bkt
    @Deprecated
    public final /* bridge */ /* synthetic */ void g(Size size) {
        this.a.c(bkp.J, size);
    }

    @Override // defpackage.bkt
    public final /* bridge */ /* synthetic */ void h(int i) {
        this.a.c(bkp.G, Integer.valueOf(i));
    }

    public final void i(Executor executor) {
        this.a.c(bkp.P, executor);
    }

    @Override // defpackage.bkt
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(bvc bvcVar) {
        this.a.c(bku.N, bvcVar);
    }

    public final void k(String str) {
        this.a.c(bkp.m, str);
    }

    private bax(bli bliVar) {
        this.a = bliVar;
        Class cls = (Class) bliVar.n(brm.n, null);
        if (cls != null && !cls.equals(bbf.class)) {
            throw new IllegalArgumentException(a.i(cls, this, "Invalid target class configuration for ", ": "));
        }
        bliVar.c(bni.y, bnk.IMAGE_CAPTURE);
        bliVar.c(bkp.n, bbf.class);
        if (bliVar.n(bkp.m, null) == null) {
            k(a.w(bbf.class));
        }
    }
}
