package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class damw extends aivg {
    public static final /* synthetic */ int a = 0;
    private static final cczi b = cdag.h(cdag.b, "disable_logging_bugle_clearcut_federated_learning", false);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public damw(fcsu fcsuVar, Executor executor) {
        super(fcsuVar, new damp(), executor);
        fcsuVar.getClass();
        executor.getClass();
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new damv(damu.a);
    }

    public final void b(final fdap fdapVar) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        k(new Supplier() { // from class: damq
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = damw.a;
                elli elliVar = (elli) ellj.a.createBuilder();
                elliVar.getClass();
                elgs elgsVar = new elgs(elliVar);
                fdapVar.invoke(elgsVar);
                evsn evsnVarBuild = elgsVar.a.build();
                evsnVarBuild.getClass();
                return (ellj) evsnVarBuild;
            }
        });
    }
}
