package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drfq implements rfg, rff {
    public final int a;
    public final int b;
    public final rex c;
    public final drfl d;
    public volatile rbh e;
    public volatile boolean f;
    public volatile rfg g;
    final /* synthetic */ drft h;
    private volatile rff i;
    private volatile boolean j;
    private volatile ListenableFuture k;

    public drfq(drft drftVar, drfl drflVar, int i, int i2, rex rexVar) {
        this.h = drftVar;
        this.a = i;
        this.b = i2;
        this.c = rexVar;
        this.d = drflVar;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return this.h.e;
    }

    @Override // defpackage.rff
    public final void c(Object obj) {
        if (this.f) {
            return;
        }
        this.i.c(obj);
    }

    @Override // defpackage.rfg
    public final void d() {
        this.f = true;
        rfg rfgVar = this.g;
        if (rfgVar != null) {
            rfgVar.d();
        }
    }

    @Override // defpackage.rfg
    public final void e() {
        rfg rfgVar = this.g;
        if (rfgVar != null) {
            rfgVar.e();
        }
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.REMOTE;
    }

    @Override // defpackage.rff
    public final void f(Exception exc) {
        if (!this.f && !this.j) {
            rew rewVar = drft.a;
            if ((exc instanceof ree) && ((ree) exc).a == 403) {
                this.j = true;
                drgb drgbVar = this.h.d;
                rvi.f(drgbVar);
                drgbVar.b(this.d);
                g(this.e, this.i);
                return;
            }
        }
        this.i.f(exc);
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        this.e = rbhVar;
        this.i = rffVar;
        if (this.f) {
            return;
        }
        drgb drgbVar = this.h.d;
        rvi.f(drgbVar);
        ListenableFuture listenableFutureI = eork.i(drgbVar.a(this.d));
        this.k = listenableFutureI;
        eork.r(listenableFutureI, new drfp(this, rffVar), eoqg.a);
        if (this.f) {
            d();
        }
    }
}
