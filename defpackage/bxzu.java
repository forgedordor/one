package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bxzu implements bxzf {
    public final eosc c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu g;
    private final eosc h;
    private final bxxd i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    public static final eksp a = eksp.c("BugleSearch");
    private static final Pattern f = Pattern.compile("[^0-9]+");
    static final cczi b = cdag.h(cdag.b, "disable_logging_uma_async_icing_indexer_api_impl", false);

    public bxzu(fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, bxxd bxxdVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.g = fcsuVar;
        this.c = eoscVar;
        this.h = eoscVar2;
        this.i = bxxdVar;
        this.j = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.k = fcsuVar5;
        this.l = fcsuVar6;
    }

    public static final void k(String str) {
        ekrw ekrwVarO = a.o();
        ekrwVarO.X(cqnc.Z, str);
        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForMessageAnnotation", 358, "AsyncIcingIndexerApiImpl.java")).q("Skipping indexing call for annotation due to phenotype flag being off.");
    }

    private final eiju l(eiju eijuVar, final List list) {
        ejvr ejvrVar = new ejvr() { // from class: bxzg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = bxzu.a;
                Stream map = Collection.EL.stream(list).map(new Function() { // from class: bxzj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        final bxzs bxzsVar = (bxzs) obj2;
                        final String str = bxzsVar.a;
                        final int i = bxzsVar.c;
                        final int i2 = bxzsVar.d;
                        return eijx.g(new Callable() { // from class: bxzr
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ((byap) bxzsVar.b.d.b()).d(str, i - 1, i2);
                                return null;
                            }
                        }, bxzsVar.b.c);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                eijx.j((Iterable) map.collect(ekcv.a));
                return true;
            }
        };
        eosc eoscVar = this.c;
        return eijuVar.h(ejvrVar, eoscVar).e(Exception.class, new ejvr() { // from class: bxzh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final Exception exc = (Exception) obj;
                eksp ekspVar = bxzu.a;
                Stream map = Collection.EL.stream(list).map(new Function() { // from class: bxzm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        final bxzs bxzsVar = (bxzs) obj2;
                        eksp ekspVar2 = bxzu.a;
                        final String str = bxzsVar.a;
                        final int i = bxzsVar.c;
                        final int i2 = bxzsVar.d;
                        final Exception exc2 = exc;
                        return eijx.g(new Callable() { // from class: bxzq
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ((byap) bxzsVar.b.d.b()).c(str, i - 1, i2, exc2);
                                return null;
                            }
                        }, bxzsVar.b.c);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                eijx.j((Iterable) map.collect(ekcv.a));
                return false;
            }
        }, eoscVar);
    }

    private static String m(ParticipantsTable.BindData bindData) {
        return TextUtils.isEmpty(bindData.Q()) ? bindData.O() : bindData.Q();
    }

    private static String n(String str) {
        return !TextUtils.isEmpty(str) ? f.matcher(str).replaceAll("") : "";
    }

    @Override // defpackage.bxzf
    public final eiju a(final List list) {
        return eijx.h(new eooy() { // from class: bxzp
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                List list2 = list;
                ejwl.a(list2.size() <= ((Integer) ccze.E.e()).intValue());
                bxzt bxztVar = new bxzt();
                Iterator it = list2.iterator();
                while (true) {
                    bxzu bxzuVar = this.a;
                    if (!it.hasNext()) {
                        return bxzuVar.g(bxztVar);
                    }
                    bxzw bxzwVar = (bxzw) it.next();
                    int i = bxzwVar.b;
                    if (i == 1) {
                        bxzuVar.i(bary.b(bxzwVar.c), bxztVar);
                    } else if (i == 2) {
                        bxzuVar.h(barn.b(bxzwVar.c), bxztVar);
                    } else if (i == 3) {
                        bxzuVar.j(bxzwVar.c, bxztVar);
                    } else if (i == 4) {
                        bxzu.k(bxzwVar.c);
                    } else {
                        if (i != 11) {
                            throw new IllegalStateException(a.g(i, "Unexpected table tye value: "));
                        }
                        String str = bxzwVar.c;
                        PartsTable.BindData bindDataA = PartsTable.a(str);
                        if (bindDataA == null) {
                            eksl ekslVar = (eksl) bxzu.a.j();
                            ekslVar.X(cqnc.v, str);
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForTranscription", 368, "AsyncIcingIndexerApiImpl.java")).q("Ignoring the call since part id is not in PartsTable");
                        } else {
                            bxzuVar.i(bindDataA.v(), bxztVar);
                        }
                    }
                }
            }
        }, this.c);
    }

    @Override // defpackage.bxzf
    public final eiju b(List list) {
        ejwl.a(list.size() <= ((Integer) ccze.E.e()).intValue());
        bxzt bxztVar = new bxzt();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h((ConversationIdType) it.next(), bxztVar);
        }
        return g(bxztVar);
    }

    @Override // defpackage.bxzf
    public final eiju c(List list) {
        ejwl.a(list.size() <= ((Integer) ccze.E.e()).intValue());
        bxzt bxztVar = new bxzt();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k((String) it.next());
        }
        return g(bxztVar);
    }

    @Override // defpackage.bxzf
    public final eiju d(List list) {
        ejwl.a(list.size() <= ((Integer) ccze.E.e()).intValue());
        bxzt bxztVar = new bxzt();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i((MessageIdType) it.next(), bxztVar);
        }
        return g(bxztVar);
    }

    @Override // defpackage.bxzf
    public final eiju e(List list) {
        ejwl.a(list.size() <= ((Integer) ccze.E.e()).intValue());
        bxzt bxztVar = new bxzt();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j((String) it.next(), bxztVar);
        }
        return g(bxztVar);
    }

    @Override // defpackage.bxzf
    public final void f() {
        ((esab) this.g.b()).b().o(this.h, new defb() { // from class: bxzo
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                eksp ekspVar = bxzu.a;
                if (defnVar.m()) {
                    ((eksl) ((eksl) bxzu.a.h()).h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "removeAll", 193, "AsyncIcingIndexerApiImpl.java")).q("Removed all icing index successfully.");
                    return;
                }
                ekrw ekrwVarJ = bxzu.a.j();
                Exception excH = defnVar.h();
                excH.getClass();
                ((eksl) ((eksl) ((eksl) ekrwVarJ).g(excH)).h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "removeAll", (char) 196, "AsyncIcingIndexerApiImpl.java")).q("Failed to remove all icing index.");
            }
        });
    }

    public final eiju g(bxzt bxztVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Set set = bxztVar.a;
        if (!set.isEmpty()) {
            if (((aqdi) this.k.b()).a()) {
                List list = bxztVar.c;
                ejwl.l(!list.isEmpty());
                final dzub dzubVarA = ((byav) this.e.b()).a();
                ekfwVar.h(l(eiju.g(drgi.a(((esab) this.g.b()).a((String[]) set.toArray(new String[0])))).h(new ejvr() { // from class: bxzi
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Void r3 = (Void) obj;
                        ((byav) this.a.e.b()).b(dzubVarA);
                        return r3;
                    }
                }, this.h), list));
            } else {
                List list2 = bxztVar.c;
                ejwl.l(!list2.isEmpty());
                ekfwVar.h(l(eiju.g(drgi.a(((esab) this.g.b()).a((String[]) set.toArray(new String[0])))), list2));
            }
        }
        Set set2 = bxztVar.b;
        if (!set2.isEmpty()) {
            if (((aqdi) this.k.b()).a()) {
                List list3 = bxztVar.d;
                ejwl.l(!list3.isEmpty());
                final dzub dzubVarA2 = ((byav) this.e.b()).a();
                ekfwVar.h(l(eiju.g(drgi.a(((esab) this.g.b()).c((esal[]) set2.toArray(new esal[0])))).h(new ejvr() { // from class: bxzn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Void r3 = (Void) obj;
                        ((byav) this.a.e.b()).c(dzubVarA2);
                        return r3;
                    }
                }, this.h), list3));
            } else {
                List list4 = bxztVar.d;
                ejwl.l(!list4.isEmpty());
                ekfwVar.h(l(eiju.g(drgi.a(((esab) this.g.b()).c((esal[]) set2.toArray(new esal[0])))), list4));
            }
        }
        ekgb ekgbVarG = ekfwVar.g();
        if (!ekgbVarG.isEmpty()) {
            return eijx.a(ekgbVarG).h(new ejvr() { // from class: bxzl
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = bxzu.a;
                    return Boolean.valueOf(Collection.EL.stream((List) obj).allMatch(new Predicate() { // from class: bxzk
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
                            eksp ekspVar2 = bxzu.a;
                            return ((Boolean) obj2).booleanValue();
                        }
                    }));
                }
            }, this.h);
        }
        ((eksl) a.o().h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "execute", 615, "AsyncIcingIndexerApiImpl.java")).q("No operations applied within applyOperationsInIcing.");
        return eijx.e(true);
    }

    public final void h(ConversationIdType conversationIdType, bxzt bxztVar) {
        bojh bojhVarB = this.i.b(conversationIdType);
        if (bojhVarB == null || TextUtils.isEmpty(bojhVarB.Y())) {
            bxztVar.a.add(byan.a(conversationIdType));
            bxztVar.c.add(new bxzs(this, conversationIdType.a(), 3, 3));
            return;
        }
        List<ParticipantsTable.BindData> listK = ((bakt) this.l.b()).K(conversationIdType);
        Set set = bxztVar.b;
        ConversationIdType conversationIdTypeC = bojhVarB.C();
        String strY = bojhVarB.Y();
        strY.getClass();
        esaq esaqVar = new esaq();
        esaqVar.f(byan.a(conversationIdTypeC));
        esaqVar.i(strY);
        esaqVar.g(conversationIdTypeC.a());
        esak esakVar = new esak();
        esakVar.b();
        esakVar.c();
        esaqVar.e(esakVar);
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (ParticipantsTable.BindData bindData : listK) {
            if (bindData.V() != null) {
                ekfwVar.h(bindData.V());
            }
            if (bindData.O() != null) {
                ekfwVar.h(bindData.O());
                ekfwVar.h(n(bindData.O()));
            }
            if (bindData.T() != null) {
                ekfwVar.h(bindData.T());
            }
        }
        esaqVar.b((String[]) ekfwVar.g().toArray(new String[0]));
        set.add(esaqVar.a());
        bxztVar.d.add(new bxzs(this, conversationIdType.a(), 3, 2));
    }

    public final void i(MessageIdType messageIdType, bxzt bxztVar) {
        PartsTable.BindData bindData;
        bxxd bxxdVar = this.i;
        MessagesTable.BindData bindDataC = bxxdVar.c(messageIdType);
        if (bindDataC == null || byed.g(bindDataC.s()) || TextUtils.isEmpty(bindDataC.aa()) || bindDataC.D().b() || bindDataC.E() == null) {
            bxztVar.a.add(byan.b(messageIdType));
            bxztVar.c.add(new bxzs(this, messageIdType.b(), 2, 3));
            return;
        }
        ConversationIdType conversationIdTypeD = bindDataC.D();
        String strB = ejwk.b(bindDataC.aa());
        List<PartsTable.BindData> listL = bxxdVar.l(messageIdType);
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
            for (String str : arrayList2) {
                VmtTable.BindData bindDataA = VmtTable.a(str);
                if (bindDataA == null || bindDataA.k() != aonp.VMT_STATUS_COMPLETE || bindDataA.o() == null) {
                    ekrw ekrwVarO = a.o();
                    ekrwVarO.X(cqnc.v, str);
                    ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForMessage", 257, "AsyncIcingIndexerApiImpl.java")).q("Audio part does not have a completed transcription");
                } else {
                    arrayList.add(bindDataA.o());
                }
            }
        }
        if ((bindData == null || TextUtils.isEmpty(bindData.L())) && arrayList.isEmpty()) {
            ekrw ekrwVarO2 = a.o();
            ekrwVarO2.X(cqnc.a, messageIdType.b());
            ((eksl) ekrwVarO2.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForMessage", 268, "AsyncIcingIndexerApiImpl.java")).q("Ignoring the call since message doesn't have a text part");
            return;
        }
        Set set = bxztVar.b;
        String strL = bindData == null ? null : bindData.L();
        esas esasVar = new esas();
        esat esatVar = new esat();
        esatVar.d("participant_id", strB);
        esasVar.k(esatVar);
        esasVar.f(byan.b(messageIdType));
        esasVar.i(messageIdType.b());
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
        bxztVar.d.add(new bxzs(this, messageIdType.b(), 2, 2));
    }

    public final void j(String str, bxzt bxztVar) {
        ParticipantsTable.BindData bindDataD = this.i.d(str);
        if (bindDataD == null || TextUtils.isEmpty(m(bindDataD)) || TextUtils.isEmpty(bindDataD.T())) {
            if (bindDataD != null && !((Boolean) b.e()).booleanValue()) {
                ((ains) this.j.b()).c("Bugle.Icing.Indexing.Input.Invalid.Participant");
            }
            bxztVar.a.add(byan.c(str));
            bxztVar.c.add(new bxzs(this, str, 4, 3));
            return;
        }
        if (TextUtils.isEmpty(bindDataD.S())) {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(cqnc.p, str);
            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForParticipant", 333, "AsyncIcingIndexerApiImpl.java")).q("Skipping indexing call for participant due to phenotype flag being off and participant not in contacts.");
            return;
        }
        String strM = m(bindDataD);
        Set set = bxztVar.b;
        String strR = bindDataD.R();
        String strT = bindDataD.T();
        String strO = bindDataD.O();
        String strS = bindDataD.S();
        String strN = n(strO);
        esat esatVar = new esat();
        esatVar.i(strM);
        esatVar.f(byan.c(strR));
        esatVar.d("participant_id", strR);
        esatVar.d("normalized_destination", strT);
        esak esakVar = new esak();
        esakVar.b();
        esakVar.c();
        esatVar.e(esakVar);
        if (!TextUtils.isEmpty(strN)) {
            esatVar.d("keywords", strN);
        }
        if (!TextUtils.isEmpty(strS)) {
            esatVar.d("lookup_key", strS);
        }
        set.add(esatVar.a());
        bxztVar.d.add(new bxzs(this, str, 4, 2));
    }
}
