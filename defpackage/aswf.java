package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aswf implements asxy {
    public static final eksp a = eksp.c("BugleRcsCapabilities");
    public final assu b;
    public final asxy c;
    public final aszu d;
    public final Executor e;

    public aswf(assu assuVar, asxy asxyVar, aszu aszuVar, Executor executor) {
        this.b = assuVar;
        this.c = asxyVar;
        this.d = aszuVar;
        this.e = executor;
    }

    @Override // defpackage.asxy
    public final eiju a(final Iterable iterable) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilities", 107, "CachedCapabilitiesProvider.java")).r("CachedCapabilitiesProvider: start getBatchCapabilities for %d chatEndpoints", ekis.b(iterable));
        return this.b.b(iterable).i(new eooz() { // from class: asvz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Map map = (Map) obj;
                Stream stream = Collection.EL.stream(map.entrySet());
                final aswf aswfVar = this.a;
                final Map map2 = (Map) stream.filter(new Predicate() { // from class: aswb
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return aswfVar.d.a((asts) ((Map.Entry) obj2).getValue());
                    }
                }).collect(Collectors.toMap(new Function() { // from class: aswc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (aubq) ((Map.Entry) obj2).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: aswd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (asts) ((Map.Entry) obj2).getValue();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new BinaryOperator() { // from class: aswe
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj2, Object obj3) {
                        asts astsVar = (asts) obj2;
                        eksp ekspVar = aswf.a;
                        return astsVar;
                    }
                }, new Supplier() { // from class: asvp
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new HashMap();
                    }
                }));
                eksp ekspVar = aswf.a;
                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilities", 125, "CachedCapabilitiesProvider.java")).u("CachedCapabilitiesProvider: getBatchCapabilities retrieved valid capabilities for %d of %d requested users", map2.size(), map.size());
                HashSet hashSetE = ekpg.e(iterable);
                hashSetE.removeAll(map2.keySet());
                if (hashSetE.isEmpty()) {
                    return eijx.e(map2);
                }
                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilitiesFromDelegate", 148, "CachedCapabilitiesProvider.java")).r("CachedCapabilitiesProvider: start getBatchCapabilitiesFromDelegate for %d chatEndpoints", hashSetE.size());
                eiju eijuVarA = aswfVar.c.a(hashSetE);
                eooz eoozVar = new eooz() { // from class: asvr
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final Map map3 = (Map) obj2;
                        ((eksl) aswf.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilitiesFromDelegate", 155, "CachedCapabilitiesProvider.java")).r("CachedCapabilitiesProvider: getCapabilitiesFromDelegate returned delegateCapabilities for %d chatEndpoints", map3.size());
                        aswf aswfVar2 = aswfVar;
                        return aswfVar2.b.c(map3).h(new ejvr() { // from class: asvt
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                eksp ekspVar2 = aswf.a;
                                return map3;
                            }
                        }, aswfVar2.e);
                    }
                };
                Executor executor = aswfVar.e;
                return eijuVarA.i(eoozVar, executor).h(new ejvr() { // from class: asvs
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Map map3 = (Map) obj2;
                        ((eksl) aswf.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilitiesFromDelegate", 167, "CachedCapabilitiesProvider.java")).q("CachedCapabilitiesProvider: finished inserting batch of capabilities into the cache");
                        return map3;
                    }
                }, executor).h(new ejvr() { // from class: asvq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Map map3 = (Map) obj2;
                        eksp ekspVar2 = aswf.a;
                        map3.putAll(map2);
                        return map3;
                    }
                }, executor);
            }
        }, this.e);
    }

    @Override // defpackage.asxy
    public final eiju b(final aubq aubqVar) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilities", 54, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: start getCapabilities for chatEndpoint %s", cqcv.b(aubqVar.d));
        return this.b.a(aubqVar).i(new eooz() { // from class: asvo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                ((eksl) aswf.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilities", 61, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: getCapabilities result capabilitiesOptional %s", optional);
                final aswf aswfVar = this.a;
                final aszu aszuVar = aswfVar.d;
                Optional map = optional.filter(new Predicate() { // from class: asvw
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return aszuVar.a((asts) obj2);
                    }
                }).map(new Function() { // from class: asvx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return eijx.e((asts) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final aubq aubqVar2 = aubqVar;
                return (ListenableFuture) map.orElseGet(new Supplier() { // from class: asvy
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        eksl ekslVar = (eksl) aswf.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilitiesFromDelegate", 76, "CachedCapabilitiesProvider.java");
                        final aubq aubqVar3 = aubqVar2;
                        ekslVar.t("CachedCapabilitiesProvider: start getCapabilitiesFromDelegate for chatEndpoint %s", cqcv.b(aubqVar3.d));
                        final aswf aswfVar2 = aswfVar;
                        eiju eijuVarB = aswfVar2.c.b(aubqVar3);
                        eooz eoozVar = new eooz() { // from class: asvu
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final asts astsVar = (asts) obj2;
                                ((eksl) aswf.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilitiesFromDelegate", 83, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: finish getCapabilitiesFromDelegate return delegateCapabilities %s", astsVar);
                                aswf aswfVar3 = aswfVar2;
                                return aswfVar3.b.d(aubqVar3, astsVar).h(new ejvr() { // from class: aswa
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        eksp ekspVar = aswf.a;
                                        return astsVar;
                                    }
                                }, aswfVar3.e);
                            }
                        };
                        Executor executor = aswfVar2.e;
                        return eijuVarB.i(eoozVar, executor).h(new ejvr() { // from class: asvv
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                asts astsVar = (asts) obj2;
                                ((eksl) aswf.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilitiesFromDelegate", 95, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: finish inserting capabilities into the cache %s", astsVar);
                                return astsVar;
                            }
                        }, executor);
                    }
                });
            }
        }, this.e);
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }
}
