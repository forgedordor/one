package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byrw implements bykl {
    public static final cqce a = cqce.g("BugleCms", "CmsKeyObjectConsumer");
    public final cpoe b;
    public final dqsn c;
    public final bzwn d;
    public final fcsu e;
    public final cogw f;
    private final eosc g;

    public byrw(cpoe cpoeVar, dqsn dqsnVar, bzwn bzwnVar, eosc eoscVar, fcsu fcsuVar, cogw cogwVar) {
        this.b = cpoeVar;
        this.c = dqsnVar;
        this.d = bzwnVar;
        this.g = eoscVar;
        this.e = fcsuVar;
        this.f = cogwVar;
    }

    public static void e(bnar bnarVar, String str) {
        try {
            if (bnarVar.n().longValue() >= 0) {
                return;
            }
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Insert key failed");
            cqbdVarE.A("Cms Object Id", str);
            cqbdVarE.r();
            throw new byru();
        } catch (Throwable th) {
            if ((aqbf.a() || cpyl.a()) && (th instanceof Error)) {
                throw th;
            }
            cqbd cqbdVarE2 = a.e();
            cqbdVarE2.I("Insert key threw");
            cqbdVarE2.A("Cms Object Id", str);
            cqbdVarE2.s(th);
            throw new byrv(th);
        }
    }

    @Override // defpackage.bykl
    public final eiju a(ekgb ekgbVar, Optional optional, boolean z) {
        throw new UnsupportedOperationException("Restoring Key Objects in batch is not supported yet.");
    }

    @Override // defpackage.bykl
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // defpackage.bykl
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bykl
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final eiju d(final eqnd eqndVar) {
        eiju eijuVarE;
        if (!cpyl.a()) {
            return eijx.g(new Callable() { // from class: byrq
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final bnar bnarVarA;
                    byrw byrwVar = this.a;
                    cpoe cpoeVar = byrwVar.b;
                    final eqnd eqndVar2 = eqndVar;
                    cpop cpopVarA = cpoeVar.a(eqndVar2);
                    eqns eqnsVar = cpopVarA.b.i;
                    if (eqnsVar == null) {
                        eqnsVar = eqns.a;
                    }
                    evqe evqeVar = ((eqnu) eqnsVar.b.get(0)).g;
                    if (evqeVar == null) {
                        evqeVar = evqe.a;
                    }
                    try {
                        epkh epkhVar = (epkh) evsn.parseFrom(epkh.a, evqeVar.c);
                        evqs evqsVar = epkhVar.b;
                        int i = epkhVar.c;
                        if (i != -1) {
                            bnarVarA = cpopVarA.b(evqsVar, i);
                        } else {
                            try {
                                bnarVarA = cpopVarA.a((epjj) evsn.parseFrom(epjj.a, evqsVar));
                            } catch (evtj e) {
                                throw new cpoj(e, "Failed to create ".concat(String.valueOf(epjj.class.getSimpleName())));
                            }
                        }
                        bzwn bzwnVar = byrwVar.d;
                        Optional optionalA = bzwnVar.a(bnarVarA);
                        if (!optionalA.isPresent()) {
                            return (Void) byrwVar.c.c("CmsKeyObjectConsumer#restoreCmsItemDataEncryptedBackupOff", new ejxr() { // from class: byrr
                                @Override // defpackage.ejxr
                                public final Object get() {
                                    byrw.e(bnarVarA, eqndVar2.c);
                                    return null;
                                }
                            });
                        }
                        bzwnVar.b(bnarVarA, ((bnar) optionalA.get()).k(), ((bnar) optionalA.get()).m());
                        return null;
                    } catch (evtj e2) {
                        throw new cpoo(e2, String.format("Failed to parse %s from %s", epjj.class.getSimpleName(), epkh.class.getSimpleName()));
                    }
                }
            }, this.g);
        }
        final cpop cpopVarA = this.b.a(eqndVar);
        cogw cogwVar = this.f;
        eqnd eqndVar2 = cpopVarA.b;
        final long jA = cogwVar.a();
        eqns eqnsVar = eqndVar2.i;
        if (eqnsVar == null) {
            eqnsVar = eqns.a;
        }
        evqe evqeVar = ((eqnu) eqnsVar.b.get(0)).g;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        try {
            epkh epkhVar = (epkh) evsn.parseFrom(epkh.a, evqeVar.c, evrr.a());
            final evqs evqsVar = epkhVar.b;
            int i = epkhVar.c;
            if (i == -1) {
                try {
                    eijuVarE = eijx.e(cpopVarA.a((epjj) evsn.parseFrom(epjj.a, evqsVar, evrr.a())));
                } catch (evtj e) {
                    throw new cpoj(e, "Failed to create ".concat(String.valueOf(epjj.class.getSimpleName())));
                }
            } else if (cpopVarA.b.h.contains("encrypted_backup_key")) {
                eiju eijuVarI = cpopVarA.c.a().i(new eooz() { // from class: cpog
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final List list = (List) obj;
                        final cpop cpopVar = cpopVarA;
                        final evqs evqsVar2 = evqsVar;
                        return eijx.g(new Callable() { // from class: cpof
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cpop cpopVar2 = cpopVar;
                                cphr cphrVarA = cpopVar2.f.a(ekgb.n(list));
                                cqce cqceVar = cpop.a;
                                cqceVar.p("Instantiated GmsCryptor to decrypt Backup Key");
                                evqs evqsVarA = cphrVarA.a(evqsVar2);
                                cqceVar.p("Decrypted Backup Key with GmsCryptor");
                                epjj epjjVar = (epjj) evsn.parseFrom(epjj.a, evqsVarA, evrr.a());
                                cqceVar.p("Created CmsKeyEntry for encrypted Backup Key");
                                return cpopVar2.a(epjjVar);
                            }
                        }, cpopVar.e);
                    }
                }, cpopVarA.d);
                eooz eoozVar = new eooz() { // from class: cpoh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return eijx.d(new cpol((GeneralSecurityException) obj));
                    }
                };
                eosc eoscVar = cpopVarA.e;
                eijuVarE = eijuVarI.f(GeneralSecurityException.class, eoozVar, eoscVar).f(evtj.class, new eooz() { // from class: cpoi
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return eijx.d(new cpoj((evtj) obj, "Failed to create " + epjj.class.getSimpleName() + " when decrypting encrypted Backup Key"));
                    }
                }, eoscVar);
            } else {
                eijuVarE = eijx.e(cpopVarA.b(evqsVar, i));
            }
            return eijuVarE.h(new ejvr() { // from class: byrt
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    byrw byrwVar = this.a;
                    bzwn bzwnVar = byrwVar.d;
                    final bnar bnarVar = (bnar) obj;
                    Optional optionalA = bzwnVar.a(bnarVar);
                    fcsu fcsuVar = byrwVar.e;
                    ((ains) fcsuVar.b()).e("Bugle.Cms.Restore.Key.Outcome", true != optionalA.isPresent() ? 5 : 3);
                    if (optionalA.isPresent()) {
                        long j = jA;
                        bzwnVar.b(bnarVar, ((bnar) optionalA.get()).k(), ((bnar) optionalA.get()).m());
                        ((ains) fcsuVar.b()).g("Bugle.Cms.Restore.Key.DuplicateSearchDuration", byrwVar.f.a() - j);
                        return null;
                    }
                    final eqnd eqndVar3 = eqndVar;
                    cqbd cqbdVarC = byrw.a.c();
                    cqbdVarC.I("Inserting restored key to BugleDb");
                    cqbdVarC.A("Cms Object Id", eqndVar3.c);
                    cqbdVarC.A("Cms labels", eqndVar3.h);
                    cqbdVarC.y("Key type", bnarVar.m());
                    cqbdVarC.r();
                    return (Void) byrwVar.c.c("CmsKeyObjectConsumer#restoreCmsItemDataEncryptedBackupOn", new ejxr() { // from class: byrs
                        @Override // defpackage.ejxr
                        public final Object get() {
                            byrw.e(bnarVar, eqndVar3.c);
                            return null;
                        }
                    });
                }
            }, this.g);
        } catch (evtj e2) {
            throw new cpoo(e2, String.format("Failed to parse %s from %s", epjj.class.getSimpleName(), epkh.class.getSimpleName()));
        }
    }
}
