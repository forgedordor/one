package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.time.Instant;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpxn implements cpvt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/scheduledsend/ScheduledSendCmsDataProvider");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public cpxn(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar5;
    }

    @Override // defpackage.cpvt
    public final epjl a() {
        return epjl.SCHEDULED_SEND;
    }

    @Override // defpackage.cpvt
    public final List b() {
        if (((aurx) this.c.b()).aj()) {
            bbmm bbmmVarA = ((bzad) this.d.b()).b(16, bbml.DELETE).a(1, "message_id");
            bbmmVarA.f = 5;
            bbmmVarA.g = byxy.a(6);
            return fcva.b(bbmmVarA.a());
        }
        bbmm bbmmVar = new bbmm();
        bbmmVar.c = bbml.DELETE;
        bbmmVar.e = 32;
        bbmmVar.b = 16;
        bbmmVar.i = "message_id";
        bbmmVar.f = 5;
        bbmmVar.c();
        bbmmVar.g = byxy.a(6);
        bbmmVar.h = ((apod) this.e.b()).a();
        return fcva.b(bbmmVar.a());
    }

    @Override // defpackage.cpvt
    public final List c() {
        return fcva.b(((bzad) this.d.b()).c(16, bbml.DELETE));
    }

    @Override // defpackage.cpvt
    public final Map d(final List list) {
        cmcm cmcmVarB = ScheduledSendTable.b();
        cmcmVarB.A("batchGetScheduledSendData");
        cmcmVarB.e(new Function() { // from class: cpxl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                cmcs cmcsVar = (cmcs) obj;
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
                cmcsVar.ap(new dqpm("scheduled_send.message_id", 3, cmcs.as(ekfwVar.g()), true));
                return cmcsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb<ScheduledSendTable.BindData> ekgbVarZ = cmcmVarB.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (ScheduledSendTable.BindData bindData : ekgbVarZ) {
            bindData.aA(1, "message_id");
            String string = bindData.b.toString();
            string.getClass();
            cpxh cpxhVar = (cpxh) cpxi.a.createBuilder();
            cpxhVar.getClass();
            Instant instantM = bindData.m();
            instantM.getClass();
            evvp evvpVarB = evxd.b(instantM);
            cpxhVar.copyOnWrite();
            cpxi cpxiVar = (cpxi) cpxhVar.instance;
            cpxiVar.c = evvpVarB;
            cpxiVar.b = 1 | cpxiVar.b;
            bindData.aA(4, "status");
            String strName = bindData.e.name();
            strName.getClass();
            cpxhVar.copyOnWrite();
            ((cpxi) cpxhVar.instance).d = strName;
            Instant instantK = bindData.k();
            instantK.getClass();
            evvp evvpVarB2 = evxd.b(instantK);
            cpxhVar.copyOnWrite();
            cpxi cpxiVar2 = (cpxi) cpxhVar.instance;
            cpxiVar2.e = evvpVarB2;
            cpxiVar2.b |= 2;
            evsn evsnVarBuild = cpxhVar.build();
            evsnVarBuild.getClass();
            linkedHashMap.put(string, new fctk(((cpxi) evsnVarBuild).toByteString()));
        }
        return linkedHashMap;
    }

    @Override // defpackage.cpvt
    public final Map e(Map map) {
        ScheduledSendTable.BindData bindDataA;
        map.getClass();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                cpxi cpxiVar = (cpxi) evsn.parseFrom(cpxi.a, (evqs) entry.getValue());
                cpxiVar.getClass();
                MessageIdType messageIdTypeB = bary.b(str);
                evvp evvpVar = cpxiVar.c;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                evvpVar.getClass();
                if (evxd.d(evvpVar).compareTo(((cogw) this.b.b()).f()) >= 0) {
                    linkedHashMap.put(messageIdTypeB, cpxiVar);
                } else {
                    arrayList.add(messageIdTypeB);
                }
            } catch (evtj e) {
                linkedHashMap2.put(str, e);
            }
        }
        if (!arrayList.isEmpty()) {
            String[] strArr = MessagesTable.a;
            brdu brduVar = new brdu();
            brduVar.ap("markedScheduledMessagesAsFailed");
            brduVar.X(new Function() { // from class: cpxm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.t(arrayList);
                    brecVar.ae(16);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brduVar.U(8);
            int iE = brduVar.b().e();
            if (iE != arrayList.size()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/scheduledsend/ScheduledSendCmsDataProvider", "markedScheduledMessagesAsFailed", 255, "ScheduledSendCmsDataProvider.kt")).u("Executed update of %s messages but only %s rows affected", arrayList.size(), iE);
            }
        }
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("restoreDataInTransaction");
        brdrVarD.h(new Function() { // from class: cpxj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.t(linkedHashMap.keySet());
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.e(new Function() { // from class: cpxk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                return new brao[]{branVar.a, branVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb<MessagesTable.BindData> ekgbVarZ = brdrVarD.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (MessagesTable.BindData bindData : ekgbVarZ) {
            fcti fctiVar = new fcti(bindData.E(), bindData.D());
            linkedHashMap3.put(fctiVar.a, fctiVar.b);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            MessageIdType messageIdType = (MessageIdType) entry2.getKey();
            cpxi cpxiVar2 = (cpxi) entry2.getValue();
            ConversationIdType conversationIdType = (ConversationIdType) linkedHashMap3.get(messageIdType);
            if (conversationIdType == null || conversationIdType.b()) {
                String strB = messageIdType.b();
                Objects.toString(messageIdType);
                linkedHashMap2.put(strB, new IllegalArgumentException("No conversation id found for message id: ".concat(String.valueOf(messageIdType))));
                bindDataA = null;
            } else {
                String[] strArr2 = ScheduledSendTable.a;
                cmbi cmbiVar = new cmbi();
                cmbiVar.f(messageIdType);
                cmbiVar.c(conversationIdType);
                evvp evvpVar2 = cpxiVar2.c;
                if (evvpVar2 == null) {
                    evvpVar2 = evvp.a;
                }
                evvpVar2.getClass();
                cmbiVar.g(evxd.d(evvpVar2));
                evvp evvpVar3 = cpxiVar2.e;
                if (evvpVar3 == null) {
                    evvpVar3 = evvp.a;
                }
                evvpVar3.getClass();
                cmbiVar.d(evxd.d(evvpVar3));
                String str2 = cpxiVar2.d;
                str2.getClass();
                cmbiVar.h((cmct) Enum.valueOf(cmct.class, str2));
                bindDataA = cmbiVar.a();
            }
            if (bindDataA != null) {
                arrayList2.add(bindDataA);
            }
        }
        ScheduledSendTable.BindData[] bindDataArr = (ScheduledSendTable.BindData[]) arrayList2.toArray(new ScheduledSendTable.BindData[0]);
        try {
            dqru.B(ScheduledSendTable.c(), 5, false, new BiConsumer() { // from class: cmay
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ScheduledSendTable.BindData bindData2 = (ScheduledSendTable.BindData) obj;
                    Long l = (Long) obj2;
                    String[] strArr3 = ScheduledSendTable.a;
                    if (l.longValue() >= 0) {
                        bindData2.a = String.valueOf(l);
                        bindData2.fN(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (ScheduledSendTable.BindData[]) Arrays.copyOf(bindDataArr, bindDataArr.length));
        } catch (Exception e2) {
            ekrw ekrwVarJ2 = a.j();
            ekrwVarJ2.X(eksq.a, "BugleCmsAddFields");
            ((ekrd) ((ekrd) ekrwVarJ2).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/scheduledsend/ScheduledSendCmsDataProvider", "restoreDataInTransaction", 237, "ScheduledSendCmsDataProvider.kt")).q("Bulk insert of scheduled send data failed.");
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
