package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esro extends fbnd {
    private final egpe a;
    private final String b;
    private final Executor c;

    public esro(final esog esogVar, final esof esofVar) {
        esmi esmiVar = (esmi) esofVar;
        this.b = esmiVar.b.getAuthority();
        this.c = esmiVar.d;
        this.a = new egpe(new eooy() { // from class: esrf
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eieu eieuVarK = eiiy.k("FrameworkChannel#getTransportChannel");
                try {
                    ListenableFuture listenableFutureI = eork.i(esogVar.a(esofVar));
                    eieuVarK.close();
                    return listenableFutureI;
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, esmiVar.c);
    }

    @Override // defpackage.fbnd
    public final fbnh a(final fbrk fbrkVar, final fbnc fbncVar) {
        drgk.a();
        ListenableFuture listenableFutureC = this.a.c();
        ejvr ejvrVar = new ejvr() { // from class: esre
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((fbnd) obj).a(fbrkVar, fbncVar);
            }
        };
        Executor executor = fbncVar.c;
        if (executor == null) {
            executor = this.c;
        }
        return new esrn(eika.j(listenableFutureC, ejvrVar, executor));
    }

    @Override // defpackage.fbnd
    public final String b() {
        return this.b;
    }
}
