package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsRestoreAdditionalFieldsDelegate");
    private static final dzfh d = new dzfh("CmsBatchRestoreAdditionalFields");
    public final cpuv b;
    public final cpvu c;
    private final fcsu e;
    private final fcsu f;
    private final dzuc g;

    public cajh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cpuv cpuvVar, cpvu cpvuVar, dzuc dzucVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        cpuvVar.getClass();
        dzucVar.getClass();
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.b = cpuvVar;
        this.c = cpvuVar;
        this.g = dzucVar;
    }

    public final void a(final List list, int i) {
        Optional optional;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i2 = i - 1;
        dzub dzubVarD = this.g.d();
        try {
            if (i2 != 1) {
                Object objB = this.f.b();
                objB.getClass();
                optional = (Optional) objB;
            } else {
                Object objB2 = this.e.b();
                objB2.getClass();
                optional = (Optional) objB2;
            }
            final fdap fdapVar = new fdap() { // from class: caje
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    cajh cajhVar;
                    Map mapE;
                    Map map = (Map) obj;
                    map.getClass();
                    List list2 = list;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list2, 10)), 16));
                    for (Object obj2 : list2) {
                        linkedHashMap.put(((cajg) obj2).a, obj2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it = list2.iterator();
                    while (true) {
                        cajhVar = this;
                        if (!it.hasNext()) {
                            break;
                        }
                        cajg cajgVar = (cajg) it.next();
                        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(cajgVar.c.b);
                        mapUnmodifiableMap.getClass();
                        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                            String str = (String) entry.getKey();
                            evqs evqsVar = (evqs) entry.getValue();
                            str.getClass();
                            epjl epjlVar = (epjl) Enum.valueOf(epjl.class, str);
                            cpvt cpvtVar = (cpvt) map.get(epjlVar);
                            if (cpvtVar != null) {
                                final fdap fdapVar2 = new fdap() { // from class: cajc
                                    @Override // defpackage.fdap
                                    public final Object invoke(Object obj3) {
                                        ((cpvt) obj3).getClass();
                                        return new LinkedHashMap();
                                    }
                                };
                                Object objComputeIfAbsent = Map.EL.computeIfAbsent(linkedHashMap2, cpvtVar, new Function() { // from class: cajd
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return fdapVar2.invoke(obj3);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                objComputeIfAbsent.getClass();
                                ((java.util.Map) objComputeIfAbsent).put(cajgVar.a, evqsVar);
                            } else {
                                ekrw ekrwVarJ = cajh.a.j();
                                ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
                                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsRestoreAdditionalFieldsDelegate", "generateProviderToBatchesMap", 154, "CmsRestoreAdditionalFieldsDelegate.kt")).D("Unrecognized CmsDataProviderType. CmsDataProviderType=%s. CmsId=%s.", str, cajgVar.b);
                                cajhVar.c.b(4, epjlVar);
                                linkedHashMap2 = linkedHashMap2;
                            }
                        }
                    }
                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        cpvt cpvtVar2 = (cpvt) entry2.getKey();
                        java.util.Map map2 = (java.util.Map) entry2.getValue();
                        try {
                            mapE = cpvtVar2.e(map2);
                        } catch (Exception e) {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(fcwa.a(map2.size()));
                            Iterator it3 = map2.entrySet().iterator();
                            while (it3.hasNext()) {
                                linkedHashMap3.put(((Map.Entry) it3.next()).getKey(), e);
                            }
                            mapE = linkedHashMap3;
                        }
                        int size = linkedHashMap.size() - mapE.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            cajhVar.c.b(3, cpvtVar2.a());
                        }
                        Iterator it4 = mapE.entrySet().iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it4.next();
                            String str2 = (String) entry3.getKey();
                            Throwable th = (Throwable) entry3.getValue();
                            if (th instanceof cpyq) {
                                cajg cajgVar2 = (cajg) linkedHashMap.get(str2);
                                if (cajgVar2 != null) {
                                    cpyq cpyqVar = (cpyq) th;
                                    epjl epjlVarA = cpvtVar2.a();
                                    MessageIdType messageIdTypeB = bary.b(str2);
                                    String strName = cpvtVar2.a().name();
                                    strName.getClass();
                                    Iterator it5 = it4;
                                    evub evubVar = cajgVar2.c.b;
                                    evqs evqsVar2 = evubVar.containsKey(strName) ? (evqs) evubVar.get(strName) : null;
                                    if (evqsVar2 != null) {
                                        ekqh it6 = cpyqVar.a.iterator();
                                        it6.getClass();
                                        while (it6.hasNext()) {
                                            String str3 = cajgVar2.b;
                                            cpys cpysVar = (cpys) it6.next();
                                            evqs evqsVar3 = evqsVar2;
                                            cpuv cpuvVar = cajhVar.b;
                                            String strA = cpysVar.a();
                                            epjlVarA.getClass();
                                            ecem.b();
                                            String[] strArr = bmyr.a;
                                            java.util.Map map3 = map;
                                            bmxi bmxiVar = new bmxi();
                                            bmxiVar.e(MessageIdType.a(messageIdTypeB));
                                            bmxiVar.d(str3);
                                            bmxiVar.c(strA);
                                            bmxiVar.b(epjlVarA);
                                            bmxiVar.g(evqsVar3.I());
                                            bmxiVar.f(((cogw) cpuvVar.a.b()).f().toEpochMilli());
                                            final bmxf bmxfVarA = bmxiVar.a();
                                            final dqsy dqsyVarB = bmyr.b();
                                            Long.valueOf(dqru.b(bmyr.b(), "cms_restore_dependency_cache_table", bmxfVarA, new Function() { // from class: bmxe
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj3) {
                                                    return Long.valueOf(dqsyVarB.P("cms_restore_dependency_cache_table", (dqst) obj3));
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            }, new Consumer() { // from class: bmxd
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj3) {
                                                    Long l = (Long) obj3;
                                                    if (l.longValue() >= 0) {
                                                        bmxf bmxfVar = bmxfVarA;
                                                        bmxfVar.a = l.longValue();
                                                        bmxfVar.fN(0);
                                                    }
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            })).longValue();
                                            ekrw ekrwVarH = cajh.a.h();
                                            ekrwVarH.X(eksq.a, "BugleCmsAddFields");
                                            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsRestoreAdditionalFieldsDelegate", "handleBugleDependencyMissingException", 283, "CmsRestoreAdditionalFieldsDelegate.kt");
                                            String string = messageIdTypeB.toString();
                                            String strA2 = cpysVar.a();
                                            epjl epjlVar2 = epjlVarA;
                                            ekrdVar.J("Dependency inserted into RestoreDependencyCache. CmsDataProviderType=%s MsgCmsId=%s MsgBugleId=%s DependencyCmsId=%s", epjlVar2, str3, string, strA2);
                                            epjlVarA = epjlVar2;
                                            evqsVar2 = evqsVar3;
                                            map = map3;
                                            list2 = list2;
                                            it2 = it2;
                                        }
                                        cajhVar.c.b(5, epjlVarA);
                                        it4 = it5;
                                        map = map;
                                    } else {
                                        it4 = it5;
                                    }
                                }
                            } else {
                                Iterator it7 = it4;
                                java.util.Map map4 = map;
                                List list3 = list2;
                                Iterator it8 = it2;
                                cajg cajgVar3 = (cajg) linkedHashMap.get(str2);
                                if (cajgVar3 != null) {
                                    ekrw ekrwVarI = cajh.a.i();
                                    ekrwVarI.X(eksq.a, "BugleCmsAddFields");
                                    ((ekrd) ((ekrd) ekrwVarI).g(th).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsRestoreAdditionalFieldsDelegate", "restoreDataForProviderAndHandleResult", 124, "CmsRestoreAdditionalFieldsDelegate.kt")).D("Unable to restore data from CmsDataProvider. CmsDataProviderType=%s. cmsId=%s.", cpvtVar2.a().name(), cajgVar3.b);
                                    cajhVar.c.b(6, cpvtVar2.a());
                                }
                                it4 = it7;
                                map = map4;
                                list2 = list3;
                                it2 = it8;
                            }
                        }
                    }
                    List list4 = list2;
                    ekrw ekrwVarH2 = cajh.a.h();
                    ekrwVarH2.X(eksq.a, "BugleCmsAddFields");
                    ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/restore/CmsRestoreAdditionalFieldsDelegate", "restoreAdditionalFields$lambda$4", 71, "CmsRestoreAdditionalFieldsDelegate.kt");
                    Collection collectionValues = map.values();
                    ArrayList arrayList = new ArrayList(fcva.p(collectionValues, 10));
                    Iterator it9 = collectionValues.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(((cpvt) it9.next()).a());
                    }
                    ekrdVar2.I("Data processed from AdditionalFields. CmsDataProviderTypes=%s. BugleDbIds=%s. CmsIds=%s.", fcva.aF(arrayList, ",", null, null, null, 62), fcva.aF(list4, ",", null, null, new fdap() { // from class: caja
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            cajg cajgVar4 = (cajg) obj3;
                            cajgVar4.getClass();
                            return cajgVar4.a;
                        }
                    }, 30), fcva.aF(list4, ",", null, null, new fdap() { // from class: cajb
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            cajg cajgVar4 = (cajg) obj3;
                            cajgVar4.getClass();
                            return cajgVar4.b;
                        }
                    }, 30));
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: cajf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } finally {
            this.g.f(dzubVarD, d, null, dzua.SUCCESS);
        }
    }

    public final void b(epjf epjfVar, String str, String str2, int i) {
        epjfVar.getClass();
        str.getClass();
        if (str2 == null || str2.length() == 0) {
            return;
        }
        a(fcva.b(new cajg(str, str2, epjfVar)), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(String str) {
        if (str == null) {
            return;
        }
        ekgb ekgbVarR = ekgb.r(str);
        ekgbVarR.getClass();
        ekqh it = cpuv.a(ekgbVarR).iterator();
        it.getClass();
        while (it.hasNext()) {
            bmxf bmxfVar = (bmxf) it.next();
            long jK = bmxfVar.k();
            String strN = bmxfVar.n();
            strN.getClass();
            epjd epjdVar = (epjd) epjf.a.createBuilder();
            epjdVar.a(bmxfVar.m().name(), evqs.x(bmxfVar.o()));
            evsn evsnVarBuild = epjdVar.build();
            evsnVarBuild.getClass();
            b((epjf) evsnVarBuild, String.valueOf(jK), strN, 2);
        }
    }
}
