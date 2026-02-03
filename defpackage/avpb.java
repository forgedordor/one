package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class avpb {
    public static bojh a(avpc avpcVar, alqm alqmVar, fcsu fcsuVar) {
        return avpcVar.b(ejwk.b(alqmVar.n()), fcsuVar);
    }

    public static bojh b(avpc avpcVar, Collection collection, fcsu fcsuVar) {
        Stream map = Collection.EL.stream(collection).map(new Function() { // from class: avoy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ejwk.b(((alqm) obj).n());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return avpcVar.d((ekgb) map.collect(ekcv.a), fcsuVar);
    }

    public static eiju c(avpc avpcVar, alqm alqmVar) {
        return avpcVar.f(ejwk.b(alqmVar.n()));
    }

    public static eiju d(avpc avpcVar, String str) {
        return avpcVar.f(str).h(new ejvr() { // from class: avpa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (bojh) ((Optional) obj).orElse(null);
            }
        }, eoqg.a);
    }

    public static eiju e(avpc avpcVar, java.util.Collection collection) {
        Stream map = Collection.EL.stream(collection).map(new Function() { // from class: avoz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ejwk.b(((alqm) obj).n());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return avpcVar.j((ekgb) map.collect(ekcv.a));
    }

    public static eiju f(avpc avpcVar, alqm alqmVar, fcsu fcsuVar) {
        return avpcVar.m(ejwk.b(alqmVar.n()), fcsuVar);
    }

    public static Optional g(avpc avpcVar, alqm alqmVar) {
        return avpcVar.o(ejwk.b(alqmVar.n()));
    }

    public static Optional h(avpc avpcVar, alqm alqmVar) {
        return avpcVar.q(ejwk.b(alqmVar.n()));
    }

    public static Optional i(avpc avpcVar, java.util.Collection collection) {
        return avpcVar.s((ekgb) Collection.EL.stream(collection).map(new Function() { // from class: avox
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ejwk.b(((alqm) obj).n());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a));
    }
}
