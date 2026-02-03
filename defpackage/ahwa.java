package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwa extends fcyz implements fdat {
    final /* synthetic */ UUID a;
    final /* synthetic */ aiba b;
    final /* synthetic */ ahwd c;
    final /* synthetic */ aiay d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwa(fcxy fcxyVar, UUID uuid, aiba aibaVar, ahwd ahwdVar, aiay aiayVar) {
        super(2, fcxyVar);
        this.a = uuid;
        this.b = aibaVar;
        this.c = ahwdVar;
        this.d = aiayVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahwa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = btqy.a;
        btow btowVar = new btow();
        btowVar.f(Optional.of(this.a));
        btowVar.d(this.b);
        cogw cogwVar = this.c.d;
        btowVar.g(cogwVar.f());
        btowVar.h(aiaf.CREATED);
        btowVar.i(cogwVar.f());
        btowVar.e(cswl.a(r0.f).b);
        btowVar.c(this.d);
        btowVar.b(false);
        final btor btorVarA = btowVar.a(new Supplier() { // from class: btou
            @Override // java.util.function.Supplier
            public final Object get() {
                return new btos();
            }
        });
        final dqsy dqsyVarB = btqy.b();
        dqru.b(btqy.b(), "restore_workflow_executions", btorVarA, new Function() { // from class: btop
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return Long.valueOf(dqsyVarB.P("restore_workflow_executions", (dqst) obj2));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btoq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                Long l = (Long) obj2;
                if (l.longValue() >= 0) {
                    btor btorVar = btorVarA;
                    btorVar.a = l.longValue();
                    btorVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahwa ahwaVar = new ahwa(fcxyVar, this.a, this.b, this.c, this.d);
        ahwaVar.e = obj;
        return ahwaVar;
    }
}
