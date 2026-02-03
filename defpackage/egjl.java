package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egjl {
    private final fcsu a;
    private final egjo b;

    public egjl(fcsu fcsuVar, egjo egjoVar) {
        this.a = fcsuVar;
        this.b = egjoVar;
    }

    public final ecjh a(final ehvs ehvsVar, ecev ecevVar) {
        ejwl.m(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        ejwl.m(true, "Custom IOExecutor should not be used with a BlockingSafeProtoDataStore config");
        ehvm ehvmVar = (ehvm) ehvsVar;
        Executor executor = ehvmVar.g;
        if (executor == null) {
            executor = (Executor) this.a.b();
        }
        Executor executor2 = executor;
        final egjo egjoVar = this.b;
        executor2.getClass();
        ListenableFuture listenableFutureI = eork.i("");
        final fdap fdapVar = new fdap() { // from class: egjm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                StringBuilder sb = new StringBuilder();
                ehvm ehvmVar2 = (ehvm) ehvsVar;
                sb.append(ehvmVar2.a);
                sb.append((String) obj);
                sb.append(".pb");
                return egjoVar.a.a(ehvmVar2.c, sb.toString()).a();
            }
        };
        ListenableFuture listenableFutureJ = eika.j(listenableFutureI, new ejvr() { // from class: egjn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        }, executor2);
        ecjh ecjhVarA = ecla.a(ehvmVar.a, listenableFutureJ, ehvmVar.b, evrr.a(), executor2, ehvmVar.e, ecevVar);
        ekgb ekgbVar = ehvmVar.d;
        if (!ekgbVar.isEmpty()) {
            ecjhVarA.d(new ecjg(ekgbVar, executor2));
        }
        return ecjhVarA;
    }
}
