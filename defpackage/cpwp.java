package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
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
public final class cpwp implements cpvt {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagereactions/MessageReactionsCmsDataProvider");
    private final ckmg b;
    private final cpvx c;
    private final apoo d;
    private final aurx e;
    private final bzad f;
    private final apod g;

    public cpwp(fcsu fcsuVar, fcsu fcsuVar2, ckmg ckmgVar, cpvx cpvxVar, apoo apooVar, aurx aurxVar, bzad bzadVar, apod apodVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        ckmgVar.getClass();
        aurxVar.getClass();
        bzadVar.getClass();
        apodVar.getClass();
        this.b = ckmgVar;
        this.c = cpvxVar;
        this.d = apooVar;
        this.e = aurxVar;
        this.f = bzadVar;
        this.g = apodVar;
    }

    private final ckmb f(String str) {
        ckmb ckmbVarB = this.b.b(str);
        ckmbVarB.getClass();
        return ckmbVarB;
    }

    @Override // defpackage.cpvt
    public final epjl a() {
        return epjl.MESSAGE_REACTIONS;
    }

    @Override // defpackage.cpvt
    public final List b() {
        if (this.e.aj()) {
            bzad bzadVar = this.f;
            bbmm bbmmVarA = bzadVar.b(10, bbml.INSERT).a(1, "message_id");
            bbmmVarA.f = 5;
            bbmmVarA.g = byxy.a(6);
            String strA = bbmmVarA.a();
            bbmm bbmmVarA2 = bzadVar.b(10, bbml.UPDATE).a(1, "message_id");
            bbmmVarA2.f = 5;
            bbmmVarA2.g = byxy.a(6);
            String strA2 = bbmmVarA2.a();
            bbmm bbmmVarA3 = bzadVar.b(10, bbml.DELETE).a(1, "message_id");
            bbmmVarA3.f = 5;
            bbmmVarA3.g = byxy.a(6);
            return fcva.g(strA, strA2, bbmmVarA3.a());
        }
        bbmm bbmmVar = new bbmm();
        bbmmVar.c = bbml.INSERT;
        bbmmVar.e = 32;
        bbmmVar.b = 10;
        bbmmVar.i = "message_id";
        bbmmVar.f = 5;
        bbmmVar.c();
        bbmmVar.g = byxy.a(6);
        apod apodVar = this.g;
        bbmmVar.h = apodVar.a();
        String strA3 = bbmmVar.a();
        bbmm bbmmVar2 = new bbmm();
        bbmmVar2.c = bbml.UPDATE;
        bbmmVar2.e = 32;
        bbmmVar2.b = 10;
        bbmmVar2.i = "message_id";
        bbmmVar2.f = 5;
        bbmmVar2.c();
        bbmmVar2.g = byxy.a(6);
        bbmmVar2.h = apodVar.a();
        String strA4 = bbmmVar2.a();
        bbmm bbmmVar3 = new bbmm();
        bbmmVar3.c = bbml.DELETE;
        bbmmVar3.e = 32;
        bbmmVar3.b = 10;
        bbmmVar3.i = "message_id";
        bbmmVar3.f = 5;
        bbmmVar3.c();
        bbmmVar3.g = byxy.a(6);
        bbmmVar3.h = apodVar.a();
        return fcva.g(strA3, strA4, bbmmVar3.a());
    }

    @Override // defpackage.cpvt
    public final List c() {
        bbml bbmlVar = bbml.INSERT;
        bzad bzadVar = this.f;
        return fcva.g(bzadVar.c(10, bbmlVar), bzadVar.c(10, bbml.UPDATE), bzadVar.c(10, bbml.DELETE));
    }

    @Override // defpackage.cpvt
    public final Map d(final List list) {
        int i;
        int i2;
        Object objA;
        int i3;
        ArrayList arrayList;
        if (!this.d.a() || !cpyl.a()) {
            return fcvp.a;
        }
        bqkg bqkgVarA = bqkl.a();
        bqkgVarA.A("bugleReactionBindData");
        bqkgVarA.f(new Function() { // from class: cpwl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                List list2 = list;
                bqkk bqkkVar = (bqkk) obj;
                ArrayList arrayList2 = new ArrayList(fcva.p(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(bary.b((String) it.next()));
                }
                bqkkVar.c(arrayList2);
                return bqkkVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdr brdrVarD = MessagesTable.d();
        int i4 = 1;
        bran branVar = MessagesTable.c;
        int i5 = 0;
        brdrVarD.c(branVar.M);
        dqtr dqtrVarI = dqts.i(brdrVarD.b(), branVar.a, bqkl.c.d);
        ((dqos) dqtrVarI).e = "joined_messages";
        bqkgVarA.H(dqtrVarI.g());
        bqkgVarA.A("MessageReactionsCmsDataProvider#getData#batched");
        ekgb<bqit> ekgbVarZ = bqkgVarA.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it = ekgbVarZ.iterator();
        while (true) {
            i = 10;
            if (!it.hasNext()) {
                break;
            }
            bqit bqitVar = (bqit) it.next();
            if (bqitVar.n() != null) {
                cklv cklvVarN = bqitVar.n();
                cklvVarN.getClass();
                evtg evtgVar = cklvVarN.b;
                evtgVar.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator<E> it2 = evtgVar.iterator();
                while (it2.hasNext()) {
                    evtg evtgVar2 = ((ckme) it2.next()).d;
                    evtgVar2.getClass();
                    fcva.y(arrayList3, evtgVar2);
                }
                ArrayList arrayList4 = new ArrayList(fcva.p(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ckly cklyVar = ((ckmi) it3.next()).c;
                    if (cklyVar == null) {
                        cklyVar = ckly.a;
                    }
                    arrayList4.add(cklyVar.b);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2.add(arrayList);
            }
        }
        final List listAo = fcva.ao(fcva.q(arrayList2));
        ParticipantsTable.BindData bindDataA = ((bbca) this.c.a.b()).a();
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("CmsDataProviderDatabaseOperations#getCmsIdsForParticipants");
        bsboVarE.h(new Function() { // from class: cpvv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.m(listAo);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.e(new Function() { // from class: cpvw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brzh brzhVar = (brzh) obj;
                return new brzi[]{brzhVar.a, brzhVar.E, brzhVar.d};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb<ParticipantsTable.BindData> ekgbVarZ2 = bsboVarE.b().z();
        ekgbVarZ2.getClass();
        ArrayList arrayList5 = new ArrayList(fcva.p(ekgbVarZ2, 10));
        for (ParticipantsTable.BindData bindData : ekgbVarZ2) {
            arrayList5.add(new fcti(bindData.R(), bindData));
        }
        Map mapK = fcwa.k(arrayList5);
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(mapK.size()));
        for (Map.Entry entry : mapK.entrySet()) {
            linkedHashMap.put(entry.getKey(), bbdl.k((ParticipantsTable.BindData) entry.getValue()) ? bindDataA : (ParticipantsTable.BindData) entry.getValue());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) entry2.getValue();
            arrayList6.add(new fcti(str, bindData2 != null ? bindData2.L() : null));
        }
        Map mapK2 = fcwa.k(arrayList6);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (bqit bqitVar2 : ekgbVarZ) {
            String strB = bqitVar2.k().b();
            strB.getClass();
            if (bqitVar2.n() != null) {
                try {
                    cklv cklvVarN2 = bqitVar2.n();
                    cklvVarN2.getClass();
                    epml epmlVar = (epml) epmm.a.createBuilder();
                    epmlVar.getClass();
                    for (ckme ckmeVar : cklvVarN2.b) {
                        ckmeVar.getClass();
                        epmf epmfVar = (epmf) epmg.a.createBuilder();
                        epmfVar.getClass();
                        ckmb ckmbVar = ckmeVar.c;
                        if (ckmbVar == null) {
                            ckmbVar = ckmb.a;
                        }
                        String str2 = ckmbVar.d;
                        str2.getClass();
                        epmfVar.copyOnWrite();
                        ((epmg) epmfVar.instance).b = str2;
                        evsn evsnVarBuild = epmfVar.build();
                        evsnVarBuild.getClass();
                        epmg epmgVar = (epmg) evsnVarBuild;
                        ArrayList arrayList7 = new ArrayList();
                        evtg evtgVar3 = ckmeVar.d;
                        evtgVar3.getClass();
                        i2 = i5;
                        try {
                            ArrayList arrayList8 = new ArrayList(fcva.p(evtgVar3, i));
                            Iterator<E> it4 = evtgVar3.iterator();
                            while (it4.hasNext()) {
                                ckly cklyVar2 = ((ckmi) it4.next()).c;
                                if (cklyVar2 == null) {
                                    cklyVar2 = ckly.a;
                                }
                                arrayList8.add(cklyVar2.b);
                            }
                            for (ckmi ckmiVar : ckmeVar.d) {
                                ckly cklyVar3 = ckmiVar.c;
                                if (cklyVar3 == null) {
                                    cklyVar3 = ckly.a;
                                }
                                String str3 = cklyVar3.b;
                                str3.getClass();
                                String str4 = (String) mapK2.get(str3);
                                if (str4 == null) {
                                    throw new cpyx("Cannot create reaction for missing participant", ekgb.r(new cpyp(str3, i4)));
                                }
                                try {
                                    ckly cklyVar4 = ckmiVar.c;
                                    if (cklyVar4 == null) {
                                        cklyVar4 = ckly.a;
                                    }
                                    boolean z = cklyVar4.c;
                                    boolean z2 = ckmiVar.d;
                                    epmd epmdVar = (epmd) epme.a.createBuilder();
                                    epmdVar.getClass();
                                    epmdVar.copyOnWrite();
                                    int i6 = i4;
                                    ((epme) epmdVar.instance).b = str4;
                                    epmdVar.copyOnWrite();
                                    ((epme) epmdVar.instance).c = z;
                                    evsn evsnVarBuild2 = epmdVar.build();
                                    evsnVarBuild2.getClass();
                                    epmj epmjVar = (epmj) epmk.a.createBuilder();
                                    epmjVar.getClass();
                                    epmjVar.copyOnWrite();
                                    epmk epmkVar = (epmk) epmjVar.instance;
                                    epmkVar.c = (epme) evsnVarBuild2;
                                    epmkVar.b |= 1;
                                    epmjVar.copyOnWrite();
                                    ((epmk) epmjVar.instance).d = z2;
                                    evsn evsnVarBuild3 = epmjVar.build();
                                    evsnVarBuild3.getClass();
                                    arrayList7.add((epmk) evsnVarBuild3);
                                    i4 = i6;
                                } catch (cpyx e) {
                                    e = e;
                                    cpyz cpyzVar = cpyz.NO_RETRY;
                                    Object[] objArr = new Object[1];
                                    objArr[i2] = e.a;
                                    String str5 = String.format("Could not find cmsId for participantId %s.", Arrays.copyOf(objArr, 1));
                                    str5.getClass();
                                    objA = fctl.a(new cpwo(cpyzVar, str5));
                                    i5 = i2;
                                    i3 = 1;
                                    linkedHashMap2.put(strB, new fctk(objA));
                                    i4 = i3;
                                    i = 10;
                                }
                            }
                            epmh epmhVar = (epmh) epmi.a.createBuilder();
                            epmhVar.copyOnWrite();
                            epmi epmiVar = (epmi) epmhVar.instance;
                            epmiVar.c = epmgVar;
                            epmiVar.b |= 1;
                            epmhVar.copyOnWrite();
                            epmi epmiVar2 = (epmi) epmhVar.instance;
                            evtg evtgVar4 = epmiVar2.d;
                            if (!evtgVar4.c()) {
                                epmiVar2.d = evsn.mutableCopy(evtgVar4);
                            }
                            evpz.addAll(arrayList7, epmiVar2.d);
                            evsn evsnVarBuild4 = epmhVar.build();
                            evsnVarBuild4.getClass();
                            epmi epmiVar3 = (epmi) evsnVarBuild4;
                            epmlVar.copyOnWrite();
                            epmm epmmVar = (epmm) epmlVar.instance;
                            evtg evtgVar5 = epmmVar.c;
                            if (!evtgVar5.c()) {
                                epmmVar.c = evsn.mutableCopy(evtgVar5);
                            }
                            epmmVar.c.add(epmiVar3);
                            i5 = i2;
                            i4 = 1;
                            i = 10;
                        } catch (cpyx e2) {
                            e = e2;
                        }
                    }
                    i2 = i5;
                    evsn evsnVarBuild5 = epmlVar.build();
                    evsnVarBuild5.getClass();
                    objA = ((epmm) evsnVarBuild5).toByteString();
                } catch (cpyx e3) {
                    e = e3;
                    i2 = i5;
                }
                i5 = i2;
                i3 = 1;
            } else {
                int i7 = i5;
                bqitVar2.getClass();
                ckmb ckmbVarO = bqitVar2.o();
                String str6 = ckmbVarO != null ? ckmbVarO.d : null;
                if (str6 == null) {
                    str6 = ckmg.a(bqitVar2.p()).d;
                    str6.getClass();
                }
                i5 = i7;
                dqpd[] dqpdVarArrAH = bqitVar2.aH("joined_messages", new MessagesTable.BindData[i5]);
                dqpdVarArrAH.getClass();
                MessagesTable.BindData bindData3 = (MessagesTable.BindData) fcur.I(dqpdVarArrAH);
                String strU = bindData3 != null ? bindData3.U() : null;
                if (strU != null) {
                    epml epmlVar2 = (epml) epmm.a.createBuilder();
                    epmlVar2.getClass();
                    epmb epmbVar = (epmb) epmc.a.createBuilder();
                    epmbVar.getClass();
                    epmbVar.copyOnWrite();
                    ((epmc) epmbVar.instance).b = str6;
                    epmbVar.copyOnWrite();
                    ((epmc) epmbVar.instance).c = strU;
                    evsn evsnVarBuild6 = epmbVar.build();
                    evsnVarBuild6.getClass();
                    epmlVar2.copyOnWrite();
                    epmm epmmVar2 = (epmm) epmlVar2.instance;
                    epmmVar2.d = (epmc) evsnVarBuild6;
                    i3 = 1;
                    epmmVar2.b |= 1;
                    evsn evsnVarBuild7 = epmlVar2.build();
                    evsnVarBuild7.getClass();
                    objA = ((epmm) evsnVarBuild7).toByteString();
                } else {
                    i3 = 1;
                    MessageIdType messageIdTypeM = bqitVar2.m();
                    messageIdTypeM.getClass();
                    objA = fctl.a(cpvx.a(messageIdTypeM));
                }
            }
            linkedHashMap2.put(strB, new fctk(objA));
            i4 = i3;
            i = 10;
        }
        return linkedHashMap2;
    }

    @Override // defpackage.cpvt
    public final Map e(Map map) {
        bqit bqitVarA;
        map.getClass();
        if (!this.d.a() || !cpyl.a()) {
            return fcvp.a;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            try {
                epmm epmmVar = (epmm) evsn.parseFrom(epmm.a, (evqs) entry.getValue());
                epmmVar.getClass();
                linkedHashMap.put(str, epmmVar);
            } catch (evtj e) {
                linkedHashMap2.put(str, e);
            }
        }
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("reactedMessageCmsIdsToBugleIds");
        brdrVarD.h(new Function() { // from class: cpwm
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
                    epmc epmcVar = ((epmm) it.next()).d;
                    if (epmcVar == null) {
                        epmcVar = epmc.a;
                    }
                    arrayList.add(epmcVar.c);
                }
                brecVar.g(arrayList);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bran branVar = MessagesTable.c;
        brdrVarD.c(branVar.M, branVar.a);
        ekgb<MessagesTable.BindData> ekgbVarZ = brdrVarD.b().z();
        ekgbVarZ.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ, 10)), 16));
        for (MessagesTable.BindData bindData : ekgbVarZ) {
            fcti fctiVar = new fcti(bindData.U(), bindData.E().b());
            linkedHashMap3.put(fctiVar.a, fctiVar.b);
        }
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("participantsCmsIdsToBugleIds");
        bsboVarE.h(new Function() { // from class: cpwn
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
                    evtg evtgVar = ((epmm) it.next()).c;
                    evtgVar.getClass();
                    fcva.y(arrayList, evtgVar);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    evtg evtgVar2 = ((epmi) it2.next()).d;
                    evtgVar2.getClass();
                    fcva.y(arrayList2, evtgVar2);
                }
                ArrayList arrayList3 = new ArrayList(fcva.p(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    epme epmeVar = ((epmk) it3.next()).c;
                    if (epmeVar == null) {
                        epmeVar = epme.a;
                    }
                    arrayList3.add(epmeVar.b);
                }
                bsbxVar.e(arrayList3);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brzh brzhVar = ParticipantsTable.c;
        bsboVarE.c(brzhVar.E, brzhVar.a);
        ekgb<ParticipantsTable.BindData> ekgbVarZ2 = bsboVarE.b().z();
        ekgbVarZ2.getClass();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(ekgbVarZ2, 10)), 16));
        for (ParticipantsTable.BindData bindData2 : ekgbVarZ2) {
            fcti fctiVar2 = new fcti(bindData2.L(), bindData2.R());
            linkedHashMap4.put(fctiVar2.a, fctiVar2.b);
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : setEntrySet) {
            String str2 = (String) entry2.getKey();
            epmm epmmVar2 = (epmm) entry2.getValue();
            if (epmmVar2.c.size() != 0) {
                cklu ckluVar = (cklu) cklv.a.createBuilder();
                ckluVar.getClass();
                for (epmi epmiVar : epmmVar2.c) {
                    DesugarCollections.unmodifiableList(((cklv) ckluVar.instance).b).getClass();
                    epmiVar.getClass();
                    ckmd ckmdVar = (ckmd) ckme.a.createBuilder();
                    ckmdVar.getClass();
                    epmg epmgVar = epmiVar.c;
                    if (epmgVar == null) {
                        epmgVar = epmg.a;
                    }
                    String str3 = epmgVar.b;
                    str3.getClass();
                    ckmf.b(f(str3), ckmdVar);
                    for (epmk epmkVar : epmiVar.d) {
                        epme epmeVar = epmkVar.c;
                        if (epmeVar == null) {
                            epmeVar = epme.a;
                        }
                        String str4 = (String) linkedHashMap4.get(epmeVar.b);
                        if (str4 != null) {
                            DesugarCollections.unmodifiableList(((ckme) ckmdVar.instance).d).getClass();
                            ckmh ckmhVar = (ckmh) ckmi.a.createBuilder();
                            ckmhVar.getClass();
                            cklx cklxVar = (cklx) ckly.a.createBuilder();
                            cklxVar.getClass();
                            cklz.c(str4, cklxVar);
                            epme epmeVar2 = epmkVar.c;
                            if (epmeVar2 == null) {
                                epmeVar2 = epme.a;
                            }
                            cklz.b(epmeVar2.c, cklxVar);
                            ckmj.b(cklz.a(cklxVar), ckmhVar);
                            ckmdVar.a(ckmj.a(ckmhVar));
                        }
                    }
                    ckluVar.b(ckmf.a(ckmdVar));
                }
                evsn evsnVarBuild = ckluVar.build();
                evsnVarBuild.getClass();
                String[] strArr = bqkl.a;
                bqiy bqiyVar = new bqiy();
                bqiyVar.e(bary.b(str2));
                bqiyVar.h((cklv) evsnVarBuild);
                bqitVarA = bqiyVar.a();
            } else {
                epmc epmcVar = epmmVar2.d;
                if (epmcVar == null) {
                    epmcVar = epmc.a;
                }
                String str5 = (String) linkedHashMap3.get(epmcVar.c);
                if (str5 == null) {
                    epmc epmcVar2 = epmmVar2.d;
                    if (epmcVar2 == null) {
                        epmcVar2 = epmc.a;
                    }
                    ekgb ekgbVarR = ekgb.r(new cpyp(epmcVar2.c, 3));
                    ekgbVarR.getClass();
                    linkedHashMap2.put(str2, new cpyq("Cannot create message reaction. BugleId does not exist for reacted message.", ekgbVarR));
                    bqitVarA = null;
                } else {
                    epmc epmcVar3 = epmmVar2.d;
                    if (epmcVar3 == null) {
                        epmcVar3 = epmc.a;
                    }
                    String str6 = epmcVar3.b;
                    str6.getClass();
                    ckmb ckmbVarF = f(str6);
                    String[] strArr2 = bqkl.a;
                    bqiy bqiyVar2 = new bqiy();
                    bqiyVar2.e(bary.b(str2));
                    ckml ckmlVarB = ckml.b(ckmbVarF.e);
                    if (ckmlVarB == null) {
                        ckmlVarB = ckml.UNRECOGNIZED;
                    }
                    bqiyVar2.g(ckmlVarB);
                    bqiyVar2.d(ckmbVarF);
                    bqiyVar2.f(bary.b(str5));
                    bqitVarA = bqiyVar2.a();
                }
            }
            if (bqitVarA != null) {
                arrayList.add(bqitVarA);
            }
        }
        bqit[] bqitVarArr = (bqit[]) arrayList.toArray(new bqit[0]);
        try {
            dqru.B(bqkl.b(), 5, false, new BiConsumer() { // from class: bqim
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    bqit bqitVar = (bqit) obj;
                    Long l = (Long) obj2;
                    String[] strArr3 = bqkl.a;
                    if (l.longValue() >= 0) {
                        bqitVar.a = l.longValue();
                        bqitVar.fN(0);
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (bqit[]) Arrays.copyOf(bqitVarArr, bqitVarArr.length));
        } catch (Exception e2) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleCmsAddFields");
            ((ekrd) ((ekrd) ekrwVarJ).g(e2).h("com/google/android/apps/messaging/shared/util/cloudstore/completeness/messagereactions/MessageReactionsCmsDataProvider", "restoreDataInTransaction", 501, "MessageReactionsCmsDataProvider.kt")).q("Bulk insert of message reaction data failed.");
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(fcwa.a(map.size()));
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                linkedHashMap5.put(((Map.Entry) it.next()).getKey(), e2);
            }
            linkedHashMap2.putAll(linkedHashMap5);
        }
        return linkedHashMap2;
    }
}
