package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtxx implements dtxt, dtxs {
    public static final ekrg a = ekrg.c("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugListFragmentActionProviderImpl");
    public final Executor c;
    public final ea d;
    public final dtws e;
    public ejtj f;
    public dtxq g;
    public final ejtf b = new dtxv(this);
    public dtxs h = null;

    public dtxx(ea eaVar, dtws dtwsVar, Executor executor) {
        ejwl.b(true, "This helper class requires a fragment that implements IMddDebugListFragment!");
        this.d = eaVar;
        this.e = dtwsVar;
        this.c = executor;
    }

    @Override // defpackage.dtxs
    public final void a(String str) {
        throw null;
    }

    @Override // defpackage.dtxt
    public final void b() {
        this.f.c(ejtj.a(this.g.a()), this.b, "MDD.DEBUG.UPDATE_ACTION");
    }

    public final void c() {
        dtxs dtxsVar = this.h;
        if (dtxsVar != null) {
            final dtye dtyeVar = (dtye) dtxsVar;
            dtyeVar.b.fg().runOnUiThread(new Runnable() { // from class: dtyc
                @Override // java.lang.Runnable
                public final void run() {
                    dtyeVar.e.i(false);
                }
            });
        }
    }
}
