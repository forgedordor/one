package defpackage;

import android.widget.FrameLayout;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dajp implements lun {
    private static final cqce e = cqce.g("Bugle", "RecyclerViewPreInflationManager");
    public Future a;
    public final eosc b;
    public final eosc c;
    public final arfv d;
    private final fcsu f;

    public dajp(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, arfv arfvVar) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.f = fcsuVar;
        this.d = arfvVar;
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        this.a.cancel(true);
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        this.a.cancel(true);
    }

    public final void g(dajo dajoVar) {
        eieu eieuVarK = eiiy.k("RecyclerViewPreInflationManager#inflationInternal");
        try {
            FrameLayout frameLayout = new FrameLayout(dajoVar.d);
            for (int i = dajoVar.a; i > 0; i--) {
                try {
                    dajoVar.c.e(dajoVar.b.n(frameLayout, 1));
                } catch (RuntimeException e2) {
                    e.s("Failed to inflate ViewHolder in background, inflate in main thread instead", e2);
                }
            }
            eieuVarK.close();
            ((adaw) this.f.b()).a(adaw.d);
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
