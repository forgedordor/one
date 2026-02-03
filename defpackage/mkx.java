package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mkx {
    final /* synthetic */ Executor a;
    final /* synthetic */ mcz b;
    final /* synthetic */ mno c;
    final /* synthetic */ mlb d;

    public mkx(mlb mlbVar, Executor executor, mcz mczVar, mno mnoVar) {
        this.a = executor;
        this.b = mczVar;
        this.c = mnoVar;
        this.d = mlbVar;
    }

    public final void a(long j) {
        mno mnoVar = this.c;
        if (mnoVar == null) {
            return;
        }
        mnoVar.l(j);
    }

    public final void b() {
        mlb mlbVar = this.d;
        if (!mlbVar.l) {
            mlbVar.m();
            return;
        }
        Executor executor = this.a;
        final mcz mczVar = this.b;
        executor.execute(new Runnable() { // from class: mkw
            @Override // java.lang.Runnable
            public final void run() {
                mczVar.a();
            }
        });
        int i = mjr.a;
    }
}
