package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egwe {
    public final Executor a;

    public egwe(Executor executor) {
        executor.getClass();
        this.a = executor;
    }

    public final void a(fdlr fdlrVar) {
        fdlt fdltVar = new fdlt(fdlrVar);
        final fdap fdapVar = new fdap() { // from class: egwc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final IllegalStateException illegalStateException = new IllegalStateException("TikTok's CoroutineScope should not be cancelled or completed", (Throwable) obj);
                this.a.a.execute(eiid.k(new Runnable() { // from class: egwd
                    @Override // java.lang.Runnable
                    public final void run() {
                        eiip.k(illegalStateException);
                    }
                }));
                return fctx.a;
            }
        };
        final eifn eifnVarE = eidc.e();
        fdltVar.hK(new fdap() { // from class: eiie
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                eifi eifiVarB = eidc.b();
                eifn eifnVarH = eidc.h(eifiVarB, eifnVarE);
                try {
                    fdapVar.invoke(th);
                    eidc.h(eifiVarB, eifnVarH);
                    return fctx.a;
                } finally {
                }
            }
        });
    }
}
