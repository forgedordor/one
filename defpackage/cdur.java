package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdur extends aivg {
    public static final /* synthetic */ int a = 0;
    private static final cczv b = cdag.h(cdag.b, "disable_logging_mdd_lib", true);

    static {
        cdag.v("use_mdd_lib_event_logger").getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdur(fcsu fcsuVar, Executor executor) {
        super(fcsuVar, new cdul(), executor);
        fcsuVar.getClass();
        executor.getClass();
    }

    private final void d(final fdap fdapVar) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        k(new Supplier() { // from class: cdum
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = cdur.a;
                elms elmsVar = (elms) elmv.a.createBuilder();
                elmsVar.getClass();
                elgx elgxVar = new elgx(elmsVar);
                fdapVar.invoke(elgxVar);
                evsn evsnVarBuild = elgxVar.a.build();
                evsnVarBuild.getClass();
                return (elmv) evsnVarBuild;
            }
        });
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new cduq(cdup.a);
    }

    public final void b(final int i, final int i2) {
        d(new fdap() { // from class: cdun
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                elgx elgxVar = (elgx) obj;
                int i3 = cdur.a;
                elgxVar.getClass();
                elgxVar.b(i);
                elgxVar.a(i2);
                return fctx.a;
            }
        });
    }

    public final void c(final int i, final int i2, final String str, final long j) {
        str.getClass();
        d(new fdap() { // from class: cduo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                elgx elgxVar = (elgx) obj;
                int i3 = cdur.a;
                elgxVar.getClass();
                elgxVar.b(i);
                elgxVar.a(i2);
                elms elmsVar = elgxVar.a;
                elmsVar.copyOnWrite();
                elmv elmvVar = (elmv) elmsVar.instance;
                elmv elmvVar2 = elmv.a;
                elmvVar.b |= 4;
                elmvVar.e = str;
                elmsVar.copyOnWrite();
                elmv elmvVar3 = (elmv) elmsVar.instance;
                elmvVar3.b |= 8;
                elmvVar3.f = j;
                return fctx.a;
            }
        });
    }
}
