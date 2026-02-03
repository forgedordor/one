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
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpwk implements cpvt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagecaptions/MessageCaptionsCmsDataProvider");

    @Override // defpackage.cpvt
    public final epjl a() {
        return epjl.MESSAGE_CAPTIONS;
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
        String[] strArr = bqbb.a;
        bqay bqayVar = new bqay(bqbb.a);
        bqayVar.A("getData");
        bqayVar.k(new bqaz((bqba) new Function() { // from class: cpwj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                bqba bqbaVar = (bqba) obj;
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
                bqbaVar.ap(new dqpm("message_captions.message_id", 3, bqba.as(ekfwVar.g()), true));
                return bqbaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bqba())));
        bqayVar.A("MessageCaptionsCmsDataProvider#getData#batched");
        ekgb<bqad> ekgbVarZ = bqayVar.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (bqad bqadVar : ekgbVarZ) {
            bqadVar.aA(0, "message_id");
            String strB = bqadVar.a.b();
            cpwh cpwhVar = (cpwh) cpwi.a.createBuilder();
            cpwhVar.getClass();
            String strK = bqadVar.k();
            strK.getClass();
            cpwhVar.copyOnWrite();
            cpwi cpwiVar = (cpwi) cpwhVar.instance;
            cpwiVar.b |= 1;
            cpwiVar.c = strK;
            evsn evsnVarBuild = cpwhVar.build();
            evsnVarBuild.getClass();
            fcti fctiVar = new fcti(strB, new fctk(((cpwi) evsnVarBuild).toByteString()));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
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
                cpwi cpwiVar = (cpwi) evsn.parseFrom(cpwi.a, (evqs) entry.getValue());
                cpwiVar.getClass();
                if ((cpwiVar.b & 1) != 0) {
                    linkedHashMap.put(str, cpwiVar);
                }
            } catch (evtj e) {
                linkedHashMap2.put(str, e);
            }
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList(fcva.p(setEntrySet, 10));
        for (Map.Entry entry2 : setEntrySet) {
            String str2 = (String) entry2.getKey();
            cpwi cpwiVar2 = (cpwi) entry2.getValue();
            String[] strArr = bqbb.a;
            bqag bqagVar = new bqag();
            bqagVar.c(bary.b(str2));
            bqagVar.b(cpwiVar2.c);
            arrayList.add(bqagVar.a());
        }
        bqad[] bqadVarArr = (bqad[]) arrayList.toArray(new bqad[0]);
        try {
            dqru.B(bqbb.a(), 5, false, new BiConsumer() { // from class: bpzz
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String[] strArr2 = bqbb.a;
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (bqad[]) Arrays.copyOf(bqadVarArr, bqadVarArr.length));
        } catch (Exception e2) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
            ((ekrd) ((ekrd) ekrwVarJ).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagecaptions/MessageCaptionsCmsDataProvider", "restoreDataInTransaction", 102, "MessageCaptionsCmsDataProvider.kt")).q("Bulk insert of message caption data failed.");
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
