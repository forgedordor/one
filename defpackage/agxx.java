package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agxx extends aivg implements agxn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agxx(fcsu fcsuVar, agxm agxmVar, Executor executor) {
        super(fcsuVar, agxmVar, executor);
        fcsuVar.getClass();
        executor.getClass();
    }

    private final void m(final fdap fdapVar) {
        k(new Supplier() { // from class: agxp
            @Override // java.util.function.Supplier
            public final Object get() {
                emny emnyVarA = emnx.a((emnv) emnw.a.createBuilder());
                fdapVar.invoke(emnyVarA);
                return emnyVarA.a();
            }
        });
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new agxw(agxv.a);
    }

    @Override // defpackage.agxn
    public final void b() {
        m(new fdap() { // from class: agxr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                emny emnyVar = (emny) obj;
                emnyVar.getClass();
                emnyVar.b(4);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.agxn
    public final void c() {
        m(new fdap() { // from class: agxs
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                emny emnyVar = (emny) obj;
                emnyVar.getClass();
                emnyVar.b(8);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.agxn
    public final void d() {
        m(new fdap() { // from class: agxu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                emny emnyVar = (emny) obj;
                emnyVar.getClass();
                emnyVar.b(3);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.agxn
    public final void e() {
        m(new fdap() { // from class: agxt
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                emny emnyVar = (emny) obj;
                emnyVar.getClass();
                emnyVar.b(2);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.agxn
    public final void f() {
        m(new fdap() { // from class: agxo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                emny emnyVar = (emny) obj;
                emnyVar.getClass();
                emnyVar.b(7);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.agxn
    public final void g() {
        m(new fdap() { // from class: agxq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                emny emnyVar = (emny) obj;
                emnyVar.getClass();
                emnyVar.b(6);
                return fctx.a;
            }
        });
    }
}
