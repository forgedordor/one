package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byxd implements bykl {
    public final cpuc b;
    public final bzze c;
    public final dqsn d;
    public final fcsu e;
    public final cogw f;
    public final bzap g;
    private final apow i;
    private final aurx j;
    private final eosc k;
    private final eosc l;
    private final appc m;
    private final appa n;
    private static final cqce h = cqce.g("BugleCms", "CmsParticipantConsumer");
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer");

    public byxd(bzze bzzeVar, cpuc cpucVar, aurx aurxVar, apow apowVar, eosc eoscVar, eosc eoscVar2, dqsn dqsnVar, fcsu fcsuVar, cogw cogwVar, appc appcVar, bzap bzapVar, appa appaVar) {
        this.c = bzzeVar;
        this.b = cpucVar;
        this.i = apowVar;
        this.j = aurxVar;
        this.k = eoscVar;
        this.l = eoscVar2;
        this.d = dqsnVar;
        this.e = fcsuVar;
        this.f = cogwVar;
        this.m = appcVar;
        this.g = bzapVar;
        this.n = appaVar;
    }

    public static void h(ParticipantsTable.BindData bindData) {
        String strL = bindData.L();
        if (TextUtils.isEmpty(strL)) {
            throw new byxa();
        }
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("restoreCmsIdForDefaultSelfParticipant");
        bsbsVarF.U(new Function() { // from class: bywq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.v(-1);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbsVarF.g(strL);
        int iE = bsbsVarF.b().e();
        if (iE == 1) {
            cqbd cqbdVarC = h.c();
            cqbdVarC.I("Updated default self participant cms_id");
            cqbdVarC.A("Cms id", strL);
            cqbdVarC.r();
            return;
        }
        cqbd cqbdVarE = h.e();
        cqbdVarE.I("Failed to update default self participant cms_id");
        cqbdVarE.y("Number of updates", iE);
        cqbdVarE.r();
    }

    @Override // defpackage.bykl
    public final eiju a(final ekgb ekgbVar, Optional optional, boolean z) {
        if (ekgbVar.isEmpty()) {
            return eijx.e(ekoj.a);
        }
        final eiju eijuVarG = eijx.g(new Callable() { // from class: bywr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eieu eieuVarK;
                ekgp ekgpVar;
                ekgp ekgpVarB;
                boolean z2;
                bywr bywrVar = this;
                final ekgi ekgiVar = new ekgi();
                ekgi ekgiVar2 = new ekgi();
                final HashMap map = new HashMap();
                ekgi ekgiVar3 = new ekgi();
                ekgb ekgbVar2 = ekgbVar;
                int size = ekgbVar2.size();
                int i = 0;
                while (true) {
                    final byxd byxdVar = bywrVar.a;
                    if (i >= size) {
                        final ekgp ekgpVarB2 = ekgiVar2.b();
                        final ekgp ekgpVarB3 = ekgiVar3.b();
                        ekgp ekgpVarJ = ekgp.j(map);
                        ekgi ekgiVar4 = new ekgi();
                        if (ekgpVarJ.isEmpty()) {
                            ekgpVar = ekoj.a;
                        } else {
                            final ekhx ekhxVar = (ekhx) Collection.EL.stream(ekgpVarJ.keySet()).filter(new Predicate() { // from class: bzzf
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
                                    brzi[] brziVarArr = bzzm.a;
                                    return !TextUtils.isEmpty((String) obj);
                                }
                            }).collect(ekcv.b);
                            if (ekhxVar.isEmpty()) {
                                ekgpVar = ekoj.a;
                            } else {
                                eieuVarK = eiiy.k("CmsParticipantBugleMergeHandler#findDupByCmsIds");
                                try {
                                    bsbo bsboVarE = ParticipantsTable.e();
                                    bsboVarE.A("findDupParticipantsByCmsIds");
                                    bsboVarE.c(bzzm.a);
                                    bsboVarE.h(new Function() { // from class: bzzg
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bsbx bsbxVar = (bsbx) obj;
                                            brzi[] brziVarArr = bzzm.a;
                                            bsbxVar.e(ekhxVar);
                                            return bsbxVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    ekgpVar = (ekgp) Collection.EL.stream(bsboVarE.b().z()).filter(new Predicate() { // from class: bzzh
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
                                            brzi[] brziVarArr = bzzm.a;
                                            return ((ParticipantsTable.BindData) obj).L() != null;
                                        }
                                    }).collect(ekcv.a(new Function() { // from class: bzzi
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            brzi[] brziVarArr = bzzm.a;
                                            return ejwk.b(((ParticipantsTable.BindData) obj).L());
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }, new Function() { // from class: bzzj
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                                            brzi[] brziVarArr = bzzm.a;
                                            return bindData;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }));
                                    eieuVarK.close();
                                } finally {
                                }
                            }
                        }
                        ekgiVar4.g(ekgpVar);
                        ekgi ekgiVar5 = new ekgi();
                        ekqg ekqgVarListIterator = ekgpVarJ.entrySet().listIterator();
                        while (ekqgVarListIterator.hasNext()) {
                            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                            if (!ekgpVar.containsKey(entry.getKey())) {
                                ekgiVar5.j(entry);
                            }
                        }
                        ekgp ekgpVarB4 = ekgiVar5.b();
                        if (ekgpVarB4.keySet().isEmpty()) {
                            ekgpVarB = ekoj.a;
                        } else {
                            eieuVarK = eiiy.k("CmsParticipantBugleMergeHandler#findDupsByDestinations");
                            try {
                                HashMap map2 = new HashMap();
                                ArrayList arrayList = new ArrayList();
                                for (Map.Entry entry2 : ekgpVarB4.entrySet()) {
                                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) entry2.getValue();
                                    String strT = bindData.T();
                                    int iR = bindData.r();
                                    if (!TextUtils.isEmpty(strT)) {
                                        String[] strArr = ParticipantsTable.a;
                                        bsbx bsbxVar = new bsbx();
                                        bsbxVar.r(strT);
                                        bsbxVar.v(iR);
                                        arrayList.add(bsbxVar);
                                        map2.put(bzzm.b(bindData), (String) entry2.getKey());
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    ekgpVarB = ekoj.a;
                                } else {
                                    String[] strArr2 = ParticipantsTable.a;
                                    bsbx bsbxVar2 = new bsbx();
                                    bsbxVar2.aq((bsbx[]) arrayList.toArray(new bsbx[0]));
                                    bsbo bsboVarE2 = ParticipantsTable.e();
                                    bsboVarE2.A("findDupParticipantsByDestinations");
                                    bsboVarE2.c(bzzm.a);
                                    bsboVarE2.g(bsbxVar2);
                                    ekgb ekgbVarZ = bsboVarE2.b().z();
                                    ekgi ekgiVar6 = new ekgi();
                                    ekqh it = ekgbVarZ.iterator();
                                    while (it.hasNext()) {
                                        ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it.next();
                                        String str = (String) map2.get(bzzm.b(bindData2));
                                        if (!TextUtils.isEmpty(str)) {
                                            ekgiVar6.i(str, bindData2);
                                        }
                                    }
                                    ekgpVarB = ekgiVar6.b();
                                }
                                eieuVarK.close();
                            } finally {
                            }
                        }
                        ekgiVar4.g(ekgpVarB);
                        final ekgp ekgpVarB5 = ekgiVar4.b();
                        byxdVar.d.b(new ejxr() { // from class: bywm
                            @Override // defpackage.ejxr
                            public final Object get() throws Throwable {
                                eieu eieuVar;
                                eieu eieuVarK2 = eiiy.k("CmsParticipantConsumer#overwriteWithCmsParticipantList");
                                ekgp ekgpVar2 = ekgpVarB3;
                                try {
                                    ekqg ekqgVarListIterator2 = ekgpVarB5.entrySet().listIterator();
                                    while (true) {
                                        boolean zHasNext = ekqgVarListIterator2.hasNext();
                                        ekgi ekgiVar7 = ekgiVar;
                                        HashMap map3 = map;
                                        ekgp ekgpVar3 = ekgpVarB2;
                                        final byxd byxdVar2 = byxdVar;
                                        if (zHasNext) {
                                            Map.Entry entry3 = (Map.Entry) ekqgVarListIterator2.next();
                                            String str2 = (String) entry3.getKey();
                                            ParticipantsTable.BindData bindData3 = (ParticipantsTable.BindData) map3.get(str2);
                                            ParticipantsTable.BindData bindData4 = (ParticipantsTable.BindData) entry3.getValue();
                                            eqnl eqnlVar = (eqnl) ekgpVar3.get(str2);
                                            if (bindData3 == null || bindData4 == null) {
                                                ekrw ekrwVarJ = byxd.a.j();
                                                ekrwVarJ.X(eksq.a, "BugleCms");
                                                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "overwriteWithCmsParticipantList", 375, "CmsParticipantConsumer.java")).t("Skip overwrite due to data missing for cmsId:%s", str2);
                                                map3.remove(str2);
                                                if (eqnlVar != null) {
                                                    ekgiVar7.i(eqnlVar, new IllegalStateException("Missing data."));
                                                }
                                            } else {
                                                try {
                                                    byxdVar2.c.a(bindData3, bindData4);
                                                } catch (Throwable th) {
                                                    if (eqnlVar == null || !(th instanceof Exception)) {
                                                        throw th;
                                                    }
                                                    ekrw ekrwVarJ2 = byxd.a.j();
                                                    ekrwVarJ2.X(eksq.a, "BugleCms");
                                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(th)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "overwriteWithCmsParticipantList", 388, "CmsParticipantConsumer.java")).t("Failed to overwrite. %s", bindData4.R());
                                                    ekgiVar7.i(eqnlVar, th);
                                                }
                                                map3.remove(str2);
                                            }
                                        } else {
                                            eieuVarK2.close();
                                            eieu eieuVarK3 = eiiy.k("CmsParticipantConsumer#insertCmsParticipantList");
                                            try {
                                                for (final Map.Entry entry4 : map3.entrySet()) {
                                                    String str3 = (String) entry4.getKey();
                                                    final eqnl eqnlVar2 = (eqnl) ekgpVar3.get(str3);
                                                    final cpub cpubVar = (cpub) ekgpVar2.get(str3);
                                                    if (eqnlVar2 == null || cpubVar == null) {
                                                        eieuVar = eieuVarK3;
                                                        ekrw ekrwVarJ3 = byxd.a.j();
                                                        ekrwVarJ3.X(eksq.a, "BugleCms");
                                                        ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "insertCmsParticipantList", 413, "CmsParticipantConsumer.java")).t("Participant data missing for cmsId: %s", str3);
                                                    } else {
                                                        try {
                                                            eieuVar = eieuVarK3;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            eieuVar = eieuVarK3;
                                                        }
                                                        try {
                                                            byxdVar2.d.d("CmsParticipantConsumer#restoreCmsItemData", new Runnable() { // from class: bywp
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    byxdVar2.g(eqnlVar2, cpubVar, (ParticipantsTable.BindData) entry4.getValue());
                                                                }
                                                            });
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            try {
                                                                if (!(th instanceof Exception)) {
                                                                    throw th;
                                                                }
                                                                ekrw ekrwVarJ4 = byxd.a.j();
                                                                ekrwVarJ4.X(eksq.a, "BugleCms");
                                                                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ4).g(th)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "insertCmsParticipantList", 424, "CmsParticipantConsumer.java")).t("Failed to insert %s", str3);
                                                                ekgiVar7.i(eqnlVar2, th);
                                                                eieuVarK3 = eieuVar;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                Throwable th5 = th;
                                                                try {
                                                                    eieuVar.close();
                                                                    throw th5;
                                                                } catch (Throwable th6) {
                                                                    th5.addSuppressed(th6);
                                                                    throw th5;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    eieuVarK3 = eieuVar;
                                                }
                                                eieuVarK3.close();
                                                return null;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                eieuVar = eieuVarK3;
                                            }
                                        }
                                    }
                                    throw th;
                                } finally {
                                }
                            }
                        });
                        return ekgiVar.b();
                    }
                    eqnl eqnlVar = (eqnl) ekgbVar2.get(i);
                    cpug cpugVarA = byxdVar.b.a(eqnlVar);
                    ParticipantsTable.BindData bindDataB = cpugVarA.b();
                    if (cpugVarA.c && !TextUtils.isEmpty(bindDataB.L())) {
                        bzap bzapVar = byxdVar.g;
                        String strL = bindDataB.L();
                        strL.getClass();
                        bzapVar.g(strL);
                    }
                    try {
                        if (bbdl.k(bindDataB)) {
                            byxd.h(bindDataB);
                        } else {
                            String str2 = eqnlVar.c;
                            if (TextUtils.isEmpty(str2)) {
                                ekrw ekrwVarJ = byxd.a.j();
                                ekrwVarJ.X(eksq.a, "BugleCms");
                                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "fillUpParticipantMaps", 349, "CmsParticipantConsumer.java")).q("CMS participant does not have CMS Id.");
                                ekgiVar.i(eqnlVar, new byxa());
                            } else {
                                ekgiVar2.i(str2, eqnlVar);
                                map.put(str2, bindDataB);
                                ekgiVar3.i(str2, cpugVarA);
                            }
                        }
                    } finally {
                        if (z2) {
                            i++;
                            bywrVar = this;
                        }
                    }
                    i++;
                    bywrVar = this;
                }
            }
        }, this.k);
        eooz eoozVar = new eooz() { // from class: byws
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.e(ekgbVar.size() - ((ekgp) obj).size());
            }
        };
        eosc eoscVar = this.l;
        eiju eijuVarF = eijuVarG.i(eoozVar, eoscVar).i(new eooz() { // from class: bywt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eijx.e((ekgp) eork.q(eijuVarG));
            }
        }, eoscVar).f(Throwable.class, new eooz() { // from class: bywu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Throwable th = (Throwable) obj;
                if (!(th instanceof Exception)) {
                    return eijx.d(th);
                }
                ekgb ekgbVar2 = ekgbVar;
                ekrw ekrwVarJ = byxd.a.j();
                ekrwVarJ.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantConsumer", "restoreCmsItemDataList", (char) 249, "CmsParticipantConsumer.java")).q("Failed to restore batch.");
                return eijx.e((ekgp) Collection.EL.stream(ekgbVar2).collect(ekcv.a(Function$CC.identity(), new Function() { // from class: bywo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (Exception) th;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })));
            }
        }, eoscVar);
        return this.n.a() ? eijuVarF.i(new eooz() { // from class: bywv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ekgp ekgpVar = (ekgp) obj;
                return this.a.g.c().h(new ejvr() { // from class: bywn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return ekgpVar;
                    }
                }, eoqg.a);
            }
        }, eoqg.a) : eijuVarF;
    }

    @Override // defpackage.bykl
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }

    @Override // defpackage.bykl
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bykl
    public final /* bridge */ /* synthetic */ eiju d(Object obj) {
        return f((eqnl) obj, true);
    }

    public final eiju e(int i) {
        return (cpyl.a() && this.i.a() && !this.m.a()) ? this.j.v(i) : eijx.e(null);
    }

    public final eiju f(final eqnl eqnlVar, final boolean z) {
        eiju eijuVarI = eijx.g(new Callable() { // from class: bywx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Optional optionalOfNullable;
                final byxd byxdVar = this.a;
                cpuc cpucVar = byxdVar.b;
                final eqnl eqnlVar2 = eqnlVar;
                final cpug cpugVarA = cpucVar.a(eqnlVar2);
                final ParticipantsTable.BindData bindDataB = cpugVarA.b();
                if (cpugVarA.c && !TextUtils.isEmpty(bindDataB.L())) {
                    bzap bzapVar = byxdVar.g;
                    String strL = bindDataB.L();
                    strL.getClass();
                    bzapVar.g(strL);
                }
                if (bbdl.k(bindDataB)) {
                    byxd.h(bindDataB);
                    return null;
                }
                cogw cogwVar = byxdVar.f;
                bzze bzzeVar = byxdVar.c;
                long jA = cogwVar.a();
                String strL2 = bindDataB.L();
                if (TextUtils.isEmpty(strL2)) {
                    optionalOfNullable = Optional.empty();
                } else {
                    ParticipantsTable.BindData bindDataA = ParticipantsTable.a(strL2);
                    if (bindDataA != null) {
                        ((ains) ((bzzm) bzzeVar).b.b()).e("Bugle.Cms.Restore.Participant.Outcome", 3);
                    }
                    optionalOfNullable = Optional.ofNullable(bindDataA);
                }
                if (!optionalOfNullable.isPresent()) {
                    final String strT = bindDataB.T();
                    final int iR = bindDataB.r();
                    if (strT == null) {
                        optionalOfNullable = Optional.empty();
                    } else {
                        bsbo bsboVarE = ParticipantsTable.e();
                        bsboVarE.A("findDuplicationWithSameDestinationAndSubId");
                        bsboVarE.h(new Function() { // from class: bzzk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsbx bsbxVar = (bsbx) obj;
                                brzi[] brziVarArr = bzzm.a;
                                bsbxVar.r(strT);
                                bsbxVar.v(iR);
                                return bsbxVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brzj brzjVar = (brzj) bsboVarE.b().p();
                        try {
                            if (brzjVar.moveToFirst()) {
                                ((ains) ((bzzm) bzzeVar).b.b()).e("Bugle.Cms.Restore.Participant.Outcome", 4);
                                Optional optionalOf = Optional.of((ParticipantsTable.BindData) brzjVar.cQ());
                                brzjVar.close();
                                optionalOfNullable = optionalOf;
                            } else {
                                brzjVar.close();
                                optionalOfNullable = Optional.empty();
                            }
                        } catch (Throwable th) {
                            try {
                                brzjVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
                if (!optionalOfNullable.isPresent()) {
                    ((ains) byxdVar.e.b()).e("Bugle.Cms.Restore.Participant.Outcome", 5);
                    return byxdVar.d.c("CmsParticipantConsumer#restoreCmsItemData", new ejxr() { // from class: byww
                        @Override // defpackage.ejxr
                        public final Object get() {
                            byxdVar.g(eqnlVar2, cpugVarA, bindDataB);
                            return null;
                        }
                    });
                }
                bzzeVar.a(bindDataB, (ParticipantsTable.BindData) optionalOfNullable.get());
                ((ains) byxdVar.e.b()).g("Bugle.Cms.Restore.Participant.DuplicateSearchDuration", cogwVar.a() - jA);
                return null;
            }
        }, this.k).i(new eooz() { // from class: bywy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return z ? this.a.e(1) : eijx.e(null);
            }
        }, this.l);
        return this.n.a() ? eijuVarI.i(new eooz() { // from class: bywz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.g.c().h(new ejvr() { // from class: bywl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, eoqg.a);
            }
        }, eoqg.a) : eijuVarI;
    }

    public final void g(eqnl eqnlVar, cpub cpubVar, ParticipantsTable.BindData bindData) {
        String str = eqnlVar.c;
        try {
            long jLongValue = bindData.J().longValue();
            if (jLongValue < 0) {
                cqbd cqbdVarE = h.e();
                cqbdVarE.I("Insert participant failed");
                cqbdVarE.A("cms_id", str);
                cqbdVarE.r();
                throw new byxb();
            }
            bpts bptsVarA = cpubVar.a();
            if (cpubVar.c() && !TextUtils.isEmpty(bindData.L())) {
                bzap bzapVar = this.g;
                String strL = bindData.L();
                strL.getClass();
                bzapVar.g(strL);
            }
            if (bptsVarA.k() > 0) {
                bptv bptvVar = new bptv();
                BitSet bitSet = bptsVarA.cL;
                bptvVar.az = bitSet == null ? null : (BitSet) bitSet.clone();
                BitSet bitSet2 = bptvVar.az;
                if (bitSet2 == null || bitSet2.get(0)) {
                    bptsVarA.aA(0, "_id");
                    bptvVar.a = bptsVarA.a;
                }
                BitSet bitSet3 = bptvVar.az;
                if (bitSet3 == null || bitSet3.get(1)) {
                    bptsVarA.aA(1, "participant_id");
                    bptvVar.b = bptsVarA.b;
                }
                BitSet bitSet4 = bptvVar.az;
                if (bitSet4 == null || bitSet4.get(2)) {
                    bptvVar.c = bptsVarA.k();
                }
                bptvVar.c(jLongValue);
                long jLongValue2 = bptvVar.a().m().longValue();
                if (jLongValue2 < 0) {
                    cqbd cqbdVarB = h.b();
                    cqbdVarB.I("Insert linkPreviewParticipantData failed with return value");
                    cqbdVarB.H(jLongValue2);
                    cqbdVarB.r();
                }
            }
        } catch (Throwable th) {
            if ((aqbf.a() || cpyl.a()) && (th instanceof Error)) {
                throw th;
            }
            cqbd cqbdVarE2 = h.e();
            cqbdVarE2.I("Insert participant threw");
            cqbdVarE2.A("cms_id", str);
            cqbdVarE2.s(th);
            throw new byxc(th);
        }
    }
}
