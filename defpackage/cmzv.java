package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmzv implements asxy, aszp {
    public static final eksp a = eksp.c("BugleTachygram");
    public final eosc b;
    public final cogw c;
    public final cnlh d;
    public final cejj e;
    private final cmzu f;
    private final eosc g;
    private final awlc h;
    private final fcsu i;

    public cmzv(cmzu cmzuVar, eosc eoscVar, eosc eoscVar2, awlc awlcVar, cogw cogwVar, fcsu fcsuVar, cnlh cnlhVar, cejj cejjVar) {
        this.f = cmzuVar;
        this.b = eoscVar;
        this.g = eoscVar2;
        this.h = awlcVar;
        this.c = cogwVar;
        this.i = fcsuVar;
        this.d = cnlhVar;
        this.e = cejjVar;
    }

    private final eiju g() {
        final ekgp ekgpVar = (ekgp) Collection.EL.stream(((cozg) this.i.b()).f(coze.c)).collect(ekcv.a(Function$CC.identity(), new Function() { // from class: cmzh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = ((aubq) obj).d;
                cmzv cmzvVar = this.a;
                return cmzvVar.e.e(str, 16).i(new eooz() { // from class: cmza
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return ((cejg) obj2).y();
                    }
                }, cmzvVar.b);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        return eijx.j(ekgpVar.values()).a(eiid.l(new Callable() { // from class: cmzm
            @Override // java.util.concurrent.Callable
            public final Object call() throws eqgc {
                ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    if (((Boolean) eork.q((Future) entry.getValue())).booleanValue()) {
                        cmzv cmzvVar = this.a;
                        return cmzvVar.d.a((aubq) entry.getKey());
                    }
                }
                eqcs eqcsVar = eqcs.a;
                fbtf fbtfVar = new fbtf(Status.d);
                Status status = fbtfVar.a;
                status.getClass();
                throw new eqgc("No registered Tachygram transport", eqcsVar, fbtfVar, status);
            }
        }), this.b);
    }

    @Override // defpackage.asxy
    public final eiju a(Iterable iterable) {
        final HashSet hashSet = new HashSet();
        final HashMap map = new HashMap();
        Iterable$EL.forEach(iterable, new Consumer() { // from class: cmze
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                aubq aubqVar = (aubq) obj;
                eksp ekspVar = cmzv.a;
                ezol ezolVarB = cnln.b(aubqVar);
                hashSet.add(ezolVarB);
                map.put(ezolVarB.c, aubqVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eiju eijuVarI = g().i(new eooz() { // from class: cmzf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cnlm cnlmVar = (cnlm) obj;
                eksp ekspVar = cmzv.a;
                return auvw.c(cnlmVar.b, fcyi.a, fdjz.a, new cnlk(cnlmVar, hashSet, null));
            }
        }, this.g);
        ejvr ejvrVar = new ejvr() { // from class: cmzg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List list = (List) obj;
                ((eksl) ((eksl) cmzv.a.h()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramNetworkCapabilitiesProvider", "getBatchCapabilities", 141, "TachygramNetworkCapabilitiesProvider.java")).u("[Tachygram] %d registrations were fetched from the network for %d requested users", list.size(), hashSet.size());
                Stream stream = Collection.EL.stream(list);
                final Map map2 = map;
                Stream streamFilter = stream.filter(new Predicate() { // from class: cmzj
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
                        eksp ekspVar = cmzv.a;
                        return map2.containsKey(((eqhy) obj2).a.c);
                    }
                });
                Function function = new Function() { // from class: cmzk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        eksp ekspVar = cmzv.a;
                        aubq aubqVar = (aubq) map2.get(((eqhy) obj2).a.c);
                        aubqVar.getClass();
                        return aubqVar;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                final cmzv cmzvVar = this.a;
                return (Map) streamFilter.collect(ekcv.a(function, new Function() { // from class: cmzl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return cmzvVar.e((eqhy) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }));
            }
        };
        eosc eoscVar = this.b;
        return eijuVarI.h(ejvrVar, eoscVar).f(eqgc.class, new eooz() { // from class: cmzi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eqgc eqgcVar = (eqgc) obj;
                eqcr eqcrVar = eqgcVar.a.c;
                eksp ekspVar = cmzv.a;
                return eijx.d(new assm("[Tachygram] Failed to fetch batched RCS capabilities from Tachyon", eqgcVar, eqcrVar.equals(eqcr.b)));
            }
        }, eoscVar);
    }

    @Override // defpackage.asxy
    public final eiju b(aubq aubqVar) {
        final ezol ezolVarB = cnln.b(aubqVar);
        eiju eijuVarI = g().i(new eooz() { // from class: cmzs
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cnlm cnlmVar = (cnlm) obj;
                eksp ekspVar = cmzv.a;
                ezol ezolVar = ezolVarB;
                ezolVar.getClass();
                return auvw.c(cnlmVar.b, fcyi.a, fdjz.a, new cnlj(cnlmVar, ezolVar, null));
            }
        }, this.g);
        ejvr ejvrVar = new ejvr() { // from class: cmzt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eqhy eqhyVar = (eqhy) obj;
                ((eksl) ((eksl) cmzv.a.h()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramNetworkCapabilitiesProvider", "getCapabilities", 105, "TachygramNetworkCapabilitiesProvider.java")).r("[Tachygram] Capabilities are fetched from the network. Size: %d", eqhyVar.a().size());
                return this.a.e(eqhyVar);
            }
        };
        eosc eoscVar = this.b;
        return eijuVarI.h(ejvrVar, eoscVar).f(eqgc.class, new eooz() { // from class: cmyx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eqgc eqgcVar = (eqgc) obj;
                eqcr eqcrVar = eqgcVar.a.c;
                eksp ekspVar = cmzv.a;
                return eijx.d(new assm("[Tachygram] Failed to fetch RCS capabilities from Tachyon", eqgcVar, eqcr.b.equals(eqcrVar)));
            }
        }, eoscVar);
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }

    @Override // defpackage.aszp
    public final eiju d(final aubq aubqVar) {
        final ezol ezolVarB = cnln.b(aubqVar);
        eiju eijuVarI = g().i(new eooz() { // from class: cmzn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cnlm cnlmVar = (cnlm) obj;
                eksp ekspVar = cmzv.a;
                ezol ezolVar = ezolVarB;
                ezolVar.getClass();
                return auvw.c(cnlmVar.b, fcyi.a, fdjz.a, new cnli(cnlmVar, ezolVar, null));
            }
        }, this.g);
        final cmzu cmzuVar = this.f;
        ejvr ejvrVar = new ejvr() { // from class: cmzo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (aszo) cmzuVar.fM((eqhx) obj);
            }
        };
        eosc eoscVar = this.b;
        return eijuVarI.h(ejvrVar, eoscVar).i(new eooz() { // from class: cmzp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final aszo aszoVar = (aszo) obj;
                boolean zEquals = aszo.NOT_RCS.equals(aszoVar);
                final cmzv cmzvVar = this.a;
                final aubq aubqVar2 = aubqVar;
                if (zEquals) {
                    ((eksl) ((eksl) cmzv.a.h()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramNetworkCapabilitiesProvider", "getOnlineStatus", 180, "TachygramNetworkCapabilitiesProvider.java")).q("Online status NOT_RCS returned from TachygramUserTransport. Invalidating cached capabilities, if there are any.");
                    return cmzvVar.f(aubqVar2, asts.e(cmzvVar.c.f())).h(new ejvr() { // from class: cmyy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = cmzv.a;
                            return aszoVar;
                        }
                    }, eoqg.a);
                }
                if (aszo.ONLINE.equals(aszoVar)) {
                    auvh.e(cmzvVar.b(aubqVar2).i(new eooz() { // from class: cmyz
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return cmzvVar.f(aubqVar2, (asts) obj2);
                        }
                    }, cmzvVar.b));
                }
                return eijx.e(aszoVar);
            }
        }, eoscVar).f(eqgc.class, new eooz() { // from class: cmzq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = cmzv.a;
                return eijx.d(new aszn("[Tachygram] Failed to fetch online status from Tachyon", (eqgc) obj));
            }
        }, eoscVar).f(eqco.class, new eooz() { // from class: cmzr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = cmzv.a;
                return eijx.d(new aszn("[Tachygram] Failed to get an auth token during online status request", (eqco) obj));
            }
        }, eoscVar);
    }

    public final asts e(eqhy eqhyVar) {
        final asuz asuzVar = (asuz) asva.a.createBuilder();
        for (eqhv eqhvVar : eqhyVar.a()) {
            final asvb asvbVar = (asvb) asvc.a.createBuilder();
            String str = eqhvVar.a;
            asvbVar.copyOnWrite();
            asvc asvcVar = (asvc) asvbVar.instance;
            asvcVar.b |= 1;
            asvcVar.c = str;
            Optional optionalOfNullable = Optional.ofNullable(eqhvVar.b);
            asvbVar.getClass();
            optionalOfNullable.ifPresent(new Consumer() { // from class: cmzb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    asvb asvbVar2 = asvbVar;
                    String str2 = (String) obj;
                    asvbVar2.copyOnWrite();
                    asvc asvcVar2 = (asvc) asvbVar2.instance;
                    asvc asvcVar3 = asvc.a;
                    str2.getClass();
                    asvcVar2.b |= 2;
                    asvcVar2.d = str2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            asuzVar.a((asvc) asvbVar.build());
        }
        ekhv ekhvVar = new ekhv();
        Iterator it = eqhyVar.b.iterator();
        while (it.hasNext()) {
            ekhvVar.j(((eqhw) it.next()).b);
        }
        ekqg ekqgVarListIterator = ekhvVar.g().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            final int iIntValue = ((Integer) ekqgVarListIterator.next()).intValue();
            Optional map = ((cefn) Collection.EL.stream(cefn.g).filter(new Predicate() { // from class: cefm
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
                public final boolean test(Object obj) {
                    cefn cefnVar = cefn.NONE;
                    return ((cefn) obj).h == iIntValue;
                }
            }).findAny().orElse(cefn.NONE)).b().map(new Function() { // from class: cmzc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    eksp ekspVar = cmzv.a;
                    asvb asvbVar2 = (asvb) asvc.a.createBuilder();
                    asvbVar2.copyOnWrite();
                    asvc asvcVar2 = (asvc) asvbVar2.instance;
                    str2.getClass();
                    asvcVar2.b |= 1;
                    asvcVar2.c = str2;
                    return (asvc) asvbVar2.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            asuzVar.getClass();
            map.ifPresent(new Consumer() { // from class: cmzd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    asuzVar.a((asvc) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        int i = asts.b;
        aste asteVar = new aste();
        asteVar.c((asva) asuzVar.build());
        asteVar.b(this.c.f());
        return asteVar.a();
    }

    public final eiju f(final aubq aubqVar, final asts astsVar) {
        return this.h.a(new Function() { // from class: cmyw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = cmzv.a;
                return ((asvl) obj).b(aubqVar, astsVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
