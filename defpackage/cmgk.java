package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmgk {
    public final cmgp a;
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    public cmgk(cmgp cmgpVar) {
        this.a = cmgpVar;
    }

    public final cmfo a(final cmgh cmghVar) {
        final fdap fdapVar = new fdap() { // from class: cmgi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((cmfn) obj).getClass();
                cmgp cmgpVar = this.a.a;
                ((aqbj) cmgpVar.b.b()).getClass();
                eosc eoscVar = (eosc) cmgpVar.c.b();
                eoscVar.getClass();
                eosc eoscVar2 = (eosc) cmgpVar.d.b();
                eoscVar2.getClass();
                return new cmgo(cmgpVar.a, eoscVar, eoscVar2, cmghVar);
            }
        };
        cmfm cmfmVar = (cmfm) cmghVar;
        Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(this.b, cmfmVar.a, new Function() { // from class: cmgj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        objComputeIfAbsent.getClass();
        final cmgo cmgoVar = (cmgo) objComputeIfAbsent;
        String str = (String) cmfmVar.b.orElse("");
        str.getClass();
        boolean z = ((cmfm) cmgoVar.d).f;
        boolean z2 = cmfmVar.f;
        if (z == z2) {
            ConcurrentHashMap concurrentHashMap = cmgoVar.e;
            final fdap fdapVar2 = new fdap() { // from class: cmgl
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    String str2 = (String) obj;
                    str2.getClass();
                    cmgo cmgoVar2 = cmgoVar;
                    cmfl cmflVar = new cmfl(cmgoVar2.d);
                    cmflVar.g(str2);
                    cmgh cmghVarA = cmflVar.a();
                    cmio cmioVar = new cmio(cmgoVar2.a, cmgoVar2.b, cmgoVar2.c, cmghVarA);
                    if (!((cmfm) cmghVarA).f) {
                        return cmioVar;
                    }
                    AtomicReference atomicReference = cmgoVar2.f;
                    cmgn cmgnVar = new cmgn(null);
                    while (!atomicReference.compareAndSet(null, cmgnVar) && atomicReference.get() == null) {
                    }
                    Object obj2 = atomicReference.get();
                    obj2.getClass();
                    return new cmgf(cmioVar, cmghVarA, (cmgn) obj2);
                }
            };
            Object objComputeIfAbsent2 = ConcurrentMap.EL.computeIfAbsent(concurrentHashMap, str, new Function() { // from class: cmgm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return fdapVar2.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            objComputeIfAbsent2.getClass();
            return (cmfo) objComputeIfAbsent2;
        }
        throw new IllegalStateException("Requesting cache state " + z2 + " but it is already " + z);
    }
}
