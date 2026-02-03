package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpxg implements cpvt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/readreports/ReadReportsCmsDataProvider");
    private final aurx b;
    private final bzad c;
    private final apod d;

    public cpxg(fcsu fcsuVar, aurx aurxVar, bzad bzadVar, apod apodVar) {
        fcsuVar.getClass();
        aurxVar.getClass();
        bzadVar.getClass();
        apodVar.getClass();
        this.b = aurxVar;
        this.c = bzadVar;
        this.d = apodVar;
    }

    @Override // defpackage.cpvt
    public final epjl a() {
        return epjl.READ_REPORTS;
    }

    @Override // defpackage.cpvt
    public final List b() {
        if (this.b.aj()) {
            bbmm bbmmVarA = this.c.b(14, bbml.INSERT).a(1, "message_id");
            bbmmVarA.f = 5;
            bbmmVarA.g = byxy.a(6);
            return fcva.b(bbmmVarA.a());
        }
        bbmm bbmmVar = new bbmm();
        bbmmVar.c = bbml.INSERT;
        bbmmVar.e = 32;
        bbmmVar.b = 14;
        bbmmVar.i = "message_id";
        bbmmVar.f = 5;
        bbmmVar.c();
        bbmmVar.g = byxy.a(6);
        bbmmVar.h = this.d.a();
        return fcva.b(bbmmVar.a());
    }

    @Override // defpackage.cpvt
    public final List c() {
        return fcva.b(this.c.c(14, bbml.INSERT));
    }

    @Override // defpackage.cpvt
    public final Map d(final List list) {
        btbo btboVarB = btbt.b();
        btboVarB.A("readReportsCmsDataProvider#getReadReportsDatas");
        btboVarB.e(new Function() { // from class: cpxf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                btbs btbsVar = (btbs) obj;
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
                btbsVar.ap(new dqpm("read_reports.message_id", 3, btbs.as(ekfwVar.g()), true));
                return btbsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbo bsboVarE = ParticipantsTable.e();
        brzh brzhVar = ParticipantsTable.c;
        bsboVarE.c(brzhVar.E);
        dqtr dqtrVarI = dqts.i(bsboVarE.b(), brzhVar.a, btbt.c.c);
        ((dqos) dqtrVarI).e = "joined_participants";
        btboVarB.H(dqtrVarI.g());
        ekgb ekgbVarZ = btboVarB.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : ekgbVarZ) {
            String string = ((btai) obj).o().toString();
            Object arrayList = linkedHashMap.get(string);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(string, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            cpxc cpxcVar = (cpxc) cpxd.a.createBuilder();
            cpxcVar.getClass();
            for (Object obj2 : (List) entry.getValue()) {
                obj2.getClass();
                btai btaiVar = (btai) obj2;
                dqpd[] dqpdVarArrAH = btaiVar.aH("joined_participants", new ParticipantsTable.BindData[0]);
                dqpdVarArrAH.getClass();
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) fcur.I(dqpdVarArrAH);
                String strL = bindData != null ? bindData.L() : null;
                if (strL == null) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
                    ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/readreports/ReadReportsCmsDataProvider", "getData", 158, "ReadReportsCmsDataProvider.kt")).D("Read reports could not find cmsId for participant. BugleParticipantId: %s, MessageId: %s", String.valueOf(btaiVar.k()), entry.getKey());
                } else {
                    cpxa cpxaVar = (cpxa) cpxb.a.createBuilder();
                    cpxaVar.getClass();
                    cpxaVar.copyOnWrite();
                    ((cpxb) cpxaVar.instance).b = strL;
                    long jN = btaiVar.n();
                    cpxaVar.copyOnWrite();
                    ((cpxb) cpxaVar.instance).c = jN;
                    long jM = btaiVar.m();
                    cpxaVar.copyOnWrite();
                    ((cpxb) cpxaVar.instance).d = jM;
                    long jA = basb.a(btaiVar.q());
                    cpxaVar.copyOnWrite();
                    ((cpxb) cpxaVar.instance).e = jA;
                    evsn evsnVarBuild = cpxaVar.build();
                    evsnVarBuild.getClass();
                    cpxb cpxbVar = (cpxb) evsnVarBuild;
                    cpxcVar.copyOnWrite();
                    cpxd cpxdVar = (cpxd) cpxcVar.instance;
                    evtg evtgVar = cpxdVar.b;
                    if (!evtgVar.c()) {
                        cpxdVar.b = evsn.mutableCopy(evtgVar);
                    }
                    cpxdVar.b.add(cpxbVar);
                }
            }
            if (((cpxd) cpxcVar.instance).b.size() > 0) {
                Object key = entry.getKey();
                key.getClass();
                linkedHashMap2.put(key, new fctk(((cpxd) cpxcVar.build()).toByteString()));
            }
        }
        return linkedHashMap2;
    }

    @Override // defpackage.cpvt
    public final Map e(Map map) {
        map.getClass();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                linkedHashMap.put(str, (cpxd) evsn.parseFrom(cpxd.a, (evqs) entry.getValue()));
            } catch (evtj e) {
                linkedHashMap2.put(str, e);
            }
        }
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("readReportsCmsDataProvider#getBugleParticipantIds");
        brzh brzhVar = ParticipantsTable.c;
        bsboVarE.c(brzhVar.a, brzhVar.E);
        bsboVarE.h(new Function() { // from class: cpxe
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
                    evtg evtgVar = ((cpxd) it.next()).b;
                    evtgVar.getClass();
                    ArrayList arrayList2 = new ArrayList(fcva.p(evtgVar, 10));
                    Iterator<E> it2 = evtgVar.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((cpxb) it2.next()).b);
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
        ekgb<ParticipantsTable.BindData> ekgbVarZ = bsboVarE.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (ParticipantsTable.BindData bindData : ekgbVarZ) {
            linkedHashMap3.put(bindData.L(), bindData.R());
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            for (cpxb cpxbVar : ((cpxd) entry2.getValue()).b) {
                String str2 = (String) linkedHashMap3.get(cpxbVar.b);
                if (str2 != null && !fdgn.H(str2)) {
                    String[] strArr = btbt.a;
                    btal btalVar = new btal();
                    btalVar.d(bary.b((String) entry2.getKey()));
                    btalVar.e(Long.parseLong(str2));
                    btalVar.g(cpxbVar.c);
                    btalVar.f(cpxbVar.d);
                    btalVar.b(basb.b(cpxbVar.e));
                    arrayList.add(btalVar.a());
                }
            }
        }
        try {
            btai[] btaiVarArr = (btai[]) arrayList.toArray(new btai[0]);
            dqru.B(btbt.c(), 5, false, new BiConsumer() { // from class: bszz
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    btai btaiVar = (btai) obj;
                    Long l = (Long) obj2;
                    String[] strArr2 = btbt.a;
                    if (l.longValue() >= 0) {
                        btaiVar.a = String.valueOf(l);
                        btaiVar.fN(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (btai[]) Arrays.copyOf(btaiVarArr, btaiVarArr.length));
        } catch (Exception e2) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
            ((ekrd) ((ekrd) ekrwVarJ).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/readreports/ReadReportsCmsDataProvider", "restoreDataInTransaction", 249, "ReadReportsCmsDataProvider.kt")).q("Bulk insert of read reports data failed.");
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
