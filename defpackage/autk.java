package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cpvj;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class autk extends fcyz implements fdau {
    int a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    final /* synthetic */ autm d;
    final /* synthetic */ Context e;
    final /* synthetic */ efwo f;
    final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public autk(autm autmVar, Context context, efwo efwoVar, boolean z, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = autmVar;
        this.e = context;
        this.f = efwoVar;
        this.g = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        autk autkVar = new autk(this.d, this.e, this.f, this.g, (fcxy) obj3);
        autkVar.b = zBooleanValue;
        autkVar.c = zBooleanValue2;
        return autkVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            boolean z = this.b;
            boolean z2 = this.c;
            if (z && z2) {
                throw new cpzz();
            }
            autm autmVar = this.d;
            autmVar.b.p("Start initial restore for MultiDevice with unencrypted backup");
            Context context = this.e;
            final efwo efwoVar = this.f;
            final boolean z3 = this.g;
            cpvj.a.m("Restore for multi-device.");
            final cpnx cpnxVarFw = ((cpvj.a) ehlh.a(context, cpvj.a.class, efwoVar)).fw();
            final cpvj cpvjVar = (cpvj) autmVar.a;
            final ucb ucbVar = cpvjVar.d;
            eiju eijuVarV = ucbVar.e.v();
            eooz eoozVar = new eooz() { // from class: ubx
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    return ucbVar.e.w();
                }
            };
            eosc eoscVar = ucbVar.k;
            eiju eijuVarE = eijuVarV.i(eoozVar, eoscVar).h(new ejvr() { // from class: uby
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    return null;
                }
            }, eoqg.a).e(ceks.class, new ejvr() { // from class: ubz
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    final ucb ucbVar2 = ucbVar;
                    ceks ceksVar = (ceks) obj2;
                    auvh.i(ucbVar2.b.b(efwoVar), new Consumer() { // from class: ubw
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj3) {
                            String str = (String) obj3;
                            cqbd cqbdVarE = ucb.a.e();
                            cqbdVarE.I("Tachyon registration failed for Dasher account. Dasher account is not allowed to use Messages.");
                            cqbdVarE.M("accountName", str);
                            cqbdVarE.r();
                            Object[] objArr = {str};
                            ucb ucbVar3 = ucbVar2;
                            ucbVar3.d.k(ucbVar3.m.getString(R.string.dasher_account_restricted_toast, objArr));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, ucbVar2.k);
                    throw ceksVar;
                }
            }, eoscVar).e(cekt.class, new ejvr() { // from class: uca
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    final ucb ucbVar2 = ucbVar;
                    cekt cektVar = (cekt) obj2;
                    auvh.i(ucbVar2.b.b(efwoVar), new Consumer() { // from class: ubu
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj3) {
                            String str = (String) obj3;
                            cqbd cqbdVarE = ucb.a.e();
                            cqbdVarE.I("Tachyon registration failed for Unicorn account. Unicorn account is not allowed to use Messages.");
                            cqbdVarE.M("accountName", str);
                            cqbdVarE.r();
                            Object[] objArr = {str};
                            ucb ucbVar3 = ucbVar2;
                            ucbVar3.d.k(ucbVar3.m.getString(R.string.unicorn_account_restricted_toast, objArr));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, ucbVar2.k);
                    throw cektVar;
                }
            }, eoscVar);
            if (ucbVar.f.a()) {
                eooz eoozVar2 = new eooz() { // from class: ubq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        cedc cedcVar = ucbVar.g;
                        return auvw.c(cedcVar.a, fcyi.a, fdjz.a, new cecw(cedcVar, efwoVar, null));
                    }
                };
                eosc eoscVar2 = ucbVar.l;
                eijuVarE = eijuVarE.i(eoozVar2, eoscVar2).h(new ejvr() { // from class: ubr
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, eoscVar2);
            }
            eooz eoozVar3 = new eooz() { // from class: cpuz
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    cpvj.a.p("Registered gaia account for MultiDevice feature.");
                    cprd cprdVar = cpvjVar.e;
                    return auvw.c(cprdVar.c, fcyi.a, fdjz.a, new cpqz(cprdVar, efwoVar, null));
                }
            };
            eosc eoscVar3 = cpvjVar.k;
            eiju eijuVarI = eijuVarE.i(eoozVar3, eoscVar3);
            eooz eoozVar4 = new eooz() { // from class: cpva
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    cgbn cgbnVar = cpvjVar.h;
                    cgbnVar.j(cgbe.ACCOUNT_REMOVED);
                    cgbnVar.j(cgbe.DASHER_DISABLED);
                    cgbnVar.j(cgbe.PRIMARY_DEVICE_CHANGED_MD);
                    cgbnVar.j(cgbe.PRIMARY_DEVICE_CHANGED_BNR);
                    cpvj.a.p("Checked D2D delta sync eligibility for MultiDevice feature. Starting restore flow.");
                    return cpnxVarFw.a();
                }
            };
            eosc eoscVar4 = cpvjVar.i;
            eiju eijuVarI2 = eijuVarI.i(eoozVar4, eoscVar4).i(new eooz() { // from class: cpvb
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    final cpvj cpvjVar2 = cpvjVar;
                    final efwo efwoVar2 = efwoVar;
                    return cpvjVar2.s.b("CmsRestoreManagerImpl#restoreCmsBackupForMultidevice", new Runnable() { // from class: cpux
                        @Override // java.lang.Runnable
                        public final void run() {
                            cpvj cpvjVar3 = cpvjVar2;
                            efwo efwoVar3 = efwoVar2;
                            if (cpyl.a()) {
                                try {
                                    cpvjVar3.l.a(2);
                                    cpvjVar3.b();
                                    byeq byeqVar = cpvjVar3.s;
                                    dqsm dqsmVar = new dqsm() { // from class: cpuy
                                        @Override // defpackage.dqsm
                                        public final eieu a() {
                                            return eiiy.k("CRMI::notifyDataChanged2::runAfterCommit");
                                        }
                                    };
                                    final aurx aurxVar = cpvjVar3.c;
                                    aurxVar.getClass();
                                    byeqVar.a.g(dqsmVar, "CmsRestoreManagerImpl#restoreCmsBackupForMultidevice", new Runnable() { // from class: cpvf
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            aurxVar.L();
                                        }
                                    });
                                } catch (cpzl e) {
                                    throw new IllegalStateException(e);
                                }
                            } else {
                                cpvj.a.m("Update settings for restore.");
                                cpvjVar3.b.c(efwoVar3);
                                cpvjVar3.b();
                                aurx aurxVar2 = cpvjVar3.c;
                                aurxVar2.Y(true);
                                aurxVar2.X(true);
                                aurxVar2.ah(UUID.randomUUID().toString());
                                aurxVar2.ad(auml.ENABLING);
                                if (!cpvjVar3.q.a()) {
                                    ((cjzq) cpvjVar3.p.b()).n(ckbz.TOGGLE_STATE_AUTOMATICALLY_DISABLED);
                                }
                                cpvjVar3.o.i();
                            }
                            cpvjVar3.c.S(aumj.ENCRYPTION_STATUS_NOT_ENCRYPTED);
                            cqbd cqbdVarC = cpvj.a.c();
                            cqbdVarC.B("isEncrypted", false);
                            cqbdVarC.I("Enqueue restore work using PWQ for MultiDevice feature.");
                            cqbdVarC.r();
                            cpvjVar3.a(efwoVar3, cpyb.MULTI_DEVICE);
                        }
                    });
                }
            }, eoscVar4).h(new ejvr() { // from class: cpvc
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    int iB = toc.b();
                    emec emecVar = emec.RESTORE;
                    emcw emcwVar = (emcw) emcx.a.createBuilder();
                    aukz aukzVar = cpvjVar.j;
                    emec emecVarC = aukzVar.c(emecVar);
                    emcwVar.copyOnWrite();
                    emcx emcxVar = (emcx) emcwVar.instance;
                    emcxVar.c = emecVarC.s;
                    emcxVar.b |= 1;
                    emcwVar.copyOnWrite();
                    emcx emcxVar2 = (emcx) emcwVar.instance;
                    emcxVar2.d = 1;
                    emcxVar2.b |= 2;
                    emcwVar.copyOnWrite();
                    emcx emcxVar3 = (emcx) emcwVar.instance;
                    emcxVar3.g = (true == z3 ? 3 : 2) - 1;
                    emcxVar3.b |= 16;
                    emcn emcnVar = emcn.NO_FAILURE;
                    emcwVar.copyOnWrite();
                    emcx emcxVar4 = (emcx) emcwVar.instance;
                    emcxVar4.e = emcnVar.bs;
                    emcxVar4.b |= 4;
                    emcwVar.copyOnWrite();
                    emcx emcxVar5 = (emcx) emcwVar.instance;
                    emcxVar5.b |= 64;
                    emcxVar5.i = iB;
                    emcwVar.a(aukzVar.b());
                    aukzVar.m((emcx) emcwVar.build());
                    return Optional.empty();
                }
            }, eoscVar4).i(new eooz() { // from class: cpvd
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    cpvj.a.p("Restore is ready to start.");
                    return cpvjVar.f.g();
                }
            }, eoscVar3).i(new eooz() { // from class: cpve
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    final cpvr cpvrVar = cpvjVar.g;
                    if (!cpvrVar.h.a()) {
                        return eijx.a((Iterable) Collection.EL.stream(cpvrVar.a.o()).map(new Function() { // from class: cpvp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                ezol ezolVar = (ezol) obj3;
                                cpvr cpvrVar2 = cpvrVar;
                                ((bvio) cpvrVar2.b.b()).r(ezolVar.c, 19);
                                return cpvrVar2.e.a(cpvrVar2.c.a(ezolVar));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new cpvo()))).h(new ejvr() { // from class: cpvq
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return null;
                            }
                        }, cpvrVar.f);
                    }
                    final bvkr bvkrVar = cpvrVar.a;
                    bvkrVar.getClass();
                    eiju eijuVarG = eijx.g(new Callable() { // from class: cpvk
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ecem.b();
                            int i2 = ekgb.d;
                            ekfw ekfwVar = new ekfw();
                            eieu eieuVarK = eiiy.k("DittoDesktops#getDittoIdContainersForAllDesktops");
                            bvkr bvkrVar2 = bvkrVar;
                            try {
                                bozw bozwVarA = bpab.a();
                                bozwVarA.A("getDittoIdContainersForAllDesktops");
                                boyn boynVar = bpab.c;
                                bozwVarA.c(boynVar.b, boynVar.u, boynVar.t);
                                boyp boypVar = (boyp) bozwVarA.b().p();
                                while (boypVar.moveToNext()) {
                                    try {
                                        ekfwVar.h(bvkrVar2.g(boypVar.i(), boypVar.j(), bvkrVar2.m((bowp) boypVar.cQ())));
                                    } finally {
                                    }
                                }
                                boypVar.close();
                                eieuVarK.close();
                                return ekfwVar.g();
                            } catch (Throwable th) {
                                try {
                                    eieuVarK.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, cpvrVar.g);
                    eooz eoozVar5 = new eooz() { // from class: cpvl
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj3) {
                            Stream stream = Collection.EL.stream((ekgb) obj3);
                            final cpvr cpvrVar2 = cpvrVar;
                            return eijx.a((Iterable) stream.map(new Function() { // from class: cpvn
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj4) {
                                    bvks bvksVar = (bvks) obj4;
                                    cpvr cpvrVar3 = cpvrVar2;
                                    ((bvio) cpvrVar3.b.b()).r(bvksVar.b, 19);
                                    return cpvrVar3.d.b(bvksVar);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new cpvo())));
                        }
                    };
                    eosc eoscVar5 = cpvrVar.f;
                    return eijuVarG.i(eoozVar5, eoscVar5).h(new ejvr() { // from class: cpvm
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj3) {
                            return null;
                        }
                    }, eoscVar5);
                }
            }, eoscVar4);
            this.a = 1;
            if (fdxs.c(eijuVarI2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
