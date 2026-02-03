package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bylr implements bykl {
    public final byos c;
    public final byvu d;
    public final aurx e;
    public final bxjn f;
    public final cpmc g;
    public final dzuc h;
    public final bzug i;
    public final efwo j;
    public final apoi k;
    public final appc l;
    private final fcsu n;
    private final eosc o;
    private final eosc p;
    private final eosc q;
    private final fcsu r;
    private final apoy s;
    private final avnh t;
    private final fcsu u;
    private final aqfi v;
    private static final cqce m = cqce.g("BugleCms", "CmsConversationConsumer");
    static final dzfh a = new dzfh("RestoreInitialBlockTimer");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer");

    public bylr(cpmc cpmcVar, byos byosVar, byvu byvuVar, aurx aurxVar, bxjn bxjnVar, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, dzuc dzucVar, bzug bzugVar, efwo efwoVar, fcsu fcsuVar2, apoy apoyVar, apoi apoiVar, avnh avnhVar, fcsu fcsuVar3, appc appcVar, aqfi aqfiVar) {
        this.c = byosVar;
        this.g = cpmcVar;
        this.d = byvuVar;
        this.e = aurxVar;
        this.f = bxjnVar;
        this.n = fcsuVar;
        this.o = eoscVar;
        this.p = eoscVar2;
        this.q = eoscVar3;
        this.h = dzucVar;
        this.i = bzugVar;
        this.j = efwoVar;
        this.r = fcsuVar2;
        this.s = apoyVar;
        this.k = apoiVar;
        this.t = avnhVar;
        this.u = fcsuVar3;
        this.l = appcVar;
        this.v = aqfiVar;
    }

    public static void i(Exception exc) {
        cqbd cqbdVarE = m.e();
        cqbdVarE.I("Exception was thrown during restoring messages immediately after conversation. The restore process will continue");
        cqbdVarE.s(exc);
    }

    private final int j() {
        ausj ausjVar = this.e.c().C;
        if (ausjVar == null) {
            ausjVar = ausj.a;
        }
        return ausjVar.h;
    }

    private static boolean k(int i) {
        return i == ((Integer) cpyl.I.e()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bykl
    public final eiju a(ekgb ekgbVar, final Optional optional, final boolean z) {
        if (ekgbVar.isEmpty()) {
            return this.v.a() ? eijx.g(new Callable() { // from class: bykz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    try {
                        this.a.f.a();
                        return null;
                    } catch (RuntimeException e) {
                        ekrw ekrwVarJ = bylr.b.j();
                        ekrwVarJ.X(eksq.a, "BugleCms");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "restoreCmsItemDataList", (char) 284, "CmsConversationConsumer.java")).q("ParticipantFullRefresh failed.");
                        return null;
                    }
                }
            }, this.q).h(new ejvr() { // from class: byla
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ekoj.a;
                }
            }, this.p) : eijx.e(ekoj.a);
        }
        if (!this.s.a()) {
            return g(ekgbVar, optional, z);
        }
        final ekgi ekgiVar = new ekgi();
        eiju eijuVarE = eijx.e(null);
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            final eqjv eqjvVar = (eqjv) ekgbVar.get(i);
            evvp evvpVar = eqjvVar.l;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            if (evvpVar.equals(evxc.c)) {
                ekgiVar.i(eqjvVar, new ejwj(false, Optional.empty()));
            } else {
                eijuVarE = eijuVarE.i(new eooz() { // from class: byld
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return this.a.f(eqjvVar);
                    }
                }, this.q).h(new ejvr() { // from class: byle
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Void r4 = (Void) obj;
                        ekgiVar.i(eqjvVar, new ejwj(true, Optional.empty()));
                        return r4;
                    }
                }, eoqg.a).e(Exception.class, new ejvr() { // from class: bylf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Exception exc = (Exception) obj;
                        ekrw ekrwVarJ = bylr.b.j();
                        ekrwVarJ.X(eksq.a, "BugleCms");
                        ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "deleteConversationsIfNeeded", 668, "CmsConversationConsumer.java");
                        eqjv eqjvVar2 = eqjvVar;
                        ekrdVar.t("Failed to delete conversation %s", eqjvVar2.c);
                        ekgiVar.i(eqjvVar2, new ejwj(true, Optional.of(exc)));
                        return null;
                    }
                }, this.p);
            }
        }
        return eijuVarE.h(new ejvr() { // from class: bylg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ekgiVar.b();
            }
        }, eoqg.a).i(new eooz() { // from class: bylb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                final ekgi ekgiVar2 = new ekgi();
                ekqg ekqgVarListIterator = ((ekgp) obj).entrySet().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    eqjv eqjvVar2 = (eqjv) entry.getKey();
                    ejwj ejwjVar = (ejwj) entry.getValue();
                    if (((Boolean) ejwjVar.a).booleanValue()) {
                        Optional optional2 = (Optional) ejwjVar.b;
                        if (optional2.isPresent()) {
                            ekgiVar2.i(eqjvVar2, (Exception) optional2.get());
                        }
                    } else {
                        ekfwVar.h(eqjvVar2);
                    }
                }
                boolean z2 = z;
                return this.a.g(ekfwVar.g(), optional, z2).h(new ejvr() { // from class: bylc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekgi ekgiVar3 = ekgiVar2;
                        ekgiVar3.g((ekgp) obj2);
                        return ekgiVar3.b();
                    }
                }, eoqg.a);
            }
        }, this.q);
    }

    @Override // defpackage.bykl
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // defpackage.bykl
    public final boolean c() {
        return ((Boolean) avos.a.e()).booleanValue();
    }

    @Override // defpackage.bykl
    public final /* bridge */ /* synthetic */ eiju d(Object obj) {
        final eqjv eqjvVar = (eqjv) obj;
        if (this.s.a()) {
            evvp evvpVar = eqjvVar.l;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            if (!evvpVar.equals(evxc.c)) {
                return f(eqjvVar);
            }
        }
        eiju eijuVarA = this.c.a(eqjvVar, true);
        if (((Boolean) ((cczi) cpyl.T.get()).e()).booleanValue() && ((apow) this.r.b()).a()) {
            try {
                int iJ = j();
                if (this.l.a()) {
                    iJ++;
                }
                if (iJ == 0) {
                    this.h.e(a);
                } else if (k(iJ)) {
                    this.h.g(a, null, null, dzua.SUCCESS);
                }
                if (this.k.a() && k(iJ)) {
                    try {
                        bzug bzugVar = this.i;
                        bzzx bzzxVar = bzzx.a;
                        bzzw bzzwVar = (bzzw) bzzx.a.createBuilder();
                        int iA = this.j.a();
                        bzzwVar.copyOnWrite();
                        bzzx bzzxVar2 = (bzzx) bzzwVar.instance;
                        bzzxVar2.b = 1 | bzzxVar2.b;
                        bzzxVar2.c = iA;
                        bzugVar.a((bzzx) bzzwVar.build());
                    } catch (Exception e) {
                        cqbd cqbdVarE = m.e();
                        cqbdVarE.I("Exception when queuing media download after top conversations restore, will continue restoring the rest of the messages.");
                        cqbdVarE.s(e);
                    }
                }
                if (((Boolean) this.n.b()).booleanValue() && !((Boolean) ((cczi) cpyl.T.get()).e()).booleanValue()) {
                    return eijuVarA;
                }
                if (((Boolean) ((cczi) cpyl.T.get()).e()).booleanValue()) {
                    if (iJ >= ((Integer) cpyl.I.e()).intValue()) {
                        return eijuVarA;
                    }
                }
            } catch (evtj e2) {
                cqbd cqbdVarE2 = m.e();
                cqbdVarE2.I("Can't determine total conversations restored, skipping listConversationObjects task");
                cqbdVarE2.s(e2);
                return eijuVarA;
            }
        } else if (((Boolean) this.n.b()).booleanValue()) {
            return eijuVarA;
        }
        if (((apoh) this.u.b()).a()) {
            return eijuVarA.i(new eooz() { // from class: bykn
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    return this.a.h(eqjvVar, Optional.empty());
                }
            }, this.p);
        }
        return (this.s.a() ? eijuVarA.i(new eooz() { // from class: byky
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return this.a.e.i();
            }
        }, this.p).i(new eooz() { // from class: bylj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                boolean zEquals = ((evvp) obj2).equals(evxc.c);
                boolean z = false;
                if (((Boolean) ((cczi) cpyl.T.get()).e()).booleanValue() && zEquals) {
                    z = true;
                }
                return this.a.g.A(eqjvVar.c, z);
            }
        }, this.o) : eijuVarA.i(new eooz() { // from class: bylk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return this.a.g.z(eqjvVar.c);
            }
        }, this.o)).i(new eooz() { // from class: byll
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                Stream streamFilter = Collection.EL.stream((ekgb) obj2).filter(new Predicate() { // from class: byku
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
                        return !toc.a((eqnd) obj3);
                    }
                });
                final bylr bylrVar = this.a;
                Stream map = streamFilter.map(new Function() { // from class: bykv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        bylr bylrVar2 = bylrVar;
                        eqnd eqndVar = (eqnd) obj3;
                        try {
                            boolean z = false;
                            if (cpyl.a() && ((Boolean) ((cczi) cpyl.o.get()).e()).booleanValue()) {
                                z = true;
                            }
                            return bylrVar2.d.c(eqndVar, true, z).e(Exception.class, new ejvr() { // from class: bykx
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj4) {
                                    bylr.i((Exception) obj4);
                                    return null;
                                }
                            }, eoqg.a);
                        } catch (Exception e3) {
                            bylr.i(e3);
                            return eijx.e(null);
                        }
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                return eijx.j((Iterable) map.collect(ekcv.a)).a(new Callable() { // from class: bykw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                }, eoqg.a);
            }
        }, this.o);
    }

    public final int e() {
        if (!((Boolean) ((cczi) cpyl.T.get()).e()).booleanValue()) {
            return 0;
        }
        try {
            int iJ = j();
            Integer num = (Integer) cpyl.I.e();
            if (iJ < num.intValue()) {
                return num.intValue() - iJ;
            }
            return 0;
        } catch (evtj e) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "remainingTopConversationsWithMessages", (char) 535, "CmsConversationConsumer.java")).q("Can't determine total conversations restored, skipping listConversationObjects task");
            return 0;
        }
    }

    public final eiju f(eqjv eqjvVar) {
        bojh bojhVarA = botm.a(eqjvVar.c);
        if (bojhVarA == null) {
            return eijx.e(null);
        }
        avnh avnhVar = this.t;
        avnk avnkVarF = avnl.f();
        avnkVarF.b(bojhVarA.C());
        avnkVarF.f(elka.CONVERSATION_FROM_DELETION_DURING_CMS_RESTORE_D2D);
        return avnhVar.a(avnkVarF.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eiju g(final ekgb ekgbVar, final Optional optional, boolean z) {
        final ekgb ekgbVarSubList;
        eiju eijuVarI;
        if (ekgbVar.isEmpty()) {
            return eijx.e(ekoj.a);
        }
        if (!((Boolean) ((cczi) cpyl.T.get()).e()).booleanValue()) {
            return this.c.b(ekgbVar, optional);
        }
        final int iE = e();
        eiju eijuVarI2 = null;
        if (iE <= 0) {
            ekgbVarSubList = ekgbVar;
            ekgbVar = null;
        } else if (iE < ekgbVar.size()) {
            ekgb ekgbVarSubList2 = ekgbVar.subList(0, iE);
            ekgbVarSubList = ekgbVar.subList(iE, ekgbVar.size());
            ekgbVar = ekgbVarSubList2;
        } else {
            ekgbVarSubList = null;
        }
        ekgp ekgpVar = ekoj.a;
        final eiju eijuVarE = eijx.e(ekgpVar);
        if (ekgbVar != null) {
            if (ekgbVar.isEmpty()) {
                eijuVarI = eijx.e(ekgpVar);
            } else {
                if (z) {
                    this.h.e(a);
                }
                final eiju eijuVarB = this.c.b(ekgbVar, optional);
                int size = ekgbVar.size();
                for (int i = 0; i < size; i++) {
                    final eqjv eqjvVar = (eqjv) ekgbVar.get(i);
                    if (eijuVarI2 == null) {
                        eijuVarI2 = eijuVarB;
                    }
                    eijuVarI2 = eijuVarI2.i(new eooz() { // from class: byln
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            final ekgp ekgpVar2 = (ekgp) obj;
                            return this.a.h(eqjvVar, optional).h(new ejvr() { // from class: bylm
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return ekgpVar2;
                                }
                            }, eoqg.a);
                        }
                    }, this.p);
                }
                if (eijuVarI2 == null) {
                    eijuVarE = eijuVarB;
                    if (this.v.a() && z) {
                        eijuVarE = eijuVarE.h(new ejvr() { // from class: byko
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                ekgp ekgpVar2 = (ekgp) obj;
                                try {
                                    this.a.f.a();
                                    return ekgpVar2;
                                } catch (RuntimeException e) {
                                    ekrw ekrwVarJ = bylr.b.j();
                                    ekrwVarJ.X(eksq.a, "BugleCms");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "restoreTopConversations", (char) 512, "CmsConversationConsumer.java")).q("ParticipantFullRefresh failed.");
                                    return ekgpVar2;
                                }
                            }
                        }, this.q);
                    }
                } else {
                    eiju eijuVarH = eijuVarI2.h(new ejvr() { // from class: bylo
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ekgp ekgpVar2 = (ekgp) obj;
                            bylr bylrVar = this.a;
                            if (((bylrVar.l.a() && ((Boolean) ((cczi) cpyl.T.get()).e()).booleanValue()) ? iE - (ekgbVar.size() - ekgpVar2.size()) : bylrVar.e()) <= 0) {
                                bylrVar.h.g(bylr.a, null, null, dzua.SUCCESS);
                                if (bylrVar.k.a()) {
                                    try {
                                        bzug bzugVar = bylrVar.i;
                                        bzzw bzzwVar = (bzzw) bzzx.a.createBuilder();
                                        int iA = bylrVar.j.a();
                                        bzzwVar.copyOnWrite();
                                        bzzx bzzxVar = (bzzx) bzzwVar.instance;
                                        bzzxVar.b |= 1;
                                        bzzxVar.c = iA;
                                        bzugVar.a((bzzx) bzzwVar.build());
                                    } catch (RuntimeException e) {
                                        ekrw ekrwVarJ = bylr.b.j();
                                        ekrwVarJ.X(eksq.a, "BugleCms");
                                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "restoreTopConversations", (char) 478, "CmsConversationConsumer.java")).q("Exception when queuing media download after top conversations restore, will continue restoring the rest of the messages.");
                                    }
                                }
                            }
                            return ekoj.a;
                        }
                    }, this.q);
                    ejvr ejvrVar = new ejvr() { // from class: bylp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            bylr.i((Exception) obj);
                            return ekoj.a;
                        }
                    };
                    eosc eoscVar = this.p;
                    eijuVarI = eijuVarH.e(Exception.class, ejvrVar, eoscVar).i(new eooz() { // from class: bylq
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return eijuVarB;
                        }
                    }, eoscVar);
                }
            }
            eijuVarE = eijuVarI;
            if (this.v.a()) {
                eijuVarE = eijuVarE.h(new ejvr() { // from class: byko
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ekgp ekgpVar2 = (ekgp) obj;
                        try {
                            this.a.f.a();
                            return ekgpVar2;
                        } catch (RuntimeException e) {
                            ekrw ekrwVarJ = bylr.b.j();
                            ekrwVarJ.X(eksq.a, "BugleCms");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationConsumer", "restoreTopConversations", (char) 512, "CmsConversationConsumer.java")).q("ParticipantFullRefresh failed.");
                            return ekgpVar2;
                        }
                    }
                }, this.q);
            }
        }
        if (ekgbVarSubList == null || ekgbVarSubList.isEmpty()) {
            return eijuVarE;
        }
        eooz eoozVar = new eooz() { // from class: bylh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.c.b(ekgbVarSubList, optional);
            }
        };
        eosc eoscVar2 = this.p;
        return eijuVarE.i(eoozVar, eoscVar2).i(new eooz() { // from class: byli
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgp ekgpVar2 = (ekgp) obj;
                ekgp ekgpVar3 = (ekgp) eork.q(eijuVarE);
                if (ekgpVar3 == null || ekgpVar3.isEmpty()) {
                    return eijx.e(ekgpVar2);
                }
                ekgi ekgiVar = new ekgi();
                ekgiVar.g(ekgpVar3);
                ekgiVar.g(ekgpVar2);
                return eijx.e(ekgiVar.b());
            }
        }, eoscVar2);
    }

    public final eiju h(final eqjv eqjvVar, final Optional optional) {
        eiju eijuVarI = this.s.a() ? this.e.i().i(new eooz() { // from class: bykq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zEquals = ((evvp) obj).equals(evxc.c);
                boolean z = false;
                if (((Boolean) ((cczi) cpyl.T.get()).e()).booleanValue() && zEquals) {
                    z = true;
                }
                return this.a.g.A(eqjvVar.c, z);
            }
        }, this.p) : this.g.z(eqjvVar.c);
        eooz eoozVar = new eooz() { // from class: bykr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Stream streamFilter = Collection.EL.stream((ekgb) obj).filter(new Predicate() { // from class: bykp
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
                        return !toc.a((eqnd) obj2);
                    }
                });
                int i = ekgb.d;
                return this.a.d.i((ekgb) streamFilter.collect(ekcv.a), optional);
            }
        };
        eosc eoscVar = this.p;
        return eijuVarI.i(eoozVar, eoscVar).e(Exception.class, new ejvr() { // from class: byks
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bylr.i((Exception) obj);
                return ekoj.a;
            }
        }, eoscVar).h(new ejvr() { // from class: bykt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }
}
