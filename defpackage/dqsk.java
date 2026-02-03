package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dqsk {
    public static void a(dqsn dqsnVar, final dqsm dqsmVar, String str, final Runnable runnable, dqss dqssVar) {
        ((dqsy) ((byev) dqsnVar).a.b()).W(str, new Runnable() { // from class: byes
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                eieu eieuVarA = dqsmVar.a();
                try {
                    runnable2.run();
                    eieuVarA.close();
                } catch (Throwable th) {
                    try {
                        eieuVarA.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, dqssVar);
    }
}
