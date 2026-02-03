package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cezf {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/ditto/DittoResponseRebuilder");
    public final eosc b;
    public final eosc c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    private final fcsu h;

    public cezf(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
    }

    public final eiju a(final eowu eowuVar) {
        final ArrayList arrayList = new ArrayList();
        Iterator<E> it = eowuVar.b.iterator();
        while (it.hasNext()) {
            arrayList.add(d((eowm) it.next(), 2));
        }
        return eijx.l(arrayList).a(new Callable() { // from class: ceyk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eowt eowtVar = (eowt) eowuVar.toBuilder();
                eowtVar.copyOnWrite();
                ((eowu) eowtVar.instance).b = eowu.emptyProtobufList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    eowtVar.b((eowm) eork.q((eiju) it2.next()));
                }
                return (eowu) eowtVar.build();
            }
        }, this.b);
    }

    public final eiju b(final epak epakVar) {
        final ArrayList arrayList = new ArrayList();
        Iterator<E> it = epakVar.c.iterator();
        while (it.hasNext()) {
            arrayList.add(d((eowm) it.next(), 2));
        }
        return eijx.l(arrayList).a(new Callable() { // from class: ceyv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                epaj epajVar = (epaj) epakVar.toBuilder();
                epajVar.copyOnWrite();
                ((epak) epajVar.instance).c = epak.emptyProtobufList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    epajVar.a((eowm) eork.q((eiju) it2.next()));
                }
                return (epak) epajVar.build();
            }
        }, this.b);
    }

    public final ekgb c(final boolean z, List list, final ekhx ekhxVar, final ekhx ekhxVar2, final ekgp ekgpVar) {
        Stream map = Collection.EL.stream(list).map(new Function() { // from class: ceyt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                epcj epcjVar = (epcj) obj;
                epcm epcmVar = epcjVar.c;
                if (epcmVar == null) {
                    epcmVar = epcm.a;
                }
                ekgp ekgpVar2 = ekgpVar;
                cezf cezfVar = this.a;
                alqm alqmVar = (alqm) ekgpVar2.get(epcmVar);
                epci epciVar = (epci) epcjVar.toBuilder();
                if (epcjVar.g && z) {
                    epciVar.copyOnWrite();
                    ((epcj) epciVar.instance).r = eoxp.a(4);
                    epciVar.copyOnWrite();
                    ((epcj) epciVar.instance).q = eoxp.a(4);
                    fcsu fcsuVar = cezfVar.g;
                    if (((bvur) fcsuVar.b()).j()) {
                        epciVar.copyOnWrite();
                        ((epcj) epciVar.instance).r = eoxp.a(3);
                    }
                    if (((bvur) fcsuVar.b()).h()) {
                        epciVar.copyOnWrite();
                        ((epcj) epciVar.instance).q = eoxp.a(3);
                    }
                    return (epcj) epciVar.build();
                }
                if (alqmVar == null || alqmVar.e().isEmpty()) {
                    return epcjVar;
                }
                aubq aubqVar = (aubq) alqmVar.e().get();
                epciVar.copyOnWrite();
                ((epcj) epciVar.instance).r = eoxp.a(4);
                epciVar.copyOnWrite();
                ((epcj) epciVar.instance).q = eoxp.a(4);
                if (((bvur) cezfVar.g.b()).j() && ekhxVar.contains(aubqVar)) {
                    epciVar.copyOnWrite();
                    ((epcj) epciVar.instance).r = eoxp.a(3);
                }
                if (ekhxVar2.contains(aubqVar)) {
                    epciVar.copyOnWrite();
                    ((epcj) epciVar.instance).q = eoxp.a(3);
                }
                return (epcj) epciVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    public final eiju d(final eowm eowmVar, final int i) {
        SelfIdentityId selfIdentityIdC = aofa.c(eowmVar.j);
        eiju eijuVarE = selfIdentityIdC == null ? eijx.e(Optional.empty()) : ((aofc) this.h.b()).e(selfIdentityIdC).h(new ejvr() { // from class: ceyh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((Optional) obj).flatMap(new Function() { // from class: ceys
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aoer) obj2).o();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).flatMap(new Function() { // from class: ceyw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((alqm) obj2).e();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.b);
        ejvr ejvrVar = new ejvr() { // from class: ceyp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    cezf cezfVar = this.a;
                    fcsu fcsuVar = cezfVar.g;
                    if (((bvur) fcsuVar.b()).h() || ((bvur) fcsuVar.b()).j()) {
                        return new cexo(optional, ((bvut) cezfVar.f.b()).e(((aubq) optional.get()).d));
                    }
                }
                return new cexo(optional, eijx.e(false));
            }
        };
        eosc eoscVar = this.b;
        return eijuVarE.h(ejvrVar, eoscVar).i(new eooz() { // from class: cezd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ceze cezeVar = (ceze) obj;
                eiju eijuVarA = cezeVar.a();
                final eowm eowmVar2 = eowmVar;
                final cezf cezfVar = this.a;
                final int i2 = i;
                return eijuVarA.i(new eooz() { // from class: cezb
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final Optional optionalB = cezeVar.b();
                        final boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        final eowm eowmVar3 = eowmVar2;
                        final evtg evtgVar = eowmVar3.r;
                        final cezf cezfVar2 = cezfVar;
                        eiju eijuVarG = eijx.g(new Callable() { // from class: ceyi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ekgi ekgiVar = new ekgi();
                                for (epcj epcjVar : evtgVar) {
                                    epcm epcmVar = epcjVar.c;
                                    if (epcmVar == null) {
                                        epcmVar = epcm.a;
                                    }
                                    alrj alrjVar = (alrj) cezfVar2.e.b();
                                    epcm epcmVar2 = epcjVar.c;
                                    if (epcmVar2 == null) {
                                        epcmVar2 = epcm.a;
                                    }
                                    String str = epcmVar2.c;
                                    epes epesVar = epcjVar.h;
                                    if (epesVar == null) {
                                        epesVar = epes.a;
                                    }
                                    ekgiVar.i(epcmVar, alrjVar.u(str, epesVar.c));
                                }
                                return ekgiVar.b();
                            }
                        }, cezfVar2.c);
                        final int i3 = i2;
                        eooz eoozVar = new eooz() { // from class: ceyu
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                final ekgp ekgpVar = (ekgp) obj3;
                                Stream map = Collection.EL.stream(ekgpVar.values()).filter(new Predicate() { // from class: ceyx
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
                                    public final boolean test(Object obj4) {
                                        return ((alqm) obj4).e().isPresent();
                                    }
                                }).map(new Function() { // from class: ceyy
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return (aubq) ((alqm) obj4).e().get();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i4 = ekgb.d;
                                ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
                                final cezf cezfVar3 = cezfVar2;
                                final boolean z = zBooleanValue;
                                int i5 = i3;
                                final List list = evtgVar;
                                if (i5 - 1 != 0) {
                                    return ((bwuv) cezfVar3.d.b()).c(ekgbVar).h(new ejvr() { // from class: ceyz
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj4) {
                                            ekhx ekhxVarO;
                                            Map map2 = (Map) obj4;
                                            cezf cezfVar4 = cezfVar3;
                                            if (((bvur) cezfVar4.g.b()).j()) {
                                                map2.getClass();
                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                for (Map.Entry entry : map2.entrySet()) {
                                                    if (((E2eeInfo) entry.getValue()).a.contains(bwus.b)) {
                                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                                    }
                                                }
                                                ekhxVarO = ekhx.o(linkedHashMap.keySet());
                                            } else {
                                                ekhxVarO = ekon.a;
                                            }
                                            ekhx ekhxVar = ekhxVarO;
                                            map2.getClass();
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                            for (Map.Entry entry2 : map2.entrySet()) {
                                                if (((E2eeInfo) entry2.getValue()).a.containsAll(fcva.g(bwus.b, bwus.c))) {
                                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                                }
                                            }
                                            return cezfVar4.c(z, list, ekhxVar, ekhx.o(linkedHashMap2.keySet()), ekgpVar);
                                        }
                                    }, cezfVar3.c);
                                }
                                Optional optional = optionalB;
                                final bwvc bwvcVar = (bwvc) bwvf.a.createBuilder();
                                elyd elydVar = elyd.DITTO_SYNC;
                                bwvcVar.copyOnWrite();
                                bwvf bwvfVar = (bwvf) bwvcVar.instance;
                                bwvfVar.e = elydVar.m;
                                bwvfVar.b |= 1;
                                bwvd bwvdVar = (bwvd) bwve.a.createBuilder();
                                bwvdVar.copyOnWrite();
                                bwve bwveVar = (bwve) bwvdVar.instance;
                                bwveVar.a();
                                evpz.addAll(ekgbVar, bwveVar.b);
                                bwve bwveVar2 = (bwve) bwvdVar.build();
                                bwvcVar.copyOnWrite();
                                bwvf bwvfVar2 = (bwvf) bwvcVar.instance;
                                bwveVar2.getClass();
                                bwvfVar2.d = bwveVar2;
                                bwvfVar2.c = 1;
                                return (eiju) optional.map(new Function() { // from class: ceyq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        bwvc bwvcVar2 = bwvcVar;
                                        aubq aubqVar = (aubq) obj4;
                                        bwvcVar2.copyOnWrite();
                                        bwvf bwvfVar3 = (bwvf) bwvcVar2.instance;
                                        bwvf bwvfVar4 = bwvf.a;
                                        aubqVar.getClass();
                                        bwvfVar3.f = aubqVar;
                                        bwvfVar3.b |= 2;
                                        bwvf bwvfVar5 = (bwvf) bwvcVar2.build();
                                        final cezf cezfVar4 = cezfVar3;
                                        eiju eijuVarB = ((bwuv) cezfVar4.d.b()).b(bwvfVar5);
                                        final boolean z2 = z;
                                        final List list2 = list;
                                        final ekgp ekgpVar2 = ekgpVar;
                                        return eijuVarB.h(new ejvr() { // from class: cezc
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj5) {
                                                bwvh bwvhVar = (bwvh) obj5;
                                                cezf cezfVar5 = cezfVar4;
                                                ekhx ekhxVar = (!((bvur) cezfVar5.g.b()).j() || bwvhVar == null) ? ekon.a : (ekhx) Collection.EL.stream(bwvhVar.b).filter(new Predicate() { // from class: ceym
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
                                                    public final boolean test(Object obj6) {
                                                        return new evsz(((bwvb) obj6).e, bwvb.a).contains(bwva.ONE_ON_ONE_ENCRYPTION);
                                                    }
                                                }).map(new Function() { // from class: ceyn
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj6) {
                                                        aubq aubqVar2 = ((bwvb) obj6).d;
                                                        return aubqVar2 == null ? aubq.a : aubqVar2;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).collect(ekcv.b);
                                                ekhx ekhxVar2 = ekhxVar;
                                                ekhx ekhxVar3 = bwvhVar == null ? ekon.a : (ekhx) Collection.EL.stream(bwvhVar.b).filter(new Predicate() { // from class: ceyo
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
                                                    public final boolean test(Object obj6) {
                                                        bwvb bwvbVar = (bwvb) obj6;
                                                        evsx evsxVar = bwvbVar.e;
                                                        evsy evsyVar = bwvb.a;
                                                        return new evsz(evsxVar, evsyVar).contains(bwva.ONE_ON_ONE_ENCRYPTION) && new evsz(bwvbVar.e, evsyVar).contains(bwva.GROUP_ENCRYPTION);
                                                    }
                                                }).map(new Function() { // from class: ceyn
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj6) {
                                                        aubq aubqVar2 = ((bwvb) obj6).d;
                                                        return aubqVar2 == null ? aubq.a : aubqVar2;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).collect(ekcv.b);
                                                ekgp ekgpVar3 = ekgpVar2;
                                                return cezfVar5.c(z2, list2, ekhxVar2, ekhxVar3, ekgpVar3);
                                            }
                                        }, cezfVar4.c);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).orElseGet(new Supplier() { // from class: ceyr
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        ekrw ekrwVarJ = cezf.a.j();
                                        ekrwVarJ.X(eksq.a, "BugleDitto");
                                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/ditto/DittoResponseRebuilder", "getE2eeCapabilitiesAndSetForParticipants", 321, "DittoResponseRebuilder.java")).q("Self identity must be provided when fetching e2ee capabilities for RCS group participants.");
                                        return eijx.e(list);
                                    }
                                });
                            }
                        };
                        eosc eoscVar2 = cezfVar2.b;
                        return eijuVarG.i(eoozVar, eoscVar2).h(new ejvr() { // from class: ceyl
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                eowi eowiVar = (eowi) eowmVar3.toBuilder();
                                eowiVar.copyOnWrite();
                                ((eowm) eowiVar.instance).r = eowm.emptyProtobufList();
                                Iterator it = ((List) obj3).iterator();
                                while (it.hasNext()) {
                                    eowiVar.c((epcj) it.next());
                                }
                                return (eowm) eowiVar.build();
                            }
                        }, eoscVar2);
                    }
                }, cezfVar.b);
            }
        }, eoscVar);
    }
}
