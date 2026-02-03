package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.FillPartSizeAction;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsi implements cmqf {
    public static final cqce c = cqce.g("Bugle", "TelephonySyncManager");
    private static final long k = TimeUnit.SECONDS.toMillis(1);
    private static final long l = TimeUnit.MINUTES.toMillis(1);
    private static final ekhx m = ekhx.r(enqq.APP_STARTUP_RESUME_SYNC, enqq.SYNC_TELEPHONY_THREADS_RESUME_SYNC);
    private static volatile Boolean n = null;
    public final cogw d;
    public final ejxr e;
    public final eygg f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final Context u;
    private final eosc v;
    private final eosc w;
    private final fcsu x;
    private final eoqr y = new eoqr();
    public final List j = new ArrayList();
    private long z = -1;
    private long A = -1;
    private long B = -1;
    private ctz C = null;

    public cmsi(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, Context context, final eygg eyggVar, eygg eyggVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10) {
        this.o = fcsuVar;
        this.p = fcsuVar2;
        this.q = fcsuVar3;
        this.d = cogwVar;
        this.r = fcsuVar4;
        this.s = fcsuVar5;
        this.t = fcsuVar6;
        this.u = context;
        this.e = new ejxr() { // from class: cmru
            @Override // defpackage.ejxr
            public final Object get() {
                cqce cqceVar = cmsi.c;
                return new CopyOnWriteArraySet((Collection) eyggVar.b());
            }
        };
        this.f = eyggVar2;
        this.v = eoscVar;
        this.w = eoscVar2;
        this.x = fcsuVar7;
        this.g = fcsuVar8;
        this.h = fcsuVar9;
        this.i = fcsuVar10;
    }

    private final void A(long j, long j2, long j3, enqq enqqVar) {
        y(j, j2, j3, enqqVar, UUID.randomUUID());
    }

    private final boolean B() {
        if (n == null) {
            n = Boolean.valueOf(((Optional) ((eyig) this.q).a).isEmpty() || ((crnp) this.o.b()).e());
        }
        boolean z = n.booleanValue() && ((crnp) this.o.b()).d();
        cqbd cqbdVarD = c.d();
        cqbdVarD.I("Checking canSyncWithTelephony");
        cqbdVarD.B("canSyncWithTelephony", z);
        cqbdVarD.B("isWearable", ((Optional) ((eyig) this.q).a).isPresent());
        fcsu fcsuVar = this.o;
        cqbdVarD.B("isSmsCapable", ((crnp) fcsuVar.b()).e());
        cqbdVarD.B("isDefaultSmsApp", ((crnp) fcsuVar.b()).d());
        cqbdVarD.r();
        return z;
    }

    private final boolean C() {
        if (((crma) this.t.b()).p() && craf.j(this.u)) {
            return true;
        }
        c.r("no permission to sync.");
        return false;
    }

    private final void z(final enqq enqqVar, final enqm enqmVar, final boolean z) {
        eijx.g(new Callable() { // from class: cmsa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enqq enqqVar2 = enqqVar;
                cmsi cmsiVar = this.a;
                enqm enqmVar2 = enqmVar;
                if (z) {
                    ((cnut) cmsiVar.g.b()).b(enqqVar2, 1, false, ekgb.r(enqmVar2));
                } else {
                    ((cnut) cmsiVar.g.b()).c(enqqVar2, 1, ekgb.r(enqmVar2));
                }
                return true;
            }
        }, this.w).k(auvh.c(new Consumer() { // from class: cmsb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqbd cqbdVarC = cmsi.c.c();
                cqbdVarC.I("Logged syncRequestFailed to clearcut.");
                cqbdVarC.A("reason", enqqVar);
                cqbdVarC.A("problem", enqmVar);
                cqbdVarC.B("isFullSync", z);
                cqbdVarC.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), eoqg.a);
    }

    @Override // defpackage.cmqf
    public final long a(long j) {
        long jE = ((cmqh) this.p.b()).a.e("last_full_sync_time_millis", -1L);
        long j2 = (jE < 0 ? j : jE + l) - j;
        if (j2 > 0) {
            return j2;
        }
        return 0L;
    }

    @Override // defpackage.cmqf
    public final synchronized cnvx b(long j) {
        ctz ctzVar = this.C;
        if (ctzVar == null) {
            return null;
        }
        return (cnvx) ctzVar.d(j);
    }

    @Override // defpackage.cmqf
    public final eiju c(final boolean z, final long j, final long j2, final long j3, final UUID uuid) {
        return eiju.g(this.y.b(eiid.c(new eooy() { // from class: cmsd
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                cmsi cmsiVar = this.a;
                boolean z2 = z;
                long j4 = j;
                long j5 = j2;
                long j6 = j3;
                final UUID uuid2 = uuid;
                final cmqe cmqeVarX = cmsiVar.x(z2, j4, j5, j6, uuid2);
                if (!cmqe.CAN_START.equals(cmqeVarX)) {
                    return eijx.e(cmqeVarX);
                }
                final cmvs cmvsVar = (cmvs) cmsiVar.f.b();
                final AtomicReference atomicReference = new AtomicReference();
                final AtomicReference atomicReference2 = new AtomicReference();
                ecjh ecjhVar = cmvsVar.a;
                ejvr ejvrVar = new ejvr() { // from class: cmvp
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        AtomicReference atomicReference3 = atomicReference;
                        cmvh cmvhVar = (cmvh) obj;
                        Instant instantF = cmvsVar.b.f();
                        atomicReference3.set(instantF);
                        cmvg cmvgVar = (cmvg) cmvhVar.toBuilder();
                        UUID uuid3 = uuid2;
                        String string = uuid3.toString();
                        cmvgVar.copyOnWrite();
                        cmvh cmvhVar2 = (cmvh) cmvgVar.instance;
                        string.getClass();
                        cmvhVar2.b |= 2;
                        cmvhVar2.d = string;
                        evvp evvpVarB = evwz.b((Instant) atomicReference3.get());
                        cmvgVar.copyOnWrite();
                        cmvh cmvhVar3 = (cmvh) cmvgVar.instance;
                        evvpVarB.getClass();
                        cmvhVar3.e = evvpVarB;
                        cmvhVar3.b |= 4;
                        boolean zEquals = uuid3.toString().equals(cmvhVar.d);
                        AtomicReference atomicReference4 = atomicReference2;
                        if (zEquals) {
                            evvp evvpVar = cmvhVar.e;
                            if (evvpVar == null) {
                                evvpVar = evvp.a;
                            }
                            atomicReference4.set(evwz.d(evvpVar));
                        } else {
                            atomicReference4.set(instantF);
                        }
                        evvp evvpVarB2 = evwz.b((Instant) atomicReference4.get());
                        cmvgVar.copyOnWrite();
                        cmvh cmvhVar4 = (cmvh) cmvgVar.instance;
                        evvpVarB2.getClass();
                        cmvhVar4.f = evvpVarB2;
                        cmvhVar4.b |= 8;
                        return (cmvh) cmvgVar.build();
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eiju.g(ecjhVar.b(ejvrVar, eoqgVar)).h(new ejvr() { // from class: cmvq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        int i = cmvs.c;
                        return cmvr.d(uuid2, (Instant) atomicReference.get(), (Instant) atomicReference2.get());
                    }
                }, eoqgVar).h(new ejvr() { // from class: cmsc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cqce cqceVar = cmsi.c;
                        return cmqeVarX;
                    }
                }, eoqgVar);
            }
        }), this.w));
    }

    @Override // defpackage.cmqf
    public final eiju d() {
        return ((cmvs) this.f.b()).a();
    }

    @Override // defpackage.cmqf
    public final eiju e() {
        return eijx.e(Boolean.valueOf(((cmqh) this.p.b()).b()));
    }

    @Override // defpackage.cmqf
    public final eiju f(final enqq enqqVar) {
        return eijx.g(new Callable() { // from class: cmsf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.k(enqqVar);
                return fctx.a;
            }
        }, (Executor) this.x.b());
    }

    @Override // defpackage.cmqf
    public final synchronized void g() {
        cqbd cqbdVarA = c.a();
        cqbdVarA.I("Sync started at");
        cqbdVarA.H(this.z);
        cqbdVarA.I("marked as complete");
        cqbdVarA.r();
        this.z = -1L;
        this.C = null;
        cmvs cmvsVar = (cmvs) this.f.b();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final AtomicReference atomicReference3 = new AtomicReference();
        ecjh ecjhVar = cmvsVar.a;
        ejvr ejvrVar = new ejvr() { // from class: cmvn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cmvh cmvhVar = (cmvh) obj;
                int i = cmvs.c;
                atomicReference.set(cmvhVar.d);
                evvp evvpVar = cmvhVar.e;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                atomicReference2.set(evwz.d(evvpVar));
                evvp evvpVar2 = cmvhVar.f;
                if (evvpVar2 == null) {
                    evvpVar2 = evvp.a;
                }
                atomicReference3.set(evwz.d(evvpVar2));
                cmvg cmvgVar = (cmvg) cmvhVar.toBuilder();
                cmvgVar.copyOnWrite();
                cmvh cmvhVar2 = (cmvh) cmvgVar.instance;
                cmvhVar2.b &= -3;
                cmvhVar2.d = cmvh.a.d;
                cmvgVar.copyOnWrite();
                cmvh cmvhVar3 = (cmvh) cmvgVar.instance;
                cmvhVar3.e = null;
                cmvhVar3.b &= -5;
                cmvgVar.copyOnWrite();
                cmvh cmvhVar4 = (cmvh) cmvgVar.instance;
                cmvhVar4.f = null;
                cmvhVar4.b &= -9;
                return (cmvh) cmvgVar.build();
            }
        };
        eoqg eoqgVar = eoqg.a;
        eiju.g(ecjhVar.b(ejvrVar, eoqgVar)).h(new ejvr() { // from class: cmvo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = cmvs.c;
                Optional optionalC = cmvs.c((String) atomicReference.get());
                final AtomicReference atomicReference4 = atomicReference2;
                final AtomicReference atomicReference5 = atomicReference3;
                return optionalC.map(new Function() { // from class: cmvl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i2 = cmvs.c;
                        return cmvr.d((UUID) obj2, (Instant) atomicReference4.get(), (Instant) atomicReference5.get());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, eoqgVar).h(new ejvr() { // from class: cmse
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cmsi cmsiVar = this.a;
                List list = cmsiVar.j;
                long size = list.size();
                if (list.isEmpty()) {
                    cmsiVar.p(false);
                    Iterator it = ((CopyOnWriteArraySet) cmsiVar.e.get()).iterator();
                    while (it.hasNext()) {
                        ((cmqg) it.next()).a(true);
                    }
                } else {
                    cmsh cmshVar = (cmsh) list.remove(0);
                    cmsiVar.y(cmshVar.a, cmshVar.b, cmshVar.c, enqq.QUEUED_SYNC, cmshVar.d);
                    Iterator it2 = ((CopyOnWriteArraySet) cmsiVar.e.get()).iterator();
                    while (it2.hasNext()) {
                        ((cmqg) it2.next()).a(false);
                    }
                }
                if (optional.isPresent()) {
                    cnup cnupVar = (cnup) cmsiVar.h.b();
                    cmvr cmvrVar = (cmvr) optional.get();
                    Instant instantF = cmsiVar.d.f();
                    int i = ekgb.d;
                    cnupVar.a(cmvrVar.c(), cmvrVar.a(), (Instant) cmvrVar.b().orElse(Instant.EPOCH), instantF, size, ekoe.a);
                } else {
                    cnup cnupVar2 = (cnup) cmsiVar.h.b();
                    int i2 = ekgb.d;
                    ekgb ekgbVar = ekoe.a;
                    enpz enpzVar = (enpz) enqa.a.createBuilder();
                    enpzVar.copyOnWrite();
                    enqa enqaVar = (enqa) enpzVar.instance;
                    enqaVar.b |= 1;
                    enqaVar.c = size;
                    cnupVar2.a.c(ekgbVar, (enqa) enpzVar.build());
                }
                return true;
            }
        }, this.w).k(auvh.b(), this.v);
    }

    @Override // defpackage.cmqf
    public final void h() {
        j(this.d.f().toEpochMilli(), enqq.IMMEDIATE_SYNC);
    }

    @Override // defpackage.cmqf
    public final synchronized void i(long j) {
        eieu eieuVarK = eiiy.k("TelephonySyncManager::onNewMessageInserted");
        try {
            long j2 = this.A;
            if (j2 < 0 || j > j2) {
                cqbd cqbdVarA = c.a();
                cqbdVarA.I("New message at");
                cqbdVarA.H(j);
                cqbdVarA.I("is after upper bound of current sync batch");
                cqbdVarA.H(this.A);
                cqbdVarA.r();
            } else {
                this.B = Math.max(j2, j);
                cqbd cqbdVarA2 = c.a();
                cqbdVarA2.I("New message at");
                cqbdVarA2.H(j);
                cqbdVarA2.I("is before upper bound of current sync batch");
                cqbdVarA2.H(this.A);
                cqbdVarA2.r();
            }
            eieuVarK.close();
        } finally {
        }
    }

    @Override // defpackage.cmqf
    public final void j(long j, enqq enqqVar) {
        A(j, ((cmqh) this.p.b()).a(), j, enqqVar);
    }

    @Override // defpackage.cmqf
    public final void k(final enqq enqqVar) {
        if (!B()) {
            z(enqqVar, enqm.CANT_SYNC_WITH_TELEPHONY, true);
            cqbd cqbdVarA = c.a();
            cqbdVarA.I("Skip forceFullSync() because canSyncWithTelephony is false");
            cqbdVarA.r();
            return;
        }
        p(true);
        ((cmot) this.r.b()).j();
        n();
        if (!C()) {
            z(enqqVar, enqm.MISSING_PERMISSIONS, true);
            return;
        }
        cqbd cqbdVarC = c.c();
        cqbdVarC.I("Starting full sync");
        cqbdVarC.A("reason", enqqVar);
        cqbdVarC.r();
        final long epochMilli = this.d.f().toEpochMilli() + cnrt.b().toMillis();
        eiju eijuVarH = enqqVar == enqq.SELECTED_DEFAULT_SMS_APP ? ((cmvs) this.f.b()).b(epochMilli).h(new ejvr() { // from class: cmrq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = cmsi.c;
                return cmsg.FIRST_FULL_SYNC;
            }
        }, eoqg.a) : ((cmvs) this.f.b()).a().i(new eooz() { // from class: cmry
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Long) obj).equals(0L)) {
                    return eijx.e(cmsg.NOT_FIRST_FULL_SYNC);
                }
                return ((cmvs) this.a.f.b()).b(epochMilli).h(new ejvr() { // from class: cmrt
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = cmsi.c;
                        return cmsg.FIRST_FULL_SYNC;
                    }
                }, eoqg.a);
            }
        }, this.v);
        ejvr ejvrVar = new ejvr() { // from class: cmrz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cmsi.c.s("Failed to update first full sync timestamp", (IOException) obj);
                return cmsg.FAILED_TO_UPDATE_TIMESTAMP;
            }
        };
        eoqg eoqgVar = eoqg.a;
        final eiju eijuVarE = eijuVarH.e(IOException.class, ejvrVar, eoqgVar);
        final eiju eijuVarH2 = m.contains(enqqVar) ? eiju.g(((cmvs) this.f.b()).a.a()).h(new ejvr() { // from class: cmvk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cmvh cmvhVar = (cmvh) obj;
                int i = cmvs.c;
                String str = cmvhVar.d;
                evvp evvpVar = cmvhVar.e;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                final Instant instantD = evwz.d(evvpVar);
                evvp evvpVar2 = cmvhVar.f;
                if (evvpVar2 == null) {
                    evvpVar2 = evvp.a;
                }
                final Instant instantD2 = evwz.d(evvpVar2);
                return cmvs.c(str).map(new Function() { // from class: cmvj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i2 = cmvs.c;
                        return cmvr.d((UUID) obj2, instantD, instantD2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, eoqgVar).h(new ejvr() { // from class: cmrv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = cmsi.c;
                return (UUID) ((Optional) obj).map(new Function() { // from class: cmrw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((cmvr) obj2).c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new Supplier() { // from class: cmrx
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        cmsi.c.r("Resuming full sync but no sync id was found.");
                        return UUID.randomUUID();
                    }
                });
            }
        }, this.v) : eijx.e(UUID.randomUUID());
        eijx.m(eijuVarE, eijuVarH2).b(new eooy() { // from class: cmrr
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                cmsg cmsgVar = (cmsg) eork.q(eijuVarE);
                UUID uuid = (UUID) eork.q(eijuVarH2);
                UUID uuidRandomUUID = UUID.randomUUID();
                boolean zEquals = cmsgVar.equals(cmsg.FIRST_FULL_SYNC);
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                if (cmsg.FAILED_TO_UPDATE_TIMESTAMP.equals(cmsgVar)) {
                    ekfwVar.h(enqm.FAILED_TO_UPDATE_FIRST_FULL_SYNC_TIMESTAMP);
                }
                long j = epochMilli;
                enqq enqqVar2 = enqqVar;
                cmsi cmsiVar = this.a;
                cnut cnutVar = (cnut) cmsiVar.g.b();
                cnutVar.a.b(uuid, ekfwVar.g(), cnut.d(enqqVar2, true, zEquals, uuidRandomUUID));
                return ((cnrs) cmsiVar.i.b()).a(Instant.ofEpochMilli(-1L), Instant.ofEpochMilli(j), Instant.ofEpochMilli(j), enqqVar2, uuid, uuidRandomUUID);
            }
        }, (Executor) this.x.b()).k(auvh.c(new Consumer() { // from class: cmrs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cmsi.c.q("ForwardSyncExecutionScheduler queued forward sync");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.v);
    }

    @Override // defpackage.cmqf
    public final void l(enqq enqqVar) {
        j(this.d.f().toEpochMilli() + cnrt.b().toMillis(), enqqVar);
    }

    @Override // defpackage.cmqf
    public final void m(Uri uri, Instant instant) {
        long epochMilli = instant.toEpochMilli();
        long j = k;
        long j2 = epochMilli + j;
        long j3 = epochMilli - j;
        A(epochMilli, j3 >= 0 ? j3 : 0L, j2, enqq.SPOT_SYNC);
    }

    @Override // defpackage.cmqf
    public final void n() {
        fcsu fcsuVar = this.p;
        ((cmqh) fcsuVar.b()).a.k("last_full_sync_time_millis", -1L);
        ((cmqh) fcsuVar.b()).a.k("last_sync_time_millis", -1L);
    }

    @Override // defpackage.cmqf
    public final synchronized void o(ctz ctzVar) {
        this.C = ctzVar;
    }

    @Override // defpackage.cmqf
    public final void p(boolean z) {
        boolean zU = u();
        cqce cqceVar = c;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("setting full sync.");
        cqbdVarC.B("inProgress", z);
        cqbdVarC.B("before", zU);
        cqbdVarC.r();
        if (zU != z) {
            cqbd cqbdVarA = cqceVar.a();
            cqbdVarA.I("setFullSyncInProgressFlag:");
            cqbdVarA.J(z);
            cqbdVarA.r();
            ((cmqh) this.p.b()).a.g("bugle_full_sync_in_progress", z);
            if (z) {
                return;
            }
            axnz axnzVar = (axnz) this.s.b();
            dqsn dqsnVar = (dqsn) axnzVar.b.b();
            dqsnVar.getClass();
            new FillPartSizeAction(axnzVar.a, dqsnVar).z();
        }
    }

    @Override // defpackage.cmqf
    public final void q(boolean z) {
        n = Boolean.valueOf(z);
    }

    @Override // defpackage.cmqf
    public final synchronized void r(long j) {
        ejwl.a(this.A < 0);
        this.A = j;
        this.B = -1L;
    }

    @Override // defpackage.cmqf
    public final boolean s() {
        return ((cmqh) this.p.b()).a() != -1;
    }

    @Override // defpackage.cmqf
    public final synchronized boolean t(long j) {
        boolean z;
        z = true;
        ejwl.a(this.A >= 0);
        long j2 = this.B;
        if (j2 < 0 || j2 < j) {
            z = false;
        }
        cqbd cqbdVarA = c.a();
        cqbdVarA.I("Sync batch of messages.");
        cqbdVarA.z("lowerBoundTimestamp", j);
        cqbdVarA.z("upperBoundTimestamp", this.A);
        cqbdVarA.B("dirty", z);
        cqbdVarA.z("maxRecentChangeTimestamp", this.B);
        cqbdVarA.r();
        this.A = -1L;
        this.B = -1L;
        return z;
    }

    @Override // defpackage.cmqf
    public final boolean u() {
        return ((cmqh) this.p.b()).b();
    }

    @Override // defpackage.cmqf
    public final synchronized boolean v() {
        return this.z >= 0;
    }

    @Override // defpackage.cmqf
    public final synchronized boolean w(long j) {
        ejwl.a(j >= 0);
        cqbd cqbdVarA = c.a();
        cqbdVarA.I("IsSyncing");
        cqbdVarA.z("upperBoundTimestamp", j);
        cqbdVarA.z("currentUpperBoundTimestamp", this.A);
        cqbdVarA.r();
        return j == this.A;
    }

    public final synchronized cmqe x(boolean z, long j, long j2, long j3, UUID uuid) {
        cqce cqceVar = c;
        cqbd cqbdVarD = cqceVar.d();
        cqbdVarD.I("Checking if sync can start");
        cqbdVarD.z("startTimestampMs", j);
        cqbdVarD.A("syncId", uuid);
        cqbdVarD.B("isFull", z);
        cqbdVarD.r();
        if (z) {
            long jA = a(j);
            if (jA > 0) {
                cqbd cqbdVarA = cqceVar.a();
                cqbdVarA.I("Full sync requested, but delayed");
                cqbdVarA.z("startTimestampMs", j);
                cqbdVarA.z("delayUntilFullSyncMs", jA);
                cqbdVarA.A("syncId", uuid);
                cqbdVarA.r();
                return cmqe.FULL_SYNC_DELAYED;
            }
        }
        if (!v()) {
            cqbd cqbdVarA2 = cqceVar.a();
            cqbdVarA2.I("Sync configured");
            cqbdVarA2.z("startTimestampMs", j);
            cqbdVarA2.A("syncId", uuid);
            cqbdVarA2.B("isFull", z);
            cqbdVarA2.r();
            this.z = j;
            this.A = j3;
            this.B = -1L;
            Iterator it = ((CopyOnWriteArraySet) this.e.get()).iterator();
            while (it.hasNext()) {
                ((cmqg) it.next()).b(z);
            }
            return cmqe.CAN_START;
        }
        cqbd cqbdVarA3 = cqceVar.a();
        cqbdVarA3.I("Not allowed to sync yet");
        cqbdVarA3.z("Current sync started at", this.z);
        cqbdVarA3.A("syncId", uuid);
        cqbdVarA3.B("isFull", z);
        cqbdVarA3.r();
        if (z) {
            return cmqe.DO_NOT_START;
        }
        cqbd cqbdVarA4 = cqceVar.a();
        cqbdVarA4.I("Adding partial sync request to queue");
        cqbdVarA4.z("startTimestampMs", j);
        cqbdVarA4.A("syncId", uuid);
        cqbdVarA4.r();
        this.j.add(new cmsh(j, j2, j3, uuid));
        return cmqe.PARTIAL_SYNC_QUEUED;
    }

    public final void y(long j, long j2, long j3, enqq enqqVar, UUID uuid) {
        if (!B()) {
            z(enqqVar, enqm.CANT_SYNC_WITH_TELEPHONY, false);
            return;
        }
        if (!C()) {
            z(enqqVar, enqm.MISSING_PERMISSIONS, false);
            return;
        }
        fcsu fcsuVar = this.g;
        UUID uuidRandomUUID = UUID.randomUUID();
        cnut cnutVar = (cnut) fcsuVar.b();
        int i = ekgb.d;
        cnutVar.a.b(uuid, ekoe.a, cnut.d(enqqVar, false, false, uuidRandomUUID));
        auvh.h(((cnrs) this.i.b()).a(Instant.ofEpochMilli(j2), Instant.ofEpochMilli(j3), Instant.ofEpochMilli(j), enqqVar, uuid, uuidRandomUUID));
    }
}
