package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aukz {
    static final ekgp c;
    public final aurx d;
    public final eosc e;
    public final eosc f;
    public final apow g;
    public final apof h;
    public final appq i;
    public final appi j;
    public final apoy k;
    public final cqba l;
    private final fcsu n;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/cloudstore/clearcutlogging/CmsClearcutLogger");
    public static final cczi b = cdag.e(cdag.b, "cms_num_failures_before_clearcut_logging", 5);
    private static final ekhx m = ekhx.s(emcn.RESTORE_CONV_PARTICIPANT_NOT_FOUND, emcn.RESTORE_MSG_CONVERSATION_MISSING, emcn.RESTORE_MSG_PARTICIPANT_MISSING);

    static {
        emec emecVar = emec.RESTORE;
        emec emecVar2 = emec.OPTIMIZED_RESTORE;
        emec emecVar3 = emec.RESTORE_BACKUP_KEY;
        emec emecVar4 = emec.OPTIMIZED_RESTORE_BACKUP_KEY;
        emec emecVar5 = emec.RESTORE_ENCRYPTION_KEY;
        emec emecVar6 = emec.OPTIMIZED_RESTORE_ENCRYPTION_KEY;
        emec emecVar7 = emec.RESTORE_PARTICIPANT;
        emec emecVar8 = emec.OPTIMIZED_RESTORE_PARTICIPANT;
        emec emecVar9 = emec.RESTORE_CONVERSATION;
        emec emecVar10 = emec.OPTIMIZED_RESTORE_CONVERSATION;
        emec emecVar11 = emec.RESTORE_MESSAGE;
        emec emecVar12 = emec.OPTIMIZED_RESTORE_MESSAGE;
        emec emecVar13 = emec.BACKUP;
        emec emecVar14 = emec.OPTIMIZED_BACKUP;
        ekcw.a(emecVar, emecVar2);
        ekcw.a(emecVar3, emecVar4);
        ekcw.a(emecVar5, emecVar6);
        ekcw.a(emecVar7, emecVar8);
        ekcw.a(emecVar9, emecVar10);
        ekcw.a(emecVar11, emecVar12);
        ekcw.a(emecVar13, emecVar14);
        c = ekoj.a(7, new Object[]{emecVar, emecVar2, emecVar3, emecVar4, emecVar5, emecVar6, emecVar7, emecVar8, emecVar9, emecVar10, emecVar11, emecVar12, emecVar13, emecVar14});
    }

    public aukz(cqba cqbaVar, fcsu fcsuVar, aurx aurxVar, apow apowVar, appi appiVar, apof apofVar, appq appqVar, apoy apoyVar, eosc eoscVar, eosc eoscVar2) {
        this.l = cqbaVar;
        this.n = fcsuVar;
        this.d = aurxVar;
        this.h = apofVar;
        this.g = apowVar;
        this.j = appiVar;
        this.i = appqVar;
        this.k = apoyVar;
        this.e = eoscVar;
        this.f = eoscVar2;
    }

    public static void d(Throwable th) {
        th.addSuppressed(new auky());
    }

    public static boolean u(Throwable th) {
        for (Throwable th2 : th.getSuppressed()) {
            if (th2 instanceof auky) {
                return true;
            }
        }
        return false;
    }

    private static boolean y(auml aumlVar) {
        return aumlVar == auml.ENABLED || aumlVar == auml.ENABLING;
    }

    private final void z(emcd emcdVar, int i, Throwable th, int i2, int i3) {
        apof apofVar = this.h;
        if (apofVar.a() && th != null && u(th)) {
            return;
        }
        embz embzVar = (embz) emca.a.createBuilder();
        embzVar.copyOnWrite();
        emca emcaVar = (emca) embzVar.instance;
        emcaVar.c = emcdVar.w;
        emcaVar.b |= 1;
        embzVar.copyOnWrite();
        emca emcaVar2 = (emca) embzVar.instance;
        emcaVar2.g = i3 - 1;
        emcaVar2.b |= 16;
        embzVar.copyOnWrite();
        emca emcaVar3 = (emca) embzVar.instance;
        emcaVar3.d = i - 1;
        emcaVar3.b |= 2;
        embzVar.copyOnWrite();
        emca emcaVar4 = (emca) embzVar.instance;
        emcaVar4.b |= 8;
        emcaVar4.f = i2;
        emcn emcnVarA = th != null ? auls.a(th) : emcn.NO_FAILURE;
        embzVar.copyOnWrite();
        emca emcaVar5 = (emca) embzVar.instance;
        emcaVar5.e = emcnVarA.bs;
        emcaVar5.b |= 4;
        f((emca) embzVar.build());
        if (!apofVar.a() || th == null) {
            return;
        }
        d(th);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cmfo, java.lang.Object] */
    public final eiju a(final emek emekVar) {
        eiju eijuVarH = this.d.e.get().h().h(new ejvr() { // from class: aurc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((aumq) obj).j;
            }
        }, eoqg.a);
        ejvr ejvrVar = new ejvr() { // from class: aukv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str = (String) obj;
                emce emceVar = (emce) emekVar.toBuilder();
                emceVar.copyOnWrite();
                emek emekVar2 = (emek) emceVar.instance;
                str.getClass();
                emekVar2.b |= 128;
                emekVar2.j = str;
                boolean z = this.a.l.a;
                emceVar.copyOnWrite();
                emek emekVar3 = (emek) emceVar.instance;
                emekVar3.b |= 512;
                emekVar3.l = z;
                return (emek) emceVar.build();
            }
        };
        eosc eoscVar = this.e;
        return eijuVarH.h(ejvrVar, eoscVar).i(new eooz() { // from class: aukw
            /* JADX WARN: Type inference failed for: r1v2, types: [cmfo, java.lang.Object] */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final emek emekVar2 = (emek) obj;
                aukz aukzVar = this.a;
                return aukzVar.d.e.get().h().h(new ejvr() { // from class: aurl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        aumq aumqVar = (aumq) obj2;
                        cqce cqceVar = aurx.a;
                        if ((aumqVar.c & 256) == 0) {
                            return Optional.empty();
                        }
                        evvp evvpVar = aumqVar.N;
                        if (evvpVar == null) {
                            evvpVar = evvp.a;
                        }
                        return Optional.of(evvpVar);
                    }
                }, eoqg.a).h(new ejvr() { // from class: auku
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekrg ekrgVar = aukz.a;
                        final emek emekVar3 = emekVar2;
                        return (emek) ((Optional) obj2).map(new Function() { // from class: aukq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                ekrg ekrgVar2 = aukz.a;
                                emce emceVar = (emce) emekVar3.toBuilder();
                                long jA = evxc.a((evvp) obj3);
                                emceVar.copyOnWrite();
                                emek emekVar4 = (emek) emceVar.instance;
                                emekVar4.b |= 262144;
                                emekVar4.p = jA;
                                return (emek) emceVar.build();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(emekVar3);
                    }
                }, aukzVar.e);
            }
        }, eoscVar).i(new eooz() { // from class: aukx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final emek emekVar2 = (emek) obj;
                aukz aukzVar = this.a;
                return aukzVar.d.n().h(new ejvr() { // from class: aukn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekrg ekrgVar = aukz.a;
                        final emek emekVar3 = emekVar2;
                        Optional map = ((Optional) obj2).map(new Function() { // from class: auko
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                String str = (String) obj3;
                                ekrg ekrgVar2 = aukz.a;
                                emce emceVar = (emce) emekVar3.toBuilder();
                                emceVar.copyOnWrite();
                                emek emekVar4 = (emek) emceVar.instance;
                                str.getClass();
                                emekVar4.b |= 256;
                                emekVar4.k = str;
                                return emceVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        emekVar3.getClass();
                        return (emce) map.orElseGet(new Supplier() { // from class: aukp
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return (emce) emekVar3.toBuilder();
                            }
                        });
                    }
                }, aukzVar.e);
            }
        }, eoscVar);
    }

    public final ekgb b() {
        ecem.b();
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        try {
            aurx aurxVar = this.d;
            if (y(aurxVar.a())) {
                ekfwVar.h(emcg.BACKUP_AND_RESTORE);
            }
            if (y(aurxVar.b())) {
                ekfwVar.h(emcg.FI_MULTI_DEVICE);
            }
            return ekfwVar.g();
        } catch (evtj e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [cmfo, java.lang.Object] */
    public final emec c(emec emecVar) {
        evvp evvpVar;
        ecem.b();
        if (this.k.a()) {
            ekgp ekgpVar = c;
            if (ekgpVar.containsKey(emecVar)) {
                try {
                    aurx aurxVar = this.d;
                    ecem.b();
                    aumq aumqVar = (aumq) aurxVar.e.get().l();
                    apoy apoyVar = aurxVar.j;
                    apoyVar.a();
                    if (apoyVar.a()) {
                        evvpVar = aumqVar.I;
                        if (evvpVar == null) {
                            evvpVar = evvp.a;
                        }
                    } else {
                        apoyVar.a();
                        evvpVar = evxc.c;
                    }
                    if (!Objects.equals(evvpVar, evxc.c)) {
                        return (emec) ekgpVar.get(emecVar);
                    }
                } catch (evtj e) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/cloudstore/clearcutlogging/CmsClearcutLogger", "getInitialSyncStage", (char) 1362, "CmsClearcutLogger.java")).q("Failed to parse timestamp for delta sync. Do not convert sync stage in clearcut log.");
                }
            }
        }
        return emecVar;
    }

    public final void e(emec emecVar) {
        emcw emcwVar = (emcw) emcx.a.createBuilder();
        emec emecVarC = c(emecVar);
        emcwVar.copyOnWrite();
        emcx emcxVar = (emcx) emcwVar.instance;
        emcxVar.c = emecVarC.s;
        emcxVar.b |= 1;
        emcwVar.copyOnWrite();
        emcx emcxVar2 = (emcx) emcwVar.instance;
        emcxVar2.d = 3;
        emcxVar2.b |= 2;
        emcn emcnVar = emcn.ACCOUNT_NOT_LINKED;
        emcwVar.copyOnWrite();
        emcx emcxVar3 = (emcx) emcwVar.instance;
        emcxVar3.e = emcnVar.bs;
        emcxVar3.b |= 4;
        emcwVar.a(b());
        m((emcx) emcwVar.build());
    }

    public final void f(emca emcaVar) {
        emce emceVar = (emce) emek.a.createBuilder();
        emceVar.copyOnWrite();
        emek emekVar = (emek) emceVar.instance;
        emcaVar.getClass();
        emekVar.d = emcaVar;
        emekVar.b |= 2;
        r((emek) emceVar.build());
    }

    public final void g(emcd emcdVar, boolean z, int i, Throwable th) {
        h(false, emcdVar, z, i, th);
    }

    public final void h(boolean z, emcd emcdVar, boolean z2, int i, Throwable th) {
        if (z || ((Integer) b.e()).intValue() == i) {
            z(emcdVar, 4, th, i, true != z2 ? 3 : 2);
        }
    }

    public final void i(int i, Throwable th) {
        if (((Integer) b.e()).intValue() != i) {
            return;
        }
        apof apofVar = this.h;
        if (apofVar.a() && u(th)) {
            return;
        }
        z(emcd.SELF_PARTICIPANT_BACKUP, 4, th, i, 1);
        if (apofVar.a()) {
            d(th);
        }
    }

    public final void j(emcd emcdVar, boolean z, int i, Throwable th) {
        z(emcdVar, 6, th, i, true != z ? 3 : 2);
    }

    public final void k(emek emekVar, final aulr aulrVar, final boolean z) {
        eiju eijuVarH = a(emekVar).h(new ejvr() { // from class: aukr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                emce emceVar = (emce) obj;
                emcx emcxVar = ((emek) emceVar.instance).c;
                if (emcxVar == null) {
                    emcxVar = emcx.a;
                }
                aulr aulrVar2 = aulrVar;
                aukz aukzVar = this.a;
                emcw emcwVar = (emcw) emcxVar.toBuilder();
                emcu emcuVar = (emcu) emcv.a.createBuilder();
                emcuVar.copyOnWrite();
                emcv emcvVar = (emcv) emcuVar.instance;
                emcvVar.b |= 1;
                emcvVar.c = aulrVar2.a / 1000;
                emcuVar.copyOnWrite();
                emcv emcvVar2 = (emcv) emcuVar.instance;
                emcvVar2.b |= 8;
                emcvVar2.f = aulrVar2.b / 1000;
                emcuVar.copyOnWrite();
                emcv emcvVar3 = (emcv) emcuVar.instance;
                emcvVar3.b |= 2;
                emcvVar3.d = aulrVar2.c / 10;
                emcuVar.copyOnWrite();
                emcv emcvVar4 = (emcv) emcuVar.instance;
                emcvVar4.b |= 16;
                emcvVar4.g = aulrVar2.d / 10;
                emcuVar.copyOnWrite();
                emcv emcvVar5 = (emcv) emcuVar.instance;
                emcvVar5.b |= 4;
                emcvVar5.e = aulrVar2.e / 10;
                emcuVar.copyOnWrite();
                emcv emcvVar6 = (emcv) emcuVar.instance;
                emcvVar6.b |= 32;
                emcvVar6.h = aulrVar2.f / 10;
                if (aukzVar.g.a()) {
                    if (z) {
                        int i = aulrVar2.g;
                        emcuVar.copyOnWrite();
                        emcv emcvVar7 = (emcv) emcuVar.instance;
                        emcvVar7.b |= 32768;
                        emcvVar7.r = i;
                        int i2 = aulrVar2.h;
                        emcuVar.copyOnWrite();
                        emcv emcvVar8 = (emcv) emcuVar.instance;
                        emcvVar8.b |= 65536;
                        emcvVar8.s = i2;
                        int i3 = aulrVar2.k;
                        emcuVar.copyOnWrite();
                        emcv emcvVar9 = (emcv) emcuVar.instance;
                        emcvVar9.b |= 2048;
                        emcvVar9.n = i3;
                        int i4 = aulrVar2.l;
                        emcuVar.copyOnWrite();
                        emcv emcvVar10 = (emcv) emcuVar.instance;
                        emcvVar10.b |= 4096;
                        emcvVar10.o = i4;
                        long j = aulrVar2.o;
                        emcuVar.copyOnWrite();
                        emcv emcvVar11 = (emcv) emcuVar.instance;
                        emcvVar11.b |= 64;
                        emcvVar11.i = j;
                        long j2 = aulrVar2.p;
                        emcuVar.copyOnWrite();
                        emcv emcvVar12 = (emcv) emcuVar.instance;
                        emcvVar12.b |= 128;
                        emcvVar12.j = j2;
                        if (((eoth) ((aotr) aukzVar.i).a.b()).a("bugle.records_merged_message_count_in_initial_sync_database_profile")) {
                            long j3 = aulrVar2.q;
                            emcuVar.copyOnWrite();
                            emcv emcvVar13 = (emcv) emcuVar.instance;
                            emcvVar13.b |= 256;
                            emcvVar13.k = j3;
                        }
                    } else {
                        int i5 = aulrVar2.i;
                        emcuVar.copyOnWrite();
                        emcv emcvVar14 = (emcv) emcuVar.instance;
                        emcvVar14.b |= 131072;
                        emcvVar14.t = i5;
                        int i6 = aulrVar2.j;
                        emcuVar.copyOnWrite();
                        emcv emcvVar15 = (emcv) emcuVar.instance;
                        emcvVar15.b |= 262144;
                        emcvVar15.u = i6;
                        int i7 = aulrVar2.m;
                        emcuVar.copyOnWrite();
                        emcv emcvVar16 = (emcv) emcuVar.instance;
                        emcvVar16.b |= 8192;
                        emcvVar16.p = i7;
                        int i8 = aulrVar2.n;
                        emcuVar.copyOnWrite();
                        emcv emcvVar17 = (emcv) emcuVar.instance;
                        emcvVar17.b |= 16384;
                        emcvVar17.q = i8;
                        long j4 = aulrVar2.r;
                        emcuVar.copyOnWrite();
                        emcv emcvVar18 = (emcv) emcuVar.instance;
                        emcvVar18.b |= 512;
                        emcvVar18.l = j4;
                        long j5 = aulrVar2.s;
                        emcuVar.copyOnWrite();
                        emcv emcvVar19 = (emcv) emcuVar.instance;
                        emcvVar19.b |= 1024;
                        emcvVar19.m = j5;
                    }
                }
                emcv emcvVar20 = (emcv) emcuVar.build();
                emcwVar.copyOnWrite();
                emcx emcxVar2 = (emcx) emcwVar.instance;
                emcvVar20.getClass();
                emcxVar2.l = emcvVar20;
                emcxVar2.b |= 512;
                emcx emcxVar3 = (emcx) emcwVar.build();
                emceVar.copyOnWrite();
                emek emekVar2 = (emek) emceVar.instance;
                emcxVar3.getClass();
                emekVar2.c = emcxVar3;
                emekVar2.b |= 1;
                return emceVar;
            }
        }, this.f);
        auks auksVar = new auks();
        eosc eoscVar = this.e;
        auvh.i(eijuVarH.h(auksVar, eoscVar), new aukt(this), eoscVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r5, boolean r6, defpackage.cpyb r7, j$.util.Optional r8) {
        /*
            r4 = this;
            emcr r0 = defpackage.emcr.a
            evsf r0 = r0.createBuilder()
            emcq r0 = (defpackage.emcq) r0
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            emcr r1 = (defpackage.emcr) r1
            int r2 = r1.b
            r3 = 1
            r2 = r2 | r3
            r1.b = r2
            r1.c = r5
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r0.instance
            emcr r5 = (defpackage.emcr) r5
            int r1 = r5.b
            r1 = r1 | 2
            r5.b = r1
            r5.d = r6
            cpyb r5 = defpackage.cpyb.BACKUP_AND_RESTORE
            boolean r6 = r7.equals(r5)
            if (r6 == 0) goto L4d
            boolean r6 = r8.isPresent()
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r8.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r0.instance
            emcr r8 = (defpackage.emcr) r8
            int r1 = r8.b
            r1 = r1 | 4
            r8.b = r1
            r8.e = r6
        L4d:
            emcx r6 = defpackage.emcx.a
            evsf r6 = r6.createBuilder()
            emcw r6 = (defpackage.emcw) r6
            emec r8 = defpackage.emec.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS
            r6.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r6.instance
            emcx r1 = (defpackage.emcx) r1
            int r8 = r8.s
            r1.c = r8
            int r8 = r1.b
            r8 = r8 | r3
            r1.b = r8
            MessageType extends evsn<MessageType, BuilderType> r8 = r0.instance
            emcr r8 = (defpackage.emcr) r8
            boolean r8 = r8.d
            cpyb r1 = defpackage.cpyb.MULTI_DEVICE
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L7d
            MessageType extends evsn<MessageType, BuilderType> r5 = r0.instance
            emcr r5 = (defpackage.emcr) r5
            boolean r5 = r5.c
        L7b:
            r8 = r8 & r5
            goto L8a
        L7d:
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L8a
            MessageType extends evsn<MessageType, BuilderType> r5 = r0.instance
            emcr r5 = (defpackage.emcr) r5
            boolean r5 = r5.e
            goto L7b
        L8a:
            if (r3 == r8) goto L8e
            r5 = 6
            goto L8f
        L8e:
            r5 = 3
        L8f:
            r6.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r7 = r6.instance
            emcx r7 = (defpackage.emcx) r7
            int r5 = r5 + (-1)
            r7.d = r5
            int r5 = r7.b
            r5 = r5 | 2
            r7.b = r5
            emcn r5 = defpackage.emcn.NO_FAILURE
            r6.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r7 = r6.instance
            emcx r7 = (defpackage.emcx) r7
            int r5 = r5.bs
            r7.e = r5
            int r5 = r7.b
            r5 = r5 | 4
            r7.b = r5
            r6.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r6.instance
            emcx r5 = (defpackage.emcx) r5
            evsn r7 = r0.build()
            emcr r7 = (defpackage.emcr) r7
            r7.getClass()
            r5.k = r7
            int r7 = r5.b
            r7 = r7 | 256(0x100, float:3.59E-43)
            r5.b = r7
            ekgb r5 = r4.b()
            r6.a(r5)
            evsn r5 = r6.build()
            emcx r5 = (defpackage.emcx) r5
            r4.m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aukz.l(boolean, boolean, cpyb, j$.util.Optional):void");
    }

    public final void m(emcx emcxVar) {
        emce emceVar = (emce) emek.a.createBuilder();
        emceVar.copyOnWrite();
        emek emekVar = (emek) emceVar.instance;
        emcxVar.getClass();
        emekVar.c = emcxVar;
        emekVar.b |= 1;
        r((emek) emceVar.build());
    }

    public final void n(emec emecVar, int i, Throwable th) {
        if (i != ((Integer) b.e()).intValue()) {
            return;
        }
        apof apofVar = this.h;
        if (apofVar.a() && u(th)) {
            return;
        }
        emcw emcwVar = (emcw) emcx.a.createBuilder();
        emec emecVarC = c(emecVar);
        emcwVar.copyOnWrite();
        emcx emcxVar = (emcx) emcwVar.instance;
        emcxVar.c = emecVarC.s;
        emcxVar.b |= 1;
        emcwVar.copyOnWrite();
        emcx emcxVar2 = (emcx) emcwVar.instance;
        emcxVar2.d = 3;
        emcxVar2.b |= 2;
        emcn emcnVarA = auls.a(th);
        emcwVar.copyOnWrite();
        emcx emcxVar3 = (emcx) emcwVar.instance;
        emcxVar3.e = emcnVarA.bs;
        emcxVar3.b |= 4;
        emcwVar.a(b());
        m((emcx) emcwVar.build());
        if (apofVar.a()) {
            d(th);
        }
    }

    public final void o(emcz emczVar) {
        emce emceVar = (emce) emek.a.createBuilder();
        emceVar.copyOnWrite();
        emek emekVar = (emek) emceVar.instance;
        emekVar.q = emczVar;
        emekVar.b |= 524288;
        r((emek) emceVar.build());
    }

    public final void p(List list, long j, bmsp bmspVar) {
        if (b().isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageIdType messageIdType = (MessageIdType) it.next();
            emda emdaVar = (emda) emdc.a.createBuilder();
            long j2 = messageIdType.a;
            emdaVar.copyOnWrite();
            emdc emdcVar = (emdc) emdaVar.instance;
            int i = 1;
            emdcVar.b |= 1;
            emdcVar.c = j2;
            emdaVar.copyOnWrite();
            emdc emdcVar2 = (emdc) emdaVar.instance;
            emdcVar2.b |= 4;
            emdcVar2.d = j;
            switch (bmspVar.ordinal()) {
                case 0:
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 8;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 9;
                    break;
                case 10:
                    i = 11;
                    break;
                case 11:
                    i = 12;
                    break;
                case 12:
                    i = 13;
                    break;
                case 13:
                    i = 14;
                    break;
                case 14:
                    i = 15;
                    break;
                case 15:
                    i = 16;
                    break;
                case 16:
                    i = 17;
                    break;
                case 17:
                    i = 18;
                    break;
                case 18:
                    i = 19;
                    break;
                case 19:
                    i = 20;
                    break;
                default:
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(bmspVar))));
            }
            emdaVar.copyOnWrite();
            emdc emdcVar3 = (emdc) emdaVar.instance;
            emdcVar3.e = i - 1;
            emdcVar3.b = 8 | emdcVar3.b;
            emdc emdcVar4 = (emdc) emdaVar.build();
            emce emceVar = (emce) emek.a.createBuilder();
            emceVar.copyOnWrite();
            emek emekVar = (emek) emceVar.instance;
            emdcVar4.getClass();
            emekVar.n = emdcVar4;
            emekVar.b |= 4096;
            r((emek) emceVar.build());
        }
    }

    public final void q(emek emekVar) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MULTI_DEVICE_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emekVar.getClass();
        ellhVar2.ao = emekVar;
        ellhVar2.d |= 2048;
        elim elimVar = (elim) elin.a.createBuilder();
        elvg elvgVar = cqbe.a;
        elimVar.copyOnWrite();
        elin elinVar = (elin) elimVar.instance;
        elinVar.d = elvgVar.x;
        elinVar.b |= 64;
        ellgVar.copyOnWrite();
        ellh ellhVar3 = (ellh) ellgVar.instance;
        elin elinVar2 = (elin) elimVar.build();
        elinVar2.getClass();
        ellhVar3.k = elinVar2;
        ellhVar3.b |= 2;
        ((aill) this.n.b()).o(ellgVar);
    }

    public final void r(emek emekVar) {
        eiju eijuVarA = a(emekVar);
        auks auksVar = new auks();
        eosc eoscVar = this.e;
        auvh.i(eijuVarA.h(auksVar, eoscVar), new aukt(this), eoscVar);
    }

    public final void s(emdj emdjVar) {
        emce emceVar = (emce) emek.a.createBuilder();
        emceVar.copyOnWrite();
        emek emekVar = (emek) emceVar.instance;
        emdjVar.getClass();
        emekVar.e = emdjVar;
        emekVar.b |= 4;
        r((emek) emceVar.build());
    }

    public final void t(emec emecVar) {
        emcw emcwVar = (emcw) emcx.a.createBuilder();
        emec emecVarC = c(emecVar);
        emcwVar.copyOnWrite();
        emcx emcxVar = (emcx) emcwVar.instance;
        emcxVar.c = emecVarC.s;
        emcxVar.b |= 1;
        emcwVar.copyOnWrite();
        emcx emcxVar2 = (emcx) emcwVar.instance;
        emcxVar2.d = 1;
        emcxVar2.b |= 2;
        emcn emcnVar = emcn.NO_FAILURE;
        emcwVar.copyOnWrite();
        emcx emcxVar3 = (emcx) emcwVar.instance;
        emcxVar3.e = emcnVar.bs;
        emcxVar3.b |= 4;
        emcwVar.a(b());
        m((emcx) emcwVar.build());
    }

    public final void v(emdn emdnVar, evvp evvpVar, evvp evvpVar2, int i) {
        long jB = evwy.b(evxc.b(evvpVar, evvpVar2));
        emdk emdkVar = (emdk) emdo.a.createBuilder();
        emdkVar.copyOnWrite();
        emdo emdoVar = (emdo) emdkVar.instance;
        emdoVar.c = emdnVar.A;
        emdoVar.b |= 1;
        long jA = evxc.a(evvpVar);
        eltz eltzVar = (eltz) elua.a.createBuilder();
        eltzVar.copyOnWrite();
        elua eluaVar = (elua) eltzVar.instance;
        eluaVar.b |= 1;
        eluaVar.c = jA;
        eltzVar.copyOnWrite();
        elua eluaVar2 = (elua) eltzVar.instance;
        eluaVar2.b |= 2;
        eluaVar2.d = jB;
        elua eluaVar3 = (elua) eltzVar.build();
        emdkVar.copyOnWrite();
        emdo emdoVar2 = (emdo) emdkVar.instance;
        eluaVar3.getClass();
        emdoVar2.d = eluaVar3;
        emdoVar2.b |= 2;
        emdkVar.copyOnWrite();
        emdo emdoVar3 = (emdo) emdkVar.instance;
        emdoVar3.e = i - 1;
        emdoVar3.b |= 4;
        emdo emdoVar4 = (emdo) emdkVar.build();
        emce emceVar = (emce) emek.a.createBuilder();
        emceVar.copyOnWrite();
        emek emekVar = (emek) emceVar.instance;
        emdoVar4.getClass();
        emekVar.i = emdoVar4;
        emekVar.b |= 64;
        q((emek) emceVar.build());
    }

    public final void w(int i, int i2, Throwable th, int i3, String str) {
        apof apofVar = this.h;
        if (apofVar.a() && th != null && u(th)) {
            return;
        }
        emcn emcnVarA = auls.a(th);
        emdp emdpVar = (emdp) emdu.a.createBuilder();
        emdpVar.copyOnWrite();
        emdu emduVar = (emdu) emdpVar.instance;
        emduVar.e = i - 1;
        emduVar.b |= 1;
        emdpVar.copyOnWrite();
        emdu emduVar2 = (emdu) emdpVar.instance;
        emduVar2.f = 3;
        emduVar2.b |= 2;
        emdpVar.copyOnWrite();
        emdu emduVar3 = (emdu) emdpVar.instance;
        emduVar3.g = emcnVarA.bs;
        emduVar3.b |= 4;
        emdpVar.copyOnWrite();
        emdu emduVar4 = (emdu) emdpVar.instance;
        emduVar4.b |= 8;
        emduVar4.h = i2;
        if (i3 != 0) {
            emdq emdqVar = (emdq) emdr.a.createBuilder();
            emdqVar.copyOnWrite();
            emdr emdrVar = (emdr) emdqVar.instance;
            emdrVar.c = i3 - 1;
            emdrVar.b |= 1;
            emdr emdrVar2 = (emdr) emdqVar.build();
            emdpVar.copyOnWrite();
            emdu emduVar5 = (emdu) emdpVar.instance;
            emdrVar2.getClass();
            emduVar5.d = emdrVar2;
            emduVar5.c = 6;
        } else if (str != null) {
            emds emdsVar = (emds) emdt.a.createBuilder();
            emdsVar.copyOnWrite();
            emdt emdtVar = (emdt) emdsVar.instance;
            emdtVar.b |= 1;
            emdtVar.c = str;
            m.contains(emcnVarA);
            emdt emdtVar2 = (emdt) emdsVar.build();
            emdpVar.copyOnWrite();
            emdu emduVar6 = (emdu) emdpVar.instance;
            emdtVar2.getClass();
            emduVar6.d = emdtVar2;
            emduVar6.c = 5;
        }
        emce emceVar = (emce) emek.a.createBuilder();
        emdu emduVar7 = (emdu) emdpVar.build();
        emceVar.copyOnWrite();
        emek emekVar = (emek) emceVar.instance;
        emduVar7.getClass();
        emekVar.m = emduVar7;
        emekVar.b |= 2048;
        r((emek) emceVar.build());
        if (!apofVar.a() || th == null) {
            return;
        }
        d(th);
    }

    public final void x(int i) {
        emco emcoVar = (emco) emcp.a.createBuilder();
        emcoVar.copyOnWrite();
        emcp emcpVar = (emcp) emcoVar.instance;
        emcpVar.c = i - 1;
        emcpVar.b |= 1;
        emcoVar.copyOnWrite();
        emcp emcpVar2 = (emcp) emcoVar.instance;
        emcpVar2.d = 2;
        emcpVar2.b = 2 | emcpVar2.b;
        emcp emcpVar3 = (emcp) emcoVar.build();
        emce emceVar = (emce) emek.a.createBuilder();
        emceVar.copyOnWrite();
        emek emekVar = (emek) emceVar.instance;
        emcpVar3.getClass();
        emekVar.f = emcpVar3;
        emekVar.b |= 8;
        r((emek) emceVar.build());
    }
}
