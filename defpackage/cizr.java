package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.Collection;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cizr extends cjin {
    public static final eksp a = eksp.p();
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final eosc j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    private final eosc n;
    private final cjej o;
    private final cjek p;

    public cizr(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, cjej cjejVar, cjek cjekVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, eosc eoscVar, eosc eoscVar2) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.o = cjejVar;
        this.p = cjekVar;
        this.k = fcsuVar9;
        this.l = fcsuVar10;
        this.m = fcsuVar11;
        this.j = eoscVar;
        this.n = eoscVar2;
    }

    public static StatusException b(IllegalArgumentException illegalArgumentException) {
        return Status.e.d(illegalArgumentException).withDescription((String) Optional.ofNullable(illegalArgumentException.getMessage()).orElse("")).asException();
    }

    private final void m(final String str, final fcsf fcsfVar, Supplier supplier) {
        try {
            eiju eijuVar = (eiju) supplier.get();
            ejvr ejvrVar = new ejvr() { // from class: cizk
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    fcsf fcsfVar2 = fcsfVar;
                    fcsfVar2.c(obj);
                    fcsfVar2.a();
                    return Status.Code.OK;
                }
            };
            eosc eoscVar = this.j;
            auvh.h(eijuVar.h(ejvrVar, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: cizl
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                    ((eksl) ((eksl) ((eksl) cizr.a.j()).g(illegalArgumentException)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 264, "MessagingEngineNotificationServerImpl.java")).t("[%s] Ignoring invalid data", str);
                    fcsfVar.b(cizr.b(illegalArgumentException));
                    return Status.Code.INVALID_ARGUMENT;
                }
            }, eoscVar).e(Throwable.class, new ejvr() { // from class: cizm
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    ((eksl) ((eksl) ((eksl) cizr.a.j()).g(th)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 272, "MessagingEngineNotificationServerImpl.java")).t("[%s] Error while processing request", str);
                    fcsfVar.b(th);
                    return Status.Code.UNKNOWN;
                }
            }, eoscVar));
        } catch (IllegalArgumentException e) {
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 279, "MessagingEngineNotificationServerImpl.java")).t("[%s] Ignoring invalid data", str);
            fcsfVar.b(b(e));
        } catch (Throwable th) {
            ((eksl) ((eksl) ((eksl) a.j()).g(th)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 282, "MessagingEngineNotificationServerImpl.java")).t("[%s] Error while processing request", str);
            fcsfVar.b(th);
        }
    }

    @Override // defpackage.cjin, defpackage.cjil
    public final void c(final cjgd cjgdVar, fcsf fcsfVar) {
        m("addUserToGroup", fcsfVar, new Supplier() { // from class: cizg
            @Override // java.util.function.Supplier
            public final Object get() {
                cjmh cjmhVar = (cjmh) this.a.e.b();
                return cjmhVar.a.b(cjgdVar).h(new ejvr() { // from class: cjmf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cjgf.a;
                    }
                }, cjmhVar.b);
            }
        });
    }

    @Override // defpackage.cjin, defpackage.cjil
    public final void d(final cjgt cjgtVar, fcsf fcsfVar) {
        m("createGroup", fcsfVar, new Supplier() { // from class: cizj
            @Override // java.util.function.Supplier
            public final Object get() {
                cjml cjmlVar = (cjml) this.a.d.b();
                return cjmlVar.a.b(cjgtVar).h(new ejvr() { // from class: cjmj
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cjgv.a;
                    }
                }, cjmlVar.b);
            }
        });
    }

    @Override // defpackage.cjin, defpackage.cjil
    public final void e(final cjjh cjjhVar, fcsf fcsfVar) {
        m("receiveGroupNotification", fcsfVar, new Supplier() { // from class: cizd
            @Override // java.util.function.Supplier
            public final Object get() {
                cjjh cjjhVar2 = cjjhVar;
                int i = cjjhVar2.c;
                cizr cizrVar = this.a;
                if (i == 4) {
                    eiju eijuVarD = ((asrc) cizrVar.i.b()).d(((cjea) cizrVar.k.b()).apply(cjjhVar2));
                    final cjeb cjebVar = (cjeb) cizrVar.m.b();
                    cjebVar.getClass();
                    return eijuVarD.h(new ejvr() { // from class: cizb
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return cjebVar.apply((aubl) obj);
                        }
                    }, cizrVar.j);
                }
                if (i != 3) {
                    return eijx.e(cjjj.a);
                }
                eiju eijuVarC = ((asrc) cizrVar.i.b()).c(((cjdw) cizrVar.l.b()).apply(cjjhVar2));
                final cjeb cjebVar2 = (cjeb) cizrVar.m.b();
                cjebVar2.getClass();
                return eijuVarC.h(new ejvr() { // from class: cizi
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cjebVar2.apply((aubl) obj);
                    }
                }, cizrVar.j);
            }
        });
    }

    @Override // defpackage.cjin, defpackage.cjil
    public final void f(final cjjl cjjlVar, fcsf fcsfVar) {
        eiju eijuVarB;
        final cjej cjejVar = this.o;
        if (((aqtb) cjejVar.d.b()).a()) {
            eiju eijuVarC = ((chtk) cjejVar.c.b()).c();
            ejvr ejvrVar = new ejvr() { // from class: cjee
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return (aubq) Collection.EL.stream((ekgb) obj).findAny().orElseThrow();
                }
            };
            eoqg eoqgVar = eoqg.a;
            eiju eijuVarH = eijuVarC.h(ejvrVar, eoqgVar).h(new ejvr() { // from class: cjec
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    aubq aubqVar = (aubq) obj;
                    aufe aufeVar = (aufe) cjejVar.a.apply(cjjlVar).toBuilder();
                    aufeVar.copyOnWrite();
                    aufh aufhVar = (aufh) aufeVar.instance;
                    aubqVar.getClass();
                    aufhVar.h = aubqVar;
                    aufhVar.c |= 64;
                    return (aufh) aufeVar.build();
                }
            }, eoqgVar);
            final atvy atvyVar = cjejVar.b;
            atvyVar.getClass();
            eijuVarB = eijuVarH.i(new eooz() { // from class: cjed
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return atvyVar.b((aufh) obj);
                }
            }, eoqgVar);
        } else {
            eijuVarB = cjejVar.b.b(cjejVar.a.apply(cjjlVar));
        }
        eiju eijuVarI = eijuVarB.i(new eooz() { // from class: cizp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((asrc) this.a.i.b()).f((aufh) obj);
            }
        }, this.n);
        final cjek cjekVar = this.p;
        final eiju eijuVarH2 = eijuVarI.h(new ejvr() { // from class: cizq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cjekVar.apply((aubl) obj);
            }
        }, this.j);
        m("receiveMessageNotification", fcsfVar, new Supplier() { // from class: cizc
            @Override // java.util.function.Supplier
            public final Object get() {
                return eijuVarH2;
            }
        });
    }

    @Override // defpackage.cjin, defpackage.cjil
    public final void g(final cjjy cjjyVar, fcsf fcsfVar) {
        m("removeUserFromGroup", fcsfVar, new Supplier() { // from class: cizn
            @Override // java.util.function.Supplier
            public final Object get() {
                cjmx cjmxVar = (cjmx) this.a.f.b();
                return cjmxVar.a.b(cjjyVar).h(new ejvr() { // from class: cjmv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cjka.a;
                    }
                }, cjmxVar.b);
            }
        });
    }

    @Override // defpackage.cjin, defpackage.cjil
    public final void h(final cjkm cjkmVar, fcsf fcsfVar) {
        m("revokeMessage", fcsfVar, new Supplier() { // from class: cize
            @Override // java.util.function.Supplier
            public final Object get() {
                cjna cjnaVar = (cjna) this.a.c.b();
                return cjnaVar.a.b(cjkmVar).h(new ejvr() { // from class: cjmy
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cjko.a;
                    }
                }, cjnaVar.b);
            }
        });
    }

    @Override // defpackage.cjin, defpackage.cjil
    public final void i(final cjlc cjlcVar, fcsf fcsfVar) {
        m("sendMessage", fcsfVar, new Supplier() { // from class: cizf
            @Override // java.util.function.Supplier
            public final Object get() {
                final cjnd cjndVar = (cjnd) this.a.b.b();
                cjmt cjmtVar = cjndVar.a;
                final cjlc cjlcVar2 = cjlcVar;
                return cjmtVar.b(cjlcVar2).h(new ejvr() { // from class: cjnb
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        if (((Boolean) ((cczi) cjbf.d.get()).e()).booleanValue()) {
                            cjlc cjlcVar3 = cjlcVar2;
                            cjnd cjndVar2 = cjndVar;
                            auia auiaVar = (auia) auib.a.createBuilder();
                            cjlm cjlmVar = cjlcVar3.d;
                            if (cjlmVar == null) {
                                cjlmVar = cjlm.a;
                            }
                            String str = cjlmVar.c;
                            auiaVar.copyOnWrite();
                            auib auibVar = (auib) auiaVar.instance;
                            str.getClass();
                            auibVar.b |= 1;
                            auibVar.c = str;
                            auib auibVar2 = (auib) auiaVar.build();
                            cjjw cjjwVar = cjlcVar3.f;
                            if (cjjwVar == null) {
                                cjjwVar = cjjw.a;
                            }
                            cjndVar2.c.a(auibVar2, basd.a(cjjwVar.c));
                        }
                        return cjle.a;
                    }
                }, cjndVar.b);
            }
        });
    }

    @Override // defpackage.cjin, defpackage.cjil
    public final void j(final cjlo cjloVar, fcsf fcsfVar) {
        m("triggerGroupNotification", fcsfVar, new Supplier() { // from class: cizh
            @Override // java.util.function.Supplier
            public final Object get() {
                cjng cjngVar = (cjng) this.a.h.b();
                return cjngVar.a.b(cjloVar).h(new ejvr() { // from class: cjne
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cjlq.a;
                    }
                }, cjngVar.b);
            }
        });
    }

    @Override // defpackage.cjin, defpackage.cjil
    public final void k(final cjlw cjlwVar, fcsf fcsfVar) {
        m("updateGroup", fcsfVar, new Supplier() { // from class: cizo
            @Override // java.util.function.Supplier
            public final Object get() {
                cjnj cjnjVar = (cjnj) this.a.g.b();
                return cjnjVar.a.b(cjlwVar).h(new ejvr() { // from class: cjnh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cjly.a;
                    }
                }, cjnjVar.b);
            }
        });
    }
}
