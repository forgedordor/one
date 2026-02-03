package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuev extends cmwg {
    public final Context a;
    private final eosc b;

    public cuev(Context context, eosc eoscVar) {
        this.a = context;
        this.b = eoscVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("ProfileInstallerStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        return eijx.f(new Runnable() { // from class: cueu
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                pax paxVar = pay.a;
                pay.c(this.a.a, new Executor() { // from class: pau
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, pay.a, false);
            }
        }, this.b);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return false;
    }
}
