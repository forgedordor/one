package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpme {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsAdditionalFieldsFetcher");
    private static final dzfh b = new dzfh("CmsBatchGetAdditionalFields");
    private final cpmh c;
    private final cpvu d;
    private final dzuc e;

    public cpme(cpmh cpmhVar, cpvu cpvuVar, dzuc dzucVar) {
        cpmhVar.getClass();
        dzucVar.getClass();
        this.c = cpmhVar;
        this.d = cpvuVar;
        this.e = dzucVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ekgp a(Map map, ekgb ekgbVar) throws Throwable {
        Map mapD;
        LinkedHashMap linkedHashMap;
        Iterator it;
        cpme cpmeVar = this;
        ekgbVar.getClass();
        dzub dzubVarD = cpmeVar.e.d();
        try {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                try {
                    mapD = ((cpvt) entry.getValue()).d(ekgbVar);
                } catch (Exception e) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVar, 10)), 16));
                    for (Object obj : ekgbVar) {
                        linkedHashMap3.put(obj, new fctk(fctl.a(e)));
                    }
                    mapD = linkedHashMap3;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry2 : mapD.entrySet()) {
                    if (fctk.d(((fctk) entry2.getValue()).a)) {
                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                    }
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(fcwa.a(linkedHashMap4.size()));
                for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                    Object key = entry3.getKey();
                    Object obj2 = ((fctk) entry3.getValue()).a;
                    fctl.b(obj2);
                    linkedHashMap5.put(key, (evqs) obj2);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Map.Entry entry4 : mapD.entrySet()) {
                    if (((fctk) entry4.getValue()).a instanceof fctj) {
                        linkedHashMap6.put(entry4.getKey(), entry4.getValue());
                    }
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(fcwa.a(linkedHashMap6.size()));
                for (Map.Entry entry5 : linkedHashMap6.entrySet()) {
                    Object key2 = entry5.getKey();
                    Throwable thC = fctk.c(((fctk) entry5.getValue()).a);
                    thC.getClass();
                    linkedHashMap7.put(key2, thC);
                }
                linkedHashMap2.put(entry.getKey(), linkedHashMap5);
                ekrg ekrgVar = a;
                ekrw ekrwVarH = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH.X(ekrzVar, "BugleCmsAddFields");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrz ekrzVar2 = bzmz.M;
                LinkedHashMap linkedHashMap8 = linkedHashMap2;
                ekrdVar.X(ekrzVar2, ((epjl) entry.getKey()).name());
                ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsAdditionalFieldsFetcher", "getAdditionalFields", 62, "CmsAdditionalFieldsFetcher.kt");
                Iterator it3 = it2;
                ArrayList arrayList = new ArrayList(linkedHashMap5.size());
                for (Iterator it4 = linkedHashMap5.entrySet().iterator(); it4.hasNext(); it4 = it4) {
                    arrayList.add((String) ((Map.Entry) it4.next()).getKey());
                }
                String strAF = fcva.aF(arrayList, ",", null, null, null, 62);
                ArrayList arrayList2 = new ArrayList();
                Iterator<E> it5 = ekgbVar.iterator();
                while (true) {
                    linkedHashMap = linkedHashMap7;
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next = it5.next();
                    Map.Entry entry6 = entry;
                    if (!mapD.containsKey((String) next)) {
                        arrayList2.add(next);
                    }
                    linkedHashMap7 = linkedHashMap;
                    entry = entry6;
                }
                Map.Entry entry7 = entry;
                String strAF2 = fcva.aF(arrayList2, ",", null, null, null, 62);
                ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                Iterator it6 = linkedHashMap.entrySet().iterator();
                while (it6.hasNext()) {
                    arrayList3.add((String) ((Map.Entry) it6.next()).getKey());
                }
                ekrdVar2.I("Retrieved data from CmsDataProvider. Successful Ids = %s. No result Ids = %s. Failed Ids = %s.", strAF, strAF2, fcva.aF(arrayList3, ",", null, null, null, 62));
                int size = linkedHashMap5.size();
                for (int i = 0; i < size; i++) {
                    cpmeVar.d.a(3, (epjl) entry7.getKey());
                }
                Iterator it7 = linkedHashMap.entrySet().iterator();
                while (it7.hasNext()) {
                    Map.Entry entry8 = (Map.Entry) it7.next();
                    String str = (String) entry8.getKey();
                    Throwable th = (Throwable) entry8.getValue();
                    if (th instanceof cpyx) {
                        ekqh it8 = ((cpyx) th).a.iterator();
                        it8.getClass();
                        while (it8.hasNext()) {
                            try {
                                cpys cpysVar = (cpys) it8.next();
                                cpmh cpmhVar = cpmeVar.c;
                                MessageIdType messageIdTypeB = bary.b(str);
                                MessageIdType messageIdTypeB2 = bary.b(cpysVar.a());
                                ecem.b();
                                String[] strArr = bmnn.a;
                                bmmn bmmnVar = new bmmn();
                                Iterator it9 = it7;
                                bmmnVar.c(MessageIdType.a(messageIdTypeB));
                                bmmnVar.b(MessageIdType.a(messageIdTypeB2));
                                bmmnVar.d(((cogw) cpmhVar.a.b()).f().toEpochMilli());
                                final bmmk bmmkVarA = bmmnVar.a();
                                final dqsy dqsyVarA = bmnn.a();
                                Long.valueOf(dqru.b(bmnn.a(), "cms_backup_dependency_cache_table", bmmkVarA, new Function() { // from class: bmmi
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return Long.valueOf(dqsyVarA.P("cms_backup_dependency_cache_table", (dqst) obj3));
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }, new Consumer() { // from class: bmmj
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj3) {
                                        Long l = (Long) obj3;
                                        if (l.longValue() >= 0) {
                                            bmmk bmmkVar = bmmkVarA;
                                            bmmkVar.a = l.longValue();
                                            bmmkVar.fN(0);
                                        }
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                })).longValue();
                                cpmeVar = this;
                                it7 = it9;
                            } catch (Throwable th2) {
                                th = th2;
                                cpmeVar = this;
                                cpmeVar.e.f(dzubVarD, b, null, dzua.SUCCESS);
                                throw th;
                            }
                        }
                        it = it7;
                        ekrw ekrwVarH2 = ekrgVar.h();
                        ekrwVarH2.X(ekrzVar, "BugleCmsAddFields");
                        ekrd ekrdVar3 = (ekrd) ekrwVarH2;
                        ekrdVar3.X(ekrzVar2, ((epjl) entry7.getKey()).name());
                        ekrdVar3.X(bzmz.c, str);
                        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsAdditionalFieldsFetcher", "getAdditionalFields", 87, "CmsAdditionalFieldsFetcher.kt")).q("Dependencies inserted into BackupDependencyCache.");
                        cpmeVar = this;
                        cpmeVar.d.a(5, (epjl) entry7.getKey());
                    } else {
                        it = it7;
                        ekrw ekrwVarI = ekrgVar.i();
                        ekrwVarI.X(ekrzVar, "BugleCmsAddFields");
                        ekrd ekrdVar4 = (ekrd) ((ekrd) ekrwVarI).g(th);
                        ekrdVar4.X(ekrzVar2, ((epjl) entry7.getKey()).name());
                        ekrdVar4.X(bzmz.c, str);
                        ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsAdditionalFieldsFetcher", "getAdditionalFields", 99, "CmsAdditionalFieldsFetcher.kt")).q("Unable to get data from CmsDataProvider.");
                        cpmeVar.d.a(6, (epjl) entry7.getKey());
                    }
                    it7 = it;
                }
                it2 = it3;
                linkedHashMap2 = linkedHashMap8;
            }
            LinkedHashMap linkedHashMap9 = linkedHashMap2;
            LinkedHashMap linkedHashMap10 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVar, 10)), 16));
            for (Object obj3 : ekgbVar) {
                String str2 = (String) obj3;
                LinkedHashMap linkedHashMap11 = new LinkedHashMap(fcwa.a(linkedHashMap9.size()));
                for (Map.Entry entry9 : linkedHashMap9.entrySet()) {
                    linkedHashMap11.put(entry9.getKey(), (evqs) ((Map) entry9.getValue()).get(str2));
                }
                LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                for (Map.Entry entry10 : linkedHashMap11.entrySet()) {
                    if (((evqs) entry10.getValue()) != null) {
                        linkedHashMap12.put(entry10.getKey(), entry10.getValue());
                    }
                }
                LinkedHashMap linkedHashMap13 = new LinkedHashMap(fcwa.a(linkedHashMap12.size()));
                for (Map.Entry entry11 : linkedHashMap12.entrySet()) {
                    Object key3 = entry11.getKey();
                    Object value = entry11.getValue();
                    value.getClass();
                    linkedHashMap13.put(key3, (evqs) value);
                }
                linkedHashMap10.put(obj3, ekfv.e(linkedHashMap13));
            }
            ekgp ekgpVarE = ekfv.e(linkedHashMap10);
            cpmeVar.e.f(dzubVarD, b, null, dzua.SUCCESS);
            return ekgpVarE;
        } catch (Throwable th3) {
            th = th3;
            cpmeVar.e.f(dzubVarD, b, null, dzua.SUCCESS);
            throw th;
        }
    }

    public final Map b(Map map, String str) {
        str.getClass();
        ekgb ekgbVarR = ekgb.r(str);
        ekgbVarR.getClass();
        return (Map) Map.EL.getOrDefault(a(map, ekgbVarR), str, fcvp.a);
    }
}
