package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpwz implements cpvt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagestar/MessageStarCmsDataProvider");
    private final aurx b;
    private final bzad c;
    private final apod d;

    public cpwz(aurx aurxVar, bzad bzadVar, apod apodVar) {
        aurxVar.getClass();
        bzadVar.getClass();
        apodVar.getClass();
        this.b = aurxVar;
        this.c = bzadVar;
        this.d = apodVar;
    }

    @Override // defpackage.cpvt
    public final epjl a() {
        return epjl.MESSAGE_STAR;
    }

    @Override // defpackage.cpvt
    public final List b() {
        ArrayList arrayList = new ArrayList();
        if (this.b.aj()) {
            bzad bzadVar = this.c;
            bbmm bbmmVarA = bzadVar.b(12, bbml.INSERT).a(1, "message_id");
            bbmmVarA.f = 5;
            bbmmVarA.g = byxy.a(6);
            arrayList.add(bbmmVarA.a());
            bbmm bbmmVarA2 = bzadVar.b(12, bbml.DELETE).a(1, "message_id");
            bbmmVarA2.f = 5;
            bbmmVarA2.g = byxy.a(6);
            arrayList.add(bbmmVarA2.a());
            return arrayList;
        }
        bbmm bbmmVar = new bbmm();
        bbmmVar.c = bbml.INSERT;
        bbmmVar.e = 32;
        bbmmVar.b = 12;
        bbmmVar.i = "message_id";
        bbmmVar.f = 5;
        bbmmVar.c();
        bbmmVar.g = byxy.a(6);
        apod apodVar = this.d;
        bbmmVar.h = apodVar.a();
        arrayList.add(bbmmVar.a());
        bbmm bbmmVar2 = new bbmm();
        bbmmVar2.c = bbml.DELETE;
        bbmmVar2.e = 32;
        bbmmVar2.b = 12;
        bbmmVar2.i = "message_id";
        bbmmVar2.f = 5;
        bbmmVar2.c();
        bbmmVar2.g = byxy.a(6);
        bbmmVar2.h = apodVar.a();
        arrayList.add(bbmmVar2.a());
        return arrayList;
    }

    @Override // defpackage.cpvt
    public final List c() {
        ArrayList arrayList = new ArrayList();
        bbml bbmlVar = bbml.INSERT;
        bzad bzadVar = this.c;
        arrayList.add(bzadVar.c(12, bbmlVar));
        arrayList.add(bzadVar.c(12, bbml.DELETE));
        return arrayList;
    }

    @Override // defpackage.cpvt
    public final Map d(List list) {
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bary.b((String) it.next()));
        }
        final List listAo = fcva.ao(arrayList);
        String[] strArr = bqsm.a;
        bqsh bqshVar = new bqsh(bqsm.a);
        bqshVar.A("batchGetMessageStarData");
        bqshVar.e(new Function() { // from class: cpwy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqsl bqslVar = (bqsl) obj;
                ekfw ekfwVar = new ekfw();
                Iterator it2 = listAo.iterator();
                while (it2.hasNext()) {
                    ekfwVar.h(String.valueOf(bary.a((MessageIdType) it2.next())));
                }
                bqslVar.ap(new dqpm("message_star.message_id", 3, bqsl.as(ekfwVar.g()), true));
                return bqslVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = bqshVar.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        Iterator<E> it2 = ekgbVarZ.iterator();
        while (it2.hasNext()) {
            String string = ((bqrm) it2.next()).k().toString();
            string.getClass();
            cpww cpwwVar = (cpww) cpwx.a.createBuilder();
            cpwwVar.getClass();
            cpwwVar.copyOnWrite();
            ((cpwx) cpwwVar.instance).b = true;
            evsn evsnVarBuild = cpwwVar.build();
            evsnVarBuild.getClass();
            linkedHashMap.put(string, new fctk(((cpwx) evsnVarBuild).toByteString()));
        }
        return linkedHashMap;
    }

    @Override // defpackage.cpvt
    public final Map e(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                cpwx cpwxVar = (cpwx) evsn.parseFrom(cpwx.a, (evqs) entry.getValue());
                cpwxVar.getClass();
                if (cpwxVar.b) {
                    linkedHashMap.put(str, cpwxVar);
                }
            } catch (evtj e) {
                linkedHashMap2.put(str, e);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String[] strArr = bqsm.a;
            bqrp bqrpVar = new bqrp();
            bqrpVar.b(bary.b((String) entry2.getKey()));
            arrayList.add(bqrpVar.a());
        }
        bqrm[] bqrmVarArr = (bqrm[]) arrayList.toArray(new bqrm[0]);
        try {
            dqru.B(bqsm.a(), 5, false, new BiConsumer() { // from class: bqri
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    bqrm bqrmVar = (bqrm) obj;
                    Long l = (Long) obj2;
                    String[] strArr2 = bqsm.a;
                    if (l.longValue() >= 0) {
                        bqrmVar.a = l.longValue();
                        bqrmVar.fN(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (bqrm[]) Arrays.copyOf(bqrmVarArr, bqrmVarArr.length));
        } catch (Exception e2) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
            ((ekrd) ((ekrd) ekrwVarJ).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagestar/MessageStarCmsDataProvider", "restoreDataInTransaction", 174, "MessageStarCmsDataProvider.kt")).q("Bulk insert of message star data failed.");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(fcwa.a(map.size()));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                linkedHashMap3.put(((Map.Entry) it.next()).getKey(), e2);
            }
            linkedHashMap2.putAll(linkedHashMap3);
        }
        return linkedHashMap2;
    }
}
