package defpackage;

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
public final class cpwc implements cpvt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/conversationpin/ConversationPinCmsDataProvider");
    private final aurx b;
    private final bzad c;
    private final apod d;

    public cpwc(aurx aurxVar, bzad bzadVar, apod apodVar) {
        aurxVar.getClass();
        bzadVar.getClass();
        apodVar.getClass();
        this.b = aurxVar;
        this.c = bzadVar;
        this.d = apodVar;
    }

    @Override // defpackage.cpvt
    public final epjl a() {
        return epjl.CONVERSATION_PIN;
    }

    @Override // defpackage.cpvt
    public final List b() {
        if (this.b.aj()) {
            bzad bzadVar = this.c;
            bbmm bbmmVarA = bzadVar.b(15, bbml.INSERT).a(2, "conversation_id");
            bbmmVarA.f = 2;
            bbmmVarA.g = bzas.a(65);
            String strA = bbmmVarA.a();
            bbmm bbmmVarA2 = bzadVar.b(15, bbml.DELETE).a(2, "conversation_id");
            bbmmVarA2.f = 2;
            bbmmVarA2.g = bzas.a(65);
            return fcva.g(strA, bbmmVarA2.a());
        }
        bbmm bbmmVar = new bbmm();
        bbmmVar.c = bbml.INSERT;
        bbmmVar.e = 32;
        bbmmVar.b = 15;
        bbmmVar.i = "conversation_id";
        bbmmVar.f = 2;
        bbmmVar.c();
        bbmmVar.g = bzas.a(65);
        apod apodVar = this.d;
        bbmmVar.h = apodVar.a();
        String strA2 = bbmmVar.a();
        bbmm bbmmVar2 = new bbmm();
        bbmmVar2.c = bbml.DELETE;
        bbmmVar2.e = 32;
        bbmmVar2.b = 15;
        bbmmVar2.i = "conversation_id";
        bbmmVar2.f = 2;
        bbmmVar2.c();
        bbmmVar2.g = bzas.a(65);
        bbmmVar2.h = apodVar.a();
        return fcva.g(strA2, bbmmVar2.a());
    }

    @Override // defpackage.cpvt
    public final List c() {
        bbml bbmlVar = bbml.INSERT;
        bzad bzadVar = this.c;
        return fcva.g(bzadVar.c(15, bbmlVar), bzadVar.c(15, bbml.DELETE));
    }

    @Override // defpackage.cpvt
    public final Map d(List list) {
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(barn.b((String) it.next()));
        }
        final List listAo = fcva.ao(arrayList);
        String[] strArr = bodn.a;
        bodk bodkVar = new bodk(bodn.a);
        bodkVar.A("ConversationPinCmsDataProvider#batchGetData");
        bodkVar.d(new Function() { // from class: cpwa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bodm bodmVar = (bodm) obj;
                bodmVar.c(listAo);
                return bodmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bodkVar.d(new Function() { // from class: cpwb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bodm bodmVar = (bodm) obj;
                bodmVar.ap(new dqty("conversation_pin.pin_status", 1, 1));
                return bodmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = bodkVar.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        Iterator<E> it2 = ekgbVarZ.iterator();
        while (it2.hasNext()) {
            String string = ((bocm) it2.next()).k().toString();
            string.getClass();
            cpvy cpvyVar = (cpvy) cpvz.a.createBuilder();
            cpvyVar.getClass();
            cpvyVar.copyOnWrite();
            ((cpvz) cpvyVar.instance).b = true;
            evsn evsnVarBuild = cpvyVar.build();
            evsnVarBuild.getClass();
            linkedHashMap.put(string, new fctk(((cpvz) evsnVarBuild).toByteString()));
        }
        return linkedHashMap;
    }

    @Override // defpackage.cpvt
    public final Map e(Map map) {
        map.getClass();
        String[] strArr = bodn.a;
        bodk bodkVar = new bodk(bodn.a);
        bodkVar.c(bodn.c.b);
        bodkVar.A("ConversationPinCmsDataProvider#restoreDataInTransaction#batched#queryCount");
        ekgb ekgbVarZ = bodkVar.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((bocm) it.next()).k().a());
        }
        ekhx ekhxVarF = ekfv.f(arrayList);
        int iIntValue = ((Number) agzg.a.e()).intValue() - ekhxVarF.size();
        if (iIntValue <= 0) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleCmsAddFields");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/conversationpin/ConversationPinCmsDataProvider", "restoreDataInTransaction", 165, "ConversationPinCmsDataProvider.kt")).r("Pin limit (%s) reached, skipping restore of conversation pin data.", iIntValue);
            return fcvp.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                cpvz cpvzVar = (cpvz) evsn.parseFrom(cpvz.a, (evqs) entry.getValue());
                cpvzVar.getClass();
                if (cpvzVar.b && !ekhxVarF.contains(str)) {
                    linkedHashMap.put(str, cpvzVar);
                }
            } catch (evtj e) {
                linkedHashMap2.put(str, e);
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str2 = (String) entry2.getKey();
            cpvz cpvzVar2 = (cpvz) entry2.getValue();
            bocp bocpVar = new bocp();
            bocpVar.b(barn.b(str2));
            bocpVar.c(cpvzVar2.b);
            arrayList2.add(bocpVar.a());
        }
        bocm[] bocmVarArr = (bocm[]) fcva.am(arrayList2, iIntValue).toArray(new bocm[0]);
        try {
            dqru.B(bodn.a(), 4, false, new BiConsumer() { // from class: boci
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    bocm bocmVar = (bocm) obj;
                    Long l = (Long) obj2;
                    String[] strArr2 = bodn.a;
                    if (l.longValue() >= 0) {
                        bocmVar.a = l.longValue();
                        bocmVar.fN(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (bocm[]) Arrays.copyOf(bocmVarArr, bocmVarArr.length));
        } catch (Exception e2) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
            ((ekrd) ((ekrd) ekrwVarJ).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/conversationpin/ConversationPinCmsDataProvider", "restoreDataInTransaction", 208, "ConversationPinCmsDataProvider.kt")).q("Bulk insert of conversation pin data failed.");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(fcwa.a(map.size()));
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap3.put(((Map.Entry) it2.next()).getKey(), e2);
            }
            linkedHashMap2.putAll(linkedHashMap3);
        }
        return linkedHashMap2;
    }
}
