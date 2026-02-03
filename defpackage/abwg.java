package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwg implements cdek {
    private final eosc a;
    private final cogw b;

    public abwg(eosc eoscVar, cogw cogwVar) {
        this.a = eoscVar;
        this.b = cogwVar;
    }

    private final eiju d(final long j) {
        return eijx.g(new Callable() { // from class: abwb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final long j2 = j;
                if (j2 < 0) {
                    String[] strArr = brlh.a;
                    brky brkyVar = new brky();
                    brkyVar.f("deleteP2pSuggestionEventsAsync2");
                    return Integer.valueOf(brkyVar.d());
                }
                String[] strArr2 = brlh.a;
                brky brkyVar2 = new brky();
                brkyVar2.f("deleteP2pSuggestionEventsAsync1");
                brkyVar2.b = new brlf((brlg) new Function() { // from class: abwa
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brlg brlgVar = (brlg) obj;
                        brlgVar.ap(new dqty("p2p_conversation_suggestion_event.timestamp", 10, Long.valueOf(j2)));
                        return brlgVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new brlg()));
                return Integer.valueOf(brkyVar2.d());
            }
        }, this.a);
    }

    private static String e(SuggestionData suggestionData) {
        if (!f(suggestionData) || !(suggestionData instanceof SmartSuggestionItemSuggestionData)) {
            return null;
        }
        ezgg ezggVar = ((SmartSuggestionItemSuggestionData) suggestionData).c.e;
        if (ezggVar == null) {
            ezggVar = ezgg.b;
        }
        return ezggVar.o;
    }

    private static boolean f(SuggestionData suggestionData) {
        if (!(suggestionData instanceof SmartSuggestionItemSuggestionData)) {
            return true;
        }
        ezan ezanVarL = ((SmartSuggestionItemSuggestionData) suggestionData).l();
        return (ezanVarL == ezan.SILENT && ((Boolean) abvz.a.e()).booleanValue()) || (ezanVarL == ezan.EMOTION && ((Boolean) abvz.b.e()).booleanValue());
    }

    public final eiju a(elqn elqnVar, emig emigVar, ezac ezacVar, eyzv eyzvVar, int i, int i2, List list, MessageIdType messageIdType) {
        SuggestionData suggestionData;
        String string = "";
        if (!list.isEmpty() && (suggestionData = (SuggestionData) list.get(0)) != null) {
            string = Objects.toString(suggestionData.w(), "");
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < list.size(); i3++) {
            SuggestionData suggestionData2 = (SuggestionData) list.get(i3);
            if (suggestionData2 instanceof SmartSuggestionItemSuggestionData) {
                if (i3 != 0 && sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(((SmartSuggestionItemSuggestionData) suggestionData2).l().a());
            }
        }
        String string2 = sb.toString();
        int i4 = ekgb.d;
        ekgb ekgbVarG = ekoe.a;
        if (elqnVar != elqn.P2P_SUGGESTION_CLICK || i2 < 0 || list.size() <= i2) {
            ekfw ekfwVar = new ekfw();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SuggestionData suggestionData3 = (SuggestionData) it.next();
                if (f(suggestionData3)) {
                    String strE = e(suggestionData3);
                    if (!TextUtils.isEmpty(strE)) {
                        ekfwVar.h(strE);
                    }
                }
            }
            ekgbVarG = ekfwVar.g();
        } else {
            String strE2 = e((SuggestionData) list.get(i2));
            if (!TextUtils.isEmpty(strE2)) {
                ekgbVarG = ekgb.r(strE2);
            }
        }
        String[] strArr = brlh.a;
        brjh brjhVar = new brjh();
        brjhVar.f(messageIdType);
        brjhVar.l(this.b.f().toEpochMilli());
        brjhVar.d(elqnVar);
        brjhVar.j(emigVar);
        brjhVar.i(ezacVar);
        brjhVar.b(eyzvVar);
        brjhVar.h(i);
        brjhVar.c(i2);
        brjhVar.e(string);
        brjhVar.k(string2);
        brjhVar.g(TextUtils.join(",", ekgbVarG));
        final brje brjeVarA = brjhVar.a();
        return eijx.g(new Callable() { // from class: abwe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final dqsy dqsyVarB = brlh.b();
                dqsy dqsyVarB2 = brlh.b();
                Function function = new Function() { // from class: brjb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVarB.O("p2p_conversation_suggestion_event", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                final brje brjeVar = brjeVarA;
                return Long.valueOf(dqru.b(dqsyVarB2, "p2p_conversation_suggestion_event", brjeVar, function, new Consumer() { // from class: brjc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        Long l = (Long) obj;
                        if (l.longValue() >= 0) {
                            brje brjeVar2 = brjeVar;
                            brjeVar2.a = String.valueOf(l);
                            brjeVar2.fN(0);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }));
            }
        }, this.a);
    }

    @Override // defpackage.cdek
    public final void b() {
        cqnx.c(d(-1L), "BugleUsageStatistics", "Failed to delete all P2pSuggestionEvent");
    }

    @Override // defpackage.cdek
    public final void c(long j) {
        cqnx.c(d(j), "BugleUsageStatistics", "Failed to delete all P2pSuggestionEvent before cutoff timestamp");
    }
}
