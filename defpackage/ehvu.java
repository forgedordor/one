package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvu {
    public final ehvf a;
    private final fcsu b;

    public ehvu(fcsu fcsuVar, ehvf ehvfVar) {
        this.b = fcsuVar;
        this.a = ehvfVar;
    }

    public final ecjh a(final ehvs ehvsVar, ecev ecevVar) {
        ejwl.m(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        ejwl.m(true, "Custom IOExecutor should not be used with a BlockingSafeProtoDataStore config");
        ehvm ehvmVar = (ehvm) ehvsVar;
        Executor executor = ehvmVar.g;
        if (executor == null) {
            executor = (Executor) this.b.b();
        }
        Executor executor2 = executor;
        ListenableFuture listenableFutureJ = eika.j(eork.i(""), new ejvr() { // from class: ehvt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str = (String) obj;
                str.getClass();
                StringBuilder sb = new StringBuilder();
                ehvm ehvmVar2 = (ehvm) ehvsVar;
                sb.append(ehvmVar2.a);
                sb.append(str);
                sb.append(".pb");
                return this.a.a.c(ehvmVar2.c, sb.toString());
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
