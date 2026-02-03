package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpnk implements cpmi {
    public static final cqce a = cqce.g("BugleCms", "CmsBackupManagerImpl");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsBackupManagerImpl");
    public final byeq A;
    private final eosc B;
    private final Context C;
    public dqsy c;
    public final fcsu d;
    public final axlf e;
    public final dqsn f;
    public final fcsu g;
    public final fcsu h;
    public final apow i;
    public final ains j;
    public final aurx k;
    public final fcsu l;
    public final eosc m;
    public final aukz n;
    public final bzip o;
    public final cogw p;
    public final bzin q;
    public final caby r;
    public final bzvl s;
    public final axky t;
    public final autx u;
    public final fcsu v;
    public final fcsu w;
    public final egzh x;
    public final appi y;
    public final byya z;

    /* compiled from: PG */
    public interface a {
        cafc cv();

        cpzo fG();

        cpnx fv();
    }

    public cpnk(fcsu fcsuVar, byya byyaVar, axlf axlfVar, dqsn dqsnVar, byeq byeqVar, fcsu fcsuVar2, fcsu fcsuVar3, apow apowVar, ains ainsVar, aurx aurxVar, fcsu fcsuVar4, eosc eoscVar, eosc eoscVar2, Context context, aukz aukzVar, bzip bzipVar, bzin bzinVar, caby cabyVar, bzvl bzvlVar, axky axkyVar, autx autxVar, cogw cogwVar, fcsu fcsuVar5, fcsu fcsuVar6, egzh egzhVar, appi appiVar) {
        this.d = fcsuVar;
        this.z = byyaVar;
        this.e = axlfVar;
        this.f = dqsnVar;
        this.A = byeqVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = apowVar;
        this.j = ainsVar;
        this.k = aurxVar;
        this.l = fcsuVar4;
        this.m = eoscVar;
        this.B = eoscVar2;
        this.C = context;
        this.n = aukzVar;
        this.o = bzipVar;
        this.q = bzinVar;
        this.r = cabyVar;
        this.s = bzvlVar;
        this.t = axkyVar;
        this.u = autxVar;
        this.p = cogwVar;
        this.v = fcsuVar5;
        this.w = fcsuVar6;
        this.x = egzhVar;
        this.y = appiVar;
    }

    private final eiju j(final efwo efwoVar, int i, final int i2, final boolean z) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Disabling Multi Device feature");
        cqbdVarC.y("reason", i);
        cqbdVarC.r();
        final eiju eijuVarB = this.A.b("CmsBackupManagerImpl#disableCmsBackupForMultiDeviceInternal", new Runnable() { // from class: cpmv
            @Override // java.lang.Runnable
            public final void run() {
                final cpnk cpnkVar = this.a;
                aurx aurxVar = cpnkVar.k;
                aurxVar.Y(false);
                aurxVar.X(false);
                if (cpyl.a() && ((Boolean) ((cczi) cpxw.l.get()).e()).booleanValue()) {
                    cpnkVar.u.f(false);
                } else {
                    cpnkVar.u.e();
                }
                final int i3 = i2;
                final efwo efwoVar2 = efwoVar;
                final boolean z2 = z;
                aurxVar.F();
                aurxVar.P();
                fcsu fcsuVar = cpnkVar.v;
                ((cprj) fcsuVar.b()).g();
                cpnkVar.i();
                ((cprj) fcsuVar.b()).d();
                cpnkVar.f.d("CmsBackupManagerImpl#initiateOptOutFlow", new Runnable() { // from class: cpmn
                    @Override // java.lang.Runnable
                    public final void run() {
                        caei caeiVarB;
                        auml aumlVarB;
                        cpnk cpnkVar2 = cpnkVar;
                        try {
                            aumlVarB = cpnkVar2.k.b();
                        } catch (evtj e) {
                            cqbd cqbdVarE = cpnk.a.e();
                            cqbdVarE.I("Reading current feature status failed due to unrecoverable error, will proceed to log out user regardless of current state");
                            cqbdVarE.s(e);
                        }
                        if (aumlVarB.equals(auml.DISABLING)) {
                            return;
                        }
                        if (aumlVarB.equals(auml.DISABLED)) {
                            return;
                        }
                        int i4 = i3;
                        efwo efwoVar3 = efwoVar2;
                        cpnkVar2.k.ad(auml.DISABLING);
                        int iA = efwoVar3.a();
                        int i5 = i4 - 1;
                        if (i5 == 0) {
                            boolean z3 = z2;
                            ekfw ekfwVar = new ekfw();
                            ekfwVar.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, caeg.TACHYON_UNREGISTER, caeg.SET_SERVER_STATUS_OFF, caeg.CLEAR_INITIAL_SYNC_STATUS);
                            if (cpyl.a() && !z3) {
                                ekfwVar.h(caeg.CLEAR_FEATURE_TYPES);
                            }
                            if (z3) {
                                ekfwVar.h(caeg.RESET_BOX);
                            }
                            if (!((Boolean) ((cczi) cpxw.d.get()).e()).booleanValue() || !cpyl.a() || !z3) {
                                ekfwVar.h(caeg.CLEAR_PRIMARY_DEVICE_ID);
                            }
                            ekfwVar.h(caeg.COMPLETE_OPT_OUT_MD);
                            caeiVarB = caej.b(iA, ekfwVar.g());
                        } else if (i5 != 1) {
                            int i6 = ekgb.d;
                            ekfw ekfwVar2 = new ekfw();
                            ekfwVar2.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, caeg.COMPLETE_OPT_OUT_MD);
                            caeiVarB = caej.b(iA, ekfwVar2.g());
                        } else {
                            int i7 = ekgb.d;
                            ekfw ekfwVar3 = new ekfw();
                            ekfwVar3.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, caeg.TACHYON_UNREGISTER, caeg.COMPLETE_OPT_OUT_MD);
                            caeiVarB = caej.b(iA, ekfwVar3.g());
                        }
                        caei caeiVarG = cpnkVar2.g(caeiVarB);
                        caea caeaVar = (caea) cpnkVar2.l.b();
                        caxr caxrVar = new caxr();
                        caxrVar.b = caej.d(caeiVarG);
                        caeaVar.a(caeiVarG, caxrVar.a());
                        cpnkVar2.n.x(2);
                    }
                });
                aurxVar.E();
                if (cpnkVar.y.a()) {
                    aurxVar.O();
                }
                aurxVar.G();
                aurxVar.ag(false);
                aurxVar.I();
                byeq byeqVar = cpnkVar.A;
                byeqVar.a.g(new dqsm() { // from class: cpml
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        return eiiy.k("CRMI::notifyDataChanged4::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: cpmm
                    @Override // java.lang.Runnable
                    public final void run() {
                        cpnk cpnkVar2 = cpnkVar;
                        cpnkVar2.k.L();
                        if (cpyl.a() && ((Boolean) ((cczi) cpxw.l.get()).e()).booleanValue()) {
                            cpnkVar2.x.a(eijx.e(null), cpxx.a);
                            ekrw ekrwVarH = cpnk.b.h();
                            ekrwVarH.X(eksq.a, "BugleCms");
                            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBackupManagerImpl", "disableCmsBackupForMultiDeviceInternal", 628, "CmsBackupManagerImpl.java")).q("CmsBackupManagerImpl#disableCmsBackupForMultiDeviceInternal: Notify Bnr Settings Ui called.");
                        }
                    }
                });
            }
        });
        if (((Boolean) ((cczi) cpxw.m.get()).e()).booleanValue()) {
            eijuVarB = ((cprj) this.v.b()).a().i(new eooz() { // from class: cpmw
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return eijuVarB;
                }
            }, this.B);
        }
        eika.l(eijuVarB, new cpnj(this, i), this.m);
        return eijuVarB;
    }

    @Override // defpackage.cpmi
    public final eiju a(final efwo efwoVar, final cpyb cpybVar) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Start initial backup for sooner path");
        cqbdVarC.r();
        return this.e.b(efwoVar.a()).i(new eooz() { // from class: cpms
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cpnk cpnkVar = this.a;
                final efwo efwoVar2 = efwoVar;
                final cpyb cpybVar2 = cpybVar;
                return cpnkVar.A.b("CmsBackupManagerImpl#enableInitialBackup", new Runnable() { // from class: cpnb
                    /* JADX WARN: Removed duplicated region for block: B:20:0x01bb  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x01cb  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x01fa  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0249  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x0299  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x02c3  */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x02dd  */
                    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r0v46, types: [cmfo, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v56, types: [cmfo, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r12v8, types: [cmfo, java.lang.Object] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 753
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpnb.run():void");
                    }
                });
            }
        }, this.B).i(new eooz() { // from class: cpmt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                int iA = efwoVar.a();
                bzhx bzhxVarA = bzhx.d().a();
                int i = ekgb.d;
                final cpnk cpnkVar = this.a;
                return cpnkVar.o.a(iA, bzhxVarA, ekoe.a, Optional.empty()).h(new ejvr() { // from class: cpmj
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        final ekgb ekgbVar = (ekgb) obj2;
                        final cpnk cpnkVar2 = cpnkVar;
                        cpnkVar2.f.d("CmsBackupManagerImpl#queueBatchWorkItems", new Runnable() { // from class: cpnh
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                ekgb ekgbVar2 = ekgbVar;
                                int size = ekgbVar2.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    cpnk cpnkVar3 = cpnkVar2;
                                    bzhn bzhnVar = (bzhn) ekgbVar2.get(i2);
                                    ((cazj) cpnkVar3.q.a.b()).a(cbcu.g("cms_batch_backup", bzhnVar.a(), bzhnVar.b()));
                                }
                            }
                        });
                        return null;
                    }
                }, cpnkVar.m);
            }
        }, this.m);
    }

    @Override // defpackage.cpmi
    public final void b() {
        ecem.b();
        a.p("Enabling incremental backup...");
        this.f.d("CmsBackupManagerImpl#enableIncrementalBackup", new Runnable() { // from class: cpmu
            @Override // java.lang.Runnable
            public final void run() {
                cpnk cpnkVar = this.a;
                ((cprj) cpnkVar.v.b()).g();
                if (cpnkVar.c == null) {
                    cpnkVar.c = (dqsy) cpnkVar.d.b();
                }
                dqsy dqsyVar = cpnkVar.c;
                try {
                    byya byyaVar = cpnkVar.z;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((Set) byyaVar.a.b()).iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(((bzaf) it.next()).a());
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        dqsyVar.v((String) it2.next());
                    }
                    cpnk.a.q("Created triggers");
                } catch (evtj e) {
                    throw new IllegalStateException("Could not build CMS Backup triggers", e);
                }
            }
        });
    }

    @Override // defpackage.cpmi
    public final eiju c(efwo efwoVar, int i) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Disabling Backup & Restore feature");
        cqbdVarC.r();
        return h(efwoVar, i, false);
    }

    @Override // defpackage.cpmi
    public final eiju d(efwo efwoVar, int i, int i2) {
        return j(efwoVar, i, i2, false);
    }

    @Override // defpackage.cpmi
    public final eiju e(final efwo efwoVar) {
        return ((a) ehlh.a(this.C, a.class, efwoVar)).fv().a().h(new ejvr() { // from class: cpnf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cpnk cpnkVar = this.a;
                cpnkVar.t.c(efwoVar);
                cpnkVar.k.Q(auml.ENABLING);
                return null;
            }
        }, this.m).i(new eooz() { // from class: cpng
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cqbd cqbdVarC = cpnk.a.c();
                cqbdVarC.I("Disabling and deleting Backup & Restore feature");
                cqbdVarC.r();
                return this.a.h(efwoVar, 1, true);
            }
        }, this.B);
    }

    @Override // defpackage.cpmi
    public final eiju f(efwo efwoVar) {
        return j(efwoVar, 4, 1, true);
    }

    public final caei g(caei caeiVar) {
        caec caecVar = (caec) caeiVar.toBuilder();
        evvp evvpVarC = evxc.c(this.p.f().toEpochMilli());
        caecVar.copyOnWrite();
        caei caeiVar2 = (caei) caecVar.instance;
        evvpVarC.getClass();
        caeiVar2.i = evvpVarC;
        caeiVar2.c |= 16;
        return (caei) caecVar.build();
    }

    public final eiju h(final efwo efwoVar, final int i, final boolean z) {
        a aVar = (a) ehlh.a(this.C, a.class, efwoVar);
        final cpzo cpzoVarFG = aVar.fG();
        final cafc cafcVarCv = aVar.cv();
        final eiju eijuVarB = this.A.b("CmsBackupManagerImpl#disableCmsBackupFeature", new Runnable() { // from class: cpmx
            @Override // java.lang.Runnable
            public final void run() throws cpzl {
                boolean z2;
                caei caeiVarA;
                final cpnk cpnkVar = this.a;
                ((cprj) cpnkVar.v.b()).g();
                cpnkVar.i();
                try {
                    int iA = cpzoVarFG.a(5);
                    if (iA == 3) {
                        z2 = false;
                    } else {
                        if (iA != 4) {
                            throw new cpzl(a.g(iA, "Unrecognized opt-out Bnr command: "));
                        }
                        z2 = true;
                    }
                    int i2 = i;
                    efwo efwoVar2 = efwoVar;
                    boolean z3 = z;
                    int iA2 = efwoVar2.a();
                    int i3 = i2 - 1;
                    if (z2) {
                        if (i3 == 0) {
                            ekfw ekfwVar = new ekfw();
                            ekfwVar.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, caeg.TACHYON_UNREGISTER, caeg.SET_SERVER_STATUS_OFF, caeg.CLEAR_INITIAL_SYNC_STATUS);
                            if (cpyl.a() && !z3) {
                                ekfwVar.h(caeg.CLEAR_FEATURE_TYPES);
                            }
                            if (z3) {
                                ekfwVar.h(caeg.RESET_BOX);
                            }
                            if (!((Boolean) ((cczi) cpxw.d.get()).e()).booleanValue() || !cpyl.a() || !z3) {
                                ekfwVar.h(caeg.CLEAR_PRIMARY_DEVICE_ID);
                            }
                            ekfwVar.i(caeg.COMPLETE_DOWNGRADE_MD_TO_BNR, caeg.COMPLETE_OPT_OUT_BNR);
                            caeiVarA = caej.a(iA2, ekfwVar.g(), caee.BNR_AND_MD_OPT_OUT);
                        } else if (i3 == 1) {
                            int i4 = ekgb.d;
                            ekfw ekfwVar2 = new ekfw();
                            ekfwVar2.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, caeg.TACHYON_UNREGISTER, caeg.COMPLETE_DOWNGRADE_MD_TO_BNR, caeg.COMPLETE_OPT_OUT_BNR);
                            caeiVarA = caej.a(iA2, ekfwVar2.g(), caee.BNR_AND_MD_OPT_OUT);
                        } else {
                            if (i3 != 2) {
                                throw new UnsupportedOperationException("BnrOptOutSynclet should not be used to opt out of B&R and Multi-Device together.");
                            }
                            int i5 = ekgb.d;
                            ekfw ekfwVar3 = new ekfw();
                            ekfwVar3.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, caeg.COMPLETE_DOWNGRADE_MD_TO_BNR, caeg.COMPLETE_OPT_OUT_BNR);
                            caeiVarA = caej.a(iA2, ekfwVar3.g(), caee.BNR_AND_MD_OPT_OUT);
                        }
                    } else if (i3 == 0) {
                        ekfw ekfwVar4 = new ekfw();
                        ekfwVar4.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, caeg.TACHYON_UNREGISTER, caeg.CLEAR_INITIAL_SYNC_STATUS);
                        if (cpyl.a() && !z3) {
                            ekfwVar4.h(caeg.CLEAR_FEATURE_TYPES);
                        }
                        if (z3) {
                            ekfwVar4.h(caeg.RESET_BOX);
                        }
                        if (!((Boolean) ((cczi) cpxw.d.get()).e()).booleanValue() || !cpyl.a() || !z3) {
                            ekfwVar4.h(caeg.CLEAR_PRIMARY_DEVICE_ID);
                        }
                        ekfwVar4.h(caeg.COMPLETE_OPT_OUT_BNR);
                        caeiVarA = caej.a(iA2, ekfwVar4.g(), caee.BNR_OPT_OUT);
                    } else if (i3 == 1) {
                        int i6 = ekgb.d;
                        ekfw ekfwVar5 = new ekfw();
                        ekfwVar5.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, caeg.TACHYON_UNREGISTER, caeg.COMPLETE_OPT_OUT_BNR);
                        caeiVarA = caej.a(iA2, ekfwVar5.g(), caee.BNR_OPT_OUT);
                    } else if (i3 != 2) {
                        ekfw ekfwVar6 = new ekfw();
                        ekfwVar6.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, caeg.TACHYON_UNREGISTER, caeg.CLEAR_INITIAL_SYNC_STATUS, caeg.CLEAR_FEATURE_TYPES, caeg.CLEAR_PRIMARY_DEVICE_ID, caeg.COMPLETE_OPT_OUT_BNR);
                        caeiVarA = caej.a(iA2, ekfwVar6.g(), caee.BNR_OPT_OUT);
                    } else {
                        int i7 = ekgb.d;
                        ekfw ekfwVar7 = new ekfw();
                        ekfwVar7.i(caeg.CANCEL_CMS_WORK_MANAGER_WORK, caeg.COMPLETE_OPT_OUT_BNR);
                        caeiVarA = caej.a(iA2, ekfwVar7.g(), caee.BNR_OPT_OUT);
                    }
                    caei caeiVarG = cpnkVar.g(caeiVarA);
                    caea caeaVar = (caea) cpnkVar.l.b();
                    caxr caxrVar = new caxr();
                    caxrVar.b = caej.d(caeiVarG);
                    caeaVar.a(caeiVarG, caxrVar.a());
                    cpnkVar.n.x(2);
                    cpnkVar.A.a.g(new dqsm() { // from class: cpnc
                        @Override // defpackage.dqsm
                        public final eieu a() {
                            return eiiy.k("CRMI::notifyDataChanged3::runAfterCommit");
                        }
                    }, "CmsBackupManagerImpl#disableCmsBackupFeature", new Runnable() { // from class: cpnd
                        @Override // java.lang.Runnable
                        public final void run() {
                            cpnk cpnkVar2 = cpnkVar;
                            cpnkVar2.k.L();
                            if (cpyl.a() && ((Boolean) ((cczi) cpxw.l.get()).e()).booleanValue()) {
                                cpnkVar2.x.a(eijx.e(null), cpxx.a);
                                ekrw ekrwVarH = cpnk.b.h();
                                ekrwVarH.X(eksq.a, "BugleCms");
                                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBackupManagerImpl", "disableCmsBackupFeatureInternal", 730, "CmsBackupManagerImpl.java")).q("CmsBackupManagerImpl#disableCmsBackupFeatureInternal: Notify Bnr Settings Ui called.");
                            }
                        }
                    });
                } catch (cpzl e) {
                    throw new IllegalStateException(e);
                }
            }
        });
        if (((Boolean) ((cczi) cpxw.m.get()).e()).booleanValue()) {
            eijuVarB = ((cprj) this.v.b()).a().i(new eooz() { // from class: cpmy
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return eijuVarB;
                }
            }, this.B);
        }
        return eijuVarB.f(Exception.class, new eooz() { // from class: cpmz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final caee caeeVar = caee.BNR_AND_MD_OPT_OUT;
                cpnk.a.p("Starting feature overlap error opt out for opt-out flow: ".concat(String.valueOf(String.valueOf(caeeVar))));
                final cafc cafcVar = cafcVarCv;
                final cpnk cpnkVar = this.a;
                return cpnkVar.e.a().i(new eooz() { // from class: cpni
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        final cpnk cpnkVar2 = cpnkVar;
                        if (!zBooleanValue) {
                            cpnk.a.p("No linked account, clearing local CMS states only.");
                            return ((caqv) cpnkVar2.w.b()).a();
                        }
                        cafc cafcVar2 = cafcVar;
                        caee caeeVar2 = caeeVar;
                        caec caecVar = (caec) caei.b.createBuilder();
                        caecVar.copyOnWrite();
                        caei caeiVar = (caei) caecVar.instance;
                        caeiVar.h = caeeVar2.e;
                        caeiVar.c |= 8;
                        return cafcVar2.a(0, (caei) caecVar.build()).i(new eooz() { // from class: cpne
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                return ((caqv) cpnkVar2.w.b()).a();
                            }
                        }, cpnkVar2.m);
                    }
                }, cpnkVar.m).h(new ejvr() { // from class: cpmk
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, eoqg.a);
            }
        }, this.m);
    }

    public final void i() {
        ((cprj) this.v.b()).f();
    }
}
