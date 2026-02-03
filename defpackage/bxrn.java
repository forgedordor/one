package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.ConversationV2;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.MessageV2;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.ParticipantV2;
import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxrn implements bxrh {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleSearch");
    private static final Pattern c = Pattern.compile("[^0-9]+");
    private final fcsu d;
    private final fcsu e;
    private final eosc f;
    private final bxxd g;
    private final fcsu h;

    public bxrn(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, bxxd bxxdVar, fcsu fcsuVar3) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = eoscVar;
        this.g = bxxdVar;
        this.h = fcsuVar3;
    }

    private final eiju c(bxrm bxrmVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Set set = bxrmVar.a;
        if (!set.isEmpty()) {
            ekfwVar.h(((bxrw) this.e.b()).b(bxrmVar.e, set));
        }
        Set set2 = bxrmVar.b;
        if (!set2.isEmpty()) {
            ekfwVar.h(((bxrw) this.e.b()).c(bxrmVar.e, set2));
        }
        Set set3 = bxrmVar.c;
        if (!set3.isEmpty() && craf.f) {
            ekfwVar.h(((bxrp) this.d.b()).a(new bxsi(bxrmVar.a(), set3)));
        }
        Set set4 = bxrmVar.d;
        if (!set4.isEmpty() && craf.f) {
            ekfwVar.h(((bxrp) this.d.b()).b(new bxsh(bxrmVar.a(), set4)));
        }
        ekgb ekgbVarG = ekfwVar.g();
        if (!ekgbVarG.isEmpty()) {
            return eijx.a(ekgbVarG).h(new ejvr() { // from class: bxrj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int i2 = bxrn.a;
                    return Boolean.valueOf(Collection.EL.stream((List) obj).allMatch(new Predicate() { // from class: bxrl
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            int i3 = bxrn.a;
                            return ((Boolean) obj2).booleanValue();
                        }
                    }));
                }
            }, this.f);
        }
        ((eksl) b.o().h("com/google/android/apps/messaging/shared/datamodel/search/OnDeviceIndexerApiImpl", "execute", 436, "OnDeviceIndexerApiImpl.java")).q("No operations applied within applyOperationsInIcing.");
        return eijx.e(true);
    }

    private static String d(ParticipantsTable.BindData bindData) {
        return TextUtils.isEmpty(bindData.Q()) ? bindData.O() : bindData.Q();
    }

    private static String e(String str) {
        return !TextUtils.isEmpty(str) ? c.matcher(str).replaceAll("") : "";
    }

    private final void f(String str, bxrm bxrmVar) {
        PartsTable.BindData bindData;
        bxxd bxxdVar = this.g;
        MessageIdType messageIdTypeB = bary.b(str);
        MessagesTable.BindData bindDataC = bxxdVar.c(messageIdTypeB);
        if (bindDataC == null || byed.g(bindDataC.s()) || TextUtils.isEmpty(bindDataC.aa()) || bindDataC.D().b() || bindDataC.E() == null) {
            bxrmVar.a.add(byan.b(messageIdTypeB));
            bxrmVar.d.add(str);
            return;
        }
        ConversationIdType conversationIdTypeD = bindDataC.D();
        String strB = ejwk.b(bindDataC.aa());
        List<PartsTable.BindData> listL = bxxdVar.l(messageIdTypeB);
        Iterator it = listL.iterator();
        while (true) {
            if (!it.hasNext()) {
                bindData = null;
                break;
            }
            bindData = (PartsTable.BindData) it.next();
            if (le.w(bindData.I()) || le.s(bindData.I())) {
                break;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        for (PartsTable.BindData bindData2 : listL) {
            if (le.f(bindData2.I())) {
                arrayList2.add(bindData2.K());
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str2 : arrayList2) {
                VmtTable.BindData bindDataA = VmtTable.a(str2);
                if (bindDataA == null || bindDataA.k() != aonp.VMT_STATUS_COMPLETE || bindDataA.o() == null) {
                    ekrw ekrwVarO = b.o();
                    ekrwVarO.X(cqnc.v, str2);
                    ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/search/OnDeviceIndexerApiImpl", "recordOperationForMessage", 195, "OnDeviceIndexerApiImpl.java")).q("Audio part does not have a completed transcription");
                } else {
                    arrayList.add(bindDataA.o());
                }
            }
        }
        if ((bindData == null || TextUtils.isEmpty(bindData.L())) && arrayList.isEmpty()) {
            ekrw ekrwVarO2 = b.o();
            ekrwVarO2.X(cqnc.a, messageIdTypeB.b());
            ((eksl) ekrwVarO2.h("com/google/android/apps/messaging/shared/datamodel/search/OnDeviceIndexerApiImpl", "recordOperationForMessage", 206, "OnDeviceIndexerApiImpl.java")).q("Ignoring the call since message doesn't have a text part");
            return;
        }
        Set set = bxrmVar.b;
        String strL = bindData == null ? null : bindData.L();
        esas esasVar = new esas();
        esat esatVar = new esat();
        esatVar.d("participant_id", strB);
        esasVar.k(esatVar);
        esasVar.f(byan.b(messageIdTypeB));
        esasVar.i(messageIdTypeB.b());
        esasVar.d("conversation_id", conversationIdTypeD.a());
        esak esakVar = new esak();
        esakVar.b();
        esakVar.c();
        esasVar.e(esakVar);
        esaq esaqVar = new esaq();
        esaqVar.g(conversationIdTypeD.a());
        esasVar.h(esaqVar);
        if (!TextUtils.isEmpty(strL)) {
            esasVar.j(strL);
        }
        if (!arrayList.isEmpty()) {
            esasVar.b((String[]) arrayList.toArray(new String[0]));
        }
        set.add(esasVar.a());
        Set set2 = bxrmVar.c;
        long jW = bindDataC.w();
        String strL2 = bindData == null ? null : bindData.L();
        String string = messageIdTypeB.toString();
        int i = bxtn.a;
        G3AttributionInfo g3AttributionInfoA = bxtn.a();
        g3AttributionInfoA.getClass();
        set2.add(new MessageV2("Message", string, g3AttributionInfoA, conversationIdTypeD.toString(), strB, jW, strL2, arrayList));
    }

    @Override // defpackage.bxrh
    public final eiju a() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.h(((bxrw) this.e.b()).a());
        if (craf.f) {
            ekfwVar.h(((bxrp) this.d.b()).c());
        }
        return eijx.a(ekfwVar.g()).h(new ejvr() { // from class: bxrk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i2 = bxrn.a;
                return Boolean.valueOf(Collection.EL.stream((List) obj).allMatch(new Predicate() { // from class: bxri
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        int i3 = bxrn.a;
                        return ((Boolean) obj2).booleanValue();
                    }
                }));
            }
        }, this.f);
    }

    @Override // defpackage.bxrh
    public final eiju b(int i, List list) {
        eksp ekspVar = b;
        eksl ekslVar = (eksl) ekspVar.h();
        ekslVar.X(bxze.g, "OnDeviceIndexerApiImpl");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/search/OnDeviceIndexerApiImpl", "updateIndex", 105, "OnDeviceIndexerApiImpl.java")).q("start to update index.");
        if (i == 1) {
            ejwl.a(list.size() <= ((Integer) ccze.E.e()).intValue());
            bxrm bxrmVar = new bxrm(1);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f((String) it.next(), bxrmVar);
            }
            return c(bxrmVar);
        }
        if (i == 2) {
            ejwl.a(list.size() <= ((Integer) ccze.E.e()).intValue());
            bxrm bxrmVar2 = new bxrm(2);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                ConversationIdType conversationIdTypeB = barn.b(str);
                bojh bojhVarB = this.g.b(conversationIdTypeB);
                if (bojhVarB == null || TextUtils.isEmpty(bojhVarB.Y())) {
                    bxrmVar2.a.add(byan.a(conversationIdTypeB));
                    bxrmVar2.d.add(str);
                } else {
                    List<ParticipantsTable.BindData> listK = ((bakt) this.h.b()).K(conversationIdTypeB);
                    esaq esaqVar = new esaq();
                    esaqVar.f(byan.a(bojhVarB.C()));
                    String strY = bojhVarB.Y();
                    strY.getClass();
                    esaqVar.i(strY);
                    esaqVar.g(bojhVarB.C().toString());
                    esak esakVar = new esak();
                    esakVar.b();
                    esakVar.c();
                    esaqVar.e(esakVar);
                    int i2 = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    for (ParticipantsTable.BindData bindData : listK) {
                        if (bindData.V() != null) {
                            ekfwVar.h(bindData.V());
                        }
                        if (bindData.O() != null) {
                            ekfwVar.h(bindData.O());
                            ekfwVar.h(e(bindData.O()));
                        }
                        if (bindData.T() != null) {
                            ekfwVar.h(bindData.T());
                        }
                    }
                    ekgb ekgbVarG = ekfwVar.g();
                    esaqVar.b((String[]) ekgbVarG.toArray(new String[0]));
                    bxrmVar2.b.add(esaqVar.a());
                    Set set = bxrmVar2.c;
                    String strY2 = bojhVarB.Y();
                    strY2.getClass();
                    String string = conversationIdTypeB.toString();
                    int i3 = bxtn.a;
                    G3AttributionInfo g3AttributionInfoA = bxtn.a();
                    g3AttributionInfoA.getClass();
                    set.add(new ConversationV2("Conversation", string, g3AttributionInfoA, conversationIdTypeB.toString(), strY2, ekgbVarG));
                }
            }
            return c(bxrmVar2);
        }
        if (i != 3) {
            if (i != 11) {
                throw new IllegalStateException(a.g(i, "Unexpected table type value: "));
            }
            ejwl.a(list.size() <= ((Integer) ccze.E.e()).intValue());
            bxrm bxrmVar3 = new bxrm(1);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                String str2 = (String) it3.next();
                PartsTable.BindData bindDataA = PartsTable.a(str2);
                if (bindDataA == null) {
                    eksl ekslVar2 = (eksl) ekspVar.j();
                    ekslVar2.X(cqnc.v, str2);
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/search/OnDeviceIndexerApiImpl", "recordOperationForTranscription", 331, "OnDeviceIndexerApiImpl.java")).q("Ignoring the call since part id is not in PartsTable");
                } else {
                    f(bindDataA.v().toString(), bxrmVar3);
                }
            }
            return c(bxrmVar3);
        }
        ejwl.a(list.size() <= ((Integer) ccze.E.e()).intValue());
        bxrm bxrmVar4 = new bxrm(3);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            String str3 = (String) it4.next();
            ParticipantsTable.BindData bindDataD = this.g.d(str3);
            if (bindDataD == null || TextUtils.isEmpty(d(bindDataD)) || TextUtils.isEmpty(bindDataD.T())) {
                bxrmVar4.a.add(byan.c(str3));
                bxrmVar4.d.add(str3);
            } else if (TextUtils.isEmpty(bindDataD.S())) {
                ekrw ekrwVarO = ekspVar.o();
                ekrwVarO.X(cqnc.p, str3);
                ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/search/OnDeviceIndexerApiImpl", "recordOperationForParticipant", 286, "OnDeviceIndexerApiImpl.java")).q("Skipping indexing call for participant due to phenotype flag being off and participant not in contacts.");
            } else {
                String strD = d(bindDataD);
                String strE = e(bindDataD.O());
                esat esatVar = new esat();
                esatVar.i(strD);
                esatVar.f(byan.c(bindDataD.R()));
                esatVar.d("participant_id", bindDataD.R());
                esatVar.d("normalized_destination", bindDataD.T());
                esak esakVar2 = new esak();
                esakVar2.b();
                esakVar2.c();
                esatVar.e(esakVar2);
                if (!TextUtils.isEmpty(strE)) {
                    esatVar.d("keywords", strE);
                }
                if (!TextUtils.isEmpty(bindDataD.S())) {
                    esatVar.d("lookup_key", bindDataD.S());
                }
                bxrmVar4.b.add(esatVar.a());
                Set set2 = bxrmVar4.c;
                long jR = bindDataD.r();
                String strO = bindDataD.O();
                String strT = bindDataD.T();
                int i4 = bxtn.a;
                G3AttributionInfo g3AttributionInfoA2 = bxtn.a();
                g3AttributionInfoA2.getClass();
                set2.add(new ParticipantV2("Participant", str3, g3AttributionInfoA2, strD, jR, strO, strT, strE));
            }
        }
        return c(bxrmVar4);
    }
}
