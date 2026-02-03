package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class criz implements crif {
    public final fcyh a;
    public final cogw b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;
    private final fcyh f;
    private final dqsn g;

    public criz(fdjx fdjxVar, fcyh fcyhVar, fdjx fdjxVar2, fcyh fcyhVar2, cogw cogwVar, fcsu fcsuVar, dqsn dqsnVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fdjxVar2.getClass();
        fcyhVar2.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        dqsnVar.getClass();
        fcsuVar2.getClass();
        this.e = fdjxVar;
        this.a = fcyhVar;
        this.f = fcyhVar2;
        this.b = cogwVar;
        this.c = fcsuVar;
        this.g = dqsnVar;
        this.d = fcsuVar2;
    }

    private static final ekgb q(brnd brndVar) throws IOException {
        ecem.b();
        brna brnaVarA = brnk.a();
        brnaVarA.A("+getP2pSmartSuggestionItemSuggestions");
        brnaVarA.k(brndVar);
        dqqj dqqjVarP = brnaVarA.b().p();
        try {
            brml brmlVar = (brml) dqqjVarP;
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            while (brmlVar.moveToNext()) {
                dqpd dqpdVarCQ = brmlVar.cQ();
                dqpdVarCQ.getClass();
                ekfwVar.h(bbez.a((brlo) dqpdVarCQ));
            }
            ekgb ekgbVarG = ekfwVar.g();
            ekgbVarG.getClass();
            fczl.a(dqqjVarP, null);
            return ekgbVarG;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.crif
    public final ekgb a(final MessageIdType messageIdType) throws IOException {
        eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperationsImpl#getClassificationsByMessageId");
        try {
            ecem.b();
            bqch bqchVarA = bqcn.a();
            bqchVarA.A("getClassificationsByMessageId");
            bqchVarA.c(new Function() { // from class: crik
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqcm bqcmVar = (bqcm) obj;
                    bqcmVar.ap(new dqpm("message_classifications_table.message_id", 3, bqcm.as((Iterable) DesugarArrays.stream(new MessageIdType[]{messageIdType}).map(new Function() { // from class: bqcl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return String.valueOf(bary.a((MessageIdType) obj2));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new bqck()))), true));
                    return bqcmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dqqj dqqjVarP = bqchVarA.b().p();
            try {
                ekgb ekgbVarCX = ((bqbv) dqqjVarP).cX();
                ekgbVarCX.getClass();
                ArrayList arrayList = new ArrayList(fcva.p(ekgbVarCX, 10));
                ekqh it = ekgbVarCX.iterator();
                while (it.hasNext()) {
                    arrayList.add(((bqbg) it.next()).k());
                }
                ekgb ekgbVarA = ekfv.a(arrayList);
                fczl.a(dqqjVarP, null);
                fczl.a(eieuVarH, null);
                return ekgbVarA;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.crif
    public final ekgb b(MessageIdType messageIdType) throws IOException {
        messageIdType.getClass();
        eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperationsImpl#getSmartSuggestionsByMessageId");
        try {
            ecem.b();
            String[] strArr = brnk.a;
            brnj brnjVar = new brnj();
            brnjVar.ap(new dqpm("p2p_suggestions.target_message_id", 3, brnj.as((Iterable) DesugarArrays.stream(new MessageIdType[]{messageIdType}).map(new Function() { // from class: brnf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return String.valueOf(bary.a((MessageIdType) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new brng()))), true));
            ekgb ekgbVarQ = q(new brnd(brnjVar));
            fczl.a(eieuVarH, null);
            return ekgbVarQ;
        } finally {
        }
    }

    @Override // defpackage.crif
    public final Optional c(final MessageIdType messageIdType) throws IOException {
        eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperationsImpl#getShareImageConversationSuggestionByMessageId");
        try {
            ecem.b();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("getShareImageConversationSuggestionByMessageId");
            brdrVarD.f(new Function() { // from class: cril
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bran) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.h(new Function() { // from class: crim
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.p(messageIdType);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdp brdpVarB = brdrVarD.b();
            String[] strArr = brnk.a;
            brnj brnjVar = new brnj();
            brnjVar.h(brdpVarB);
            brnjVar.e(ezan.RECENT_IMAGE);
            ekgb ekgbVarQ = q(new brnd(brnjVar));
            Optional optionalEmpty = ((ekoe) ekgbVarQ).c != 1 ? Optional.empty() : Optional.of(ekgbVarQ.get(0));
            fczl.a(eieuVarH, null);
            return optionalEmpty;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.crif
    public final Optional d(String str) throws IOException {
        eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperationsImpl#getSmartSuggestionBySuggestionId");
        try {
            ecem.b();
            String[] strArr = brnk.a;
            brnj brnjVar = new brnj();
            brnjVar.c(str);
            ekgb ekgbVarQ = q(new brnd(brnjVar));
            if (((ekoe) ekgbVarQ).c > 1) {
                throw new IllegalStateException("Check failed.");
            }
            Optional optionalEmpty = ekgbVarQ.isEmpty() ? Optional.empty() : Optional.of(ekgbVarQ.get(0));
            fczl.a(eieuVarH, null);
            return optionalEmpty;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.crif
    public final Object e(ConversationIdType conversationIdType, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f), new crir(null, this, conversationIdType), fcxyVar);
    }

    @Override // defpackage.crif
    public final Object f(ConversationIdType conversationIdType, String str, ezaj ezajVar, fcxy fcxyVar) {
        Object objA;
        return (str == null || str.length() == 0 || (objA = fdin.a(eicg.a(this.a), new criv(null, ezajVar, this, str, conversationIdType), fcxyVar)) != fcyl.a) ? fctx.a : objA;
    }

    @Override // defpackage.crif
    public final List g(final ConversationIdType conversationIdType, long j) throws IOException {
        conversationIdType.getClass();
        eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperationsImpl#getShareImageConversationSuggestionsByConversationId");
        try {
            ecem.b();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("getShareImageConversationSuggestionsByConversationId");
            brdrVarD.f(new Function() { // from class: crii
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bran) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.h(new Function() { // from class: crij
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.m(conversationIdType);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdp brdpVarB = brdrVarD.b();
            String[] strArr = brnk.a;
            brnj brnjVar = new brnj();
            brnjVar.h(brdpVarB);
            brnjVar.b(j);
            brnjVar.e(ezan.RECENT_IMAGE);
            ekgb ekgbVarQ = q(new brnd(brnjVar));
            fczl.a(eieuVarH, null);
            return ekgbVarQ;
        } finally {
        }
    }

    @Override // defpackage.crif
    public final List h(MessageIdType messageIdType) throws IOException {
        messageIdType.getClass();
        eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperationsImpl#getShownSmartSuggestionsByMessageId");
        try {
            ecem.b();
            String[] strArr = brnk.a;
            brnj brnjVar = new brnj();
            brnjVar.g(messageIdType);
            brnjVar.ap(new dqpm("p2p_suggestions.suggestion_status", 3, brnj.as((Iterable) ekpo.a(cren.a).map(new Function() { // from class: brnh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((ezai) obj).a());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new brng()))), true));
            ekgb ekgbVarQ = q(new brnd(brnjVar));
            fczl.a(eieuVarH, null);
            return ekgbVarQ;
        } finally {
        }
    }

    @Override // defpackage.crif
    public final void i(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData, ConversationIdType conversationIdType, final MessageIdType messageIdType, long j) throws IOException {
        conversationIdType.getClass();
        messageIdType.getClass();
        eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperationsImpl#addOrUpdateShareImageSuggestion");
        try {
            ecem.b();
            String[] strArr = brnk.a;
            brnj brnjVar = new brnj();
            brnjVar.g(messageIdType);
            brnjVar.e(ezan.RECENT_IMAGE);
            if (q(new brnd(brnjVar)).isEmpty()) {
                ekgb ekgbVarR = ekgb.r(smartSuggestionItemSuggestionData.c);
                ekgbVarR.getClass();
                j(ekgbVarR, conversationIdType, messageIdType, j);
            } else {
                brnc brncVar = new brnc();
                brncVar.ap("addOrUpdateShareImageSuggestion");
                ezgi ezgiVar = smartSuggestionItemSuggestionData.c;
                brncVar.a.put("suggestion", ezgiVar == null ? null : ezgiVar.toByteArray());
                brncVar.c(new Function() { // from class: crip
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brnj brnjVar2 = (brnj) obj;
                        brnjVar2.g(messageIdType);
                        brnjVar2.e(ezan.RECENT_IMAGE);
                        return brnjVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brncVar.am();
                brncVar.b().e();
            }
            fczl.a(eieuVarH, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.crif
    public final void j(final List list, final ConversationIdType conversationIdType, final MessageIdType messageIdType, final long j) throws IOException {
        eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperationsImpl#addSmartSuggestions");
        try {
            ecem.b();
            if (!dhic.a(list)) {
                this.g.d("SmartSuggestionDatabaseOperationsImpl#addSmartSuggestions", new Runnable() { // from class: crih
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageIdType messageIdType2;
                        Iterator it = list.iterator();
                        String str = null;
                        while (true) {
                            messageIdType2 = messageIdType;
                            if (!it.hasNext()) {
                                break;
                            }
                            ezgi ezgiVar = (ezgi) it.next();
                            String[] strArr = brnk.a;
                            brlt brltVar = new brlt();
                            brltVar.g(messageIdType2);
                            ezgg ezggVar = ezgiVar.e;
                            if (ezggVar == null) {
                                ezggVar = ezgg.b;
                            }
                            ezan ezanVarB = ezan.b(ezggVar.l);
                            if (ezanVarB == null) {
                                ezanVarB = ezan.UNRECOGNIZED;
                            }
                            long j2 = j;
                            brltVar.d(ezanVarB);
                            brltVar.e(ezgiVar);
                            brltVar.c(j2);
                            brltVar.f(ezai.RECEIVED);
                            final brlo brloVarA = brltVar.a();
                            final dqsy dqsyVarB = brnk.b();
                            dqru.b(brnk.b(), "p2p_suggestions", brloVarA, new Function() { // from class: brlj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(dqsyVarB.O("p2p_suggestions", (dqst) obj));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: brlk
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    Long l = (Long) obj;
                                    if (l.longValue() >= 0) {
                                        brlo brloVar = brloVarA;
                                        brloVar.a = String.valueOf(l);
                                        brloVar.fN(0);
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            ezgg ezggVar2 = ezgiVar.e;
                            ezan ezanVarB2 = ezan.b((ezggVar2 == null ? ezgg.b : ezggVar2).l);
                            if (ezanVarB2 == null) {
                                ezanVarB2 = ezan.UNRECOGNIZED;
                            }
                            if (ezanVarB2 == ezan.SCREEN_EFFECTS) {
                                if (ezggVar2 == null) {
                                    ezggVar2 = ezgg.b;
                                }
                                str = ezggVar2.m;
                            }
                        }
                        criz crizVar = this;
                        if (((Boolean) ((cczi) cwtn.a.get()).e()).booleanValue() || ((Boolean) ((cczi) crbf.bE.get()).e()).booleanValue()) {
                            ((bxlc) crizVar.c.b()).l(conversationIdType, messageIdType2, new String[0]);
                        }
                        if (str != null) {
                            awgn awgnVar = (awgn) crizVar.d.b();
                            if (fdbq.f(awgnVar.f, bary.b(str))) {
                                awgnVar.e.g(awgn.a, null, null, dzua.SUCCESS);
                            }
                        }
                    }
                });
            }
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.crif
    public final void k(final long j) {
        ecem.b();
        String[] strArr = brnk.a;
        brmv brmvVar = new brmv();
        brmvVar.f("deleteNonShortcutSuggestionsOlderThan");
        brmvVar.a(new Function() { // from class: crio
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brnj brnjVar = (brnj) obj;
                brnjVar.ap(new dqty("p2p_suggestions.generated_timestamp", 8, Long.valueOf(this.a.b.f().toEpochMilli() - j)));
                brnjVar.ap(new dqpm("p2p_suggestions.smart_suggestion_type", 4, brnj.as((Iterable) ekpo.a(bbfa.a).map(new Function() { // from class: brni
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(((ezan) obj2).a());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new brng()))), true));
                return brnjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brmvVar.d();
    }

    @Override // defpackage.crif
    public final void l() {
        ecem.b();
        String[] strArr = brnk.a;
        brmv brmvVar = new brmv();
        brmvVar.f("deleteShortcutSuggestions");
        brmvVar.e();
        brmvVar.a(new Function() { // from class: criq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brnj brnjVar = (brnj) obj;
                brnjVar.f(bbfa.a);
                return brnjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brmvVar.d();
    }

    @Override // defpackage.crif
    public final void m(final List list) {
        list.getClass();
        String[] strArr = brnk.a;
        brmv brmvVar = new brmv();
        brmvVar.f("deleteSmartSuggestions");
        brmvVar.a(new Function() { // from class: crin
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brnj brnjVar = (brnj) obj;
                brnjVar.d(list);
                return brnjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brmvVar.d();
    }

    @Override // defpackage.crif
    public final void n(SuggestionData suggestionData, ezai ezaiVar) {
        suggestionData.getClass();
        ezaiVar.getClass();
        o(fcva.b(suggestionData), ezaiVar);
    }

    @Override // defpackage.crif
    public final void o(List list, ezai ezaiVar) {
        String strB;
        list.getClass();
        ezaiVar.getClass();
        if (dhic.a(list)) {
            return;
        }
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SuggestionData suggestionData = (SuggestionData) it.next();
            if ((suggestionData instanceof SmartSuggestionData) && (strB = suggestionData.b()) != null && strB.length() != 0) {
                SmartSuggestionData smartSuggestionData = (SmartSuggestionData) suggestionData;
                if (ezaiVar.ordinal() > smartSuggestionData.j().ordinal()) {
                    smartSuggestionData.v(ezaiVar);
                    ekfwVar.h(strB);
                }
            }
        }
        ekgb ekgbVarG = ekfwVar.g();
        if (ekgbVarG.isEmpty()) {
            return;
        }
        auvw.k(this.e, null, null, new criy(this, ekgbVarG, ezaiVar, null), 3);
    }

    @Override // defpackage.crif
    public final void p(final List list, ezai ezaiVar) {
        ezaiVar.getClass();
        eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperationsImpl#updateP2pSuggestionsStatus");
        try {
            ecem.b();
            String[] strArr = brnk.a;
            brnc brncVar = new brnc();
            brncVar.ap("updateSmartSuggestionsStatuses");
            brncVar.am();
            brncVar.a.put("suggestion_status", Integer.valueOf(ezaiVar.a()));
            brncVar.c(new Function() { // from class: crig
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brnj brnjVar = (brnj) obj;
                    brnjVar.d(list);
                    return brnjVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brncVar.b().e();
            fczl.a(eieuVarH, null);
        } finally {
        }
    }
}
