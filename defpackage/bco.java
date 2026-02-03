package defpackage;

import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bco implements bkw {
    public final bkw d;
    public baa e;
    private final Surface f;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    private final baa g = new baa() { // from class: bcn
        @Override // defpackage.baa
        public final void k(bbm bbmVar) {
            baa baaVar;
            bco bcoVar = this.a;
            synchronized (bcoVar.a) {
                int i = bcoVar.b - 1;
                bcoVar.b = i;
                if (bcoVar.c && i == 0) {
                    bcoVar.i();
                }
                baaVar = bcoVar.e;
            }
            if (baaVar != null) {
                baaVar.k(bbmVar);
            }
        }
    };

    public bco(bkw bkwVar) {
        this.d = bkwVar;
        this.f = bkwVar.e();
    }

    private final bbm l(bbm bbmVar) {
        if (bbmVar == null) {
            return null;
        }
        this.b++;
        bcr bcrVar = new bcr(bbmVar);
        bcrVar.g(this.g);
        return bcrVar;
    }

    @Override // defpackage.bkw
    public final int a() {
        int iA;
        synchronized (this.a) {
            iA = this.d.a();
        }
        return iA;
    }

    @Override // defpackage.bkw
    public final int b() {
        int iB;
        synchronized (this.a) {
            iB = this.d.b();
        }
        return iB;
    }

    @Override // defpackage.bkw
    public final int c() {
        int iC;
        synchronized (this.a) {
            iC = this.d.c();
        }
        return iC;
    }

    @Override // defpackage.bkw
    public final int d() {
        int iD;
        synchronized (this.a) {
            iD = this.d.d();
        }
        return iD;
    }

    @Override // defpackage.bkw
    public final Surface e() {
        Surface surfaceE;
        synchronized (this.a) {
            surfaceE = this.d.e();
        }
        return surfaceE;
    }

    @Override // defpackage.bkw
    public final bbm f() {
        bbm bbmVarL;
        synchronized (this.a) {
            bbmVarL = l(this.d.f());
        }
        return bbmVarL;
    }

    @Override // defpackage.bkw
    public final bbm g() {
        bbm bbmVarL;
        synchronized (this.a) {
            bbmVarL = l(this.d.g());
        }
        return bbmVarL;
    }

    @Override // defpackage.bkw
    public final void h() {
        synchronized (this.a) {
            this.d.h();
        }
    }

    @Override // defpackage.bkw
    public final void i() {
        synchronized (this.a) {
            Surface surface = this.f;
            if (surface != null) {
                surface.release();
            }
            this.d.i();
        }
    }

    @Override // defpackage.bkw
    public final void j(final bkv bkvVar, Executor executor) {
        synchronized (this.a) {
            this.d.j(new bkv() { // from class: bcm
                @Override // defpackage.bkv
                public final void a(bkw bkwVar) {
                    bkvVar.a(this.a);
                }
            }, executor);
        }
    }

    public final void k() {
        synchronized (this.a) {
            this.c = true;
            this.d.h();
            if (this.b == 0) {
                i();
            }
        }
    }
}
