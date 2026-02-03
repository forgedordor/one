package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdkp implements Executor {
    public final fdjq a;

    public fdkp(fdjq fdjqVar) {
        this.a = fdjqVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        fdjq fdjqVar = this.a;
        fcyi fcyiVar = fcyi.a;
        if (fdyf.c(fdjqVar, fcyiVar)) {
            fdyf.b(fdjqVar, fcyiVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
