package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asxs implements asxy {
    public static final eksp a = eksp.c("BugleRcsCapabilities");
    public final asxy b;
    public final aszu c;
    public final awlc d;
    public final eosc e;
    private final asxy f;

    public asxs(asxy asxyVar, asxy asxyVar2, awlc awlcVar, eosc eoscVar, aszu aszuVar) {
        this.b = asxyVar2;
        this.f = asxyVar;
        this.d = awlcVar;
        this.e = eoscVar;
        this.c = aszuVar;
    }

    @Override // defpackage.asxy
    public final eiju a(Iterable iterable) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getBatchCapabilities", 172, "RcsCapabilitiesBackgroundUpdater.java")).r("RcsCapabilitiesBackgroundUpdater: start getBatchCapabilities for %d chatEndpoints", ekis.b(iterable));
        eiju eijuVarA = this.f.a(iterable);
        auvh.e(eijuVarA.i(new eooz() { // from class: asxi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Map map = (Map) obj;
                Stream stream = Collection.EL.stream(map.entrySet());
                final asxs asxsVar = this.a;
                final ekgp ekgpVar = (ekgp) stream.filter(new Predicate() { // from class: asxl
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
                        return !asxsVar.c.a((asts) ((Map.Entry) obj2).getValue());
                    }
                }).collect(ekgp.v());
                if (ekgpVar.isEmpty()) {
                    return eijx.e(null);
                }
                ((eksl) asxs.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "fetchCapabilitiesInBackgroundIfInvalid", 209, "RcsCapabilitiesBackgroundUpdater.java")).u("RcsCapabilitiesBackgroundUpdater: %d of %d capabilities in batch are invalid. Starting backgroundProvider.getBatchCapabilities", ekgpVar.size(), map.size());
                return asxsVar.b.a(ekgpVar.keySet()).i(new eooz() { // from class: asxm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        Stream stream2 = Collection.EL.stream(((Map) obj2).entrySet());
                        final ekgp ekgpVar2 = ekgpVar;
                        final ekgp ekgpVar3 = (ekgp) stream2.filter(new Predicate() { // from class: asxp
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
                            public final boolean test(Object obj3) {
                                Map.Entry entry = (Map.Entry) obj3;
                                eksp ekspVar = asxs.a;
                                asts astsVar = (asts) ekgpVar2.get(entry.getKey());
                                return astsVar != null && ((asts) entry.getValue()).b().isAfter(astsVar.b());
                            }
                        }).collect(ekgp.v());
                        ((eksl) asxs.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "fetchCapabilitiesInBackgroundIfInvalid", 231, "RcsCapabilitiesBackgroundUpdater.java")).u("RcsCapabilitiesBackgroundUpdater: %d of %d background fetch capabilities are fresher.", ekgpVar3.size(), map.size());
                        if (ekgpVar3.isEmpty()) {
                            return eijx.e(null);
                        }
                        asxs asxsVar2 = asxsVar;
                        return asxsVar2.d.a(new Function() { // from class: asxq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                eksp ekspVar = asxs.a;
                                return ((asvl) obj3).a(ekgpVar3);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }, asxsVar.e);
            }
        }, this.e).e(assm.class, new ejvr() { // from class: asxj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                assm assmVar = (assm) obj;
                ((eksl) ((eksl) ((eksl) asxs.a.j()).g(assmVar)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getBatchCapabilities", 186, "RcsCapabilitiesBackgroundUpdater.java")).x("Batched background capability fetch failed. Error Code '%d'. Retryable '%b'.", assmVar.b, assmVar.a);
                return null;
            }
        }, eoqg.a));
        return eijuVarA;
    }

    @Override // defpackage.asxy
    public final eiju b(final aubq aubqVar) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 84, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: start getCapabilities with chatEndpoint %s ", cqcv.b(aubqVar.d));
        eiju eijuVarB = this.f.b(aubqVar);
        auvh.e(eijuVarB.i(new eooz() { // from class: asxn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final asxs asxsVar = this.a;
                final asts astsVar = (asts) obj;
                if (asxsVar.c.a(astsVar)) {
                    ((eksl) asxs.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 96, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: valid getCapabilities %s", astsVar);
                    return eijx.e(null);
                }
                final aubq aubqVar2 = aubqVar;
                eksp ekspVar = asxs.a;
                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 100, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: not valid capabilities %s", astsVar);
                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 102, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: start backgroundProvider.getCapabilities for chatEndpoint %s", cqcv.b(aubqVar2.d));
                return asxsVar.b.b(aubqVar2).i(new eooz() { // from class: asxk
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final asts astsVar2 = (asts) obj2;
                        if (!astsVar2.b().isAfter(astsVar.b())) {
                            ((eksl) asxs.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 122, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: not valid backgroundCapabilities %s", astsVar2);
                            return eijx.e(null);
                        }
                        final aubq aubqVar3 = aubqVar2;
                        asxs asxsVar2 = asxsVar;
                        ((eksl) asxs.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 113, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: valid backgroundCapabilities %s", astsVar2);
                        return asxsVar2.d.a(new Function() { // from class: asxr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                eksp ekspVar2 = asxs.a;
                                return ((asvl) obj3).b(aubqVar3, astsVar2);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }, asxsVar.e);
            }
        }, this.e).e(assm.class, new ejvr() { // from class: asxo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                assm assmVar = (assm) obj;
                eksp ekspVar = asxs.a;
                eksl ekslVar = (eksl) ((eksl) ((eksl) ekspVar.j()).g(assmVar)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 135, "RcsCapabilitiesBackgroundUpdater.java");
                aubq aubqVar2 = aubqVar;
                ekslVar.I("Background capability fetch for endpoint %s failed. Error Code '%d'. Retryable '%b'.", cqcv.b(aubqVar2.d), Integer.valueOf(assmVar.b), Boolean.valueOf(assmVar.a));
                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 141, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: failed backgroundProvider.getCapabilities for chatEndpoint %s", cqcv.b(aubqVar2.d));
                return null;
            }
        }, eoqg.a));
        return eijuVarB;
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }
}
