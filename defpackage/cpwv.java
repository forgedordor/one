package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
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
public final class cpwv implements cpvt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagereplies/MessageRepliesCmsDataProvider");
    private final aurx b;
    private final bzad c;
    private final apod d;

    public cpwv(fcsu fcsuVar, aurx aurxVar, bzad bzadVar, apod apodVar) {
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
        return epjl.MESSAGE_REPLIES;
    }

    @Override // defpackage.cpvt
    public final List b() {
        if (this.b.aj()) {
            bbmm bbmmVarA = this.c.b(13, bbml.UPDATE).a(1, "message_id");
            bbmmVarA.f = 5;
            bbmmVarA.d = ekgb.r("replied_to_message_id");
            bbmmVarA.g = byxy.a(6);
            return fcva.b(bbmmVarA.a());
        }
        bbmm bbmmVar = new bbmm();
        bbmmVar.c = bbml.UPDATE;
        bbmmVar.e = 32;
        bbmmVar.b = 13;
        bbmmVar.d = ekjz.c("replied_to_message_id");
        bbmmVar.i = "message_id";
        bbmmVar.f = 5;
        bbmmVar.c();
        bbmmVar.g = byxy.a(6);
        bbmmVar.h = this.d.a();
        return fcva.b(bbmmVar.a());
    }

    @Override // defpackage.cpvt
    public final List c() {
        return fcva.b(this.c.c(13, bbml.UPDATE));
    }

    @Override // defpackage.cpvt
    public final Map d(final List list) {
        Object byteString;
        String[] strArr = bqmc.a;
        bqlw bqlwVar = new bqlw(bqmc.a);
        bqlwVar.A("getData");
        bqlwVar.e(new Function() { // from class: cpws
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                bqmb bqmbVar = (bqmb) obj;
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
                bqmbVar.ap(new dqpm("message_replies.message_id", 3, bqmb.as(ekfwVar.g()), true));
                return bqmbVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdr brdrVarD = MessagesTable.d();
        bran branVar = MessagesTable.c;
        brdrVarD.c(branVar.M);
        dqtr dqtrVarI = dqts.i(brdrVarD.b(), branVar.a, bqmc.c.b);
        ((dqos) dqtrVarI).e = "joined_messages";
        bqlwVar.H(dqtrVarI.g());
        bqlwVar.A("MessageRepliesCmsDataProvider#getData#batched");
        ekgb<bqks> ekgbVarZ = bqlwVar.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (bqks bqksVar : ekgbVarZ) {
            dqpd[] dqpdVarArrAH = bqksVar.aH("joined_messages", new MessagesTable.BindData[0]);
            dqpdVarArrAH.getClass();
            MessagesTable.BindData bindData = (MessagesTable.BindData) fcur.I(dqpdVarArrAH);
            String strU = bindData != null ? bindData.U() : null;
            String strB = bqksVar.m().b();
            if (bindData == null || strU != null) {
                cpwq cpwqVar = (cpwq) cpwr.a.createBuilder();
                cpwqVar.getClass();
                if (strU != null) {
                    cpwqVar.copyOnWrite();
                    cpwr cpwrVar = (cpwr) cpwqVar.instance;
                    cpwrVar.b |= 1;
                    cpwrVar.c = strU;
                }
                ahqp ahqpVarK = bqksVar.k();
                ahqpVarK.getClass();
                cpwqVar.copyOnWrite();
                cpwr cpwrVar2 = (cpwr) cpwqVar.instance;
                cpwrVar2.d = ahqpVarK.a();
                cpwrVar2.b |= 2;
                bqksVar.aA(3, "replied_to_rcs_message_id");
                String strD = basd.d(bqksVar.d);
                if (strD != null) {
                    cpwqVar.copyOnWrite();
                    cpwr cpwrVar3 = (cpwr) cpwqVar.instance;
                    cpwrVar3.b |= 4;
                    cpwrVar3.e = strD;
                }
                evsn evsnVarBuild = cpwqVar.build();
                evsnVarBuild.getClass();
                byteString = ((cpwr) evsnVarBuild).toByteString();
            } else {
                MessageIdType messageIdTypeN = bqksVar.n();
                messageIdTypeN.getClass();
                byteString = fctl.a(cpvx.a(messageIdTypeN));
            }
            fcti fctiVar = new fcti(strB, new fctk(byteString));
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        return linkedHashMap;
    }

    @Override // defpackage.cpvt
    public final Map e(Map map) {
        map.getClass();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                linkedHashMap.put(str, (cpwr) evsn.parseFrom(cpwr.a, (evqs) entry.getValue()));
            } catch (evtj e) {
                linkedHashMap2.put(str, e);
            }
        }
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("cmsIdToRepliedToBugleId");
        brdrVarD.h(new Function() { // from class: cpwt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList = new ArrayList(fcva.p(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(((cpwr) it.next()).c);
                }
                brecVar.g(arrayList);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.e(new Function() { // from class: cpwu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                return new brao[]{branVar.a, branVar.M};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.A("MessageRepliesCmsDataProvider#restoreDataInTransaction");
        ekgb<MessagesTable.BindData> ekgbVarZ = brdrVarD.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (MessagesTable.BindData bindData : ekgbVarZ) {
            fcti fctiVar = new fcti(bindData.U(), bindData.E().b());
            linkedHashMap3.put(fctiVar.a, fctiVar.b);
        }
        Set setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Map.Entry entry2 = (Map.Entry) next;
            String str2 = (String) entry2.getKey();
            if ((((cpwr) entry2.getValue()).b & 1) != 0) {
                Set setKeySet = linkedHashMap3.keySet();
                cpwr cpwrVar = (cpwr) linkedHashMap.get(str2);
                if (!setKeySet.contains(cpwrVar != null ? cpwrVar.c : null)) {
                    arrayList.add(next);
                }
            }
            arrayList2.add(next);
        }
        fcti fctiVar2 = new fcti(arrayList, arrayList2);
        List list = (List) fctiVar2.a;
        List<Map.Entry> list2 = (List) fctiVar2.b;
        ArrayList arrayList3 = new ArrayList(fcva.p(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add((String) ((Map.Entry) it2.next()).getKey());
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(arrayList3, 10)), 16));
        for (Object obj : arrayList3) {
            cpwr cpwrVar2 = (cpwr) linkedHashMap.get((String) obj);
            ekgb ekgbVarR = ekgb.r(new cpyp(cpwrVar2 != null ? cpwrVar2.c : null, 3));
            ekgbVarR.getClass();
            linkedHashMap4.put(obj, new cpyq("Cannot create message reply. BugleId does not exist for replied-to message.", ekgbVarR));
        }
        linkedHashMap2.putAll(linkedHashMap4);
        ArrayList arrayList4 = new ArrayList(fcva.p(list2, 10));
        for (Map.Entry entry3 : list2) {
            String str3 = (String) entry3.getKey();
            cpwr cpwrVar3 = (cpwr) entry3.getValue();
            String[] strArr = bqmc.a;
            bqkx bqkxVar = new bqkx();
            bqkxVar.d(bary.b(str3));
            String str4 = (String) linkedHashMap3.get(cpwrVar3.c);
            if (str4 != null) {
                bqkxVar.e(bary.b(str4));
            }
            cpwr cpwrVar4 = (cpwr) linkedHashMap.get(str3);
            if (cpwrVar4 != null) {
                if ((cpwrVar4.b & 2) != 0) {
                    ahqp ahqpVarB = ahqp.b(cpwrVar4.d);
                    if (ahqpVarB == null) {
                        ahqpVarB = ahqp.UNRECOGNIZED;
                    }
                    bqkxVar.f(ahqpVarB);
                }
                if ((cpwrVar4.b & 4) != 0) {
                    bqkxVar.g(basd.a(cpwrVar4.e));
                }
            }
            arrayList4.add(bqkxVar.a());
        }
        bqks[] bqksVarArr = (bqks[]) arrayList4.toArray(new bqks[0]);
        try {
            dqru.B(bqmc.a(), 5, false, new BiConsumer() { // from class: bqkn
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    String[] strArr2 = bqmc.a;
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (bqks[]) Arrays.copyOf(bqksVarArr, bqksVarArr.length));
        } catch (Exception e2) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
            ((ekrd) ((ekrd) ekrwVarJ).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagereplies/MessageRepliesCmsDataProvider", "restoreDataInTransaction", 305, "MessageRepliesCmsDataProvider.kt")).q("Bulk insert of message reply data failed.");
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(fcwa.a(linkedHashMap.size()));
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (it3.hasNext()) {
                linkedHashMap5.put(((Map.Entry) it3.next()).getKey(), e2);
            }
            linkedHashMap2.putAll(linkedHashMap5);
        }
        return linkedHashMap2;
    }
}
