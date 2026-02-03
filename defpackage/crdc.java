package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crdc implements crcp {
    public static final cczv a = cdag.q(158701494, "filter_suggestion_logging");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final cgry e;

    public crdc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cgry cgryVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        cgryVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = cgryVar;
    }

    static /* synthetic */ emie j(emig emigVar, eyzv eyzvVar, int i, List list, List list2, String str, int i2, List list3, int i3, ezac ezacVar, int i4) {
        if ((i4 & 128) != 0) {
            list3 = fcvo.a;
        }
        if ((i4 & 256) != 0) {
            i3 = -1;
        }
        if ((i4 & 512) != 0) {
            ezacVar = ezac.UNKNOWN_REJECTION_REASON;
        }
        emie emieVar = (emie) emih.a.createBuilder();
        emieVar.getClass();
        emieVar.copyOnWrite();
        emih emihVar = (emih) emieVar.instance;
        emihVar.c = emigVar.d;
        emihVar.b |= 1;
        emieVar.copyOnWrite();
        emih emihVar2 = (emih) emieVar.instance;
        emihVar2.f = eyzvVar.a();
        emihVar2.b |= 4;
        emieVar.copyOnWrite();
        emih emihVar3 = (emih) emieVar.instance;
        emihVar3.b |= 2;
        emihVar3.d = i;
        emieVar.copyOnWrite();
        emih emihVar4 = (emih) emieVar.instance;
        evsx evsxVar = emihVar4.e;
        if (!evsxVar.c()) {
            emihVar4.e = evsn.mutableCopy(evsxVar);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            emihVar4.e.h(((ezan) it.next()).a());
        }
        emieVar.copyOnWrite();
        emih emihVar5 = (emih) emieVar.instance;
        evtg evtgVar = emihVar5.g;
        if (!evtgVar.c()) {
            emihVar5.g = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(list2, emihVar5.g);
        emieVar.copyOnWrite();
        emih emihVar6 = (emih) emieVar.instance;
        emihVar6.b |= 32;
        emihVar6.k = str;
        emieVar.copyOnWrite();
        emih emihVar7 = (emih) emieVar.instance;
        emihVar7.l = ezae.a(i2);
        emihVar7.b |= 64;
        if (i3 >= 0) {
            emieVar.copyOnWrite();
            emih emihVar8 = (emih) emieVar.instance;
            emihVar8.b |= 8;
            emihVar8.h = i3;
        }
        if (ezacVar != ezac.UNKNOWN_REJECTION_REASON) {
            emieVar.copyOnWrite();
            emih emihVar9 = (emih) emieVar.instance;
            emihVar9.j = ezacVar.a();
            emihVar9.b |= 16;
        }
        if (((Boolean) ((cczi) crbf.ae.get()).e()).booleanValue()) {
            emieVar.a(list3);
        }
        return emieVar;
    }

    private final long k(MessageCoreData messageCoreData) {
        if (messageCoreData.t() == 0) {
            messageCoreData.bW(((aika) this.b.b()).d(messageCoreData));
        }
        return messageCoreData.t();
    }

    private final List l(List list, long j) {
        int i;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ezgd ezgdVar = (ezgd) it.next();
            emhw emhwVar = (emhw) emhx.a.createBuilder();
            ezah ezahVarB = ezah.b(ezgdVar.d);
            if (ezahVarB == null) {
                ezahVarB = ezah.UNRECOGNIZED;
            }
            emhwVar.copyOnWrite();
            emhx emhxVar = (emhx) emhwVar.instance;
            emhxVar.e = ezahVarB.a();
            emhxVar.b |= 1;
            ezah ezahVarB2 = ezah.b(ezgdVar.d);
            if (ezahVarB2 == null) {
                ezahVarB2 = ezah.UNRECOGNIZED;
            }
            if (ezahVarB2 == ezah.NUDGE_CLASSIFICATION) {
                emeo emeoVar = (emeo) emep.a.createBuilder();
                cgry cgryVar = this.e;
                if (cgryVar.a(j)) {
                    i = 4;
                } else {
                    long epochMilli = cgryVar.a.f().toEpochMilli();
                    Object objE = crbf.Z.e();
                    objE.getClass();
                    long jLongValue = ((Number) objE).longValue() + j;
                    Object objE2 = crbf.aa.e();
                    objE2.getClass();
                    i = epochMilli > jLongValue + ((Number) objE2).longValue() ? 5 : 3;
                }
                emeoVar.copyOnWrite();
                emep emepVar = (emep) emeoVar.instance;
                emepVar.c = ezaa.a(i);
                emepVar.b |= 1;
                emhwVar.copyOnWrite();
                emhx emhxVar2 = (emhx) emhwVar.instance;
                emep emepVar2 = (emep) emeoVar.build();
                emepVar2.getClass();
                emhxVar2.d = emepVar2;
                emhxVar2.c = 2;
            }
            arrayList.add((emhx) emhwVar.build());
        }
        return fcva.ao(arrayList);
    }

    private static final List m(List list) {
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ezgd ezgdVar = (ezgd) it.next();
            emhw emhwVar = (emhw) emhx.a.createBuilder();
            ezah ezahVarB = ezah.b(ezgdVar.d);
            if (ezahVarB == null) {
                ezahVarB = ezah.UNRECOGNIZED;
            }
            emhwVar.copyOnWrite();
            emhx emhxVar = (emhx) emhwVar.instance;
            emhxVar.e = ezahVarB.a();
            emhxVar.b |= 1;
            arrayList.add((emhx) emhwVar.build());
        }
        return fcva.ao(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List n(java.util.List r7) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crdc.n(java.util.List):java.util.List");
    }

    private static final eyzv o(elny elnyVar) {
        int iOrdinal = elnyVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal == 4 || iOrdinal == 6 || iOrdinal == 8) {
                return eyzv.NOTIFICATION_VIEW;
            }
            if (iOrdinal != 15) {
                return eyzv.UNKNOWN_SOURCE;
            }
        }
        return eyzv.CONVERSATION_VIEW;
    }

    private static final List p(List list) {
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bbfa.b((SuggestionData) it.next()));
        }
        return fcva.ao(arrayList);
    }

    private static final boolean q(SuggestionData suggestionData) {
        return ((SmartSuggestionItemSuggestionData) suggestionData).l() == ezan.SILENT;
    }

    private static final int r(List list) {
        if (list.isEmpty()) {
            return 2;
        }
        SuggestionData suggestionData = (SuggestionData) list.get(0);
        Set set = bbfa.a;
        SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = suggestionData instanceof SmartSuggestionItemSuggestionData ? (SmartSuggestionItemSuggestionData) suggestionData : null;
        if (smartSuggestionItemSuggestionData != null) {
            ezgg ezggVar = smartSuggestionItemSuggestionData.c.e;
            if (ezggVar == null) {
                ezggVar = ezgg.b;
            }
            if ((ezggVar.c & 4) != 0) {
                ezgg ezggVar2 = smartSuggestionItemSuggestionData.c.e;
                if (ezggVar2 == null) {
                    ezggVar2 = ezgg.b;
                }
                ezfh ezfhVar = ezggVar2.r;
                if (ezfhVar == null) {
                    ezfhVar = ezfh.a;
                }
                int iB = ezae.b(ezfhVar.c);
                if (iB == 0) {
                    return 1;
                }
                return iB;
            }
        }
        return 2;
    }

    private static final List s(List list, boolean z) {
        cczv cczvVar = a;
        if (!((Boolean) cczvVar.e()).booleanValue()) {
            return list;
        }
        if (!z && ((Boolean) cczvVar.e()).booleanValue()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                SuggestionData suggestionData = (SuggestionData) list.get(i);
                if (suggestionData != null && q(suggestionData)) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SuggestionData suggestionData2 = (SuggestionData) obj;
            if (suggestionData2 == null || !q(suggestionData2)) {
                arrayList.add(obj);
            }
        }
        return fcva.ao(arrayList);
    }

    @Override // defpackage.crcp
    public final void a(emig emigVar, eyzv eyzvVar, String str, ConversationIdType conversationIdType, ezah ezahVar, elpn elpnVar) {
        emigVar.getClass();
        eyzvVar.getClass();
        elpnVar.getClass();
        if (((Boolean) ((cczi) crco.b.get()).e()).booleanValue()) {
            return;
        }
        emie emieVar = (emie) emih.a.createBuilder();
        emieVar.copyOnWrite();
        emih emihVar = (emih) emieVar.instance;
        emihVar.c = emigVar.d;
        emihVar.b |= 1;
        emieVar.copyOnWrite();
        emih emihVar2 = (emih) emieVar.instance;
        emihVar2.f = eyzvVar.a();
        emihVar2.b |= 4;
        emhw emhwVar = (emhw) emhx.a.createBuilder();
        emhwVar.getClass();
        emhwVar.copyOnWrite();
        emhx emhxVar = (emhx) emhwVar.instance;
        emhxVar.e = ezahVar.a();
        emhxVar.b |= 1;
        evsn evsnVarBuild = emhwVar.build();
        evsnVarBuild.getClass();
        emieVar.a(fcva.b((emhx) evsnVarBuild));
        long jB = ((aika) this.b.b()).b(conversationIdType);
        emieVar.copyOnWrite();
        emih emihVar3 = (emih) emieVar.instance;
        emihVar3.b |= 128;
        emihVar3.m = jB;
        emieVar.copyOnWrite();
        emih emihVar4 = (emih) emieVar.instance;
        emihVar4.b |= 32;
        emihVar4.k = str;
        evsn evsnVarBuild2 = emieVar.build();
        evsnVarBuild2.getClass();
        elpo elpoVar = (elpo) elpp.a.createBuilder();
        elpoVar.copyOnWrite();
        elpp elppVar = (elpp) elpoVar.instance;
        elppVar.c = elpnVar.d;
        elppVar.b |= 1;
        elpoVar.copyOnWrite();
        elpp elppVar2 = (elpp) elpoVar.instance;
        elppVar2.d = (emih) evsnVarBuild2;
        elppVar2.b |= 2;
        evsn evsnVarBuild3 = elpoVar.build();
        evsnVarBuild3.getClass();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE_CLASSIFICATION;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.aX = (elpp) evsnVarBuild3;
        ellhVar2.e |= 536870912;
        ((aill) this.c.b()).j(ellgVar);
    }

    @Override // defpackage.crcp
    public final void b(emig emigVar, eyzv eyzvVar, String str, ConversationIdType conversationIdType, ezgd ezgdVar, elpn elpnVar) {
        emigVar.getClass();
        eyzvVar.getClass();
        str.getClass();
        conversationIdType.getClass();
        ezgdVar.getClass();
        elpnVar.getClass();
        ezah ezahVarB = ezah.b(ezgdVar.d);
        if (ezahVarB == null) {
            ezahVarB = ezah.UNRECOGNIZED;
        }
        ezah ezahVar = ezahVarB;
        ezahVar.getClass();
        a(emigVar, eyzvVar, str, conversationIdType, ezahVar, elpnVar);
    }

    @Override // defpackage.crcp
    public final void c(final emig emigVar, final int i, int i2, final List list, List list2, List list3, final ezac ezacVar, final MessageCoreData messageCoreData) {
        emigVar.getClass();
        ezacVar.getClass();
        messageCoreData.getClass();
        if (((Boolean) ((cczi) crco.c.get()).e()).booleanValue()) {
            return;
        }
        Optional optional = (Optional) this.d.b();
        final fdap fdapVar = new fdap() { // from class: crcw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cdej cdejVar = (cdej) obj;
                cczv cczvVar = crdc.a;
                cdejVar.getClass();
                cqnx.c(cdejVar.c(emigVar, i, list, ezacVar, messageCoreData.C().b()), "BugleUsageStatistics", "Failed to log P2pSuggestionRequest");
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: crcx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cczv cczvVar = crdc.a;
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        List listS = s(list, true);
        emik emikVar = (emik) emil.a.createBuilder();
        emie emieVarJ = j(emigVar, eyzv.UNKNOWN_SOURCE, listS.size(), p(listS), n(listS), ((Boolean) ((cczi) crco.e.get()).e()).booleanValue() ? crbh.c(messageCoreData) : crbh.a(list), r(listS), m(list2), 0, ezacVar, 256);
        emikVar.copyOnWrite();
        emil emilVar = (emil) emikVar.instance;
        emih emihVar = (emih) emieVarJ.build();
        emihVar.getClass();
        emilVar.d = emihVar;
        emilVar.b |= 2;
        emikVar.copyOnWrite();
        emil emilVar2 = (emil) emikVar.instance;
        evtg evtgVar = emilVar2.e;
        if (!evtgVar.c()) {
            emilVar2.e = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(list3, emilVar2.e);
        emikVar.copyOnWrite();
        emil emilVar3 = (emil) emikVar.instance;
        emilVar3.b |= 1;
        emilVar3.c = i2;
        evsn evsnVarBuild = emikVar.build();
        evsnVarBuild.getClass();
        elqo elqoVar = (elqo) elqp.a.createBuilder();
        elqn elqnVar = elqn.P2P_SUGGESTION_REQUEST;
        elqoVar.copyOnWrite();
        elqp elqpVar = (elqp) elqoVar.instance;
        elqpVar.c = elqnVar.i;
        elqpVar.b |= 1;
        elqoVar.copyOnWrite();
        elqp elqpVar2 = (elqp) elqoVar.instance;
        elqpVar2.e = (emil) evsnVarBuild;
        elqpVar2.b |= 4;
        long jK = k(messageCoreData);
        elqoVar.copyOnWrite();
        elqp elqpVar3 = (elqp) elqoVar.instance;
        elqpVar3.b |= 64;
        elqpVar3.i = jK;
        evsn evsnVarBuild2 = elqoVar.build();
        evsnVarBuild2.getClass();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_P2P_SUGGESTION;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b = 1 | ellhVar.b;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.w = (elqp) evsnVarBuild2;
        ellhVar2.b |= 32768;
        ((aill) this.c.b()).j(ellgVar);
    }

    @Override // defpackage.crcp
    public final void d(emig emigVar, eyzv eyzvVar, List list, int i, elqn elqnVar, boolean z, float f, final MessageCoreData messageCoreData, Boolean bool, Boolean bool2) {
        final emig emigVar2;
        final int i2;
        emigVar.getClass();
        eyzvVar.getClass();
        list.getClass();
        elqnVar.getClass();
        messageCoreData.getClass();
        if (((Boolean) ((cczi) crco.d.get()).e()).booleanValue()) {
            return;
        }
        final List listS = s(list, false);
        if (elqnVar == elqn.P2P_SUGGESTION_CLICK) {
            Optional optional = (Optional) this.d.b();
            emigVar2 = emigVar;
            i2 = i;
            final fdap fdapVar = new fdap() { // from class: crcu
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    cdej cdejVar = (cdej) obj;
                    cczv cczvVar = crdc.a;
                    cdejVar.getClass();
                    emig emigVar3 = emigVar2;
                    List list2 = listS;
                    cqnx.c(cdejVar.a(emigVar3, eyzv.CONVERSATION_VIEW, list2.size(), list2, i2, messageCoreData.C()), "Bugle", "Failed to log P2pSuggestionClick");
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: crcv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cczv cczvVar = crdc.a;
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            emigVar2 = emigVar;
            i2 = i;
        }
        emie emieVarJ = j(emigVar2, eyzvVar, listS.size(), p(listS), n(listS), ((Boolean) ((cczi) crco.e.get()).e()).booleanValue() ? crbh.c(messageCoreData) : crbh.a(list), r(listS), null, i2, null, 640);
        elqo elqoVar = (elqo) elqp.a.createBuilder();
        elqoVar.copyOnWrite();
        elqp elqpVar = (elqp) elqoVar.instance;
        elqpVar.c = elqnVar.i;
        elqpVar.b |= 1;
        long jK = k(messageCoreData);
        elqoVar.copyOnWrite();
        elqp elqpVar2 = (elqp) elqoVar.instance;
        elqpVar2.b |= 64;
        elqpVar2.i = jK;
        int iOrdinal = elqnVar.ordinal();
        if (iOrdinal == 3 || iOrdinal == 4) {
            emia emiaVar = (emia) emib.a.createBuilder();
            emiaVar.copyOnWrite();
            emib emibVar = (emib) emiaVar.instance;
            emih emihVar = (emih) emieVarJ.build();
            emihVar.getClass();
            emibVar.c = emihVar;
            emibVar.b |= 1;
            emiaVar.copyOnWrite();
            emib emibVar2 = (emib) emiaVar.instance;
            emibVar2.b |= 2;
            emibVar2.d = z;
            emic emicVar = (emic) emid.a.createBuilder();
            emicVar.getClass();
            emicVar.copyOnWrite();
            emid emidVar = (emid) emicVar.instance;
            emidVar.b |= 1;
            emidVar.c = f;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                emicVar.copyOnWrite();
                emid emidVar2 = (emid) emicVar.instance;
                emidVar2.b |= 2;
                emidVar2.d = zBooleanValue;
            }
            if (bool2 != null) {
                boolean zBooleanValue2 = bool2.booleanValue();
                emicVar.copyOnWrite();
                emid emidVar3 = (emid) emicVar.instance;
                emidVar3.b |= 4;
                emidVar3.e = zBooleanValue2;
            }
            emiaVar.copyOnWrite();
            emib emibVar3 = (emib) emiaVar.instance;
            emid emidVar4 = (emid) emicVar.build();
            emidVar4.getClass();
            emibVar3.e = emidVar4;
            emibVar3.b |= 4;
            elqoVar.copyOnWrite();
            elqp elqpVar3 = (elqp) elqoVar.instance;
            emib emibVar4 = (emib) emiaVar.build();
            emibVar4.getClass();
            elqpVar3.f = emibVar4;
            elqpVar3.b |= 8;
        } else if (iOrdinal == 7) {
            emhy emhyVar = (emhy) emhz.a.createBuilder();
            emhyVar.copyOnWrite();
            emhz emhzVar = (emhz) emhyVar.instance;
            emih emihVar2 = (emih) emieVarJ.build();
            emihVar2.getClass();
            emhzVar.c = emihVar2;
            emhzVar.b |= 1;
            elqoVar.copyOnWrite();
            elqp elqpVar4 = (elqp) elqoVar.instance;
            emhz emhzVar2 = (emhz) emhyVar.build();
            emhzVar2.getClass();
            elqpVar4.h = emhzVar2;
            elqpVar4.b |= 32;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_P2P_SUGGESTION;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elqp elqpVar5 = (elqp) elqoVar.build();
        elqpVar5.getClass();
        ellhVar2.w = elqpVar5;
        ellhVar2.b |= 32768;
        ((aill) this.c.b()).j(ellgVar);
    }

    @Override // defpackage.crcp
    public final void e(final emig emigVar, elny elnyVar, List list, List list2, final MessageCoreData messageCoreData) throws IOException {
        emigVar.getClass();
        elnyVar.getClass();
        list.getClass();
        list2.getClass();
        messageCoreData.getClass();
        if (((Boolean) ((cczi) crco.a.get()).e()).booleanValue()) {
            return;
        }
        eieu eieuVarH = eiiy.h("SmartsClearcutLogger.logP2pSuggestionReceivedMessage");
        try {
            final List listS = s(list, false);
            Optional optional = (Optional) this.d.b();
            final fdap fdapVar = new fdap() { // from class: crcy
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    cdej cdejVar = (cdej) obj;
                    cczv cczvVar = crdc.a;
                    cdejVar.getClass();
                    emig emigVar2 = emigVar;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    List list3 = listS;
                    cqnx.c(cdejVar.b(emigVar2, elny.INCOMING, list3.size(), list3, messageCoreData2.C()), "Bugle", "Failed to log P2pSuggestionReceivedMessage");
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: crcz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cczv cczvVar = crdc.a;
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            emie emieVarJ = j(emigVar, o(elnyVar), listS.size(), p(listS), n(listS), ((Boolean) ((cczi) crco.e.get()).e()).booleanValue() ? crbh.c(messageCoreData) : crbh.a(list), r(listS), l(list2, messageCoreData.o()), 0, null, 768);
            if (((Boolean) ((cczi) crbf.ae.get()).e()).booleanValue()) {
                long jB = ((aika) this.b.b()).b(messageCoreData.A());
                emieVarJ.copyOnWrite();
                emih emihVar = (emih) emieVarJ.instance;
                emih emihVar2 = emih.a;
                emihVar.b |= 128;
                emihVar.m = jB;
            }
            emii emiiVar = (emii) emij.a.createBuilder();
            emiiVar.copyOnWrite();
            emij emijVar = (emij) emiiVar.instance;
            emih emihVar3 = (emih) emieVarJ.build();
            emihVar3.getClass();
            emijVar.c = emihVar3;
            emijVar.b |= 1;
            evsn evsnVarBuild = emiiVar.build();
            evsnVarBuild.getClass();
            elqo elqoVar = (elqo) elqp.a.createBuilder();
            elqn elqnVar = elqn.P2P_SUGGESTION_RECEIVED_MESSAGE;
            elqoVar.copyOnWrite();
            elqp elqpVar = (elqp) elqoVar.instance;
            elqpVar.c = elqnVar.i;
            elqpVar.b |= 1;
            elqoVar.copyOnWrite();
            elqp elqpVar2 = (elqp) elqoVar.instance;
            elqpVar2.g = (emij) evsnVarBuild;
            elqpVar2.b |= 16;
            long jK = k(messageCoreData);
            elqoVar.copyOnWrite();
            elqp elqpVar3 = (elqp) elqoVar.instance;
            elqpVar3.b |= 64;
            elqpVar3.i = jK;
            evsn evsnVarBuild2 = elqoVar.build();
            evsnVarBuild2.getClass();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.BUGLE_P2P_SUGGESTION;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            ellhVar2.w = (elqp) evsnVarBuild2;
            ellhVar2.b |= 32768;
            ((aill) this.c.b()).j(ellgVar);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.crcp
    public final void f(emig emigVar, List list, MessageCoreData messageCoreData) {
        emigVar.getClass();
        list.getClass();
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        ekgbVar.getClass();
        c(emigVar, 1, 0, list, ekgbVar, ekgbVar, ezac.UNKNOWN_REJECTION_REASON, messageCoreData);
    }

    @Override // defpackage.crcp
    public final void g(final emig emigVar, final elny elnyVar, List list, List list2, Optional optional, final MessageCoreData messageCoreData) {
        emigVar.getClass();
        elnyVar.getClass();
        list.getClass();
        list2.getClass();
        messageCoreData.getClass();
        if (((Boolean) ((cczi) crco.a.get()).e()).booleanValue()) {
            return;
        }
        final List listS = s(list, false);
        Optional optional2 = (Optional) this.d.b();
        final fdap fdapVar = new fdap() { // from class: crda
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cdej cdejVar = (cdej) obj;
                cczv cczvVar = crdc.a;
                cdejVar.getClass();
                emig emigVar2 = emigVar;
                elny elnyVar2 = elnyVar;
                MessageCoreData messageCoreData2 = messageCoreData;
                List list3 = listS;
                cqnx.c(cdejVar.d(emigVar2, elnyVar2, list3.size(), list3, messageCoreData2.C()), "Bugle", "Failed to log P2pSuggestionSentMessage");
                return fctx.a;
            }
        };
        optional2.ifPresent(new Consumer() { // from class: crdb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cczv cczvVar = crdc.a;
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        emie emieVarJ = j(emigVar, o(elnyVar), listS.size(), p(listS), n(listS), ((Boolean) ((cczi) crco.e.get()).e()).booleanValue() ? crbh.c(messageCoreData) : crbh.a(list), r(listS), l(list2, messageCoreData.r()), 0, null, 768);
        if (((Boolean) ((cczi) crbf.ae.get()).e()).booleanValue()) {
            long jB = ((aika) this.b.b()).b(messageCoreData.A());
            emieVarJ.copyOnWrite();
            emih emihVar = (emih) emieVarJ.instance;
            emih emihVar2 = emih.a;
            emihVar.b |= 128;
            emihVar.m = jB;
        }
        final emim emimVar = (emim) emin.a.createBuilder();
        emimVar.copyOnWrite();
        emin eminVar = (emin) emimVar.instance;
        emih emihVar3 = (emih) emieVarJ.build();
        emihVar3.getClass();
        eminVar.c = emihVar3;
        eminVar.b |= 1;
        final fdap fdapVar2 = new fdap() { // from class: crcr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                emhv emhvVar = (emhv) obj;
                cczv cczvVar = crdc.a;
                emhvVar.getClass();
                emim emimVar2 = emimVar;
                emimVar2.copyOnWrite();
                emin eminVar2 = (emin) emimVar2.instance;
                emin eminVar3 = emin.a;
                eminVar2.d = emhvVar;
                eminVar2.b |= 2;
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: crcs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cczv cczvVar = crdc.a;
                fdapVar2.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        elqo elqoVar = (elqo) elqp.a.createBuilder();
        elqn elqnVar = elqn.P2P_SUGGESTION_SENT_MESSAGE;
        elqoVar.copyOnWrite();
        elqp elqpVar = (elqp) elqoVar.instance;
        elqpVar.c = elqnVar.i;
        elqpVar.b |= 1;
        elqoVar.copyOnWrite();
        elqp elqpVar2 = (elqp) elqoVar.instance;
        emin eminVar2 = (emin) emimVar.build();
        eminVar2.getClass();
        elqpVar2.d = eminVar2;
        elqpVar2.b |= 2;
        long jK = k(messageCoreData);
        elqoVar.copyOnWrite();
        elqp elqpVar3 = (elqp) elqoVar.instance;
        elqpVar3.b |= 64;
        elqpVar3.i = jK;
        evsn evsnVarBuild = elqoVar.build();
        evsnVarBuild.getClass();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_P2P_SUGGESTION;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.w = (elqp) evsnVarBuild;
        ellhVar2.b |= 32768;
        ((aill) this.c.b()).j(ellgVar);
    }

    @Override // defpackage.crcp
    public final void h(ezgd ezgdVar) {
        ezgdVar.getClass();
        if (((Boolean) ((cczi) crco.b.get()).e()).booleanValue()) {
            return;
        }
        emie emieVar = (emie) emih.a.createBuilder();
        emieVar.a(m(fcva.b(ezgdVar)));
        evsn evsnVarBuild = emieVar.build();
        evsnVarBuild.getClass();
        elpo elpoVar = (elpo) elpp.a.createBuilder();
        elpoVar.copyOnWrite();
        elpp elppVar = (elpp) elpoVar.instance;
        elppVar.d = (emih) evsnVarBuild;
        elppVar.b |= 2;
        evsn evsnVarBuild2 = elpoVar.build();
        evsnVarBuild2.getClass();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE_CLASSIFICATION;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.aX = (elpp) evsnVarBuild2;
        ellhVar2.e |= 536870912;
        ((aill) this.c.b()).j(ellgVar);
    }

    @Override // defpackage.crcp
    public final void i(emig emigVar, elny elnyVar, List list, List list2, MessageCoreData messageCoreData) {
        emigVar.getClass();
        elnyVar.getClass();
        list.getClass();
        list2.getClass();
        messageCoreData.getClass();
        g(emigVar, elnyVar, list, list2, Optional.empty(), messageCoreData);
    }
}
