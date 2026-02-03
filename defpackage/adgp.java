package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgp extends aivg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adgp(fcsu fcsuVar, adgj adgjVar, Executor executor) {
        super(fcsuVar, adgjVar, executor);
        fcsuVar.getClass();
        executor.getClass();
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        final adgn adgnVar = adgn.a;
        return new BiConsumer() { // from class: adgo
            @Override // java.util.function.BiConsumer
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                adgnVar.a(obj, obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final doqh doqhVar, final boolean z, final String str) {
        doqhVar.getClass();
        str.getClass();
        k(new Supplier() { // from class: adgl
            @Override // java.util.function.Supplier
            public final Object get() {
                int i;
                endl endlVar = (endl) endm.a.createBuilder();
                endlVar.getClass();
                endp endpVar = (endp) ends.a.createBuilder();
                endpVar.getClass();
                endo endoVarA = adgf.a(z, str);
                endpVar.copyOnWrite();
                ends endsVar = (ends) endpVar.instance;
                endsVar.c = endoVarA;
                endsVar.b |= 1;
                doqh doqhVar2 = doqhVar;
                if (doqhVar2 instanceof doqd) {
                    i = 2;
                } else if (doqhVar2 instanceof doqf) {
                    i = 3;
                } else if (doqhVar2 instanceof doqg) {
                    i = 4;
                } else {
                    if (!(doqhVar2 instanceof doqe)) {
                        throw new fctg();
                    }
                    i = 5;
                }
                endpVar.copyOnWrite();
                ends endsVar2 = (ends) endpVar.instance;
                endsVar2.d = i - 1;
                endsVar2.b |= 2;
                int i2 = true == doqhVar2.a ? 2 : 3;
                endpVar.copyOnWrite();
                ends endsVar3 = (ends) endpVar.instance;
                endsVar3.e = i2 - 1;
                endsVar3.b |= 4;
                evsn evsnVarBuild = endpVar.build();
                evsnVarBuild.getClass();
                endlVar.copyOnWrite();
                endm endmVar = (endm) endlVar.instance;
                endmVar.c = (ends) evsnVarBuild;
                endmVar.b = 2;
                return enrr.a(endlVar);
            }
        });
    }

    public final void c(final doqc doqcVar) {
        k(new Supplier() { // from class: adgm
            @Override // java.util.function.Supplier
            public final Object get() {
                int i;
                endl endlVar = (endl) endm.a.createBuilder();
                endlVar.getClass();
                endt endtVar = (endt) endv.a.createBuilder();
                endtVar.getClass();
                doqc doqcVar2 = doqcVar;
                if (doqcVar2 instanceof doqb) {
                    i = 2;
                } else if (doqcVar2 instanceof doqa) {
                    i = 3;
                } else {
                    if (!(doqcVar2 instanceof dopz)) {
                        throw new fctg();
                    }
                    i = 4;
                }
                endtVar.copyOnWrite();
                endv endvVar = (endv) endtVar.instance;
                endvVar.c = i - 1;
                endvVar.b |= 1;
                dooy dooyVar = doqcVar2.a;
                endtVar.copyOnWrite();
                endv endvVar2 = (endv) endtVar.instance;
                endvVar2.d = dooyVar.e;
                endvVar2.b |= 2;
                evsn evsnVarBuild = endtVar.build();
                evsnVarBuild.getClass();
                endlVar.copyOnWrite();
                endm endmVar = (endm) endlVar.instance;
                endmVar.c = (endv) evsnVarBuild;
                endmVar.b = 3;
                return enrr.a(endlVar);
            }
        });
    }
}
