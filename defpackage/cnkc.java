package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.net.URI;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnkc implements eqfa {
    private final cndr a;

    public cnkc(cndr cndrVar) {
        this.a = cndrVar;
    }

    @Override // defpackage.eqfa
    public final Object d(ezol ezolVar, eqee eqeeVar, ezol ezolVar2, Instant instant, eqfu eqfuVar, fcxy fcxyVar) {
        Optional optionalOfNullable = Optional.ofNullable(ezolVar2);
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        boolean zEquals = felmVarB.equals(felm.GROUP_ID);
        felm felmVarB2 = felm.b(ezolVar.b);
        if (felmVarB2 == null) {
            felmVarB2 = felm.UNRECOGNIZED;
        }
        cndr cndrVar = this.a;
        ejwl.n(zEquals, "Group ID expected to be of type GROUP_ID, but instead was type %s.", felmVarB2.a());
        optionalOfNullable.ifPresent(new Consumer() { // from class: cndk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksp ekspVar = cndr.a;
                felm felmVarB3 = felm.b(((ezol) obj).b);
                if (felmVarB3 == null) {
                    felmVarB3 = felm.UNRECOGNIZED;
                }
                ejwl.m(!felmVarB3.equals(felm.GROUP_ID), "Updater ID should not be of type GROUP_ID.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ejwl.m(!eqeeVar.a(), "Received an empty GroupPropertiesUpdate from tachygram.");
        final audb audbVarA = cndrVar.a(ezolVar.c, optionalOfNullable, instant);
        eqeeVar.a.ifPresent(new Consumer() { // from class: cndl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                String str = (String) obj;
                eksp ekspVar = cndr.a;
                audb audbVar = audbVarA;
                audbVar.copyOnWrite();
                audc audcVar = (audc) audbVar.instance;
                evsy evsyVar = audc.a;
                str.getClass();
                audcVar.d |= 16;
                audcVar.l = str;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                audbVar.copyOnWrite();
                audc audcVar2 = (audc) audbVar.instance;
                audcVar2.d |= 8;
                audcVar2.k = zIsEmpty;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eqeeVar.b.ifPresent(new Consumer() { // from class: cndm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eqdp eqdpVar = (eqdp) obj;
                eksp ekspVar = cndr.a;
                String str = eqdpVar.b;
                audb audbVar = audbVarA;
                audbVar.copyOnWrite();
                audc audcVar = (audc) audbVar.instance;
                evsy evsyVar = audc.a;
                audcVar.d |= 64;
                audcVar.n = str;
                boolean zA = eqdpVar.a();
                audbVar.copyOnWrite();
                audc audcVar2 = (audc) audbVar.instance;
                audcVar2.d |= 32;
                audcVar2.m = zA;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Object objC = fdxs.c(cndrVar.b((audc) audbVarA.build(), "handleGroupPropertiesUpdate"), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.eqfa
    public final Object e(ezol ezolVar, Iterable iterable, ezol ezolVar2, Instant instant, eqfu eqfuVar, fcxy fcxyVar) {
        Optional optionalOfNullable = Optional.ofNullable(ezolVar2);
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        boolean zEquals = felmVarB.equals(felm.GROUP_ID);
        felm felmVarB2 = felm.b(ezolVar.b);
        if (felmVarB2 == null) {
            felmVarB2 = felm.UNRECOGNIZED;
        }
        cndr cndrVar = this.a;
        ejwl.n(zEquals, "Group ID expected to be of type GROUP_ID, but instead was type %s.", felmVarB2.a());
        optionalOfNullable.ifPresent(new Consumer() { // from class: cncz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksp ekspVar = cndr.a;
                felm felmVarB3 = felm.b(((ezol) obj).b);
                if (felmVarB3 == null) {
                    felmVarB3 = felm.UNRECOGNIZED;
                }
                ejwl.m(!felmVarB3.equals(felm.GROUP_ID), "Updater ID should not be of type GROUP_ID.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        audb audbVarA = cndrVar.a(ezolVar.c, optionalOfNullable, instant);
        audbVarA.c(cndr.c(iterable));
        Object objC = fdxs.c(cndrVar.b((audc) audbVarA.build(), "handleOthersAddedToGroup"), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.eqfa
    public final Object f(ezol ezolVar, Iterable iterable, ezol ezolVar2, Instant instant, eqfu eqfuVar, fcxy fcxyVar) {
        Optional optionalOfNullable = Optional.ofNullable(ezolVar2);
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        boolean zEquals = felmVarB.equals(felm.GROUP_ID);
        felm felmVarB2 = felm.b(ezolVar.b);
        if (felmVarB2 == null) {
            felmVarB2 = felm.UNRECOGNIZED;
        }
        cndr cndrVar = this.a;
        ejwl.n(zEquals, "Group ID expected to be of type GROUP_ID, but instead was type %s.", felmVarB2.a());
        optionalOfNullable.ifPresent(new Consumer() { // from class: cndo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksp ekspVar = cndr.a;
                felm felmVarB3 = felm.b(((ezol) obj).b);
                if (felmVarB3 == null) {
                    felmVarB3 = felm.UNRECOGNIZED;
                }
                ejwl.m(!felmVarB3.equals(felm.GROUP_ID), "Updater ID should not be of type GROUP_ID.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        audb audbVarA = cndrVar.a(ezolVar.c, optionalOfNullable, instant);
        audbVarA.e(cndr.c(iterable));
        Object objC = fdxs.c(cndrVar.b((audc) audbVarA.build(), "handleOthersRemovedFromGroup"), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.eqfa
    public final Object g(final eqds eqdsVar, ezol ezolVar, final Instant instant, eqfu eqfuVar, fcxy fcxyVar) {
        eiju eijuVarH;
        eqdr eqdrVar = eqdsVar.a;
        Optional optional = eqdrVar.b;
        Optional optionalOfNullable = Optional.ofNullable(ezolVar);
        if (optional.isEmpty()) {
            eijuVarH = eijx.d(new cnfx("Missing Conference URI when being added to a group.", true));
        } else {
            final cndr cndrVar = this.a;
            final Optional map = optionalOfNullable.map(new Function() { // from class: cndb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    aufa aufaVar = (aufa) aufb.a.createBuilder();
                    aubq aubqVarA = ((asqx) cndrVar.c.b()).a(((ezol) obj).c, false);
                    aufaVar.copyOnWrite();
                    aufb aufbVar = (aufb) aufaVar.instance;
                    aubqVarA.getClass();
                    aufbVar.c = aubqVarA;
                    aufbVar.b |= 1;
                    evvp evvpVarB = evwz.b(instant);
                    aufaVar.copyOnWrite();
                    aufb aufbVar2 = (aufb) aufaVar.instance;
                    evvpVarB.getClass();
                    aufbVar2.d = evvpVarB;
                    aufbVar2.b |= 2;
                    return (aufb) aufaVar.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            audj audjVar = (audj) audk.b.createBuilder();
            audjVar.a(cnct.a(eqdsVar.c));
            final aues auesVar = (aues) auet.a.createBuilder();
            eqed eqedVar = eqdsVar.b;
            String str = eqedVar.a;
            auesVar.copyOnWrite();
            auet auetVar = (auet) auesVar.instance;
            auetVar.b |= 1;
            auetVar.c = str;
            map.ifPresent(new Consumer() { // from class: cndc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    aues auesVar2 = auesVar;
                    aufb aufbVar = (aufb) obj;
                    auesVar2.copyOnWrite();
                    auet auetVar2 = (auet) auesVar2.instance;
                    auet auetVar3 = auet.a;
                    aufbVar.getClass();
                    auetVar2.d = aufbVar;
                    auetVar2.b |= 2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            aueb auebVarA = cnaq.a(eqedVar.c);
            audjVar.copyOnWrite();
            audk audkVar = (audk) audjVar.instance;
            audkVar.n = auebVarA;
            audkVar.c |= 512;
            final audn audnVar = (audn) audo.a.createBuilder();
            eqdp eqdpVar = eqedVar.d;
            audnVar.copyOnWrite();
            audo audoVar = (audo) audnVar.instance;
            audoVar.b |= 1;
            audoVar.c = eqdpVar.b;
            map.ifPresent(new Consumer() { // from class: cndd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    audn audnVar2 = audnVar;
                    aufb aufbVar = (aufb) obj;
                    audnVar2.copyOnWrite();
                    audo audoVar2 = (audo) audnVar2.instance;
                    audo audoVar3 = audo.a;
                    aufbVar.getClass();
                    audoVar2.d = aufbVar;
                    audoVar2.b |= 2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            audjVar.copyOnWrite();
            audk audkVar2 = (audk) audjVar.instance;
            audo audoVar2 = (audo) audnVar.build();
            audoVar2.getClass();
            audkVar2.j = audoVar2;
            audkVar2.c |= 32;
            audjVar.copyOnWrite();
            audk audkVar3 = (audk) audjVar.instance;
            aubq aubqVar = cndrVar.f;
            aubqVar.getClass();
            audkVar3.m = aubqVar;
            audkVar3.c |= 256;
            String str2 = eqdrVar.a.c;
            audjVar.copyOnWrite();
            audk audkVar4 = (audk) audjVar.instance;
            str2.getClass();
            audkVar4.c |= 1;
            audkVar4.d = str2;
            aubq aubqVarA = ((asqx) cndrVar.c.b()).a(((URI) optional.get()).toString(), true);
            audjVar.copyOnWrite();
            audk audkVar5 = (audk) audjVar.instance;
            aubqVarA.getClass();
            audkVar5.f = aubqVarA;
            audkVar5.c |= 8;
            ekhx ekhxVar = eqdsVar.d;
            final ejvj ejvjVarFH = new cnbb().fH();
            asrc asrcVar = cndrVar.b;
            Stream map2 = Collection.EL.stream(ekhxVar).map(new Function() { // from class: cnde
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((eqea) obj).b();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: cndg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (aubq) ejvjVarFH.fM((ezol) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: cndh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    aubq aubqVar2 = (aubq) obj;
                    eksp ekspVar = cndr.a;
                    final aueh auehVar = (aueh) auek.a.createBuilder();
                    auehVar.copyOnWrite();
                    auek auekVar = (auek) auehVar.instance;
                    aubqVar2.getClass();
                    auekVar.c = aubqVar2;
                    auekVar.b |= 1;
                    auej auejVar = auej.JOINED;
                    auehVar.copyOnWrite();
                    auek auekVar2 = (auek) auehVar.instance;
                    auekVar2.d = auejVar.e;
                    auekVar2.b |= 2;
                    map.ifPresent(new Consumer() { // from class: cndn
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj2) {
                            aueh auehVar2 = auehVar;
                            aufb aufbVar = (aufb) obj2;
                            auehVar2.copyOnWrite();
                            auek auekVar3 = (auek) auehVar2.instance;
                            auek auekVar4 = auek.a;
                            aufbVar.getClass();
                            auekVar3.e = aufbVar;
                            auekVar3.b |= 4;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return (auek) auehVar.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            audjVar.b((ekgb) map2.collect(ekcv.a));
            audjVar.copyOnWrite();
            audk audkVar6 = (audk) audjVar.instance;
            auet auetVar2 = (auet) auesVar.build();
            auetVar2.getClass();
            audkVar6.i = auetVar2;
            audkVar6.c |= 16;
            eiju eijuVarD = asrcVar.d((audk) audjVar.build());
            eooz eoozVar = new eooz() { // from class: cncx
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final aubl aublVar = (aubl) obj;
                    aubk aubkVar = aubk.OK;
                    aubk aubkVarB = aubk.b(aublVar.c);
                    if (aubkVarB == null) {
                        aubkVarB = aubk.UNKNOWN_STATUS;
                    }
                    if (!aubkVar.equals(aubkVarB)) {
                        return eijx.e(aublVar);
                    }
                    ezol ezolVar2 = eqdsVar.a.a;
                    evqs evqsVar = ezolVar2.e;
                    if (!evqs.b.equals(evqsVar)) {
                        cndr cndrVar2 = cndrVar;
                        return ((cnck) cndrVar2.d.b()).c(ezolVar2.c, evqsVar).h(new ejvr() { // from class: cnda
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                eksp ekspVar = cndr.a;
                                return aublVar;
                            }
                        }, cndrVar2.e);
                    }
                    eksl ekslVar = (eksl) cndr.a.h();
                    ekslVar.X(cqnc.N, ezolVar2.c);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupHandlerChapiAdapter", "storeRoutingInfoToken", 303, "TachygramGroupHandlerChapiAdapter.java")).q("Added to an incoming tachygram group with a missing routing info token.");
                    return eijx.e(aublVar);
                }
            };
            eosc eoscVar = cndrVar.e;
            eijuVarH = eijuVarD.i(eoozVar, eoscVar).h(new ejvr() { // from class: cncy
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cndr.d((aubl) obj, "handleSelfAddedToGroup");
                    return null;
                }
            }, eoscVar);
        }
        eijuVarH.getClass();
        Object objC = fdxs.c(eijuVarH, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.eqfa
    public final Object h(ezol ezolVar, ezol ezolVar2, Instant instant, eqfu eqfuVar, fcxy fcxyVar) {
        eiju eijuVarB;
        Optional optionalOfNullable = Optional.ofNullable(ezolVar2);
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        boolean zEquals = felmVarB.equals(felm.GROUP_ID);
        felm felmVarB2 = felm.b(ezolVar.b);
        if (felmVarB2 == null) {
            felmVarB2 = felm.UNRECOGNIZED;
        }
        cndr cndrVar = this.a;
        ejwl.n(zEquals, "Group ID expected to be of type GROUP_ID, but instead was type %s.", felmVarB2.a());
        optionalOfNullable.ifPresent(new Consumer() { // from class: cncu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksp ekspVar = cndr.a;
                felm felmVarB3 = felm.b(((ezol) obj).b);
                if (felmVarB3 == null) {
                    felmVarB3 = felm.UNRECOGNIZED;
                }
                ejwl.m(!felmVarB3.equals(felm.GROUP_ID), "Updater ID should not be of type GROUP_ID.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dggw dggwVar = (dggw) cndrVar.g.b();
        aubq aubqVar = cndrVar.f;
        if (dggwVar.v(aubqVar.d)) {
            audb audbVarA = cndrVar.a(ezolVar.c, optionalOfNullable, instant);
            audbVarA.f(aubqVar);
            eijuVarB = cndrVar.b((audc) audbVarA.build(), "handleSelfRemovedFromGroup");
        } else {
            eijuVarB = eijx.d(new cnfx("RCS unavailable for removing self from group.", false));
        }
        eijuVarB.getClass();
        Object objC = fdxs.c(eijuVarB, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.eqfa
    public final Object j(final ezol ezolVar, final eqdo eqdoVar, fcxy fcxyVar) {
        String str = ezolVar.c;
        final cndr cndrVar = this.a;
        eiju eijuVarC = ((cnck) cndrVar.d.b()).c(str, ezolVar.e);
        ejvr ejvrVar = new ejvr() { // from class: cndp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eqdo eqdoVar2 = eqdoVar;
                String str2 = ezolVar.c;
                final ekhx ekhxVarN = ekhx.n(cnct.a(eqdoVar2));
                ekhx ekhxVar = (ekhx) DesugarArrays.stream(aucp.values()).filter(new Predicate() { // from class: cndf
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
                        eksp ekspVar = cndr.a;
                        return !aucp.UNKNOWN_TYPE.equals((aucp) obj2);
                    }
                }).filter(new Predicate() { // from class: cndi
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
                        eksp ekspVar = cndr.a;
                        return !ekhxVarN.contains((aucp) obj2);
                    }
                }).collect(ekcv.b);
                audb audbVar = (audb) audc.c.createBuilder();
                audbVar.copyOnWrite();
                audc audcVar = (audc) audbVar.instance;
                str2.getClass();
                audcVar.d |= 1;
                audcVar.e = str2;
                audbVar.b(ekhxVarN);
                audbVar.d(ekhxVar);
                audbVar.copyOnWrite();
                audc audcVar2 = (audc) audbVar.instance;
                aubq aubqVar = cndrVar.f;
                aubqVar.getClass();
                audcVar2.t = aubqVar;
                audcVar2.d |= 4096;
                return (audc) audbVar.build();
            }
        };
        eosc eoscVar = cndrVar.e;
        Object objC = fdxs.c(eijuVarC.h(ejvrVar, eoscVar).i(new eooz() { // from class: cncv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return cndrVar.b((audc) obj, "handleGroupFeaturesUpdate");
            }
        }, eoscVar), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }
}
