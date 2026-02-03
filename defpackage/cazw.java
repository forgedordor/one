package defpackage;

import android.content.IntentFilter;
import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cazw implements cazj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueBatchingImpl");
    public final cbcz b;
    public final cogw c;
    public final cbmx d;
    private final fcsu e;
    private final dqsn f;
    private final fdjx g;
    private final fdjx h;
    private final eosc i;
    private final cbay j;
    private final Optional k;
    private final cbfv l;
    private final eygg m;
    private final aqmp n;

    public cazw(fcsu fcsuVar, dqsn dqsnVar, fdjx fdjxVar, fdjx fdjxVar2, eosc eoscVar, cbcz cbczVar, cogw cogwVar, cbay cbayVar, Optional optional, cbmx cbmxVar, cbfv cbfvVar, eygg eyggVar, aqmp aqmpVar) {
        fcsuVar.getClass();
        dqsnVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        eoscVar.getClass();
        cbczVar.getClass();
        cogwVar.getClass();
        cbmxVar.getClass();
        cbfvVar.getClass();
        eyggVar.getClass();
        this.e = fcsuVar;
        this.f = dqsnVar;
        this.g = fdjxVar;
        this.h = fdjxVar2;
        this.i = eoscVar;
        this.b = cbczVar;
        this.c = cogwVar;
        this.j = cbayVar;
        this.k = optional;
        this.d = cbmxVar;
        this.l = cbfvVar;
        this.m = eyggVar;
        this.n = aqmpVar;
        if (((cqky) cbayVar.f.b()).a()) {
            kxj.h(cbayVar.b, new cbax(cbayVar), new IntentFilter("messaging.workqueue.WorkQueueDebugger"), "android.permission.DUMP");
        }
    }

    @Override // defpackage.cazj
    public final cazi a(cbcu cbcuVar) throws IOException {
        cbcuVar.getClass();
        eieu eieuVarH = eiiy.h("WorkQueueBatchingImpl#queueWorkItem");
        try {
            ekgb ekgbVarR = ekgb.r(cbcuVar);
            ekgbVarR.getClass();
            Object obj = d(ekgbVarR).get(cbcuVar);
            obj.getClass();
            cazi caziVar = (cazi) obj;
            fczl.a(eieuVarH, null);
            return caziVar;
        } finally {
        }
    }

    @Override // defpackage.cazj
    public final eiju b(cbcu cbcuVar) {
        return this.n.a() ? auvw.c(this.h, fcyi.a, fdjz.a, new cazu(this, cbcuVar, null)) : auvw.c(this.g, fcyi.a, fdjz.a, new cazv(this, cbcuVar, null));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [evuh, java.lang.Object] */
    @Override // defpackage.cazj
    public final ekgb c(String str) {
        cbai cbaiVar = (cbai) this.m.b();
        ekgb<cbdg> ekgbVarB = cbaiVar.b(str, true);
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarB, 10));
        for (cbdg cbdgVar : ekgbVarB) {
            ?? H = cbaiVar.c.c(str).d().h(cbdgVar.t());
            H.getClass();
            arrayList.add(new caxt(H, cbdgVar.o(), cbdgVar.p()));
        }
        return ekfv.a(arrayList);
    }

    @Override // defpackage.cazj
    public final ekgp d(ekgb ekgbVar) throws IOException {
        int i;
        Object next;
        ekgbVar.getClass();
        eieu eieuVarH = eiiy.h("WorkQueueBatchingImpl#queueWorkItems");
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : ekgbVar) {
                cbcu cbcuVar = (cbcu) obj;
                cbcuVar.getClass();
                Optional optional = this.k;
                if (!optional.isEmpty()) {
                    Object obj2 = optional.get();
                    String strD = cbcuVar.d();
                    byte[] byteArray = cbcuVar.c().toByteArray();
                    cazg cazgVarB = ((cbaz) ((cbct) obj2).c.b()).b(strD);
                    if (cazgVarB == null) {
                        ekrw ekrwVarJ = cbct.a.j();
                        ekrwVarJ.X(eksq.a, "BugleWorkQueue");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 71, "WorkQueuePreflightImpl.java")).t("no handler found for type %s", strD);
                        throw new cboh("no handler found for type ".concat(strD));
                    }
                    if (strD.contains("-")) {
                        ekrw ekrwVarJ2 = cbct.a.j();
                        ekrwVarJ2.X(eksq.a, "BugleWorkQueue");
                        ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 76, "WorkQueuePreflightImpl.java")).t("key cannot contain the character - %s", strD);
                        throw new cboi("key cannot contain the character - ".concat(strD));
                    }
                    try {
                        int length = byteArray.length;
                        cczi ccziVar = cbct.b;
                        if (length > ((Integer) ccziVar.e()).intValue()) {
                            ekrw ekrwVarI = cbct.a.i();
                            ekrwVarI.X(eksq.a, "BugleWorkQueue");
                            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 82, "WorkQueuePreflightImpl.java")).w("protobuf too big %d vs %d", length, ccziVar.e());
                            throw new cbol("protobuf too big " + length + " vs " + String.valueOf(ccziVar.e()));
                        }
                        if (!cbcuVar.c().equals(cazgVarB.d().h(byteArray))) {
                            ekrw ekrwVarJ3 = cbct.a.j();
                            ekrwVarJ3.X(eksq.a, "BugleWorkQueue");
                            ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 88, "WorkQueuePreflightImpl.java")).q("failed equality reparsing protobuf (wrong protobuf type?)");
                            throw new cbok();
                        }
                        if (!cazgVarB.i(byteArray)) {
                            ekrw ekrwVarG = cbct.a.g();
                            ekrwVarG.X(eksq.a, "BugleWorkQueue");
                            ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "check", 58, "WorkQueuePreflightImpl.java")).t("preflightRaw for %s returned false", cbcuVar.d());
                            arrayList2.add(obj);
                        }
                    } catch (evtj e) {
                        ekrw ekrwVarJ4 = cbct.a.j();
                        ekrwVarJ4.X(eksq.a, "BugleWorkQueue");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ4).g(e)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", ']', "WorkQueuePreflightImpl.java")).q("got InvalidProtocolBufferException re-parsing protobuf (wrong protobuf type?)");
                        throw new cboj(e);
                    }
                }
                arrayList.add(obj);
            }
            fcti fctiVar = new fcti(arrayList, arrayList2);
            List list = (List) fctiVar.a;
            List list2 = (List) fctiVar.b;
            int i2 = 10;
            LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list2, 10)), 16));
            for (Object obj3 : list2) {
                linkedHashMap.put(obj3, cazr.a());
            }
            if (list.isEmpty()) {
                ekgp ekgpVarE = ekfv.e(linkedHashMap);
                fczl.a(eieuVarH, null);
                return ekgpVarE;
            }
            cbaz cbazVar = (cbaz) this.e.b();
            ArrayList arrayList3 = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((cbcu) it.next()).d());
            }
            Set<String> setAv = fcva.av(arrayList3);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(setAv, 10)), 16));
            for (String str : setAv) {
                fcti fctiVar2 = new fcti(str, cbazVar.c(str).f());
                linkedHashMap2.put(fctiVar2.a, fctiVar2.b);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj4 : list) {
                cbcu cbcuVar2 = (cbcu) obj4;
                String strD2 = (String) linkedHashMap2.get(cbcuVar2.d());
                String str2 = ((caxs) cbcuVar2.a()).a;
                if (TextUtils.isEmpty(strD2) || !TextUtils.isEmpty(str2)) {
                    if (strD2 == null) {
                        strD2 = cbcuVar2.d();
                    }
                    strD2 = TextUtils.isEmpty(str2) ? strD2.concat("-") : a.q(str2, strD2, "-");
                }
                Object arrayList4 = linkedHashMap3.get(strD2);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap3.put(strD2, arrayList4);
                }
                ((List) arrayList4).add(obj4);
            }
            ArrayList arrayList5 = new ArrayList(linkedHashMap3.size());
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                final String str3 = (String) entry.getKey();
                final List list3 = (List) entry.getValue();
                str3.getClass();
                Optional optional2 = this.k;
                final fdap fdapVar = new fdap() { // from class: cazl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        cbcs cbcsVar = (cbcs) obj5;
                        cbcsVar.getClass();
                        cbcsVar.a();
                        return fctx.a;
                    }
                };
                optional2.ifPresent(new Consumer() { // from class: cazm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj5) {
                        fdapVar.invoke(obj5);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : list3) {
                    if (((caxs) ((cbcu) obj5).a()).b != null) {
                        arrayList6.add(obj5);
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Object obj6 : arrayList6) {
                    String str4 = ((caxs) ((cbcu) obj6).a()).b;
                    str4.getClass();
                    Object arrayList7 = linkedHashMap4.get(str4);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap4.put(str4, arrayList7);
                    }
                    ((List) arrayList7).add(obj6);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(fcwa.a(linkedHashMap4.size()));
                Iterator it2 = linkedHashMap4.entrySet().iterator();
                while (true) {
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    linkedHashMap5.put(entry2.getKey(), (cbcu) ((List) entry2.getValue()).get(0));
                }
                Collection<List> collectionValues = linkedHashMap4.values();
                ArrayList arrayList8 = new ArrayList();
                for (List list4 : collectionValues) {
                    List listAc = fcva.ac(list4, 1);
                    ArrayList arrayList9 = new ArrayList(fcva.p(listAc, i2));
                    Iterator it3 = listAc.iterator();
                    while (it3.hasNext()) {
                        arrayList9.add(new fcti((cbcu) it3.next(), list4.get(i)));
                        i = 0;
                    }
                    fcva.y(arrayList8, arrayList9);
                    i2 = 10;
                    i = 0;
                }
                cazq cazqVar = new cazq(linkedHashMap5, fcwa.k(arrayList8));
                final Map map = cazqVar.a;
                final Map map2 = cazqVar.b;
                cazs cazsVar = (cazs) this.f.c("WorkQueueBatchingImpl#queueWorkItemAndReturnFuture", new ejxr() { // from class: cazn
                    @Override // defpackage.ejxr
                    public final Object get() throws IOException {
                        Map map3;
                        Object obj7;
                        Iterator it4;
                        eieu eieuVarH2 = eiiy.h("WorkQueueBatchingImpl#duplicateRows");
                        Map map4 = map2;
                        Map map5 = map;
                        try {
                            boolean zIsEmpty = map5.isEmpty();
                            final List list5 = list3;
                            final String str5 = str3;
                            final cazw cazwVar = this;
                            if (zIsEmpty) {
                                map3 = fcvp.a;
                            } else {
                                cbfd cbfdVarA = cbfi.a();
                                cbfdVarA.A("WorkQueueBatchingImpl#findExistingDuplicateRows");
                                cbfdVarA.e(new Function() { // from class: cazo
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj8) {
                                        cbmk cbmkVarA;
                                        cbfh cbfhVar = (cbfh) obj8;
                                        String str6 = str5;
                                        cbfhVar.g(str6);
                                        ArrayList arrayList10 = new ArrayList();
                                        Iterator it5 = list5.iterator();
                                        while (it5.hasNext()) {
                                            String str7 = ((caxs) ((cbcu) it5.next()).a()).b;
                                            if (str7 != null) {
                                                arrayList10.add(str7);
                                            }
                                        }
                                        Set setAv2 = fcva.av(arrayList10);
                                        int iIntValue = cbfi.c().intValue();
                                        if (iIntValue < 42050) {
                                            dqru.x("deduplication_tag", iIntValue);
                                        }
                                        cazw cazwVar2 = cazwVar;
                                        cbfhVar.ap(new dqpm("work_queue.deduplication_tag", 3, cbfh.as(setAv2), false));
                                        cbmm cbmmVar = (cbmm) ((Map) cazwVar2.d.d.c()).get(str6);
                                        cbfhVar.ap(new dqpm("work_queue._id", 4, cbfh.as((cbmmVar == null || (cbmkVarA = cbmmVar.a()) == null) ? fcvo.a : cbmkVarA.b), true));
                                        return cbfhVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                ekgb ekgbVarZ = cbfdVarA.b().z();
                                ekgbVarZ.getClass();
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
                                for (Object obj8 : ekgbVarZ) {
                                    String strP = ((cbdg) obj8).p();
                                    cbcu cbcuVar3 = (cbcu) map5.get(strP);
                                    if (cbcuVar3 == null) {
                                        throw new IllegalStateException("Could not find request for deduplication tag ".concat(String.valueOf(strP)));
                                    }
                                    linkedHashMap6.put(cbcuVar3, obj8);
                                }
                                ekrw ekrwVarG2 = cazw.a.g();
                                ekrwVarG2.X(eksq.a, "BugleWorkQueue");
                                ekrd ekrdVar = (ekrd) ekrwVarG2;
                                ekrdVar.X(cbpp.a, Integer.valueOf(linkedHashMap6.size()));
                                ekrdVar.X(cbpp.b, str5);
                                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueBatchingImpl", "getExistingRowsThatDuplicateRequests", 284, "WorkQueueBatchingImpl.kt")).q("Deduping pwq items");
                                map3 = linkedHashMap6;
                            }
                            fczl.a(eieuVarH2, null);
                            eieuVarH2 = eiiy.h("WorkQueueBatchingImpl#scheduleNewRows");
                            try {
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj9 : list5) {
                                    cbcu cbcuVar4 = (cbcu) obj9;
                                    if (!map3.keySet().contains(cbcuVar4) && !map4.keySet().contains(cbcuVar4)) {
                                        arrayList10.add(obj9);
                                    }
                                }
                                long epochMilli = cazwVar.c.f().toEpochMilli();
                                ArrayList arrayList11 = new ArrayList(fcva.p(arrayList10, 10));
                                Iterator it5 = arrayList10.iterator();
                                while (it5.hasNext()) {
                                    cbcu cbcuVar5 = (cbcu) it5.next();
                                    cbcuVar5.getClass();
                                    String[] strArr = cbfi.a;
                                    cbdj cbdjVar = new cbdj();
                                    cbdjVar.h(cbcuVar5.d());
                                    cbdjVar.g(epochMilli);
                                    cbdjVar.f(cbcuVar5.c().toByteArray());
                                    cbdjVar.e(str5);
                                    cbdjVar.c(((caxs) cbcuVar5.a()).b);
                                    cbdjVar.b(((caxs) cbcuVar5.a()).d);
                                    Duration duration = ((caxs) cbcuVar5.a()).c;
                                    if (duration != null) {
                                        it4 = it5;
                                        cbdjVar.d(new Date(epochMilli + duration.toMillis()));
                                    } else {
                                        it4 = it5;
                                    }
                                    arrayList11.add(cbdjVar.a());
                                    it5 = it4;
                                }
                                cbdg[] cbdgVarArr = (cbdg[]) arrayList11.toArray(new cbdg[0]);
                                long[] jArrB = dqru.B(cbfi.b(), 0, true, new BiConsumer() { // from class: cbde
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj10, Object obj11) {
                                        cbdg cbdgVar = (cbdg) obj10;
                                        Long l = (Long) obj11;
                                        String[] strArr2 = cbfi.a;
                                        if (l.longValue() >= 0) {
                                            cbdgVar.a = l.longValue();
                                            cbdgVar.fN(0);
                                        }
                                    }

                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                    }
                                }, (cbdg[]) Arrays.copyOf(cbdgVarArr, cbdgVarArr.length));
                                jArrB.getClass();
                                final fcuu fcuuVar = new fcuu(jArrB);
                                cbfd cbfdVarA2 = cbfi.a();
                                cbfdVarA2.A("WorkQueueBatchingImpl#loadInsertedRows");
                                cbfdVarA2.e(new Function() { // from class: cazp
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj10) {
                                        cbfh cbfhVar = (cbfh) obj10;
                                        cbfhVar.d(fcuuVar);
                                        return cbfhVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                cbfdVarA2.d(new cbfa(cbfi.c.a));
                                ekgb ekgbVarZ2 = cbfdVarA2.b().z();
                                ekrw ekrwVarG3 = cazw.a.g();
                                ekrwVarG3.X(eksq.a, "BugleWorkQueue");
                                ekrd ekrdVar2 = (ekrd) ekrwVarG3;
                                ekrdVar2.X(cbpp.b, str5);
                                ekrdVar2.X(cbpp.a, Integer.valueOf(arrayList10.size()));
                                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueBatchingImpl", "addNewRequestsToQueue", 258, "WorkQueueBatchingImpl.kt")).q("Queued");
                                ekgbVarZ2.getClass();
                                Map mapK = fcwa.k(fcva.ar(arrayList10, ekgbVarZ2));
                                fczl.a(eieuVarH2, null);
                                eieuVarH2 = eiiy.h("WorkQueueBatchingImpl#maybeSchedulingDeferred");
                                try {
                                    Iterator it6 = mapK.values().iterator();
                                    if (it6.hasNext()) {
                                        Object next2 = it6.next();
                                        if (it6.hasNext()) {
                                            long jM = ((cbdg) next2).m();
                                            do {
                                                Object next3 = it6.next();
                                                long jM2 = ((cbdg) next3).m();
                                                if (jM > jM2) {
                                                    jM = jM2;
                                                }
                                                if (jM > jM2) {
                                                    next2 = next3;
                                                }
                                            } while (it6.hasNext());
                                        }
                                        obj7 = next2;
                                    } else {
                                        obj7 = null;
                                    }
                                    cbdg cbdgVar = (cbdg) obj7;
                                    Optional optionalC = cbdgVar != null ? cazwVar.b.c(cbdgVar) : Optional.empty();
                                    fczl.a(eieuVarH2, null);
                                    return new cazs(map3, mapK, optionalC);
                                } finally {
                                }
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                });
                Map map3 = cazsVar.a;
                Map map4 = cazsVar.b;
                fdkf fdkfVarB = (fdkf) fdct.b(cazsVar.c);
                if (fdkfVarB == null) {
                    Iterator it4 = map4.values().iterator();
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (it4.hasNext()) {
                            long jM = ((cbdg) next).m();
                            do {
                                Object next2 = it4.next();
                                long jM2 = ((cbdg) next2).m();
                                if (jM > jM2) {
                                    jM = jM2;
                                }
                                if (jM > jM2) {
                                    next = next2;
                                }
                            } while (it4.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    cbdg cbdgVar = (cbdg) next;
                    fdkfVarB = cbdgVar != null ? fdin.b(this.h, eicg.a(fcyi.a), fdjz.b, new cazt(null, this, cbdgVar)) : null;
                    if (fdkfVarB == null) {
                        fdkfVarB = new fdjd();
                        fdkfVarB.t(null);
                    }
                }
                eieuVarH = eiiy.h("WorkQueueBatchingImpl#finish");
                try {
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(fcwa.a(map4.size()));
                    for (Map.Entry entry3 : map4.entrySet()) {
                        Object key = entry3.getKey();
                        cbfv cbfvVar = this.l;
                        long jM3 = ((cbdg) entry3.getValue()).m();
                        cbfu cbfuVar = new cbfu(fdkfVarB, cbfvVar.a);
                        cbfvVar.b.putIfAbsent(Long.valueOf(jM3), cbfuVar);
                        linkedHashMap6.put(key, cbfuVar);
                        map3 = map3;
                    }
                    Map map5 = map3;
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(fcwa.a(map5.size()));
                    for (Map.Entry entry4 : map5.entrySet()) {
                        Object key2 = entry4.getKey();
                        Object objA = (cazi) this.l.b.get(Long.valueOf(((cbdg) entry4.getValue()).m()));
                        if (objA == null) {
                            objA = cazr.a();
                        }
                        linkedHashMap7.put(key2, objA);
                    }
                    fdkfVarB.z();
                    Set setG = fcwm.g(map5.keySet(), map2.keySet());
                    eieuVarH = eiiy.h("WorkQueueBatchingImpl#runWorkRequestExtrasCallbacks");
                    try {
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it5 = setG.iterator();
                        while (it5.hasNext()) {
                            cazx cazxVar = ((caxs) ((cbcu) it5.next()).a()).f;
                            if (cazxVar != null) {
                                arrayList10.add(cazxVar);
                            }
                        }
                        Iterator it6 = arrayList10.iterator();
                        while (it6.hasNext()) {
                            ((cazx) it6.next()).a();
                        }
                        Set setKeySet = linkedHashMap6.keySet();
                        ArrayList arrayList11 = new ArrayList();
                        Iterator it7 = setKeySet.iterator();
                        while (it7.hasNext()) {
                            cazx cazxVar2 = ((caxs) ((cbcu) it7.next()).a()).f;
                            if (cazxVar2 != null) {
                                arrayList11.add(cazxVar2);
                            }
                        }
                        Iterator it8 = arrayList11.iterator();
                        while (it8.hasNext()) {
                            ((cazx) it8.next()).b();
                        }
                        for (Map.Entry entry5 : linkedHashMap6.entrySet()) {
                            cbcu cbcuVar3 = (cbcu) entry5.getKey();
                            cazi caziVar = (cazi) entry5.getValue();
                            eora eoraVar = ((caxs) cbcuVar3.a()).e;
                            if (eoraVar != null) {
                                caziVar.a().k(eoraVar, this.i);
                            }
                        }
                        fczl.a(eieuVarH, null);
                        Map mapJ = fcwa.j(linkedHashMap6, linkedHashMap7);
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap(fcwa.a(map2.size()));
                        for (Map.Entry entry6 : map2.entrySet()) {
                            Object key3 = entry6.getKey();
                            Object obj7 = mapJ.get(entry6.getValue());
                            obj7.getClass();
                            linkedHashMap8.put(key3, (cazi) obj7);
                        }
                        Map mapJ2 = fcwa.j(mapJ, linkedHashMap8);
                        fczl.a(eieuVarH, null);
                        arrayList5.add(mapJ2);
                        i2 = 10;
                    } finally {
                    }
                } finally {
                }
            }
            Iterator it9 = arrayList5.iterator();
            if (!it9.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next3 = it9.next();
            while (it9.hasNext()) {
                next3 = fcwa.j((Map) next3, (Map) it9.next());
            }
            ekgp ekgpVarE2 = ekfv.e(fcwa.j((Map) next3, linkedHashMap));
            fczl.a(eieuVarH, null);
            return ekgpVarE2;
        } finally {
        }
    }

    @Override // defpackage.cazj
    public final void e(String str, String str2) {
        cbai cbaiVar = (cbai) this.m.b();
        str2.getClass();
        if (Integer.valueOf(cbaiVar.a(str, str2)).equals(0)) {
            ((ekrd) cbai.a.i().h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueBatchingImpl", "cancel", 316, "WorkQueueBatchingImpl.kt")).D("Attempted to cancel work, but no work found %s %s", str, str2);
            throw new IndexOutOfBoundsException("Attempted to cancel work, but no work found");
        }
    }

    @Override // defpackage.cazj
    public final void f(String str) {
        ((cbai) this.m.b()).b(str, false);
    }

    @Override // defpackage.cazj
    public final /* synthetic */ void g(cbcu cbcuVar) {
        b(cbcuVar);
    }

    @Override // defpackage.cazj
    public final void h(String str) {
        cbai cbaiVar = (cbai) this.m.b();
        str.getClass();
        cbaiVar.a("fi_multi_sync_grpc", str);
    }

    @Override // defpackage.cazj
    public final eiju i(caxw caxwVar, EnumSet enumSet) {
        return this.j.a(caxwVar, enumSet, true, null, null);
    }
}
