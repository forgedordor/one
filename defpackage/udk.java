package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udk extends aivg {
    public static final /* synthetic */ int a = 0;
    private static final cczi b = cdag.h(cdag.b, "disable_logging_add_edit_contact_event", false);

    public udk(fcsu fcsuVar, udg udgVar, Executor executor) {
        super(fcsuVar, udgVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new udj(udi.a);
    }

    public final void b(final fdap fdapVar) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        k(new Supplier() { // from class: udh
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = udk.a;
                eljo eljoVar = (eljo) eljp.a.createBuilder();
                eljoVar.getClass();
                elgq elgqVar = new elgq(eljoVar);
                fdapVar.invoke(elgqVar);
                evsn evsnVarBuild = elgqVar.a.build();
                evsnVarBuild.getClass();
                return (eljp) evsnVarBuild;
            }
        });
    }
}
