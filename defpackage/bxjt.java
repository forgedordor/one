package defpackage;

import android.provider.ContactsContract;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxjt implements bxjn {
    private static final cqce a = cqce.g("BugleDataModel", "ParticipantFullRefresh");
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl");
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final fcsu d;
    private final fcsu e;
    private final bxko f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final Optional k;
    private final Optional l;
    private final aqcf m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;

    public bxjt(fcsu fcsuVar, fcsu fcsuVar2, bxko bxkoVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, Optional optional, Optional optional2, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, aqcf aqcfVar, fcsu fcsuVar11, fcsu fcsuVar12) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = bxkoVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.k = optional;
        this.l = optional2;
        this.n = fcsuVar7;
        this.o = fcsuVar8;
        this.p = fcsuVar9;
        this.q = fcsuVar10;
        this.m = aqcfVar;
        this.s = fcsuVar11;
        this.r = fcsuVar12;
    }

    private final void d() {
        ((bxkp) this.d.b()).a();
        bxko bxkoVar = this.f;
        bxkoVar.b.set(false);
        bxkoVar.d = null;
    }

    private final void e(int i) {
        dzub dzubVar;
        Set set;
        Consumer consumer;
        brvp brvpVarC;
        int iA;
        int i2;
        try {
            eieu eieuVarK = eiiy.k("ParticipantFullRefresh.refreshParticipants");
            try {
                ((axjg) this.n.b()).h();
                fcsu fcsuVar = this.q;
                Iterable$EL.forEach((Set) fcsuVar.b(), new Consumer() { // from class: bxjo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((bxkq) obj).c();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                try {
                    cqce cqceVar = a;
                    cqbd cqbdVarC = cqceVar.c();
                    cqbdVarC.I("Start participant refresh. refreshMode:");
                    int i3 = 1;
                    cqbdVarC.I(i != 1 ? "SELF_ONLY" : "FULL");
                    cqbdVarC.r();
                    fcsu fcsuVar2 = this.d;
                    if (((bxkp) fcsuVar2.b()).c()) {
                        avbw avbwVar = (avbw) this.o.b();
                        if (i == 1) {
                            dzub dzubVar2 = this.f.d;
                            ((ains) avbwVar.b.b()).e("Bugle.Contacts.Sync.ParticipantsRefresh.Start.Count", dzubVar2 != null ? 1 : 0);
                            d();
                            dzubVar = dzubVar2;
                        } else {
                            dzubVar = null;
                        }
                        final bxkp bxkpVar = (bxkp) fcsuVar2.b();
                        ((bbdl) bxkpVar.g.b()).i();
                        auvh.h(((aofc) bxkpVar.w.b()).a().b().h(new ejvr() { // from class: bxkh
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                final ekgb ekgbVar = (ekgb) obj;
                                final bxkp bxkpVar2 = bxkpVar;
                                bxkpVar2.h.d("ParticipantRefresh#refreshConversationsSelfIds", new Runnable() { // from class: bxjz
                                    /* JADX WARN: Removed duplicated region for block: B:30:0x015f A[LOOP:0: B:6:0x0073->B:30:0x015f, LOOP_END] */
                                    /* JADX WARN: Removed duplicated region for block: B:54:0x013c A[EDGE_INSN: B:54:0x013c->B:26:0x013c BREAK  A[LOOP:0: B:6:0x0073->B:30:0x015f], SYNTHETIC] */
                                    @Override // java.lang.Runnable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void run() {
                                        /*
                                            Method dump skipped, instructions count: 382
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxjz.run():void");
                                    }
                                });
                                return null;
                            }
                        }, bxkpVar.x));
                        bxkpVar.h.d("ParticipantRefresh#refreshDefaultCurrentSelfIds", new Runnable() { // from class: bxjy
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                ekrg ekrgVar = bxkp.a;
                                bsbo bsboVarE = ParticipantsTable.e();
                                bsboVarE.A("ParticipantRefresh#refreshDefaultCurrentSelfIds");
                                bsboVarE.h(new Function() { // from class: bxkf
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bsbx bsbxVar = (bsbx) obj;
                                        ekrg ekrgVar2 = bxkp.a;
                                        bsbxVar.v(-1);
                                        int iIntValue = ParticipantsTable.i().intValue();
                                        if (iIntValue < 2000) {
                                            dqru.x("sim_slot_id", iIntValue);
                                        }
                                        bsbxVar.ap(new dqty("participants.sim_slot_id", 7, -1));
                                        return bsbxVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                ekgb ekgbVarZ = bsboVarE.b().z();
                                if (ekgbVarZ.size() != 1) {
                                    ekrw ekrwVarJ = bxkp.a.j();
                                    ekrwVarJ.X(eksq.a, "BugleDataModel");
                                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantRefresh", "refreshDefaultCurrentSelfIds", 796, "ParticipantRefresh.java")).q("Default self participant not found");
                                    return;
                                }
                                final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ekgbVarZ.get(0);
                                bsbo bsboVarE2 = ParticipantsTable.e();
                                bsboVarE2.A("ParticipantRefresh#selfParticipantIdsSameSimSlot");
                                bsboVarE2.h(new Function() { // from class: bxkg
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bsbx bsbxVar = (bsbx) obj;
                                        ekrg ekrgVar2 = bxkp.a;
                                        bsbxVar.w(-1);
                                        bsbxVar.u(bindData.q());
                                        return bsbxVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                ekgb ekgbVarF = bsboVarE2.b().f();
                                if (((ekoe) ekgbVarF).c != 1) {
                                    ekrw ekrwVarJ2 = bxkp.a.j();
                                    ekrwVarJ2.X(eksq.a, "BugleDataModel");
                                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantRefresh", "refreshDefaultCurrentSelfIds", 811, "ParticipantRefresh.java")).q("Self participant with subId > -1 and SIM slot same as default self participant not found");
                                } else {
                                    String str = (String) ekgbVarF.get(0);
                                    String[] strArr = botm.a;
                                    bote boteVar = new bote();
                                    boteVar.ak();
                                    boteVar.n(str);
                                    boteVar.g(bindData.R());
                                }
                            }
                        });
                        ArrayList arrayList = new ArrayList();
                        bsbo bsboVarE = ParticipantsTable.e();
                        bsboVarE.A("refreshParticipantsInternal");
                        int i4 = 2;
                        if (i == 2) {
                            bsboVarE.h(new Function() { // from class: bxjq
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bsbx bsbxVar = (bsbx) obj;
                                    bsbxVar.w(-2);
                                    return bsbxVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        } else {
                            bsboVarE.s();
                        }
                        final ekgb ekgbVarZ = bsboVarE.b().z();
                        Iterator<E> it = ekgbVarZ.iterator();
                        int i5 = 0;
                        boolean zK = false;
                        while (it.hasNext()) {
                            try {
                                brvpVarC = ((ParticipantsTable.BindData) it.next()).C();
                                try {
                                    bxkp bxkpVar2 = (bxkp) fcsuVar2.b();
                                    eieu eieuVarK2 = eiiy.k("ParticipantRefresh.refreshParticipant");
                                    try {
                                        if (brvpVarC.F.a()) {
                                            cqbd cqbdVarC2 = bxkp.d.c();
                                            cqbdVarC2.I("Not overwriting data of vSms participant from contacts");
                                            cqbdVarC2.k(brvpVarC.f);
                                            cqbdVarC2.r();
                                            eieuVarK2.close();
                                            i2 = 0;
                                        } else {
                                            if (bbdl.l(brvpVarC)) {
                                                iA = ((bbdl) bxkpVar2.g.b()).a(brvpVarC);
                                                if (iA == i4) {
                                                    eieuVarK2.close();
                                                    i2 = 1;
                                                }
                                            } else {
                                                iA = 0;
                                            }
                                            i2 = (bxkpVar2.e(brvpVarC, true != bbdl.l(brvpVarC) ? 7 : 6) ? 1 : 0) | iA;
                                            eieuVarK2.close();
                                        }
                                        ParticipantsTable.BindData bindDataA = brvpVarC.a();
                                        if (ContactsContract.Contacts.isEnterpriseContactId(bindDataA.u())) {
                                            i5++;
                                        }
                                        if (i2 != 0) {
                                            zK |= bbdl.k(bindDataA);
                                            ((bxkp) this.d.b()).b(bindDataA);
                                            String str = brvpVarC.a;
                                            ((axjv) this.j.b()).b(str, bindDataA);
                                            arrayList.add(str);
                                        }
                                    } finally {
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (brvpVarC == null) {
                                        a.s("Failed to update participant=null", e);
                                    } else {
                                        cqbd cqbdVarE = a.e();
                                        cqbdVarE.I("Failed to update");
                                        cqbdVarE.f(brvpVarC.a);
                                        cqbdVarE.m(brvpVarC.d);
                                        cqbdVarE.k(brvpVarC.f);
                                        cqbdVarE.s(e);
                                    }
                                    i4 = 2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                brvpVarC = null;
                            }
                            i4 = 2;
                        }
                        if (i != i4) {
                            if (this.m.a()) {
                                this.l.ifPresent(new Consumer() { // from class: bxjr
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj) {
                                        ((csyy) ((fcsu) obj).b()).c(ekgbVarZ);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                        return Consumer$CC.$default$andThen(this, consumer2);
                                    }
                                });
                            } else {
                                this.k.ifPresent(new Consumer() { // from class: bxjs
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj) {
                                        ((csyk) ((fcsu) obj).b()).c(ekgbVarZ);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                        return Consumer$CC.$default$andThen(this, consumer2);
                                    }
                                });
                            }
                        }
                        cqbd cqbdVarC3 = a.c();
                        cqbdVarC3.I("Number of participants refreshed:");
                        cqbdVarC3.G(arrayList.size());
                        cqbdVarC3.r();
                        ((ains) this.r.b()).e("Bugle.Datamodel.ParticipantRefresh.WorkProfileSynced.Count", i5);
                        if (!arrayList.isEmpty()) {
                            ((bakt) this.e.b()).S(arrayList);
                        }
                        if (zK) {
                            fcsu fcsuVar3 = this.g;
                            ((bxlc) fcsuVar3.b()).b();
                            ((bxlc) fcsuVar3.b()).a();
                        }
                        ((ajfo) this.i.b()).b(new dzfh("Participants refreshed"));
                        if (i == 1) {
                            int size = ekgbVarZ.size();
                            int size2 = arrayList.size();
                            if (dzubVar != null) {
                                ((ajfo) avbwVar.a.b()).g(dzubVar, avbv.a);
                            }
                            ains ainsVar = (ains) avbwVar.b.b();
                            if (size > 0) {
                                ainsVar.e("Bugle.Contacts.Sync.ParticipantsRefresh.UpdateRatio.Count", (int) Math.ceil((size2 * 100.0d) / size));
                            }
                            if (size2 <= 0) {
                                i3 = 0;
                            }
                            ainsVar.e("Bugle.Contacts.Sync.ParticipantsRefresh.End.Count", i3);
                        }
                        set = (Set) this.q.b();
                        consumer = new Consumer() { // from class: bxjp
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                ((bxkq) obj).d();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                return Consumer$CC.$default$andThen(this, consumer2);
                            }
                        };
                    } else {
                        cqceVar.p("Skipping participant refresh because of permissions");
                        set = (Set) fcsuVar.b();
                        consumer = new Consumer() { // from class: bxjp
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                ((bxkq) obj).d();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                return Consumer$CC.$default$andThen(this, consumer2);
                            }
                        };
                    }
                    Iterable$EL.forEach(set, consumer);
                    eieuVarK.close();
                } catch (Throwable th) {
                    Iterable$EL.forEach((Set) this.q.b(), new Consumer() { // from class: bxjp
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((bxkq) obj).d();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    });
                    throw th;
                }
            } finally {
            }
        } finally {
            ((axjg) this.n.b()).g();
        }
    }

    @Override // defpackage.bxjn
    public final void a() {
        this.c.set(false);
        e(1);
    }

    @Override // defpackage.bxjn
    public final void b() {
        if (((Boolean) this.s.b()).booleanValue()) {
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "BugleRecipientSync");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl", "refreshParticipantsIfNeeded", 153, "ParticipantFullRefreshImpl.java")).q("Skipped full participant refresh because ContactRecipientIncrementalSync is enabled");
            if (((bxkp) this.d.b()).c()) {
                d();
                return;
            }
            return;
        }
        fcsu fcsuVar = this.d;
        if (((bxkp) fcsuVar.b()).c()) {
            ((bxkp) fcsuVar.b()).a();
            if (this.f.b.get() && this.c.compareAndSet(false, true)) {
                ekrw ekrwVarH2 = b.h();
                ekrwVarH2.X(eksq.a, "BugleRecipientSync");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl", "refreshParticipantsIfNeeded", 161, "ParticipantFullRefreshImpl.java")).q("Started full participant refresh");
                ((axsq) this.h.b()).a().x(301, 0L);
                return;
            }
        }
        ekrw ekrwVarH3 = b.h();
        ekrwVarH3.X(eksq.a, "BugleRecipientSync");
        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl", "refreshParticipantsIfNeeded", 166, "ParticipantFullRefreshImpl.java")).q("Skipped full participant refresh");
    }

    @Override // defpackage.bxjn
    public final void c() {
        e(2);
        if (((bxkp) this.d.b()).c()) {
            auvh.h(((awzo) this.p.b()).d());
        }
    }
}
