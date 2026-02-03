package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarCollections;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpxv implements cpvt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/userreference/UserReferenceCmsDataProvider");

    public cpxv(fcsu fcsuVar) {
        fcsuVar.getClass();
    }

    @Override // defpackage.cpvt
    public final epjl a() {
        return epjl.USER_REFERENCE;
    }

    @Override // defpackage.cpvt
    public final List b() {
        return fcvo.a;
    }

    @Override // defpackage.cpvt
    public final List c() {
        return fcvo.a;
    }

    @Override // defpackage.cpvt
    public final Map d(final List list) {
        if (!((Boolean) ((cczi) cpyl.H.get()).e()).booleanValue()) {
            return fcvp.a;
        }
        String[] strArr = buyx.a;
        buyu buyuVar = new buyu(buyx.a);
        buyuVar.A("userReferenceCmsDataProvider#getData");
        buyuVar.d(new Function() { // from class: cpxu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                buyw buywVar = (buyw) obj;
                ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(bary.b((String) it.next()));
                }
                ekfw ekfwVar = new ekfw();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ekfwVar.h(String.valueOf(bary.a((MessageIdType) it2.next())));
                }
                buywVar.ap(new dqpm("user_references.message_id", 3, buyw.as(ekfwVar.g()), true));
                return buywVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbo bsboVarE = ParticipantsTable.e();
        brzh brzhVar = ParticipantsTable.c;
        bsboVarE.c(brzhVar.E);
        dqtr dqtrVarI = dqts.i(bsboVarE.b(), brzhVar.a, buyx.c.c);
        ((dqos) dqtrVarI).e = "joined_participants";
        buyuVar.H(dqtrVarI.g());
        ekgb ekgbVarZ = buyuVar.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : ekgbVarZ) {
            MessageIdType messageIdTypeN = ((buxp) obj).n();
            Object arrayList = linkedHashMap.get(messageIdTypeN);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(messageIdTypeN, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            MessageIdType messageIdType = (MessageIdType) entry.getKey();
            List<buxp> list2 = (List) entry.getValue();
            String strB = messageIdType.b();
            cpxq cpxqVar = (cpxq) cpxr.a.createBuilder();
            cpxqVar.getClass();
            for (buxp buxpVar : list2) {
                String strValueOf = String.valueOf(buxpVar.k());
                dqpd[] dqpdVarArrAH = buxpVar.aH("joined_participants", new ParticipantsTable.BindData[0]);
                dqpdVarArrAH.getClass();
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) fcur.I(dqpdVarArrAH);
                String strL = bindData != null ? bindData.L() : null;
                if (strL == null) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(bzmz.c, strValueOf);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/userreference/UserReferenceCmsDataProvider", "getData", 141, "UserReferenceCmsDataProvider.kt")).q("Could not find cmsId for participant.");
                } else {
                    DesugarCollections.unmodifiableList(((cpxr) cpxqVar.instance).b).getClass();
                    cpxo cpxoVar = (cpxo) cpxp.a.createBuilder();
                    cpxoVar.getClass();
                    cpxoVar.copyOnWrite();
                    ((cpxp) cpxoVar.instance).b = strL;
                    long jM = buxpVar.m();
                    cpxoVar.copyOnWrite();
                    ((cpxp) cpxoVar.instance).c = jM;
                    evsn evsnVarBuild = cpxoVar.build();
                    evsnVarBuild.getClass();
                    cpxp cpxpVar = (cpxp) evsnVarBuild;
                    cpxqVar.copyOnWrite();
                    cpxr cpxrVar = (cpxr) cpxqVar.instance;
                    evtg evtgVar = cpxrVar.b;
                    if (!evtgVar.c()) {
                        cpxrVar.b = evsn.mutableCopy(evtgVar);
                    }
                    cpxrVar.b.add(cpxpVar);
                }
            }
            evsn evsnVarBuild2 = cpxqVar.build();
            evsnVarBuild2.getClass();
            arrayList2.add(new fcti(strB, new fctk(((cpxr) evsnVarBuild2).toByteString())));
        }
        return fcwa.k(arrayList2);
    }

    @Override // defpackage.cpvt
    public final Map e(Map map) {
        buxp buxpVarA;
        map.getClass();
        if (!((Boolean) ((cczi) cpyl.H.get()).e()).booleanValue()) {
            return fcvp.a;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                cpxr cpxrVar = (cpxr) evsn.parseFrom(cpxr.a, (evqs) entry.getValue());
                cpxrVar.getClass();
                linkedHashMap.put(str, cpxrVar);
            } catch (evtj e) {
                linkedHashMap2.put(str, e);
            }
        }
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("restoreDataInTransaction-1");
        bsboVarE.h(new Function() { // from class: cpxs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    evtg evtgVar = ((cpxr) it.next()).b;
                    evtgVar.getClass();
                    ArrayList arrayList2 = new ArrayList(fcva.p(evtgVar, 10));
                    Iterator<E> it2 = evtgVar.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((cpxp) it2.next()).b);
                    }
                    fcva.y(arrayList, arrayList2);
                }
                bsbxVar.e(arrayList);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.e(new Function() { // from class: cpxt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brzh brzhVar = (brzh) obj;
                return new brzi[]{brzhVar.a, brzhVar.E};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb<ParticipantsTable.BindData> ekgbVarZ = bsboVarE.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (ParticipantsTable.BindData bindData : ekgbVarZ) {
            fcti fctiVar = new fcti(bindData.L(), bindData.R());
            linkedHashMap3.put(fctiVar.a, fctiVar.b);
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : setEntrySet) {
            String str2 = (String) entry2.getKey();
            evtg<cpxp> evtgVar = ((cpxr) entry2.getValue()).b;
            evtgVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (cpxp cpxpVar : evtgVar) {
                String str3 = (String) linkedHashMap3.get(cpxpVar.b);
                if (str3 == null) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(bzmz.g, cpxpVar.b);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/userreference/UserReferenceCmsDataProvider", "restoreDataInTransaction", 230, "UserReferenceCmsDataProvider.kt")).q("Could not find bugleId for participant.");
                    buxpVarA = null;
                } else {
                    String[] strArr = buyx.a;
                    buxs buxsVar = new buxs();
                    buxsVar.c(bary.b(str2));
                    buxsVar.d(Long.parseLong(str3));
                    buxsVar.e(cpxpVar.c);
                    buxpVarA = buxsVar.a();
                }
                if (buxpVarA != null) {
                    arrayList2.add(buxpVarA);
                }
            }
            fcva.y(arrayList, arrayList2);
        }
        buxp[] buxpVarArr = (buxp[]) arrayList.toArray(new buxp[0]);
        try {
            dqru.B(buyx.b(), 5, false, new BiConsumer() { // from class: buxl
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    buxp buxpVar = (buxp) obj;
                    Long l = (Long) obj2;
                    String[] strArr2 = buyx.a;
                    if (l.longValue() >= 0) {
                        buxpVar.a = String.valueOf(l);
                        buxpVar.fN(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (buxp[]) Arrays.copyOf(buxpVarArr, buxpVarArr.length));
        } catch (Exception e2) {
            ekrw ekrwVarJ2 = a.j();
            ekrwVarJ2.X(eksq.a, "BugleCmsAddFields");
            ((ekrd) ((ekrd) ekrwVarJ2).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/userreference/UserReferenceCmsDataProvider", "restoreDataInTransaction", 246, "UserReferenceCmsDataProvider.kt")).q("Bulk insert of user reference data failed.");
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(fcwa.a(map.size()));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                linkedHashMap4.put(((Map.Entry) it.next()).getKey(), e2);
            }
            linkedHashMap2.putAll(linkedHashMap4);
        }
        return linkedHashMap2;
    }
}
